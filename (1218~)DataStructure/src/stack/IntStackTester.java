package stack;

import java.util.Scanner;

public class IntStackTester {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		IntStack s = new IntStack(64); //�ִ� 64���� Ǫ���� �� �ִ� ����
	
		
		while(true) {
			System.out.println("���� ������ ��: " +s.size() + "/" + s.capacity());
			System.out.println("(1) Ǫ�� (2) �� (3) ��ũ "+ "(4)���� (0)����");
			
			int menu = scn.nextInt()	;
			if(menu ==0) break;
			
			
			int x ;
			switch(menu) {
			
//			Ǫ��
			case 1:
				System.out.println("������ : ");
				x = scn.nextInt();
				try {
					s.push(x);
				}catch(IntStack.OverflowIntStackException e) {
					System.out.println("������ ���� á���ϴ�.");
					
				}
				break;

//			��
			case 2:
			try {
				x=s.pop();
				System.out.println("���� �����ʹ� : " +x+ "�Դϴ�");
				
			}catch(IntStack.EmptyIntStackException e) {
				System.out.println("������ ����ִ�.");
				
			}
			break;
			
//			��ũ
			case 3:
				try {
					x=s.peek();
					System.out.println("��ũ�� �����ʹ� : " + x + "�Դϴ�");
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("������ ����ִ�.");
				}
				break;
				
				
//			����
			case 4:			
				s.dump();
				break;
		}
	}

}
}