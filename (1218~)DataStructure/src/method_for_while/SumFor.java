package method_for_while;

import java.util.Scanner;

public class SumFor {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int a = stdIn.nextInt();
		
		int sum = 0;
		for( int i =1 ; i<=a ; i++) {
			sum += i;
		}
		System.out.println("���� ? " + sum);

	}

}


//For������ �ʱ�ȭ, �����, ������Ʈ �κ��� ���� ���� * �����ݷ��� �����ϸ� �ȵ�
//For ���� �Ŀ��� ������ ����Ϸ��� For�� �۾ּ� �������־�� �Ѵ�.

