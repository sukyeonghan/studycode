package com.oop.model.vo;

public class FinalTest {
	//������� final ����ϱ�
	//final ���. �� �� ���� �����ϰ� ������ �� ���� ����.
	//�����Ǽ� �������� ������ ���� ������ �ʱ�ȭ����� ��!
	
	//1.����� ���ÿ� �ʱ�ȭ
	public final int ID; //�빮�ڷ� ��.
	public static final int ID2;
	//private���� �ؾ��ϴµ� public���� ������
	
	{//2. �ʱ�ȭ ��
		//ID=200;
	}
	
	//static �ʱ�ȭ ������ �ʱ�ȭ
	static {
		ID2=200;
	}

	//3.�����ڷ� �ʱ�ȭ
	public FinalTest() {
		ID=300;
		//ID2=200;
		//static�� �̷��� �ϸ� ������ ->����� ���ÿ� �ʱ�ȭ �Ǵ� �ʱ�ȭ�� ���
	}
}
