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
		return (indexOf(n)!=-1) ? true: false;
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
		int n = (s.max < num) ? s.max : num; // ������ ��� ����
		for (int i = 0; i < n; i++) {
			s.set[i] = set[i];
		}
		s.num = n;
	}

	// ���� s�� �����Ѵ�.
	public void copyFrom(IntSet s) {
		int n = (max < s.num) ? max : s.num;
		for (int i = 0; i < n; i++) {
			set[i] = s.set[i];
		}
		num = n;

	}

//	���� s�� ������ Ȯ��

	public boolean equalTo(IntSet s) {
		if (num != s.num) { 	//��Ұ����� ���� ������ ���յ� �����ʴ�.
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
		IntSet s1 = new IntSet(20);
		IntSet s2 = new IntSet(20);
		IntSet s3 = new IntSet(20);
		
		
		s1.add(10);	// s1= {10}
		s1.add(15); // s1= {10,15}
		s1.add(20); // s1= {10,15,20}
		s1.add(25);	// s1= {10,15,20,25}
		
		
		s1.copyTo(s2);  //s2 ={10,15,20,25}
		s2.add(12);		//s2 ={10,15,20,25,12}
		s2.remove(25);	//s2 ={10,15,20,12}
		
		s3.copyFrom(s2); //s3 ={10,15,20,12}
		
		System.out.println("s1 = " +s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		
		
		System.out.println("���� s1�� �ִ� 15�� " + (s1.contains(15)? "���Եȴ�" :"���Ե��� �ʴ´�"));
		System.out.println("���� s2�� �ִ� 25�� " + (s2.contains(15)? "���Եȴ�" :"���Ե��� �ʴ´�"));
		System.out.println("���� s1�� s2�� " + (s1.equals(s2)? "����" :"�ٸ���"));
		System.out.println("���� s2�� s3�� " + (s2.equals(s3)? "����" :"�ٸ���"));
		
		s3.unionOf(s1, s2);
		System.out.println("s3 = " + s3);
		System.out.println("s1�� s2�� �������� " + s3 + "�Դϴ�.");
		
	}

}

//	���

//	s1 = {10 15 20 25 }
//	s2 = {10 15 20 12 }
//	s3 = {10 15 20 12 }
//	���� s1�� �ִ� 15�� ���Եȴ�
//	���� s2�� �ִ� 25�� ���Եȴ�
//	���� s1�� s2�� �ٸ���
//	���� s2�� s3�� �ٸ���
//	s3 = {10 15 20 25 12 }
//	s1�� s2�� �������� {10 15 20 25 12 }�Դϴ�.


