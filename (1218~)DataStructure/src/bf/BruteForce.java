package bf;

import java.util.Scanner;

public class BruteForce {
	static int bfMatch(String txt, String pat) {
		int pt = 0; // txtĿ��
		int pp = 0; // patĿ��

		while (pt != txt.length() && pp != pat.length()) {
			if (txt.charAt(pt) == pat.charAt(pp)) {
				pt++;
				pp++;
			} else {
				pt = pt - pp + 1;
				pp = 0;
			}

		}

		if (pp == pat.length()) {
			return pt - pp;
		}
		return -1;

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("�ؽ�Ʈ1 : ");
		String s1 = scn.next();

		System.out.println("����:");
		String s2 = scn.next();

		int idx = bfMatch(s1, s2);

		if (idx == 1) {
			System.out.println("������ ���� .");

		} else {

			// ��ġ�ϴ� ���� �ٷ� �ձ����� ���̸� ���Ѵ�.

			int len = 0;
			for (int i = 0; i < idx; i++) {
				len += s1.substring(i, i + 1).getBytes().length;
			}
			len += s2.length();

			System.out.println((idx + 1) + " ��° ���ں��� ��ġ�մϴ�.");
			System.out.println("�ؽ�Ʈ : " + s1);
			System.out.printf(String.format("���� : %%%ds\n", len), s2);
		}

	}

}


//	���

//	�ؽ�Ʈ1 : 
//	abcdefghiii
//	����:
//	hiii
//	8 ��° ���ں��� ��ġ�մϴ�.
//	�ؽ�Ʈ : abcdefghiii
//	���� :        hiii
