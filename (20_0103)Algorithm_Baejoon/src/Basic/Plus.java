package Basic;

import java.util.Scanner;

public class Plus {

	public static void main(String[] args) {

//		1000�� 
//		int num1,num2=0;
//		Scanner scn1 = new Scanner(System.in);
//		Scanner scn2 = new Scanner(System.in);
//		 num1 = scn1.nextInt();
//		 num2 = scn1.nextInt();
//		System.out.println(num1+num2);

		
//		2558��
//		�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//		�Է�
//		ù° �ٿ� A, ��° �ٿ� B�� �־�����. (0 < A, B < 10)
//
//		���
//		ù° �ٿ� A+B�� ����Ѵ�.

//		int a,b =0 ;
//		Scanner scn = new Scanner(System.in);
//		Scanner scn2 = new Scanner(System.in);
//		a =  scn.nextInt();
//		b = scn.nextInt();
//			if(0<a && b<10) {
//				System.out.println(a+b);
//			}

		
//		10950��
//		�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//		�Է�
//		ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
//
//		�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
//
//		���
//		�� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.

//		int tcase = 0;
//
//		Scanner scn = new Scanner(System.in);
//
//		tcase = scn.nextInt();
//		int a, b = 0;
//		for (int i = 0; i < tcase; i++) {
//			a = scn.nextInt();
//			b = scn.nextInt();
//			System.out.println(a + b);
//		}
	
		
//		10951��
//		�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//		�Է�
//		�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
//
//		�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
//
//		���
//		�� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.
		
		
		
//		Scanner scn = new Scanner(System.in);
//		
//		int a,b = 0;
//	
//		while(scn.hasNextInt()) {
//			a =scn.nextInt();
//			b = scn.nextInt();
//			System.out.println(a+b);
//		}
//		
		
		
		
//		10952��
//		�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//		�Է�
//		�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
//
//		�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
//
//		�Է��� ���������� 0 �� ���� ���´�.
		
//		Scanner scn = new Scanner(System.in);
//		
//		int a,b = 0;
//		
//		do {
//			a = scn.nextInt();
//			b = scn.nextInt();
//			if(a!=0 && b!=0)
//			System.out.println(a+b);
//		}while(a != 0 && b!= 0);
		

		
		
//		10953��
//		ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
//
//		�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. A�� B�� �޸�(,)�� ���еǾ� �ִ�. (0 < A, B < 10)
		
		Scanner scn  = new Scanner(System.in);
		
		int a ,b, tcase= 0 ;
		tcase = scn.nextInt();
		
		//����
//		for (int i = 0; i< tcase ; i++) {
//			a = scn.nextInt();
//			System.out.print(",");
//			b = scn.nextInt();
//			System.out.println(a+b);
//			
//		}
		
		for(int i=0;i<tcase;i++){
            String[] arr = scn.next().split(",");
            System.out.println(Integer.parseInt(arr[0])+Integer.parseInt(arr[1]));
        }
		
	
		
		
	}

}
