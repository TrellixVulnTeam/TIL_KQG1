package algo_prac;

import java.util.Scanner;

public class JudgeSign {
		
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("���� �Է�");
		int n = stdIn.nextInt();
		
		if(n>0)
			System.out.println("���");
		else if(n<0)
			System.out.println("����");
		else
			System.out.println("0");

	}

}

//���ǿ�����
//	a?b:c 
//		a�� TRUE �̸� b 
//			FALSE �� c�� ��ȯ
//	a= (x>y)? x:y;
//	System.out.println((c==0)? "c�� 0 " : "c�� 0�� �ƴ�");