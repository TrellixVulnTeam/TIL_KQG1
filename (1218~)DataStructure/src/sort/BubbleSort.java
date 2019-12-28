package sort;

import java.util.Scanner;

public class BubbleSort {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void bubbleSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {

//			�н�
			for (int j = n - 1; j > i; j--) {
				if (a[j - 1] > a[j])
					swap(a, j - 1, j);
			}
		}
	}

	static void bubbleSortV2(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			
			int exchg = 0;	//�н��� ��ȯ Ƚ��
			
			for (int j = n - 1; j > i; j--) {
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					exchg++;
				}
				
			}
			if(exchg==0)break;
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("�������� ����1");
		System.out.println("��� ��:");
		int n = scn.nextInt();
		int[] x = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("x[" + i + "] : ");
			x[i] = scn.nextInt();
		}

		bubbleSortV2(x, n);

		System.out.println(" ������������ ���� �Ϸ�");
		for (int i = 0; i < n; i++) {
			System.out.println("[" + i + "]=" + x[i]);
		}
	}

}

//	���

//	�������� ����1
//	��� ��:
//	4
//	x[0] : 
//	3
//	x[1] : 
//	2
//	x[2] : 
//	5
//	x[3] : 
//	6
//	 ������������ ���� �Ϸ�
//	[0]=2
//	[1]=3
//	[2]=5
//	[3]=6
