package method_for_while;

import java.util.Scanner;

public class Max3_1 {

//	�ִ밪�� ������ �ݺ��ؼ� ����ϴ� ��� �޼��带 Ȱ��
//	�޼��� ���� �� �޼��忡 ���޵Ǵ� ���� �����ϱ� ���� ������ ��� : �Ű�����

	//	���ĸŰ����� : ���μ�
//	�Ű����� ȣ�� �� ����ϴ� �Ű������� �� : ���μ�
//	--> �޼��� ���� : �Ű�����, ȣ��� : ���μ�
	
	static int max3(int a, int b, int c) {
		int max=a;
		if(b>max)
			max=b;
		if(c>max)
			max=c;
		return max;
	}
	public static void main(String[] args) {
		System.out.println("max3(3,2,1) = "+ max3(3,2,1));
		System.out.println("max3(5,2,2) = "+ max3(5,2,1));
		System.out.println("max3(6,2,1) = "+ max3(6,2,1));
		System.out.println("max3(7,2,1) = "+ max3(7,2,1));
		System.out.println("max3(8,2,1) = "+ max3(8,2,1));
		System.out.println("max3(9,2,1) = "+ max3(9,2,1));
		

	}

}
