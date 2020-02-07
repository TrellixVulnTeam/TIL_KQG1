package comparable;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx {
	public static void main(String[] args) {
		String[] strArr = { "cat", "dog", "Cow", "horse" };
		Arrays.sort(strArr);
		System.out.println("strArr = " + Arrays.toString(strArr));
//		strArr = [Cow, cat, dog, horse]

		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // ��ҹ��� ���� ����
		System.out.println("strArr = " + Arrays.toString(strArr));
//		strArr = [cat, Cow, dog, horse]

		Arrays.sort(strArr, new Descending()); // ���� ���� // ������ comparator�� ���� ����
		System.out.println("strArr = " + Arrays.toString(strArr));
//		strArr = [horse, dog, cat, Cow]

	}
}

class Descending implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable) o1;
			Comparable c2 = (Comparable) o2;
			return c1.compareTo(c2) * -1; // -1�� ���ؼ� �⺻ ���Ĺ���� ������ �����Ѵ�.
		}
		return -1;
	}
}


