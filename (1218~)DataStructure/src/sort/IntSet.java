package sort;

import java.util.Arrays;
import java.util.Scanner;

public class IntSet {
	private int max; // ������ �ִ� ����
	private int num; // ������ ��� ����
	private int[] set; // ���� ��ü

	public IntSet(int capacity) {
		num = 0;
		max = capacity;
		try {
			set = new int[max]; // ���� �迭 ����
		} catch (OutOfMemoryError e) { // �迭 ���� ����
			max = 0;
		}
	}

//	������ �ִ� ����
	public int capacity() {
		return max;
	}

//	������ ��� ����
	public int size() {
		return num;
	}

	public int indexOf(int n) {
		for (int i = 0; i < num; i++) {
			if (set[i] == n)
				return i;

		}
		return -1;

	}

	// ���տ� n �� �ִ��� ������ Ȯ��
	public boolean contains(int n) {
		if (num >= max || contains(n) == true) { // ���� á�ų� �̹� n�� ����.
			return false;
		} else {
			set[num++] = n; // ���� ������ �ڸ��� n �߰�
		}
		return true;
	}

	public boolean add(int n) {
		if (num >= max || contains(n) == true) {
			return false;
		} else {
			set[num++] = n;
		}
		return true;
	}
	// ���տ��� n�� �����Ѵ�.

	public boolean remove(int n) {
		int idx; // n�� ����� ����� �ε���

		if (num <= 0 || (idx = indexOf(n)) == -1) { // ����ְų� n�� �������� ��
			return false;
		} else {
			set[idx] = set[--num]; // ������ ��Ҹ� ������ ������ �ű��.
			return true;
		}
	}

	// ���� s�� �����Ѵ�.

	public void copyTo(IntSet s) {
		int n = (s.max < s.num) ? s.max : s.num; // ������ ��� ����
		for (int i = 0; i < n; i++) {
			s.set[i] = set[i];
		}
		s.num = n;
	}

	// ���� s�� �����Ѵ�.
	public void copyFrom(IntSet s) {
		int n = (max < s.num) ? s.max : s.num;
		for (int i = 0; i < n; i++) {
			set[i] = s.set[i];
		}
		num = n;

	}

//	���� s�� ������ Ȯ��

	public boolean equalTo(IntSet s) {
		if (num != s.num) {
			return false;

		}

		for (int i = 0; i < num; i++) {
			int j = 0;
			for (; j < s.num; j++) {
				if (set[i] == s.set[j]) {
					break;
				}
				if (j == s.num) {
					return false; // set[i]�� s�� ���Ե��� �ʽ��ϴ�.
				}
			}
		}
		return true;
	}

	public void unionOf(IntSet s1, IntSet s2) {
		copyFrom(s1);
		for (int i = 0; i < s2.num; i++) {
			add(s2.set[i]);
		}
	}
	
	
	

	@Override
	public String toString() {
		StringBuffer temp = new StringBuffer("{");
		for( int i = 0 ; i< num ; i++) {
			temp.append(set[i]+" ");
		}
		temp.append("}");
		return temp.toString();
	}

	
	
//	toString �޼��� :
//		Ŭ���� �ν��Ͻ��� �����͸� ���ڿ��� ��ȯ�ϴ� �޼���
//		
//		Ŭ�������� �����ϴ� ���� �����ڰ��� ���
//		
//	ObjectŬ������ ��ӹޱ� ������ �������̵���.
//	�̶�, ���� ������ �ٲ� �� ����
	
	
	public static void main(String[] args) {

	}

}
