package stack;




public class IntStack {
	
	private int max; 
	private int ptr;
	private int[] stk;
	
//	����� ���� : ������ �������.
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException(){}
	}
	
//	����� ���� : ���� á�� ��
	public class  OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {
			
		}
	}
	//����
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk  = new int[max];	//���� ��ü�� �迭 ����
			
		}catch(OutOfMemoryError e) { // ������ �� ����
			max = 0;
		}
	}

	
	
//	���ÿ� x�� Ǫ��
	public int push(int x ) throws OverflowIntStackException{
		if (ptr>=max) {
			throw new OverflowIntStackException();
			
		}
		return stk[ptr++]=x;
	}
	
	
//	���ÿ��� �����͸� ��
	public int pop () throws EmptyIntStackException{
		if (ptr<0) {
			throw new EmptyIntStackException();
		}
		return stk[--ptr];
	}
	

//	���ÿ��� ����Ʈ�� ��ũ 
	public int peek()	throws EmptyIntStackException{
		if(ptr<=0) {
			throw new EmptyIntStackException();
			
		}
		return stk[ptr-1];
	}
	
	
//	���ÿ��� x�� ã�� �ε���(������ -1)�� ��ȯ
	public int indexOf(int x ) {
		for (int i =ptr-1; i>=0 ;i--) {
			if(stk[i]==x){
				return i ;
			}
			
		}
		return -1;
	}
	
	
	// ������ ���
	public void clear() {
		ptr=0;
		
	}
	
//	 ������ �뷮�� ��ȯ
	public int capacity() {
		return max;
	}
	
//	���ÿ� �׿� �ִ� �������� ���� ��ȯ
	public int size() {
		return ptr;
	}
	
//	������ ��� �ִ°�?
	public boolean isEmpty() {
		return ptr<=0;
	}
	
	
//	������ ���� ���ִ°�?
	public boolean isFull() {
		return ptr>=max;
	}
	
	
//	���� ���� ��� �����͸� �ٴ� -> ����� ������� ���
	public void dump() {
		if(ptr<=0)
			System.out.println("������ ����ִ�.");
		else {
			for(int i=0;i<ptr;i++) {
				System.out.print(stk[i]+" ");
				
			}
			System.out.println();;
		}
	}

}


//	���
	
//	���� ������ ��: 0/64
//	(1) Ǫ�� (2) �� (3) ��ũ (4)���� (0)����
//	1
//	������ : 
//	2
//	���� ������ ��: 1/64
//	(1) Ǫ�� (2) �� (3) ��ũ (4)���� (0)����
//	1
//	������ : 
//	3
//	���� ������ ��: 2/64
//	(1) Ǫ�� (2) �� (3) ��ũ (4)���� (0)����
//	1
//	������ : 
//	5
//	���� ������ ��: 3/64
//	(1) Ǫ�� (2) �� (3) ��ũ (4)���� (0)����
//	1
//	������ : 
//	6
//	���� ������ ��: 4/64
//	(1) Ǫ�� (2) �� (3) ��ũ (4)���� (0)����
//	4
//	2 3 5 6 
//	���� ������ ��: 4/64
//	(1) Ǫ�� (2) �� (3) ��ũ (4)���� (0)����
//	3
//	��ũ�� �����ʹ� : 6�Դϴ�
//	���� ������ ��: 4/64
//	(1) Ǫ�� (2) �� (3) ��ũ (4)���� (0)����
//	2
//	���� �����ʹ� : 6�Դϴ�
//	���� ������ ��: 3/64
//	(1) Ǫ�� (2) �� (3) ��ũ (4)���� (0)����
//	2
//	���� �����ʹ� : 5�Դϴ�
//	���� ������ ��: 2/64
//	(1) Ǫ�� (2) �� (3) ��ũ (4)���� (0)����
//	2
//	���� �����ʹ� : 3�Դϴ�
//	���� ������ ��: 1/64
//	(1) Ǫ�� (2) �� (3) ��ũ (4)���� (0)����
//	2
//	���� �����ʹ� : 2�Դϴ�
//	���� ������ ��: 0/64
//	(1) Ǫ�� (2) �� (3) ��ũ (4)���� (0)����
//	0

