//�ݺ����� ( ���� )


package method_for_while;

import java.util.Scanner;

public class SumWhile {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1���� n������ �� ���ϱ�");
		System.out.println("n�� �� : ");
		int n = stdIn.nextInt();
		
	//���� ���ϱ� ���� �غ�
		int sum =0;
		int i =1;
		
	//���� ����
		while(i<=n) {
			sum+=i;
			i++;
		}
		System.out.println("1���� n������ ����" + sum +" �Դϴ�");
		
		//�������� Q6. 
		// while�� ���� �� ���� i ���� n+1�� ���� Ȯ���ϱ� 
		System.out.println("���� i ���� : " + i);
	}
}

//###### �ϳ��� ���� ���� For���� ����ϴ� ���� ���� ######
