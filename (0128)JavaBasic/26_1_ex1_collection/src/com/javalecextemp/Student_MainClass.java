package com.javalecextemp;

import java.util.HashSet;

public class Student_MainClass {
	public static void main(String[] args) {
		HashSet<Student> hashset  = new HashSet<Student>()	;
		hashset.add(new Student("ȫ�浿", 3));
		hashset.add(new Student("�̼���", 5));
		hashset.add(new Student("�庸��", 6));
		
		
		
		System.out.println(hashset.toString());
		
//		��ü�� ����Ű�� �ּҰ��� ����
//		[com.javalecextemp.Student@7852e922, com.javalecextemp.Student@70dea4e, com.javalecextemp.Student@4e25154f]

//		student Ŭ�������� 
//		toString�� �������Ƶ� �ߴ��� �� ����
//		[ȫ�浿3, �庸��6, �̼���5]
//		������ �������� �ʾұ� ������ �ٲ�.

		Student student = new Student("�̼���",5);
		hashset.remove(student);
		System.out.println(hashset.toString());
		
		
//		[ȫ�浿3, �庸��6] �����Ǿ���.

	}
}
