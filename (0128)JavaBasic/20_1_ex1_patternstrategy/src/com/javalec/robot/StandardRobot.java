package com.javalec.robot;

import com.javalec.robot.actions.FireOk;
import com.javalec.robot.actions.FlyNo;
import com.javalec.robot.actions.FlyOk;
import com.javalec.robot.actions.KnifeWithLazer;
import com.javalec.robot.actions.KnifeWithWood;

public class StandardRobot extends Robot {

	public StandardRobot() {
		// TODO Auto-generated constructor stub
		flyAction = new FlyNo();
		fireAction = new FireOk();
		knifeAction = new KnifeWithWood();
	}
	
	@Override
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("�⺻������ ��, �ٸ�, �Ӹ�, �������� �̷���� �ֽ��ϴ�. �׸��� �Ȱ�, �޸� �� �ֽ��ϴ�.");
	}
	

}
