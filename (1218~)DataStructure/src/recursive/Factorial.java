package recursive;

import java.util.Scanner;

public class Factorial {
	static int factorial(int n) {
		if (n> 0 ) {
			return n * factorial(n-1);
			
		}else {
			return 1;
			
		}
		
	}


public static void main(String[] args) {
	Scanner scn = new Scanner(System.in)	;
	System.out.println("���ڸ� �Է��ϼ���");
	int num = scn.nextInt();
	System.out.println(num + "�� ���丮���� " + factorial(num) +" �Դϴ�");
}
}


//	���
	
//	���ڸ� �Է��ϼ���
//	4
//	4�� ���丮���� 24 �Դϴ�