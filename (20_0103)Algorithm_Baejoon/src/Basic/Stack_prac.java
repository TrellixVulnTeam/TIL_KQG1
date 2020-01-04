package Basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;


public class Stack_prac {

	public static void main(String[] args) throws IOException {

//		스택의 구현
//		void push(int data) {
//			stack[size] = data;
//			size +=1;
//		}
//		
//		void pop () {
//			stack[size-1] = 0 ;
//			size -=1;
//		}

		
		
//		10828번
//		정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
//
//		명령은 총 다섯 가지이다.
//
//		push X: 정수 X를 스택에 넣는 연산이다.
//		pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//		size: 스택에 들어있는 정수의 개수를 출력한다.
//		empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
//		top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//		입력
//		첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
//
//		출력
//		출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
//		
//		Scanner scn = new Scanner(System.in);
//
//		int n = scn.nextInt();
//
//		int[] stack = new int[n];
//		int size = 0;
//		while (n-- > 0) {
//			String cmd = scn.next();
//			if (cmd.equals("push")) {
//				int num = Integer.parseInt(scn.next());
//				stack[size++] = num;
//			} else if (cmd.equals("top")) {
//				if (size == 0) {
//					System.out.println("-1");
//				} else {
//					System.out.println(stack[size - 1]);
//				}
//			} else if (cmd.equals("size")) {
//				System.out.println(size);
//
//			} else if (cmd.equals("empty")) {
//				if (size == 0) {
//					System.out.println("1");
//				} else {
//					System.out.println("0");
//				}
//			} else if (cmd.equals("pop")) {
//				if (size == 0) {
//					System.out.println("-1");
//				} else {
//					System.out.println(stack[size - 1]);
//					size -= 1;
//				}
//			}
//
//		}
		
		
//		문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램을 작성하시오. 단, 단어의 순서는 바꿀 수 없다. 단어는 영어 알파벳으로만 이루어져 있다.
//
//		입력
//		첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 문장이 하나 주어진다. 단어의 길이는 최대 20, 문장의 길이는 최대 1000이다. 단어와 단어 사이에는 공백이 하나 있다.
//
//		출력
//		각 테스트 케이스에 대해서, 입력으로 주어진 문장의 단어를 모두 뒤집어 출력한다.
		
		
//		#######  bufferdReader 사용법  #######
//		선언
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String s = br.readLine(); //String
//		int i = Integer.parseInt(br.readLine()); //Int
//
//		입력 : readLine(); 메서드 활용
//			
//		주의 1 ) 리턴 값은 String 으로 고정 즉, 다른 타입을 원한다면 형변환 필수
//		주의 2 ) 꼭 예외처리를 해주어야 한다.
//			
//		Read한 데이터 가공
//			Line단위로만 나누어지기 때문에 가공하려면 
//			1) StringTokenizer의 nextToken()을 쓰면 readLine()을 통해 입력받은 값이 공백단위로 구분	해 순서대로 호출할 수 있다.
//			2) String.Split() : 배열에 공백단위로 끊어 데이터를 넣고 사용하는 방법.

		
		
//		####### BufferdWriter 사용 ########
//			: 일반적으로 System.out.println("");를 쓰는데, 양이 많아지면 성능에서 차이가 나므로 Buffer를 활용하는게 좋다.
//		
//		사용법 & 선언
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//선언
//		String s = "abcdefg";  --->  출력할 문자열
//		bw.write(s+"\n"); ----> 출력
//		bw.flush(); ----> 남아있는 데이터를 모두 출력시킴
//		bw.close(); ----> 스트림을 닫음
//		
//		자동 개행 기능이 없기 때문에 \n으로 따로 처리를 해주어야 한다.
	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(br.readLine());
		BufferedWriter bw = new  BufferedWriter(new OutputStreamWriter(System.out));
		while(i--> 0) {
				String str = br.readLine() +"\n";
				Stack<Character> s = new Stack<>();
				for(char ch: str.toCharArray()) {
					if(ch=='\n' || ch==' ') {
						while(!s.isEmpty()) {
							bw.write(s.pop());
						}
						bw.write(ch);
					}else {
						s.push(ch);
					}
				}
						
		}
		
		
		bw.flush();

	}

}
