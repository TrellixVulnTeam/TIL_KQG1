package com.javalec.timertask;

import java.util.Timer;
import java.util.TimerTask;


public class TimerEx {
	
	public TimerEx() throws InterruptedException {
		// TODO Auto-generated constructor stub
		
		System.out.println("^^");
		Timer timer = new Timer(true); // timer ��ü �����
		TimerTask t1 = new ExTimerTask1();
		TimerTask t2 = new ExTimerTask2();
		
		timer.schedule(t1, 2000);	//2���� ����
		timer.schedule(t2, 10000);	//10���� ����
		
		Thread.sleep(11000);
		System.out.println("**");
		
	}
}
