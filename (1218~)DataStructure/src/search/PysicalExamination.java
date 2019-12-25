package search;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class PysicalExamination {


	static class PhyscData {
		private String name;
		private int height;
		private double vision;

		// ������
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
//		���ڿ��� ��ȯ�ϴ� �޼���(���� Ȯ�ο�) 
		public String toString() {
			return name + "" + height + "" + vision;
		}
		
//		������������ �����ϱ� ���� comparator
		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
		
		
		private static class HeightOrderComparator implements Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height> d2.height) ? 1:
					   (d1.height< d2.height) ? -1:0;    //d1 �� �� ũ�ٸ� ���(1) ��ȯ, d2�� �� ũ�ٸ� ����, ���ٸ� 0 �� ��
			}
		}
		
	}


//	���׸�
//		:ó���ؾ� �� �����	�ڷ����� �������� �ʴ� Ŭ����(�������̽�)���� ���
		

	
	
	
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		PhyscData[] x= {
				new PhyscData("�̳���",162,0.3),
				new PhyscData("������",168,0.7),
				new PhyscData("���Ѱ�",169,2.0),
				new PhyscData("ȫ�ر�",171,1.5),
				new PhyscData("������",174,0.4),
				new PhyscData("��ȣ��",176,1.2),
				new PhyscData("�̼���",180,0.8),
				
		};
		
		
		
		System.out.println("===== ��cm �� ã�� �ִ�? =====");
		int height= scn.nextInt();	//	Ű �� �Է�
		int idx  = Arrays.binarySearch(
				x, //�迭 x����
				new PhyscData("", height, 0.0), //Ű�� height�� ��Ҹ�
				PhyscData.HEIGHT_ORDER);	// HEIGHT_ORDER�� ���� �˻�
		
		
		if (idx<0) {
			System.out.println("��� ����");
		}else {
			System.out.println("x[" + idx +"]�� �ִ�.");
			System.out.println("ã�� ������ : " +x[idx]);
		}
	}

}


//		���

//		===== ��cm �� ã�� �ִ�? =====
//		180
//		x[6]�� �ִ�.
//		ã�� ������ : �̼���1800.8


