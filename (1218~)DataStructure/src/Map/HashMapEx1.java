package Map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId","1234");
		map.put("asdf","1111");
		map.put("asdf","1234");
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id�� pw�� �Է��ϼ���");
			System.out.println(" id : ");
			String id= s.next().trim();
			System.out.println(" pw : ");
			String pw = s.next().trim();
			System.out.println();
			if(!map.containsKey(id)) {
				System.out.println("id�� �����ϴ�. �ٽ� �Է�");
				continue;
			}else {
				if(!(map.get(id)).equals(pw)	) {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ� �ٽ� �Է�");
					
				}else {
					System.out.println("id�� ��й�ȣ�� ��ġ�մϴ�");
					break;
				}
			}
		}
	}

}


//	���

//	id�� pw�� �Է��ϼ���
//	id : 
//	asdf
//	pw : 
//	ddd
//	
//	��й�ȣ�� ��ġ���� �ʽ��ϴ� �ٽ� �Է�
//	id�� pw�� �Է��ϼ���
//	id : 
//	asdf
//	pw : 
//	1111
//	
//	��й�ȣ�� ��ġ���� �ʽ��ϴ� �ٽ� �Է�
//	id�� pw�� �Է��ϼ���
//	id : 
//	asdf
//	pw : 
//	1234
//	
//	id�� ��й�ȣ�� ��ġ�մϴ�
//	
