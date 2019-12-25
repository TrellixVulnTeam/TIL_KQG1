package search;

import java.util.Scanner;

//	���� �˻�
//	�������� : �����Ͱ� Ű ������ �̹� ���� �Ǿ� �ִ�.
//	(�����˻����� �� �������� �˻��� �� �ִٴ� ����.)
public class BinSearch {
	
//	��ڼ��� n�� �迭 a���� key�� ���� ��Ҹ� ���� �˻��Ѵ�.
	static int binSearch(int[]a , int n , int key) {
		int pl = 0;			//pl : �˻� ������ ù �ε�
		int pr = n -1;		//pr : �˻� ������ �� �ε�
		
		do {
			int pc= (pl+pr)/2;
			if(a[pc] ==key) {
				return pc; 		//�˻� ����!
				
			}else if(a[pc]<key){
				pl= pc+1;		 //�˻� ������ �������� �������� ��
			}else {
				pr=pc-1; //�˻� ������ ���� �������� ��
			}
			
		}while(pl<=pr);
		return -1; //�˻� ��
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("��� �� : ");
		int num =scn.nextInt();
		int x[] = new int[num]; //��ڼ��� num �� ��
		
		System.out.println("������������ �Է��ϼ���");

		System.out.println("x[0]:"); //ù ��� �Է�
		x[0]=scn.nextInt();
		
		for(int i = 1; i<num ; i++) {
			do {
				System.out.println("x[" + i +"]");
				x[i]= scn.nextInt();
				
				
			}while(x[i]<x[i-1]);		//�ٷ� ���� ��Һ��� ������ �ٽ� ��
		}
		
		System.out.println("�˻��� �� : ");
		int ky = scn.nextInt();
		
		int idx = binSearch(x, num, ky);
		
		if(idx==-1) {
			System.out.println("��� ����");
		}else {
			System.out.println(ky+"�� x[" +idx+"]");
		}
				
	}

}

//	���

//	��� �� : 
//		3
//		������������ �Է��ϼ���
//		x[0]:
//		2
//		x[1]
//		1
//		x[1]
//		2
//		x[2]
//		3
//		�˻��� �� : 
//		4
//		��� ����

