//
//  main.c
//  ex2
//
//  Created by hxmkim on 2020/05/20.
//  Copyright © 2020 hxmkim. All rights reserved.
//

#include <stdio.h>
#include <math.h>

int main(void) {
    
//   1. 자판기
//    int input, price;
    
//    scanf("%d %d", &input,&price);
//    int exchange = input- price;
    
//    printf("%d\n%d\n%d\n",exchange, exchange/500, exchange%500/100);
    
    
    
//   2. 반올림
//    double num;
//    scanf("%lf",  &num);
//    num = num * 10;
//    num = num+0.5;
//    num = (int)num;
//    num= num/10;
//    printf("%f\n", num);
    
    
//   3. 세 수의 평균
//    double A,B,C;
//    scanf("%lf %lf %lf", &A, &B, &C);
//    double result = (A+B+C) / 3;
//    result = result * 100;
//    result = result + 0.5;
//    result = (int)result;
//    result = result /100;
//    printf("%f\n", result);
    
//    11 19 23
//    17.670000
    
    
//   4. 연필 개수
//      : 올림 이용

//  *** Example *************************
//  올림 (ceil), 내림(floor), 반올림(round)
//    double a= 2.567;
//    printf("%f\n", ceil(a));
    // 3.000000
//    printf("%f", floor(a));
    // 2.000000
//  ************************************
    
//    double students ;
//    scanf("%lf", &students);
//    int result = ceil(students / 12);
//    printf("%d\n",result);
    
//    178
//    15
    
    
//    최솟값 구하기
//    int num1, num2;
//
//    scanf("%d %d", &num1, &num2);
//
//    if(num1<num2){
//        printf("%d", num1);
//    }else{
//        printf("%d", num2);
//    }
//    12 11
//    11
    
    
//    짝수인가?
//    int num;
//    scanf("%d", &num);
//
//    if(num % 2 ==0 ){
//        printf("YES");
//    }else{
//        printf("NO");
//    }
//    13
//    NO
    
//    홀수, 짝수, 제로
//    int num;
//    scanf("%d", &num);
//    if(num  ==0 ){
//        printf("zero");
//    }else if(num % 2==0){
//        printf("even");
//    }else if(num%2!=0){
//        printf("odd");
//    }
//    22
//    even
    
    
//    놀이기구 키 제한
//    int height ;
//    scanf("%d",&height);
//    if(height >= 120 && height<= 150){
//        printf("YES");
//    }else{
//        printf("NO");
//    }
//    155
//    NO
    
//    세 수 중 최솟값
//    int a, b, c;
//    scanf("%d %d %d", &a,&b,&c);
//    if(a>b){
//        if(b>c){
//            printf("%d", c);
//        }else{
//            printf("%d", b);
//        }
//    }else{
//        if(a<c){
//            printf("%d", a);
//        }else{
//            printf("%d", c);
//        }
//    }
//    19 23 11
//    11

//    삼각형 판별하기
//    int a,b,c, max;
//    scanf("%d %d %d", &a, &b, &c);
//
//    if(a>b){
//        if(a>c){
//            max = a;
//            if(max < b + c){
//                printf("YES");
//            }else{
//                printf("NO");
//            }
//        }else{
//            max = c;
//            if(max < a + c){
//                printf("YES");
//            }else{
//                printf("NO");
//            }
//        }
//
//    }else{
//        if(b<c){
//            max = c;
//            if(max < b + a){
//                printf("YES");
//            }else{
//                printf("NO");
//            }
//
//        }else{
//            max = b;
//            if(max < a + c){
//                printf("YES");
//            }else{
//                printf("NO");
//            }
//        }
//    }
//    11 19 23
//    YES
    
    
//    N의 약수 구하기
//    int num,i ;
//    scanf("%d", &num);
//    for (i = 1; i <= num ; i++) {
//        if(num % i == 0){
//            printf("%d " , i);
//        }
//    }
//    30
//    1 2 3 5 6 10 15 30
    
//    소수 판별하기
//    int num,i,cnt=0;
//    scanf("%d",&num);
//    for (i = 1; i<=num; i++) {
//        if(num % i == 0){
//            cnt++;
//        }
//    }
//    if(cnt<=2){
//        printf("YES");
//    }else{
//        printf("NO");
//    }
//    53
//    YES
    
    
    
    
    
    return 0;
}


