package arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {

	public static void main(String[] args) {
		final int MAX = 10;	//�ڸ����� �ϴ� ������ ���� ����
		String source = "0123456789abcdefghijklmnopqrstuwxyz#@$%";
		int length = source.length();
		
		
		List list = new ArrayList((length/MAX) + 10);	// ũ�⸦ �����ְ� ��´�. ������ ��� �ڵ����� �þ���� �ð��� ���� �ҿ�Ǳ� ����.
		
		for(int i = 0 ; i< length ; i+=MAX) {
			
			System.out.println(i);	// 0 10 20 30 ���� ����
			
			if(i+MAX<length) {
				list.add(source.substring(i, i+MAX));
			}else {
				list.add(source.substring(i));
			}
		}
		
		for(int i= 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}

//		���

//		0123456789
//		abcdefghij
//		klmnopqrst
//		uwxyz#@$%
