package com.javalec.exPrac;

import java.awt.Dimension;

public class MainClass {

	
	public static void main(String[] args) {
		MakeBtn btn = new MakeBtn();
//		btn.pack(); //��ư�� ���� �� �ִ� �ּ��� ������� �ڵ�����
		btn.setSize(new Dimension(200,200));
		btn.setVisible(true);
	try {
		Thread.sleep(2000);
	} catch (Exception e) {
		
		
	}
	btn.setVisible(false);
	
	btn.dispose(); //�ڿ� ����
	
	try {
		Thread.sleep(2000);
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	System.exit(0); //������ ���μ����� ��
	}
}
