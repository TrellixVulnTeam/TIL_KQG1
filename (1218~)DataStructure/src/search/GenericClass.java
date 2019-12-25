package search;


//���׸�
//:ó���ؾ� �� �����	�ڷ����� �������� �ʴ� Ŭ����(�������̽�)���� ���
//
//class Ŭ�����̸� <�Ķ����> {  ... }
//interface �������̽��̸� <�Ķ����> { ... }
//	�Ķ���� �������� <�Ķ����, �Ķ����>
	
//	�Ű������� ������ '�ڷ���'�� ���� ���� �� �ִ�.
	
//	�Ķ���� �̸� �ۼ���
//	1. 1���� �빮�ڷ� ����Ѵ�.
//	2. �÷����� �ڷ����� element�� E�� ���
//		�÷����� �ڹٿ��� �����ϴ� �⺻ �ڷᱸ���� ���� ��
//	3. ���� Ű,���� K,V ���
//	4. �Ϲ������� T�� ����Ѵ�.

//���������� ���ϵ�ī�� ���� ����
//< ? extends T > : Ŭ���� t�� ����Ŭ������ ���޹޴´�.
//< ? super T > : Ŭ���� t�� ����Ŭ���� ���޹޴´�.

class GenericClass {
	static class GenericClassTest<T>{
		
		private T xyz;
		
		GenericClassTest(T t){ //������
			this.xyz=t;
		}
		
		T getXyz() {
			return xyz;
		}
	}
	public static void main(String[] args) {
		//������ ���� �Ķ���Ϳ� String �� �ѱ���� �ְ� Integer�� �ѱ� �� �ִ�.
		GenericClassTest<String> s = new GenericClassTest<String>("ABC");
		GenericClassTest<Integer> n = new GenericClassTest<Integer>(123);
		
		System.out.println(s.getXyz());
		System.out.println(n.getXyz());
		
	}

}


	
//	���
	
//	ABC
//	123

