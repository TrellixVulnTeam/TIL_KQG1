package method_for_while;

import java.util.Scanner;

public class SumForPos {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n;
		System.out.println("1���� n������ �� ���ϱ�");
		
		do {
			System.out.println("n�� �� : ");
			n=scn.nextInt();
			
		}while(n<=0); //n�� 0�����̸� ��ݺ� while(true) -> ��ݺ�
			
		
		int sum=0;
		
		for(int i =0;i<=n;i++) {
			sum+=i;
			
		}
		System.out.println("1���� n������ ���� : " +sum +" �Դϴ�.");

	}

}
