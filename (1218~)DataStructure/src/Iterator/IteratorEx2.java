package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx2 {

	public static void main(String[] args) {
		ArrayList original = new ArrayList()	;
		ArrayList copy1 = new ArrayList()	;
		ArrayList copy2 = new ArrayList()	;
		
		for(int i = 0;i<10 ; i++) {
			original.add(i+"");
		}
		Iterator it = original.iterator();
		while(it.hasNext()) {
			copy1.add(it.next());
		}
		
		System.out.println("=== original ���� copy1���� ����===");
		System.out.println("original : "+ original);
		System.out.println("copy1 : " + copy1);
		
		System.out.println();
		
		it = original.iterator();
		while(it.hasNext()) {
			copy2.add(it.next());
			it.remove();
			
		}
		

		System.out.println("=== original ���� copy2���� �̵�===");
		System.out.println("original : "+ original);
		System.out.println("copy2 : " + copy2);
		
		
		
		
		
	}

}



//	���


//	=== original ���� copy1���� ����===
//	original : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
//	copy1 : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
//	
//	=== original ���� copy2���� �̵�===
//	original : []
//	copy2 : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
