package com.javalec.poly;

public class Actress implements PoliceMan, Firefighter, Chef {

	@Override
	public void makePizza() {
		// TODO Auto-generated method stub
		System.out.println("���ڸ� ���� �� ���ϴ�.");
	}

	@Override
	public void makeSpaghetti() {
		// TODO Auto-generated method stub
		System.out.println("���İ�Ƽ�� ���� �� �ֽ��ϴ�.");
	}

	@Override
	public void outFire() {
		// TODO Auto-generated method stub
		System.out.println("���� �����ִ�..");
	}

	@Override
	public void saveMan() {
		// TODO Auto-generated method stub
		System.out.println("����� ���� �� �ִ�.");

	}
	@Override
	public void canCatchCriminal() {
		// TODO Auto-generated method stub
		System.out.println("������ ���� �� �ִ�.");
	}

	@Override
	public void canSearch() {
		// TODO Auto-generated method stub
		System.out.println("������ ã�� ���ִ�.");
	}

}
