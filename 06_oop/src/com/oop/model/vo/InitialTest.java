package com.oop.model.vo;

public class InitialTest {
	//�ʱ�ȭ ����
	private String name="�ȳ�"; //null
	private int size=180; //0
	private int id;//1���� ���������� 1���ؼ� �ο�
	//�ܺο��� ������ �Ұ����ϰ�!
	
	private static int count;
	//�ϳ��� �����ϰ� �Ϸ���? static���� ������� ����ְ�
	//���� ���ϰ� getter,setter�� ����. Ư���� ����{ }������ ���� ����
	
	//������ ���� �� 
	//����� ���ÿ��� �ǰ� �ʱ�ȭ���ϵ� �ǰ�
	//������ ����� ���ÿ� �ʱ�ȭ ���� ���� �� �ʱ�ȭ�������� ���� ���� �����
	//->�������� �ϳ��� ���� ������ �� �ֱ� ����
	
	//�ʱ�ȭ ������ �����Ͽ� �ʱⰪ�� �����ϱ�
	{
		//��ü�� new�����ڷ� ������ �� ������ ����Ǵ� ����
		this.name+="Rclass";//+=�ؼ� ���� ���� ���غ���
		this.size+=100;
		//this.id++; //��� 0���� 1���� ����
		this.id=++count;
		//1���� ������ ��������
		System.out.println("�ʱ�ȭ ���� ����");
	}
	
	public int getId() {
		return id; //set�Ⱦ�.���� �Ұ���
	}
	
	public void setName(String name ) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setSize(int size ) {
		this.size=size;
	}
	public int getSize() {
		return size;
	}

	//static �ʱ�ȭ ����
	static {
		//���� ��� �Ϲ� �ʱ�ȭ �����̶� �ٸ�!!
		//���α׷��� ��Ÿ�� �� ��! �� �� ���� �����!!
		//�������, ����޼ҵ��� ȣ���� �Ұ���
		//this.name="����"; �ȵ�. this�� new�־�� ��
		//���⼱ static�������ʱ�ȭ
		InitialTest.count=100;
		System.out.println("static�ʱ�ȭ ���� ����");
		
	}

}