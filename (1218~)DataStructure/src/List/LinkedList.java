package List;

import java.util.Comparator;

public class LinkedList<E> {

	// ���
	class Node<E> {
		private E data;
		private Node<E> next;

		// ������
		public Node(E data, Node<E> next) {
			super();
			this.data = data;
			this.next = next;
		}

	}

	public LinkedList() {
		head = crnt = null;
	}

	private Node<E> head; // �Ӹ� ���
	private Node<E> crnt; // ���� ���

	public void addFirst(E obj) {
		Node<E> ptr = head; // ���� ���� �Ӹ� ���
		head = crnt = new Node<E>(obj, ptr);
	}
	
	public E search(E obj, Comparator<? super E> c) {
		Node<E> ptr = head;	//���� ��ĵ���� ���
		
		while(ptr!= null) {
			if(c.compare(obj, ptr.data)==0) { //�˻� ����
				crnt = ptr;
				return ptr.data;
			}
			ptr = ptr.next;	//���� ��� ����
		}
		return null; //�˻� ����
	}

	public void addLast(E obj) {
		if (head == null) { // ����Ʈ�� ��������� �Ӹ��� ����
			addFirst(obj);

		} else {
			Node<E> ptr = head;
			while (ptr.next != null) {
				ptr = ptr.next;
			}
			ptr.next = crnt = new Node<E>(obj, null);

		}

	}
	
	public void removeFirst(){
		  if(head!=null){
		    head =crnt = head.next;
		  }
		}
	
	public void removeLast() {
		if(head!= null) {
			if(head.next!=null)
				removeFirst();
		}else {
			Node<E> ptr = head;	// ��ĵ���� ���
			Node<E> pre = head;	// ��ĵ���� ����� ���� ���
			
			
			while(ptr.next!= null) {
				pre = ptr ;
				ptr = ptr.next;
			}
			pre.next= null;	//pre�� ���� ���� �������
			crnt = pre;
					
			
		}
	}
	
	public void remove(Node p) {
		if(head!=null) {
			if(p == head) {
				removeFirst();	
			}
			
		}else {
			Node<E> ptr = head;
			
			while(ptr.next!= p) {
				ptr = ptr.next;
				if(ptr == null) {
					return;
				}
			}
			
			ptr.next = p.next;
			crnt = ptr;
		}
	}
	public void removeCurrentNode(){
		  remove(crnt);
		}

	
	public void clear() {	// ��� ��带 ����
		while(head!= null) {	// ��忡 �ƹ��͵� ���� �� ���� ����
			removeFirst();
		}
		crnt = null;
				
	}
	
	
	//���� ��带 �ϳ��� �ڷ� �̵�
	public boolean next() {
		if(crnt == null || crnt.next == null) {
			return false;
		}
		crnt = crnt.next;
		return true;
	}
	
	//���� ��带 ���
	public void printCurrentNode() {
		if(crnt == null) {
			System.out.println("���� ��尡 �����ϴ�");
			
		}else {
			System.out.println("���� ���� : " + crnt.data);
			
		}
	}
	
	
	//��� ��带 ���	
	public void dump() {
		Node<E> ptr = head;
		
		while(ptr != null) {
			System.out.println(ptr.data);
			ptr = ptr.next;
					
		}
	}


	public static void main(String[] args) {
		
	}

}
