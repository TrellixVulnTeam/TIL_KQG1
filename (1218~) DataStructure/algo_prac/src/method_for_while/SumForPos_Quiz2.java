package method_for_while;

import java.util.Scanner;

public class SumForPos_Quiz2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int a= 0;
		int result= 0;
		
		
		a = scn.nextInt();
		do {
			a/=10;
			result++; //���������� int���̴ϱ� �ٷ� 0���� ǥ�õǰ� do ������ ����������
		}while(a>0);
		

		System.out.println("�� ���� " +result +"�ڸ� �Դϴ�");
			}

}
