package Basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class Stack_prac {

	
	
	//��ȣ 
	
	public static String isValid(String s) {
		int n = s.length();
		int cnt = 0;
		for(int i = 0; i< n; i++) {
			if(s.charAt(i)=='(') {
				cnt +=1;
			}else {
				cnt -=1;
			}
			if(cnt<0) {
				return "NO";
			}
			
		}
		if(cnt==0) {
			return "YES";
		}else {
			return "NO";
		}
	}
	
	public static void main(String[] args) throws IOException {

//		������ ����
//		void push(int data) {
//			stack[size] = data;
//			size +=1;
//		}
//		
//		void pop () {
//			stack[size-1] = 0 ;
//			size -=1;
//		}

//		10828��
//		������ �����ϴ� ������ ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//		����� �� �ټ� �����̴�.
//
//		push X: ���� X�� ���ÿ� �ִ� �����̴�.
//		pop: ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//		size: ���ÿ� ����ִ� ������ ������ ����Ѵ�.
//		empty: ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.
//		top: ������ ���� ���� �ִ� ������ ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//		�Է�
//		ù° �ٿ� �־����� ����� �� N (1 �� N �� 10,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ����� �ϳ��� �־�����. �־����� ������ 1���� ũ�ų� ����, 100,000���� �۰ų� ����. ������ �������� ���� ����� �־����� ���� ����.
//
//		���
//		����ؾ��ϴ� ����� �־��� ������, �� �ٿ� �ϳ��� ����Ѵ�.
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



//		#######  bufferdReader ����  #######
//		����
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String s = br.readLine(); //String
//		int i = Integer.parseInt(br.readLine()); //Int
//
//		�Է� : readLine(); �޼��� Ȱ��
//			
//		���� 1 ) ���� ���� String ���� ���� ��, �ٸ� Ÿ���� ���Ѵٸ� ����ȯ �ʼ�
//		���� 2 ) �� ����ó���� ���־�� �Ѵ�.
//			
//		Read�� ������ ����
//			Line�����θ� ���������� ������ �����Ϸ��� 
//			1) StringTokenizer�� nextToken()�� ���� readLine()�� ���� �Է¹��� ���� ��������� ����	�� ������� ȣ���� �� �ִ�.
//			2) String.Split() : �迭�� ��������� ���� �����͸� �ְ� ����ϴ� ���.

//		####### BufferdWriter ��� ########
//			: �Ϲ������� System.out.println("");�� ���µ�, ���� �������� ���ɿ��� ���̰� ���Ƿ� Buffer�� Ȱ���ϴ°� ����.
//		
//		���� & ����
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//����
//		String s = "abcdefg";  --->  ����� ���ڿ�
//		bw.write(s+"\n"); ----> ���
//		bw.flush(); ----> �����ִ� �����͸� ��� ��½�Ŵ
//		bw.close(); ----> ��Ʈ���� ����
//		
//		�ڵ� ���� ����� ���� ������ \n���� ���� ó���� ���־�� �Ѵ�.
		
		
		
//		9098��
//		������ �־����� ��, �ܾ ��� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��, �ܾ��� ������ �ٲ� �� ����. �ܾ�� ���� ���ĺ����θ� �̷���� �ִ�.
//
//		�Է�
//		ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, ������ �ϳ� �־�����. �ܾ��� ���̴� �ִ� 20, ������ ���̴� �ִ� 1000�̴�. �ܾ�� �ܾ� ���̿��� ������ �ϳ� �ִ�.
//
//		���
//		�� �׽�Ʈ ���̽��� ���ؼ�, �Է����� �־��� ������ �ܾ ��� ������ ����Ѵ�.

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int i = Integer.parseInt(br.readLine());
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		while (i-- > 0) {
//			String str = br.readLine() + "\n";
//			Stack<Character> s = new Stack<>();
//			for (char ch : str.toCharArray()) {
//				if (ch == '\n' || ch == ' ') {
//					while (!s.isEmpty()) {
//						bw.write(s.pop());
//					}
//					bw.write(ch);
//				} else {
//					s.push(ch);
//				}
//			}
//
//		}
//
//		bw.flush();

		
		
//		9012��
//		��ȣ ���ڿ�(Parenthesis String, PS)�� �� ���� ��ȣ ��ȣ�� ��(�� �� ��)�� ������ �����Ǿ� �ִ� ���ڿ��̴�. 
//		�� �߿��� ��ȣ�� ����� �ٸ��� ������ ���ڿ��� �ùٸ� ��ȣ ���ڿ�(Valid PS, VPS)�̶�� �θ���. 
//		�� ���� ��ȣ ��ȣ�� �� ��( )�� ���ڿ��� �⺻ VPS �̶�� �θ���. 
//		���� x �� VPS ��� �̰��� �ϳ��� ��ȣ�� ���� ���ο� ���ڿ� ��(x)���� VPS �� �ȴ�. �׸��� �� VPS x �� y�� ����(concatenation)��Ų ���ο� ���ڿ� xy�� VPS �� �ȴ�. 
//		���� ��� ��(())()���� ��((()))�� �� VPS ������ ��(()(��, ��(())()))�� , �׸��� ��(()�� �� ��� VPS �� �ƴ� ���ڿ��̴�. 
//
//		�������� �Է����� �־��� ��ȣ ���ڿ��� VPS ���� �ƴ����� �Ǵ��ؼ� �� ����� YES �� NO �� ��Ÿ����� �Ѵ�. 
//		
//		�Է�
//		�Է� �����ʹ� ǥ�� �Է��� ����Ѵ�. �Է��� T���� �׽�Ʈ �����ͷ� �־�����. �Է��� ù ��° �ٿ��� �Է� �������� ���� ��Ÿ���� ���� T�� �־�����. 
//		�� �׽�Ʈ �������� ù° �ٿ��� ��ȣ ���ڿ��� �� �ٿ� �־�����. �ϳ��� ��ȣ ���ڿ��� ���̴� 2 �̻� 50 �����̴�. 
//		
//		���
//		����� ǥ�� ����� ����Ѵ�. ���� �Է� ��ȣ ���ڿ��� �ùٸ� ��ȣ ���ڿ�(VPS)�̸� ��YES��, �ƴϸ� ��NO���� �� �ٿ� �ϳ��� ���ʴ�� ����ؾ� �Ѵ�. 
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		while(n-->0) {
			System.out.println(isValid(scn.next()));
		}
		
		
		
		
	}

}
