package com.interfaceTest.model.vo;

public interface TestAble {//�׻� public
	
	//����� �ʵ带 ���� �� �ְ�
	public static final int age=19;
	String name="������"; //�˾Ƽ� public static final ������ ����.
	
	//�޼ҵ�� �߻�޼ҵ常 ���� �� �ְ� Override�� ���� public���� ���������� ������
	//�⺻������ �޼ҵ� �����ϸ� �߻�޼ҵ�� ���� ������ public abstract�� ������ ������
	public void test(); //�߻�޼ҵ�
	
	String getStr(String a); //�߻�޼ҵ�. �ڵ����� public abstract�� ����
	
	
	
	

}
