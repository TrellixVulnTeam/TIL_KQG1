const express = require("express")
const app = express()
const port = 5000
const mongoose = require("mongoose")

const bodyParser = require("body-parser")
const cookieParser = require("cookie-parser")
const { User } = require("./models/User")
const config = require("./config/key")
app.use(bodyParser.urlencoded({ extended: true }))
app.use(bodyParser.json())
app.use(cookieParser())
mongoose
  .connect(config.mongoURI, {
    useNewUrlParser: true,
    useUnifiedTopology: true,
    useCreateIndex: true,
    useFindAndModify: false,
  })
  .then(() => console.log("MongoDB Connected..."))
  .catch((err) => console.log(err))

app.get("/", (req, res) => {
  res.send("hello world!")
})

app.post("/register", (req, res) => {
  //회원가입시 필요한 정보들을 client에서 가져오면
  // 그것들을 db에 넣어준다.

  // bodyparser로 인해서 json형태로 담겨있다. req.body:
  //   {id : 'hello',
  // password: '123'}
  const user = new User(req.body)
  user.save((err, userInfo) => {
    if (err) return res.json({ success: false, err })
    return res.status(200).json({ success: true })
  }) //save() : mongoDB의 메서드
})

app.listen(port, () => {
  console.log(`listening ${port}`)
})

app.post("/login", (req, res) => {
  // 1. 데이터베이스 안에서 요청된 이메일 찾기

  User.findOne({ email: req.body.email }, (err, user) => {
    if (!user) {
      return res.json({
        loginSuccess: false,
        message: "유저가 없습니다",
      })
    }
    // 2. 요청된 이메일이 db에 있다면 비밀번호도 일치하는지 확인

    user.comparePassword(req.body.password, (err, isMatch) => {
      if (!isMatch)
        return res.json({ loginSuccess: false, message: "비밀번호 오류!" })

      // 3. 비밀번호까지 같다면 token을 생성해야한다.
      user.generateToken((err, user) => {
        if (err) return res.status(400).send(err)

        // 토큰을 저장한다. 어디에 ? 쿠키 또는 로컬스토리지
        // 쿠키에 저장하기 위해서 npm install cookie-parser한다
        res
          .cookie("x_auth", user.token)
          // 쿠키부분에 "x_auth"이름으로 쿠키내용이 들어간다.
          .status(200)
          .json({ loginSuccess: true, userId: user._id })
      })
    })
  })
})
