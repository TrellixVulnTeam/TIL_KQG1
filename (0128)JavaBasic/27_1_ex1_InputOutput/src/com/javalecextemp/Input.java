package com.javalecextemp;

import java.io.FileInputStream;
import java.io.InputStream;

public class Input {

	public static void main(String[] args) {
		try {
				InputStream is = new FileInputStream("/Users/hxmkim/Documents/GitHub/TIL/(0128)JavaBasic/27_1_ex1_InputOutput/src/com/javalecextemp/example");
				
				while(true) {
					int i = is.read();
					System.out.println("������ : "+i);
					if(i==-1) {
						break;
					}
				}
		}catch(Exception e ) {
			System.out.println(e.getMessage());
		}
		

	}

}


//	���

//	����Ʈ������ ������
	
//	������ : 191
//	������ : 192
//	������ : 180
//	������ : 195
//	������ : 192
//	������ : 186
//	������ : 32
//	������ : 179
//	������ : 175
//	������ : 190
//	������ : 190
//	������ : 176
//	������ : 161
//	������ : 32
//	������ : 195
//	������ : 228
//	������ : 189
//	������ : 192
//	������ : 180
//	������ : 207
//	������ : 180
//	������ : 217
//	������ : 46
//	������ : -1
