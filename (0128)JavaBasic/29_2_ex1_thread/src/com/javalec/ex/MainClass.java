package com.javalec.ex;

public class MainClass {

	public static void main(String[] args) {
		
//		��� 1 : runnable �������̽�
		
//		ThreadTest threadTest = new ThreadTest();
//		
//		Thread thread = new Thread(threadTest, "A");  //Thread(Runnable Target, String name) �������� �̸��� ���� �� �ִ�.
//		
//		thread.start(); //start�޼���� run�޼��� ȣ���� �Ѵ�.
//		
//		System.out.println(Thread.currentThread().getName());
		
	
//		��� 2 : Thread ���
		
//		ThreadTest2 threadTest2 = new ThreadTest2();
//		threadTest2.setName("B");
//		threadTest2.start();
//		System.out.println(Thread.currentThread().getName());
	
		
		
//		1��ü n������
//		ThreadTest3 threadTest3= new ThreadTest3();
//		Thread thread0 = new Thread(threadTest3,"A");
//		Thread thread1 = new Thread(threadTest3,"B");
//		
//		thread0.start();
//		thread1.start();
//		
//		System.out.println(Thread.currentThread().getName());
		
		
//		1��ü 1������
		ThreadTest4 threadTest0= new ThreadTest4();
		ThreadTest4 threadTest1= new ThreadTest4();
		
		Thread thread0 = new Thread(threadTest0,"A");
		Thread thread1 = new Thread(threadTest1,"B");
		
		thread0.start();
		thread1.start();
		
		
		System.out.println(Thread.currentThread().getName());
		
		
		
		
	}

	
	
	
	
}



//	���



//	main	//���� �����ǰ� �ִ� �������� �̸��� ���.
//	A	//threadTest�� ���鶧 A��� �̸��� �ο��� ��.

//main�� A�� ����
//main �����忡���� runnable�� ����ǰ� �ִ� �Ͱ��� ������ �޷�� �����.
//main �� ������, start�޼��尡 ����ǰ�, A�� ����

//	ThreadTest
		
//	i = 0		// �����忡 0.5�� ���� ��.
//	i = 1
//	i = 2
//	i = 3
//	i = 4
//	i = 5
//	i = 6
//	i = 7
//	i = 8
//	i = 9