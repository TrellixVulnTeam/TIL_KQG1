package Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("���ڹ�",new Integer(50));
		map.put("���ڹ�",new Integer(100));
		map.put("���ڹ�",new Integer(70));
		map.put("���ڹ�",new Integer(90));
		map.put("���ڹ�",new Integer(70));
		
	Set<Entry<String,Integer>> set = map.entrySet();
	
	System.out.println(set);
	
	Iterator it = set.iterator();
	
	
	Set set1 = map.keySet();
		System.out.println("������ ��� : " +set1);
		
	Collection values =map.values();
	it=values.iterator();
	
	int total = 0;
	while(it.hasNext()) {
		Integer i = (Integer)it.next();
		total += i.intValue();
	}
	
	System.out.println("���� : " + total);
	System.out.println("��� ; " + (float)total/set.size());
	System.out.println("�ְ����� : "+ Collections.max(values));
	System.out.println("�������� : "+ Collections.min(values));
	}

}


//	���

//	[���ڹ�=70, ���ڹ�=100, ���ڹ�=90, ���ڹ�=70]
//	������ ��� : [���ڹ�, ���ڹ�, ���ڹ�, ���ڹ�]
//	���� : 330
//	��� ; 82.5
//	�ְ����� : 100
//	�������� : 70
//	
