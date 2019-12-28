package sort;

import java.util.Scanner;

public class ShellSort {
	static void shellsort(int[] a, int n) {
		for (int h = n / 2; h > 0; h /= 2) {
			for (int i = h; i < n; i++) {
				int j;
				int tmp = a[i];
				for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
					a[j + h] = a[j];
				}
				a[j + h] = tmp;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("�� ���� ����1");
		System.out.println("��� �� : ");
		int nx = scn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "]:");
			x[i] = scn.nextInt();
		}

		shellsort(x, nx);

		System.out.println(" ������������ ���� �Ϸ�");
		for (int i = 0; i < nx; i++) {
			System.out.println("[" + i + "]=" + x[i]);
		}
	}

}
