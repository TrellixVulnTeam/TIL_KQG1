package algo_prac;

import java.util.Scanner;

public class SumFor_2 {

	public static void main(String[] args) {
		// ���콺�� ���� ������� �� ���ϱ�
		// ex) 1���� 10������ �� : (1+10)*5 = 55

	 System.out.println("���� �Է� : ");
		Scanner scn = new Scanner(System.in);
	 
		
// ���� : Ȧ�� �տ� ���� ó���� ���� ����....		
	 int n = scn.nextInt();
	 int init = 1;
	 int mul = n/2;
	 int sum = (init + n)* mul;
	 System.out.println(sum);
	 
	 
	 
//	�ش� 
	int sum2 = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0); // ��
	System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");
	}
	
	

}
