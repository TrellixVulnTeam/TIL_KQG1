package bf;

import java.util.Scanner;

public class IndexOfTester {

	public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			
			System.out.print("�ؽ�Ʈ : ");
			String s1 = scn.next();
			System.out.print("���� : ");
			String s2 = scn.next();
			
		int idx = s1.indexOf(s2);
		int idx2 = s2.lastIndexOf(s2);
		
		if(idx ==-1) {
			System.out.println("�ؽ�Ʈ�ȿ� ������ �����ϴ�.");
			
		}else {
		int len1 = 0;
		for(int i = 0; i<idx ; i++) {
			len1 += s1.substring(i,i+1).getBytes().length;
		}
		len1+= s2.length();
		
		
		int len2 = 0;
		for(int i=0; i<idx2 ;i++) {
			len2+=s2.substring(i,i+1).getBytes().length;
		}
		len2+=s2.length();
		
		System.out.println("text : " +s1);
		System.out.printf(String.format("���� : %%%ds\n",len1),s1);
		System.out.println("text : " +s2);
		System.out.printf(String.format("���� : %%%ds\n",len2),s2);
			
		
		}
		
	}

}


//	���


//	�ؽ�Ʈ : abcdefghijkkkkk
//	���� : jkkkk
//	text : abcdefghijkkkkk
//	���� : abcdefghijkkkkk
//	text : jkkkk
//	���� : jkkkk

