package com.oop.model.vo;

public class StaticVariableTest {
	//��������� static���� ����ϸ�
	//static����, �� Ŭ���������� Ȱ���� ��
	//public static String name; //Ŭ���� ����
	private static String name;
	//������� �߰��ϱ� - �׷� ���� Ŭ��������, ������� �� �� ����
	private int su;
	
	public void setSu(int su) {
		this.su=su;
	}
	public int getSu() {
		return this.su;
	}
	
	
	//Ŭ���������� ��������� ����
	//Ŭ���������� ���α׷� ���۰� ���ÿ� static���� �޸𸮰����� �Ҵ�(���� Ȯ��)��
	//		�������� - Ŭ������.������
	//��������´� Ŭ������ new�����ڸ� ���� ��üȭ(����) ���� �� �Ҵ��-�� �� this ��� ����.
	
	//static ������ �����ϱ� ���� getter/setter
	//static���� �������� �̷��� �ٲ������
	public static String getName() {
		return StaticVariableTest.name;
	}
	public static void setName(String name) {
		StaticVariableTest.name=name;
		//new �ϱ� ���� ���� ������..
		//this�� new�� ������ ����� ��ü�� �ּҰ��� ��Ÿ��. �ڱ� �ڽ��� �����ϰ� ���� �� ���� �����		
	}
//	public void setName(String name) {
//		this.name=name; //����޼ҵ�...
	// �̰͵� ��� StaticVariableTest.name=name; �̷��� �����..
//	}
	
	//static ������ �������� �� ��(���� �ٲٸ� �ٰ��� �ٲ�..), ��������� ���� ���� ��(���ε��� ������ ����)
}