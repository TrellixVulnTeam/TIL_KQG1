package search;

import java.util.Arrays;
import java.util.Scanner;

//�ڿ�����
//����� ���� ���� ���ĵ� ��.

public class StringBinarySearch {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
//		�ڿ����� �Ǿ��ִ� �ɷ� ����
		String[] x = {
				"boolean", "assert" , "string" , "break", "byte","case","do","char"
		};
		System.out.println("���ϴ� Ű���带 �Է��ϼ��� : ");
		String ky = scn.next();
		
		int idx = Arrays.binarySearch(x, ky);
		
		if(idx<0) {
			System.out.println("�ش� Ű���� ���� ����.");
			
		}else {
			System.out.println("�ش� Ű����� x[" +idx + "]�� �ִ�.");
		}
	}

}


//	���
//	
//	���ϴ� Ű���带 �Է��ϼ��� : 
//		do
//		�ش� Ű����� x[6]�� �ִ�.
