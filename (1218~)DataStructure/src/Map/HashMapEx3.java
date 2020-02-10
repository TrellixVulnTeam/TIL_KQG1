package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx3 {
static HashMap phoneBook = new HashMap();
	public static void main(String[] args) {
		addPhoneNo("ģ��1" , "���ڹ�","010-1234-1234");
		addPhoneNo("ģ��1" ,"���ڹ�", "010-1111-1111");
		addPhoneNo("ģ��1" , "���ڹ�","010-2222-2222");
		addPhoneNo("ȸ��" , "��븮","010-3333-7777");
		addPhoneNo("ȸ��" , "�̴븮","010-4444-7777");
		addPhoneNo("ȸ��" ,"�ڴ븮", "010-5555-7777");
		addPhoneNo("ȸ��" , "�̰���","010-6666-7777");
		addPhoneNo("��Ź1" ,"010-1234-1234");
		
		printList();
	}
	
	
	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap group = (HashMap)phoneBook.get(groupName);
		group.put(tel, name);

	}
	
	static void addGroup(String groupName) {
		if(!phoneBook.containsKey(groupName)) {
			
			phoneBook.put(groupName,new HashMap());
		}
	}
	
	static void addPhoneNo(String name, String tel) {
		addPhoneNo("��Ÿ", name, tel);
	}
	
	
	static void printList() {
		Set set = phoneBook.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			Set subSet = ((HashMap)e.getValue()).entrySet();
			Iterator subIt = subSet.iterator();
			
			System.out.println(" * " + e.getKey() + "[" + subSet.size() + "]" );
			
			while(subIt.hasNext()) {
				Map.Entry subE = (Map.Entry)subIt.next();
				String telNo= (String)subE.getKey();
				String name = (String)subE.getValue();
				System.out.println(name + " " + telNo);
				
			}
			System.out.println();
		}
	}

}


//	���
	

//	 * ��Ÿ[1]
//	 ��Ź1 010-1234-1234
//
//	  * ģ��1[3]
//	 ���ڹ� 010-1111-1111
//	 ���ڹ� 010-1234-1234
//	 ���ڹ� 010-2222-2222
//
//	  * ȸ��[4]
//	 �̰��� 010-6666-7777
//	 �ڴ븮 010-5555-7777
//	 ��븮 010-3333-7777
//	 �̴븮 010-4444-7777
//
