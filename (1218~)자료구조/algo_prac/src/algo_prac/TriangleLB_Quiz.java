package algo_prac;

import java.util.Scanner;

public class TriangleLB_Quiz {
	
	
	//���� �Ʒ��� ������ �̵ �ﰢ�� ���
	static void trianglLB(int n) {
		for (int i =1 ; i <=n ; i++) {
			for( int j =1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
	//���� ���� ������ �̵ �ﰢ��
	static void TriangleLU(int n ) {
		for(int i =1; i<=n ; i ++) {
			for(int j =i ; j<=n ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	//������ ���� ������ �̵ �ﰢ��

	static void triangleRU(int n) {
		for (int i = 1; i <= n; i++) { 				// i�� (i = 1, 2, �� ,n)
			for (int j = 1; j <= i - 1; j++) 		// i-1���� ' '�� ��Ÿ��
				System.out.print(' ');
			for (int j = 1; j <= n - i + 1; j++) 	// n-i+1���� '*'�� ��Ÿ��
				System.out.print('*');
			System.out.println();					// ����(�ٺ�ȯ)
		}
	}

	
	//������ �Ʒ��� ������ �̵ �ﰢ��
	
	static void triangleRB(int n) {
		for(int i =1; i<=n; i++) {
			
			for (int j =1 ; j<=n-i; j++)   // i - 1 ����  ' '  
				System.out.print(" ");
			
			for(int j =1; j<=i; j++)   		//i �� ���� ��ŭ 
				System.out.print("*");
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		
//		trianglLB(9);
//		
//		*
//		**
//		***
//		****
//		*****
//		******
//		*******
//		********
//		*********
		
//		TriangleLU(8);
//		
//		********
//		*******
//		******
//		*****
//		****
//		***
//		**
//		*
		
//		triangleRU(4);
//		
//		****
//		 ***
//		  **
//		   *

		
//		triangleRB(4);
//		
//		   *
//		   **
//		  ***
//		 ****


	}

}
