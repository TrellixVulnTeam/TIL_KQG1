package stack;

import stack.IntStack.EmptyIntStackException;

public class IntQueue {
	private int max;
	private int front;
	private int rear;
	private int num;
	private int[] que;

	public class EmptyQueueException extends RuntimeException {
		public EmptyQueueException() {

		}
	}

	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {

		}
	}

//	������
	public IntQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];

		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

//	��ť
	public int enque(int x) throws OverflowIntQueueException {
		if (num>=max)
			throw new OverflowIntQueueException(); // ť�� ������'
		que[rear++] = x;
		num ++;
		
		if(rear ==max)	 //ť�� ���ڶ��� �Ǹ� max�� num�� �������� ��찡 �߻��Ѵ�. �̸� �����ϱ� ���� rear�� 0���� �������ش�.
			rear=0;
	return x;	
	}
	
//	��ť
	public int deque() throws EmptyIntStackException{
		if (num<=0)
			throw new EmptyQueueException();
		int x = que[front ++];
		num --;
		
		if(front ==max)
			front =0;
		
		return x;
	}
	
//	ť���� �����͸� ��ũ(����Ʈ �����͸� �鿩�ٺ�)
	
	public int peek() throws EmptyQueueException{
		if (num <=0)
			throw new EmptyQueueException();
		return que[front];
	}
	
//	ť���� x�� �˻��Ͽ� �ε���(ã�����ϸ� -1)�� ��ȯ
	
	public int indexOf(int x) {
		for(int i = 0; i<num ;i++) {
			int idx=(i+front) % max;
			if(que[idx]==x)
				return idx;
		}
		return -1;
	}

//	ť�� ���
	public void clear() {
		num =front =rear=0;
		
	}
	
//	ť�� �뷮�� ��ȯ
	public int capacity() {
		return max;
	}
	
//	ť�� �׿��ִ� �������� ���� ��ȯ
	public int size() {
		return num;
	}
	
//	ť�� �����?
	public boolean isEmpty() {
		return num<=0;
	}
	
//	ť�� �� á��?
	public boolean isFull() {
		return num>=max;
	}
	
//	ť���� ��� ������ ���
	
	public void dump() {
		if(num <=0) {
			System.out.println("ť�� ����ִ�.");
			
		}else {
			for(int i=0; i<num ; i++) {
				System.out.print(que[(i+front)%max] + " ");
			}
			System.out.println();
		}
	}

}