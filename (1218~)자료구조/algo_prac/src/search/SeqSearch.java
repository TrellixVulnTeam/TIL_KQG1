package search;

import java.util.Scanner;

public class SeqSearch {
	//  While�� �̿�
//	static int seqSearch(int[] a , int n, int key) {
//		int i = 0;
//		while(true) {
//			if(i==n) {
//				return -1; //�˻� ���� : -1 �� ��ȯ
//				
//			}
//			if(a[i]==key) {
//				return i; //�˻� ���� :�ε����� ��ȯ
//				
//			}
//			i++;
//		}
//	}

	// FOR�� ��
	static int seqSearch(int[] a, int n, int key) {
		for (int i = 0; i < n; i++) {
			if (a[i] == key)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("��� �� :");
		int num = scn.nextInt();
		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "]");
			x[i] = scn.nextInt();

		}
		System.out.println("�˻��� �� :");
		int ky = scn.nextInt();
		int idx = seqSearch(x, num, ky); // �迭x���� Ű ���� ky �� ��Ҹ� �˻�
		if (idx == -1) {
			System.out.println("�� ���� ��Ұ� ����.");
		} else {
			System.out.println(ky + "��x[" + idx + "]�� �ִ�.");
		}

	}

}

//	���

//	��� �� :
//	3
//	x[0]
//	1
//	x[1]
//	2
//	3x[2]
//	
//	�˻��� �� :
//	2
//	2��x[1]�� �ִ�.
