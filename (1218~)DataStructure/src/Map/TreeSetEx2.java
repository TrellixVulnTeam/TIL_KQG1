package Map;

import java.util.TreeSet;

public class TreeSetEx2 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int[] score = {12,53,67,45,22,76,87,45,78};
		for(int i = 0 ;i< score.length ; i++) {
			set.add(new Integer(score[i]));
		}
		
		System.out.println("50���� ���� �� : " + set.headSet(new Integer(50)));
		System.out.println("50���� ū �� : "+ set.tailSet(new Integer(50)));
			
	}

}


//	���

//	50���� ���� �� : [12, 22, 45]
//	50���� ū �� : [53, 67, 76, 78, 87]