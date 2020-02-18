package BoyerMoore;

public class BoyerMoore {

	static int bmMatch(String txt, String pat) {
	
	int pt ;
	int pp ;
	int txtlen = txt.length();
	int patlen = pat.length();
	int[] skip = new int[Character.MAX_VALUE+1]; //�ǳʶٱ� ǥ

	
	//�ǳʶٱ� ǥ �����
	
	for(pt = 0 ; pt<= Character.MAX_VALUE ; pt ++) {
		skip[pt] =patlen;
	}
	for(pt = 0 ; pt<patlen - 1; pt++) {
		skip[pat.charAt(pt)]=patlen - pt -1;
		
	}
	
	//�˻�
	
	while(pt<patlen) {
		
		// pat�� �� ���ڿ� �ָ�
		pp = patlen -1;
		
		
		
		while(txt.charAt(pt)==pat.charAt(pp)) {
			if(pp==0) {
				return pt;
			}
			
			pp--;
			pt--;
		}
		
		pt += (skip[txt.charAt(pt)]> patlen-pp) ?skip[txt.charAt(pt)] : patlen- pp;
		
	}
	return -1;
	
	}
	public static void main(String[] args) {
	
	}

}
