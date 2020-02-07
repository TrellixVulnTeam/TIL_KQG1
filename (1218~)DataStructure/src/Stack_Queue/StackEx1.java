package Stack_Queue;

import java.util.Stack;

public class StackEx1 {
	public static Stack backward = new Stack();
	public static Stack forward = new Stack();
	public static void goURL(String url) {
		backward.push(url);
		if(!forward.empty()) {
			forward.clear();
		}
	}
	
	
	public static void printStatus() {
		System.out.println("backward : " + backward);
		System.out.println("forward : " + forward);
		System.out.println("���� ȭ���� :" +backward.peek());
		
		System.out.println();
	}
	
	public static void goBack() {
		if(!backward.empty()) {
			forward.push(backward.pop());
		}
		
		

	}
	
	public static void goForward() {
		if(!forward.empty()) {
			backward.push(forward.pop());
		}
	}
	public static void main(String[] args) {
		
		
		goURL("1.����");
		goURL("2.���̹�");
		goURL("3.����");
		goURL("4.����");
		
		
		printStatus();
		
		
		goBack();
		System.out.println(" == �ڷΰ��� ��ư Ŭ�� �� ==");
		printStatus();
		

		goBack();
		System.out.println(" == �ڷΰ��� ��ư Ŭ�� �� ==");
		printStatus();
		
		
		goForward();
		System.out.println(" == ������ ��ư Ŭ�� �� ==");
		printStatus();
		
		goURL("helloWorld.com");
		System.out.println("== ���ο� �ּ� �̵� �� == ");
		printStatus();
	}

}
