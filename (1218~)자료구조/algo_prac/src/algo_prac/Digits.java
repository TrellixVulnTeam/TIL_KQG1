package algo_prac;

import java.util.Scanner;


//2�ڸ� ������ �����ϴ� ���α׷�

public class Digits {

	public static void main(String[] args) {
//		�ϳ��� �Ա��� �ⱸ�� ���� ������Ҹ��� 
//			���������� ��ġ�� �����ϴ� ���  : ������ ���α׷���
		
//		1. ����
//		2. ����
//		3. �ݺ� 
		
//		3������ ���� �帧 ���
		
		Scanner digits= new Scanner(System.in);
		int no;
		
		System.out.println("2�ڸ� ���� �Է�");
		
		do {
			System.out.println("2�ڸ��� �Է����ּ���");
			System.out.println("�Է� : ");
			no=digits.nextInt();
			
		
		//�� ������ 
			// ������ : �����ڿ� ���� ������ TRUE �ų� FALSE �� �ڿ� ������ �Ǵ��� ���� �ʴ� ��
		}while(no<10||no>99); //������� , //�������� : while(!(no>=10&&no<=99));
		
		// + ��𸣰� ��Ģ
		// (a>10||a<99) = !(a<=10 && a>=99)
		
		
		
		System.out.println("���� no�� ���� : " + no + " �� �Ǿ����ϴ�.");
		

	}

}
