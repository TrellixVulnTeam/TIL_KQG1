package method_for_while;

import java.util.Scanner;

public class Max3_2 {

//�������� 1 : �Ű����� 4��
	
	static int max4(int a, int b, int c, int d) {
		int max=a;
		if(b>max)
			max=b;
		if(c>max)
			max=c;
		if(d>max)
			max=d;
		return max;
	}
	
//�������� 2 : �ּڰ� ���ϱ�
	
	static int min(int a, int b, int c) {
		int min=a;
		if(b<min)
			min=b;
		if(c<min)
			min=c;
		return min;
	}
	public static void main(String[] args) {
		
		System.out.println("max4(3,2,5,19) = " + max4(3,2,5,19));
		
		System.out.println("min(1,2,3) = "+min(1,2,3));
		

	}

}


//####### �߰� #######
	//	�� ���� ��� ���� : 13���� ���� -- ���� Ʈ��



