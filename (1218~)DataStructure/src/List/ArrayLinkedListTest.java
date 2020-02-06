package List;

import java.util.*;

public class ArrayLinkedListTest {
	
	public static void main(String[] args) {
		ArrayList  al = new ArrayList(200000);
		LinkedList	ll = new LinkedList();
		
		
		System.out.println("========= ���������� �߰��ϱ� ==========");
		
		System.out.println("ArrayList : " + add1(al));
		System.out.println("LinkedList : " + add2(ll));
		
		
		
		
		
	}
	
	public static long add1(List list) {
		long start = System.currentTimeMillis();
		for(int i = 0 ; i<1000000 ; i++) {
			list.add(i+"");
		}
		long end = System.currentTimeMillis()	;
		return end- start;
		
	}
	
	public static long add2(LinkedList list) {
		long start = System.currentTimeMillis();
		for(int i = 0 ; i<1000000 ; i++) {
			list.addFirst(i+"");
		}
		long end = System.currentTimeMillis()	;
		return end- start;
		
	}
	
	
	
	
//	arrayList�� ���������� �߰�/ ���� �Ҷ� �����ϰ�
//	LinkedList�� ������ �߰�/ ���� �� �����ϴ�.

	
	

}
