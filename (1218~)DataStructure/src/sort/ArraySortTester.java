package sort;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortTester {
	
//	ArraySort�޼��带 �̿��� QuickSort

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("��� �� : ");
		int num = scn.nextInt();
		
		int[] x= new int[num];
		
		for(int i = 0 ; i< num ; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = scn.nextInt();
			
		}
		
		Arrays.sort(x);
		
		System.out.println("������������ �����Ͽ����ϴ�.");
		for(int i = 0 ; i<num ; i++) {
			System.out.println("x[" + i + "] = "+ x[i]);
		}
				
		
		
	}

}



//	���

//	��� �� : 
//	8
//	x[0] : 5
//	x[1] : 7
//	x[2] : 9
//	x[3] : 5
//	x[4] : 3
//	x[5] : 4
//	x[6] : 2
//	x[7] : 1
//	������������ �����Ͽ����ϴ�.
//	x[0] = 1
//	x[1] = 2
//	x[2] = 3
//	x[3] = 4
//	x[4] = 5
//	x[5] = 5
//	x[6] = 7
//	x[7] = 9
