package method_for_while;

import java.util.Scanner;

public class Median {
	static int median(int a, int b, int c) {
		if (a >= b) {
			if (b >= c)
				return b;
			else if (a <= c) {
				return a;

			} else
				return c;
		} else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("�� ������ �߾Ӱ� ���ϱ�");
		System.out.println("a�� �� : ");
		int a = stdIn.nextInt();
		System.out.println("b�� �� : ");
		int b = stdIn.nextInt();
		System.out.println("c�� �� : ");
		int c = stdIn.nextInt();

		System.out.println("�߾Ӱ��� " + median(a, b, c) + "�Դϴ�");

	}

}
