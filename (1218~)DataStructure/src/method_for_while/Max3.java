package method_for_while;

import java.util.Scanner;

public class Max3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�� ������ ���� ���ϱ�");
		System.out.println("a�� �� : "); 
			int a = stdIn.nextInt();
		System.out.println("b�� �� : "); 
			int b = stdIn.nextInt();
		System.out.println("c�� �� : "); 
			int c = stdIn.nextInt();
		
			
//������ ����	
		int max =a;

		//���ñ��� (if) 
		if(b>max) max=b;
		if(c>max) max=c;
		System.out.println( "�ִ밪�� "+max+"�Դϴ�");
		

	}

}
