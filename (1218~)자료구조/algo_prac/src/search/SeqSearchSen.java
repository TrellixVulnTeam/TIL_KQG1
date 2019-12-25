package search;

import java.util.Scanner;

// ���� �˻� ( ���ʹ�)

public class SeqSearchSen {
	static int seqSearchSen(int a[], int n, int key) {
		int i = 0;
		a[n] = key; // ���ʸ� �߰�

		while (true) {
			if (a[i] == key)
				break;
			i++;

		}
		return i == n ? -1 : i;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("��ڼ� : ");

		int num = scn.nextInt();

		int[] x = new int[num + 1]; // ��ڼ� num + 1

		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "]:");
			x[i] = scn.nextInt();
		}

		System.out.println("�˻� �� �� : ");
		int ky = scn.nextInt();

		int idx = seqSearchSen(x, num, ky); // �迭 x���� ���� ky�� ��Ҹ� ��

		if (idx == -1) {
			System.out.println("��� ����");
		} else {
			System.out.println(ky + "�� x[" + idx + "]�� �ִ�. ");
		}

	}

}

//	���

//	��ڼ� : 
//	3
//	x[0]:
//	2
//	x[1]:
//	1
//	x[2]:
//	4
//	�˻� �� �� : 
//	4
//	4�� x[2]�� �ִ�. 
