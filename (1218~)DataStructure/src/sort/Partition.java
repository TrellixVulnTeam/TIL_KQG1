package sort;

import java.util.Scanner;

public class Partition {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

//	�迭�� ������.

	static void partition(int[] a, int n) {
		int pl = 0; // ���� Ŀ��
		int pr = n - 1; // ������ Ŀ��
		int x = a[n / 2]; // �ǹ�(��� ��ġ ��)

		do {
			while (a[pl] < x)
				pl++;
			while (a[pr] > x)
				pr--;
			if (pl <= pr) {
				swap(a, pl++, pr--);
			}
		} while (pl <= pr);

		System.out.println("�ǹ��� ���� " + x + "�Դϴ�.");

		System.out.println("�ǹ� ������ �׷� :");
		for (int i = 0; i <= pl - 1; i++) { // a[0] ~ a[pl -1]
			System.out.print(a[i] + " ");
		}
		System.out.println();

		if (pl > pr + 1) {
			System.out.println("�ǹ��� ��ġ�ϴ� �׷�");
			for (int i = pr + 1; i <= pl - 1; i++) {  //a[pr+1] ~ a[pl-1]
				System.out.print(a[i] + " ");

			}
			System.out.println();
		}

		System.out.println("�ǹ� �̻��� �׷� :");
		for (int i = pr + 1; i < n; i++) {		//a[pr+1] ~ a[n-1]
			System.out.print(a[i] + " ");
		}
		System.out.println();

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("�迭�� �����ϴ�");
		System.out.println("��� �� : ");
		int nx = scn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "] :");
			x[i] = scn.nextInt();
		}
		partition(x, nx);		//�迭 x�� �����ϴ�.

	}
}


//			�迭�� ������
//			��� �� : 
//			7
//			x[0] :
//			39
//			x[1] :
//			42
//			x[2] :
//			52
//			x[3] :
//			5
//			x[4] :
//			4
//			x[5] :
//			7
//			x[6] :
//			8
//			�ǹ��� ���� 5�Դϴ�.
//			�ǹ� ������ �׷� :
//			4 5 
//			�ǹ� �̻��� �׷� :
//			52 42 39 7 8 
