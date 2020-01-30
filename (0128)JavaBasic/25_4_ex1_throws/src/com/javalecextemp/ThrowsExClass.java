package com.javalecextemp;

public class ThrowsExClass {
		
		public ThrowsExClass() { // ������
		actionC(); // �����ڸ� �������� ���� actionC�� ����
	}
	
	private void actionA() throws Exception {
		System.out.println("actionA");
		
		int[] iArr = {1, 2, 3, 4};
		
		System.out.println(iArr[4]); // �ε��� ���� �������� ���� ���� �߻� try catch�� �ؾ������� throws�� ���־��� ������
									 //actionB�� ����. 
		
		System.out.println("actionAA");
	} 
	
	private void actionB() {
		System.out.println("actionB");
		
		try {
			actionA();
		} catch (Exception e) {
			System.out.println("���ܴ� ���⼭ ó�� �Ҳ���.^^"); 
			System.out.println(e.getMessage());
		}
		
		System.out.println("actionBB");
	}
	 
	private void actionC() {
		System.out.println("actionC");
		actionB();
		System.out.println("actionCC");
	}
}
