package Map;

import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		String from ="b";
		String to = "d";
		
		
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("disc");
		set.add("dizzy");
		set.add("fan");
		set.add("elevator");
		set.add("dzzzz");
		set.add("flower");
		set.add("Car");
		
		System.out.println(set);
		System.out.println("rangeSearch : from " + from + " to " + to);
		System.out.println("result1 : " + set.subSet(from, to));
		System.out.println("result2 : " + set.subSet(from, to + "zzz"));
		
	}

}



//	���

//	[Car, abc, alien, bat, disc, dizzy, dzzzz, elevator, fan, flower]	// �빮�ڰ� �ҹ��ں��� �켱�̱� ������ Car�� ���� ����, �빮�� �ҹ��� �ﰢ�����ϴ� ���� ����. �ƴϸ� comparator�� ����.
//	rangeSearch : from b to d	
//	result1 : [bat]		// ó���� ���Ե����� �������� ���Ե��� �����Ƿ� bat�� ����
//	result2 : [bat, disc, dizzy]	//"zzz"�� �ٿ������ν� �� �������� �˻� ����

