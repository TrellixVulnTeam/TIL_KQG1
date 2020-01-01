package sort;

import java.util.Scanner;

public class ShellSort2 {
	static void shellsort(int[] a, int n) {
		int h ;
		for (h=1 ; h< n/9 ; h = h * h +1) ;
		
		
//		1���� ������
		
		for( ; h > 0 ; h/=3 ) {
			for (int i = 0; i<n  ; i ++) {
				int j ;
				int tmp = a[i];
				for (j = i- h ; j >=0 && a[j]> tmp ; j -= h) {
					a [j+h] = a [j];
					
				}
				a[j+h]= tmp;
			}
		}
			
//		������ h���� 1�̵ȴ�.
//		���⵵�� O(n^1.25)	�� ���� O(n^2)���� �������� �ָ� ������ �ִ� ��Ҹ� ��ȯ�ؾ� �ϹǷ� ������������ �ʴ�.
		
	
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println(" �� ���� ���� 2");
		System.out.println(" ��� ��  : ");
		int nx = scn.nextInt();
		int [] x= new int [nx];
		
		
		for (int i = 0; i<nx; i ++) {
			System.out.println("x[" + i + "]");
			x[i] = scn.nextInt();
			
		}
		
		shellsort(x,nx);
		
		
		System.out.println(" ������������ ���� �Ϸ�");
		for (int i = 0; i < nx; i++) {
			System.out.println("[" + i + "]=" + x[i]);
		}
				
	}

}
