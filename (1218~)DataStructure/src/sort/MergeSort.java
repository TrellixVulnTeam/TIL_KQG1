package sort;

import java.util.Scanner;

public class MergeSort {

	static int[] buff; // �۾��� �迭

	// a[left] ~ a[right]�� ��������� ���� ����
	static void __mergeSort(int[] a, int left, int right) {
		if (left < right) {
			int i;
			int center = (left + right) / 2;
			int p = 0;
			int j = 0;
			int k = left;

			__mergeSort(a, left, center);// �迭�� �պκ��� ���� ����
			__mergeSort(a, center + 1, right);// �迭�� �޺κ��� �� ����

			for (i = left; i <= center; i++) {
				buff[p++] = a[i];

			}
			while (i <= right && j < p) {
				a[k++] = (buff[j] <= a[i]) ? buff[j++] : a[i++];
			}
			while (j < p) {
				a[k++] = buff[j++];

			}

		}

	}

//	��������
	static void mergeSort(int[] a, int n) {
		buff = new int[n];

		__mergeSort(a, 0, n - 1); // �迭 ��ü�� ��������

		buff = null; // �۾��� �迭�� ����
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("��������");
		System.out.print("��ڼ� : ");
		int num = scn.nextInt();

		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] :");
			x[i] = scn.nextInt();
		}

		mergeSort(x, num);

		System.out.println("������������ �����Ͽ����ϴ�.");
		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}

	}

}

//	���

//	��������
//	��ڼ� : 6
//	x[0] :4
//	x[1] :5
//	x[2] :6
//	x[3] :3
//	x[4] :4
//	x[5] :3
//	������������ �����Ͽ����ϴ�.
//	x[0] = 3
//	x[1] = 3
//	x[2] = 4
//	x[3] = 4
//	x[4] = 5
//	x[5] = 6
