package com.inherit.main;

import com.inherit.model.vo.Employee;
import com.inherit.model.vo.ObjectTest;
import com.inherit.model.vo.Student;
import com.inherit.model.vo.Teacher;

public class InheritUse {
	
	public static void main(String[] args) {
		//�� ������ �غ��� , ���� �����ϰ� �̾� ��ü����(STUDENT,EMPLOYEE.TEACHER)
		//�̸��� 2���� �̻� �� �� �ְ� ����
		
		Teacher t = new Teacher();
		t.getName();
		t.getAge();
		t.setName("��");
		Student s = new Student();
		s.setName("��");
		Employee e = new Employee ();
		s.setName("��");
		
		//�����ϰ� �ִ� ��ü ��ü�� ������ �߰��Ѵ�.
		//person�� �߰��ϸ� �ڽİ�ü�鵵 �� �� �� �ִ�
		e.setGender('��');
		s.setGender('��');
		t.setGender('M');
		
		s = new Student();
		System.out.println(s.information());
		
		s = new Student("�Ѽ���",20,"��⵵","0102334555",'��',3,1,2); //�ڷ��� ���߱� ����
		System.out.println(s.information());
		
		s.getName();
		
		//��� ��ü�� object�� �ļ��̴�
		//�ڹٿ��� object�� �ֻ�����ü!!
		
		ObjectTest test = new ObjectTest();
		//test.   object ������ �ִ�!
		//s.
		Object obj; //�ڷ����� �ȸ¾Ƶ� ���� �� ���� �� �ִ�(������)
	}

}
