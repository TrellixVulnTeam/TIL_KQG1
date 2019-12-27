package recursive;

import java.util.Scanner;

public class EuclidGCD {
	static int gcd(int x , int y) {
		if (y==0) {
			return x;
			
		}else {
			return gcd(y, x%y);
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.println("�� ������ �ִ������� ���մϴ�.");
		System.out.println("������ �Է��ϼ���");
		System.out.println("a:");
		int a = scn.nextInt()	;
		System.out.println("b:");
		int b = scn.nextInt();
		
		System.out.println("�� ������ �ִ������� " + gcd(a,b) + "�Դϴ�.");
		
	}

}


//	���
	
//	�� ������ �ִ������� ���մϴ�.
//	������ �Է��ϼ���
//	a:
//	4
//	b:
//	10
//	�� ������ �ִ������� 2�Դϴ�.
