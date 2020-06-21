package com.oop.main;

import com.oop.model.vo.AccessTest;
import com.oop.model.vo.FieldAccessTest;
import com.oop.model.vo.FinalTest;
//import com.oop.model.vo.DefaultTest; //not visible -> ���������ڿ� ���ؼ� ������ ���ѵǾ��� �� ������ ����
//import com.oop.model.vo.ABCTest; //be resolved -> ���� ��ü
//��θ� ������ ���� ����. ��� �� �� �� �Ÿ� ���� ����Ʈ ���ص� ������ �ϴ°� �˾ƺ��⵵ ������.
import com.oop.model.vo.StaticVariableTest;

public class Main {

	public static void main(String[] args) {
		
		//��ü ���� ���� ���� Ȯ���ϱ� -> ���������Ѱ� Ȯ���غ���
		new AccessTest(); //��ü ���� ����. heap ������ �������׽�Ʈ ��ü�� ����. �ּҰ��� ����.
		//new com.oop.model.vo.AccessTest();
		//new DefaultTest(); //���������ڰ� default�� Ŭ���� ����
		
		//�ʵ� �����׽�Ʈ
		FieldAccessTest fct = new FieldAccessTest();
		FieldAccessTest fct2 = new FieldAccessTest();
		FieldAccessTest fct3 = new FieldAccessTest();
		fct.publicInt=100; //public�� �ٸ� ��Ű������ ���� ������ ������.
		//fct.protectedChar='��';->�ڼհ�ü, ������Ű��, ���� Ŭ������ ���� ���� ����
		//fct.defaultString="�̰�����?"; -> ���� ��Ű��, ���� Ŭ����
		//fct.privateDouble=180.5; -> ���� Ŭ����
		
		//Ŭ�������� �ڷ����� �� �� �ִ�. �ڷ��� fct=new Ŭ���� �̸�. ��ü�� �����ϴ� ������ ��.
		//���� ���� �ȿ��� fct ������� ����
		//fct. �ϸ� �ּҰ����� �����ض�(heap�� ����) - fct.publicInt �ϸ� �ű�� ����
		//heap������ publicInt,protectedChar...������� ����
		//FieldAccessTest�� ��üȭ -> heap������ ��������� Ȯ�� ->Ȯ���� ������ �ּҸ� ��ȯ
		//ctrl+shift+o ->import�ڵ�����
		
		//ĸ��ȭ�ϴ� ����
//		fct.age=19; //������ ������ �ɱ�??
//		System.out.println(fct.age);
//		fct.age=-19;
//		System.out.println(fct.age);
		
//		fct.setAge(19); //�޼ҵ� ȣ�� -> �޼ҵ� ����   fct�� �ִ� age������ 19 ����
//		System.out.println(fct.getAge()); //fct�� �ִ� age���� �� ��������  fct.age�� �Ȱ��� �ǹ���
		fct.setAge(-19); //�� 19�Ⱦ��� ����Ʈ���� 0(�������� �������ϱ� �⺻��)�� ��µ�.
		System.out.println(fct.getAge());
		
//		public void setAge(int age) {
//			this.age=age;
//		} ->�̰� �������� ���� ����. 19�� -19�� age�� ��. �װ� ȣ���ϴ� ��
//		���⿡ ������ �ɸ� ���� �� �� �ִ�!
//		������ �� ���ٰ� ����Ÿ� set �Ⱦ��� ��. �ֹι�ȣ ���� ��
		
		//static���� , Ŭ���� ������
//		System.out.println(StaticVariableTest.name);
//		StaticVariableTest.name="������"; //���Ե� ����
//		System.out.println(StaticVariableTest.name);
		
		//�̰͵� getter,setter�ؼ� �ؾ� ��
		System.out.println(StaticVariableTest.getName());
		StaticVariableTest.setName("������");
		System.out.println(StaticVariableTest.getName());
		
		
		StaticVariableTest svt=new StaticVariableTest();
		StaticVariableTest svt2=new StaticVariableTest();
		StaticVariableTest svt3=new StaticVariableTest();
		
		svt.setName("static");
		System.out.println(svt.getName());
		System.out.println(svt2.getName()); //���� ���� ���
		svt2.setName("svt2����!");
		System.out.println(svt.getName()); //��������� �ϳ�
		System.out.println(svt2.getName());
		System.out.println(StaticVariableTest.getName());
		
		svt.setSu(100);
		System.out.println(svt.getSu());//100
		System.out.println(svt2.getSu());//0 //��� ���� ����.�ּ� ���� ����
		
		
		
		//��� �̿��ϱ�
		FinalTest ft = new FinalTest();
		System.out.println(ft.ID);
		//ft.ID=200;
	}
}