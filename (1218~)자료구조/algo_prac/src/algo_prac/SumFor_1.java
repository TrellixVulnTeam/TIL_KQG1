package algo_prac;

import java.util.Scanner;

public class SumFor_1 {

	public static void main(String[] args) {
		System.out.println("���� �Է�");
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		int sum=0;
		if (n==7) {
			for(int i=1; i<=n ; i++) {
				if(i<n) {
					System.out.print(i + " + ");
				}
				else {
					System.out.print(i);
				}
				sum+=i;
				
			}
			System.out.println(" = " +sum);	
			System.out.println("7������ ���� : " + sum +" �Դϴ�");
			
		
		}
		else{
			System.out.println("7 �̿��� ���ڸ� �Է��Ͽ����ϴ�.");
		}
		

	}

}
