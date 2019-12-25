package search;


//Ŭ���� �޼���� �ν��Ͻ� �޼���
//
//	Ŭ���� �޼��� : �����޼���
//		Ŭ���� ��ü�� ���� ó���� ���.
//	�ν��Ͻ� �޼��� : ������ �޼��� (static�� ������ ����)
	

//	�ν��Ͻ� �޼��� ȣ�� �� :Ŭ������ ����.�޼��� �̸�
//	Ŭ���� �޼��� ȣ�� �� : Ŭ���� �̸�.�޼��� ��


public class IdTester {
	private static int counter = 0; // ���̵� � �ο��ߴ��� ����
	
	private int id ;	// ���̵�
	
	
	//������
	public IdTester() {
		id=++counter;
	}
	
	//���̵� ��ȯ�ϴ� �ν��Ͻ� �޼���
	public int getIdTester() {
		return id;
		
	}
	
	//counter�� ��ȯ�ϴ� Ŭ���� �޼���
	public static int getCounter() {
		return counter;
	}
	
	public static void main(String[] args) {
		IdTester a = new IdTester();
		IdTester b = new IdTester();
		
		System.out.println("a�� ���̵� : " + a.getIdTester());
		System.out.println("b�� ���̵� : " + b.getIdTester());
		
		System.out.println("�ο��� ���̵��� ���� : "+IdTester.getCounter());
		
		
	}

}
//	���

//	a�� ���̵� : 1
//	b�� ���̵� : 2
//	�ο��� ���̵��� ���� : 2

