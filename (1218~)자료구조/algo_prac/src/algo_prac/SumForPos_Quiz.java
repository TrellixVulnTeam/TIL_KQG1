package algo_prac;

import java.util.Scanner;

public class SumForPos_Quiz {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("a�� �Է��ϼ���");
		int a = scn.nextInt();
		System.out.println("b�� �Է��ϼ���");
		int b= scn.nextInt();
		int minus;
		do {
			System.out.println("a���� ū ���� �Է��ϼ���");
			System.out.println("b�� �� : ");
			b= scn.nextInt();
			minus=b-a;
		}while(b<a);
		System.out.println("b-a���� : " + minus + " �Դϴ�.");
	}

}
