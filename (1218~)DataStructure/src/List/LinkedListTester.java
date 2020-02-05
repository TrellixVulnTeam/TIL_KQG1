package List;

import java.util.Comparator;
import java.util.Scanner;

public class LinkedListTester {
	static Scanner scn = new Scanner(System.in);

	static class Data {
		static final int NO = 1;
		static final int NAME = 2;

		private Integer no;
		private String name;

		@Override
		public String toString() {
			return "no=" + no + ", name=" + name;
		}

		void ScanData(String guide, int sw) {
			System.out.println(guide + " �ҵ����͸� �Է��ϼ���");

			if ((sw & NO) == NO) {
				System.out.println("��ȣ : ");
				no = scn.nextInt();
			}

			if ((sw & NAME) == NAME) {
				System.out.println("�̸� : ");
				name = scn.next();
			}

		}

		public static final Comparator<Data> NO_ORDER = new NoOrderComparator();

		private static class NoOrderComparator implements Comparator<Data> {
			public int compare(Data d1, Data d2) {
				return (d1.no > d2.no) ? 1 : (d1.no < d2.no) ? -1 : 0;
			}
		}

		public static final Comparator<Data> NAME_ORDER = new NameOrderComparator();

		private static class NameOrderComparator implements Comparator<Data> {
			public int compare(Data d1, Data d2) {
				return d1.name.compareTo(d2.name);
			}
		}

	}

	enum Menu {
		ADD_FIRST("�Ӹ��� ��带 ����"), ADD_LAST("������ ��带 ����"), RMV_FIRST("�Ӹ� ��带 ����"), RMV_LAST("���� ��带 ����"),
		RMV_CRNT("���� ��带 ����"), CLEAR("��� ��带 ����"), SEARCH_NO("��ȣ�� �˻�"), SEARCH_NAME("�̸����� �˻�"), NEXT("���� ���� �̵�"),
		PRINT_CRNT("���� ��带 ���"), DUMP("��� ��带 ���"), TERMINATE("����");

		private final String message; // ����� ���ڿ�

		Menu(String string) {
			message = string;
		}

		static Menu MenuAt(int idx) {
			for (Menu i : Menu.values())
				if (i.ordinal() == idx)
					return i;
			return null;
		}

		String getMessage() {
			return message;
		}

	}

	static Menu SelectMenu() {
		int key;
		do {
			for (Menu m : Menu.values()) {
				System.out.printf("(%d) %s ", m.ordinal(), m.getMessage());
				if ((m.ordinal() % 3) == 2 && m.ordinal() != Menu.TERMINATE.ordinal())
					System.out.println();

			}
			System.out.print(" : ");
			key = scn.nextInt();
		} while (key < Menu.ADD_FIRST.ordinal() || key > Menu.TERMINATE.ordinal());
		return Menu.MenuAt(key);
	}

	public static void main(String[] args) {
		Menu menu;
		Data data;
		Data ptr;
		Data temp = new Data();

		LinkedList<Data> list = new LinkedList<Data>(); // ����Ʈ�� ����

		do {
			switch (menu = SelectMenu()) {
			case ADD_FIRST:
				data = new Data();
				data.ScanData("�Ӹ��� ��带 ����", Data.NO | Data.NAME);
				list.addFirst(data);
				break;

			case ADD_LAST:
				data = new Data();
				data.ScanData("������ ����", Data.NO | Data.NAME);
				list.addLast(data);
				break;

			case RMV_FIRST:
				list.removeFirst();

				break;

			case RMV_LAST:
				list.removeLast();
				break;

			case RMV_CRNT:
				list.removeCurrentNode();
				break;

			case SEARCH_NO:
				temp.ScanData("�˻�", Data.NO);
				ptr = list.search(temp, Data.NO_ORDER);
				if (ptr == null) {
					System.out.println("�ش� ��ȣ�� �����Ͱ� ����");
				} else {
					System.out.println("�˻� ���� : " + ptr);
				}

				break;

			case SEARCH_NAME:
				temp.ScanData("�˻�", Data.NAME);
				ptr = list.search(temp, Data.NAME_ORDER);
				if (ptr == null) {
					System.out.println("�ش��̸��� �����Ͱ� ����.");

				} else {
					System.out.println("�˻� ���� : " + ptr);
				}
				break;

			case NEXT:
				list.next();
				break;

			case PRINT_CRNT:
				list.printCurrentNode();
				break;

			case DUMP:
				list.dump();
				break;

			case CLEAR:
				list.clear();
				break;
			default:
				break;
			}

		} while (menu != Menu.TERMINATE);

	}

}


// ���


//	(0) �Ӹ��� ��带 ���� (1) ������ ��带 ���� (2) �Ӹ� ��带 ���� 
//	(3) ���� ��带 ���� (4) ���� ��带 ���� (5) ��� ��带 ���� 
//	(6) ��ȣ�� �˻� (7) �̸����� �˻� (8) ���� ���� �̵� 
//	(9) ���� ��带 ��� (10) ��� ��带 ��� (11) ����  : 
//	0
//	�Ӹ��� ��带 ���� �ҵ����͸� �Է��ϼ���
//	��ȣ : 
//	1
//	�̸� : 
//	���
//	
//	(0) �Ӹ��� ��带 ���� (1) ������ ��带 ���� (2) �Ӹ� ��带 ���� 
//	(3) ���� ��带 ���� (4) ���� ��带 ���� (5) ��� ��带 ���� 
//	(6) ��ȣ�� �˻� (7) �̸����� �˻� (8) ���� ���� �̵� 
//	(9) ���� ��带 ��� (10) ��� ��带 ��� (11) ����  : 1
//	������ ���� �ҵ����͸� �Է��ϼ���
//	��ȣ : 
//	5
//	�̸� : 
//	����
//	
//	(0) �Ӹ��� ��带 ���� (1) ������ ��带 ���� (2) �Ӹ� ��带 ���� 
//	(3) ���� ��带 ���� (4) ���� ��带 ���� (5) ��� ��带 ���� 
//	(6) ��ȣ�� �˻� (7) �̸����� �˻� (8) ���� ���� �̵� 
//	(9) ���� ��带 ��� (10) ��� ��带 ��� (11) ����  : 0
//	�Ӹ��� ��带 ���� �ҵ����͸� �Է��ϼ���
//	��ȣ : 
//	10
//	�̸� : 
//	����
//	
//	(0) �Ӹ��� ��带 ���� (1) ������ ��带 ���� (2) �Ӹ� ��带 ���� 
//	(3) ���� ��带 ���� (4) ���� ��带 ���� (5) ��� ��带 ���� 
//	(6) ��ȣ�� �˻� (7) �̸����� �˻� (8) ���� ���� �̵� 
//	(9) ���� ��带 ��� (10) ��� ��带 ��� (11) ����  : 1
//	������ ���� �ҵ����͸� �Է��ϼ���
//	��ȣ : 
//	12
//	�̸� : 
//	�糪
//	
//	(0) �Ӹ��� ��带 ���� (1) ������ ��带 ���� (2) �Ӹ� ��带 ���� 
//	(3) ���� ��带 ���� (4) ���� ��带 ���� (5) ��� ��带 ���� 
//	(6) ��ȣ�� �˻� (7) �̸����� �˻� (8) ���� ���� �̵� 
//	(9) ���� ��带 ��� (10) ��� ��带 ��� (11) ����  : 0
//	�Ӹ��� ��带 ���� �ҵ����͸� �Է��ϼ���
//	��ȣ : 
//	14
//	�̸� : 
//	��ȿ
//	
//	(0) �Ӹ��� ��带 ���� (1) ������ ��带 ���� (2) �Ӹ� ��带 ���� 
//	(3) ���� ��带 ���� (4) ���� ��带 ���� (5) ��� ��带 ���� 
//	(6) ��ȣ�� �˻� (7) �̸����� �˻� (8) ���� ���� �̵� 
//	(9) ���� ��带 ��� (10) ��� ��带 ��� (11) ����  : 3
//	(0) �Ӹ��� ��带 ���� (1) ������ ��带 ���� (2) �Ӹ� ��带 ���� 
//	(3) ���� ��带 ���� (4) ���� ��带 ���� (5) ��� ��带 ���� 
//	(6) ��ȣ�� �˻� (7) �̸����� �˻� (8) ���� ���� �̵� 
//	(9) ���� ��带 ��� (10) ��� ��带 ��� (11) ����  : 7
//	�˻� �ҵ����͸� �Է��ϼ���
//	�̸� : 
//	�糪
//	�˻� ���� : data [no=12, name=�糪]
//			
//	(0) �Ӹ��� ��带 ���� (1) ������ ��带 ���� (2) �Ӹ� ��带 ���� 
//	(3) ���� ��带 ���� (4) ���� ��带 ���� (5) ��� ��带 ���� 
//	(6) ��ȣ�� �˻� (7) �̸����� �˻� (8) ���� ���� �̵� 
//	(9) ���� ��带 ��� (10) ��� ��带 ��� (11) ����  : 6
//	�˻� �ҵ����͸� �Է��ϼ���
//	��ȣ : 
//	10
//	�˻� ���� : data [no=10, name=����]
//			
//	(0) �Ӹ��� ��带 ���� (1) ������ ��带 ���� (2) �Ӹ� ��带 ���� 
//	(3) ���� ��带 ���� (4) ���� ��带 ���� (5) ��� ��带 ���� 
//	(6) ��ȣ�� �˻� (7) �̸����� �˻� (8) ���� ���� �̵� 
//	(9) ���� ��带 ��� (10) ��� ��带 ��� (11) ����  : 9
//	���� ���� : data [no=10, name=����]
//			
//	(0) �Ӹ��� ��带 ���� (1) ������ ��带 ���� (2) �Ӹ� ��带 ���� 
//	(3) ���� ��带 ���� (4) ���� ��带 ���� (5) ��� ��带 ���� 
//	(6) ��ȣ�� �˻� (7) �̸����� �˻� (8) ���� ���� �̵� 
//	(9) ���� ��带 ��� (10) ��� ��带 ��� (11) ����  : 10
//	data [no=10, name=����]
//	data [no=1, name=���]
//	data [no=5, name=����]
//	data [no=12, name=�糪]
//			
//	(0) �Ӹ��� ��带 ���� (1) ������ ��带 ���� (2) �Ӹ� ��带 ���� 
//	(3) ���� ��带 ���� (4) ���� ��带 ���� (5) ��� ��带 ���� 
//	(6) ��ȣ�� �˻� (7) �̸����� �˻� (8) ���� ���� �̵� 
//	(9) ���� ��带 ��� (10) ��� ��带 ��� (11) ����  : 6
//	�˻� �ҵ����͸� �Է��ϼ���
//	��ȣ : 
//	1
//	�˻� ���� : data [no=1, name=���]
//			
//	(0) �Ӹ��� ��带 ���� (1) ������ ��带 ���� (2) �Ӹ� ��带 ���� 
//	(3) ���� ��带 ���� (4) ���� ��带 ���� (5) ��� ��带 ���� 
//	(6) ��ȣ�� �˻� (7) �̸����� �˻� (8) ���� ���� �̵� 
//	(9) ���� ��带 ��� (10) ��� ��带 ��� (11) ����  : 4
//	
//	(0) �Ӹ��� ��带 ���� (1) ������ ��带 ���� (2) �Ӹ� ��带 ���� 
//	(3) ���� ��带 ���� (4) ���� ��带 ���� (5) ��� ��带 ���� 
//	(6) ��ȣ�� �˻� (7) �̸����� �˻� (8) ���� ���� �̵� 
//	(9) ���� ��带 ��� (10) ��� ��带 ��� (11) ����  : 2
//	
//	(0) �Ӹ��� ��带 ���� (1) ������ ��带 ���� (2) �Ӹ� ��带 ���� 
//	(3) ���� ��带 ���� (4) ���� ��带 ���� (5) ��� ��带 ���� 
//	(6) ��ȣ�� �˻� (7) �̸����� �˻� (8) ���� ���� �̵� 
//	(9) ���� ��带 ��� (10) ��� ��带 ��� (11) ����  : 0
//	�Ӹ��� ��带 ���� �ҵ����͸� �Է��ϼ���
//	��ȣ : 
//	0
//	�̸� : 
//	����
//	
//	(0) �Ӹ��� ��带 ���� (1) ������ ��带 ���� (2) �Ӹ� ��带 ���� 
//	(3) ���� ��带 ���� (4) ���� ��带 ���� (5) ��� ��带 ���� 
//	(6) ��ȣ�� �˻� (7) �̸����� �˻� (8) ���� ���� �̵� 
//	(9) ���� ��带 ��� (10) ��� ��带 ��� (11) ����  : 10
//	data [no=0, name=����]
//	data [no=1, name=���]
//	data [no=5, name=����]
//	data [no=12, name=�糪]
//			
//	(0) �Ӹ��� ��带 ���� (1) ������ ��带 ���� (2) �Ӹ� ��带 ���� 
//	(3) ���� ��带 ���� (4) ���� ��带 ���� (5) ��� ��带 ���� 
//	(6) ��ȣ�� �˻� (7) �̸����� �˻� (8) ���� ���� �̵� 
//	(9) ���� ��带 ��� (10) ��� ��带 ��� (11) ����  : 4
//	
//	(0) �Ӹ��� ��带 ���� (1) ������ ��带 ���� (2) �Ӹ� ��带 ���� 
//	(3) ���� ��带 ���� (4) ���� ��带 ���� (5) ��� ��带 ���� 
//	(6) ��ȣ�� �˻� (7) �̸����� �˻� (8) ���� ���� �̵� 
//	(9) ���� ��带 ��� (10) ��� ��带 ��� (11) ����  : 2
//	
//	(0) �Ӹ��� ��带 ���� (1) ������ ��带 ���� (2) �Ӹ� ��带 ���� 
//	(3) ���� ��带 ���� (4) ���� ��带 ���� (5) ��� ��带 ���� 
//	(6) ��ȣ�� �˻� (7) �̸����� �˻� (8) ���� ���� �̵� 
//	(9) ���� ��带 ��� (10) ��� ��带 ��� (11) ����  : 10
//	data [no=5, name=����]
//	data [no=12, name=�糪]
//			
//	(0) �Ӹ��� ��带 ���� (1) ������ ��带 ���� (2) �Ӹ� ��带 ���� 
//	(3) ���� ��带 ���� (4) ���� ��带 ���� (5) ��� ��带 ���� 
//	(6) ��ȣ�� �˻� (7) �̸����� �˻� (8) ���� ���� �̵� 
//	(9) ���� ��带 ��� (10) ��� ��带 ��� (11) ����  : 11