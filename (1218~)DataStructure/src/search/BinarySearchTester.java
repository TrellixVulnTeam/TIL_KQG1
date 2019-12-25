package search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {

	public static void main(String[] args) {
		Scanner scn  = new Scanner(System.in);
		System.out.println("��� �� :");
		int num  = scn.nextInt()	;
		int x[] = new int[num];
		
		System.out.println("������������ �Է��ϼ���");
		System.out.println("x[0]:");
		
		x[0] = scn.nextInt();
		
		for(int i = 1 ; i<num ; i++) {
			do {
				System.out.println("x[" +i + "]");
				x[i] = scn.nextInt()	;
				
			}while(x[i]<x[i-1]);
		}
		System.out.println("�˻��� �� : ");
		
		int ky = scn.nextInt();
		
		int idx= Arrays.binarySearch(x, ky);
		
		if(idx<0) {
		
			System.out.println("��� ����");
			System.out.println(idx);
			
		}else {
			System.out.println(ky +"�� x[" + idx + "]�� �ִ�.");
		}
		
	}

}


//	���
	
//	��� �� :
//		3
//		������������ �Է��ϼ���
//		x[0]:
//		1
//		x[1]
//		2
//		x[2]
//		3
//		�˻��� �� : 
//		3
//		3�� x[2]�� �ִ�.


// �˻� ���� �� ��������Ʈ�� -x-1

//	��� �� :
//	2
//	������������ �Է��ϼ���
//	x[0]:
//	1
//	x[1]
//	2
//	�˻��� �� : 
//	4
//	��� ����
//	-3


