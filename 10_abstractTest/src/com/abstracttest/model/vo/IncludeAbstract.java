package com.abstracttest.model.vo;

public abstract class IncludeAbstract {

	private int a;
	private int b;
	private int count;
	
	//�߻�Ŭ������ ���ԵǾ������� �ݵ��
	//�߻�Ŭ������ �����Ѵ�.
	//�߻�޼ҵ�� ����� �޼ҵ带 �ڽİ�ü�� ������Ŵ
	//�߻�޼ҵ�� ����θ� �����ϰ� �����ΰ� ����!
	//���������� abstract ��ȯ�� �޼ҵ�� (�Ű�����);
	
	public abstract double calculator(int a,int b);

	//public abstract String combine(String a,String b);
	//�޼ҵ带 �߰��ϸ� �ڽİ�ü���� �� �޼ҵ带 �����ؾ���!
	//-> ���⼭ ������ �߻� �޼ҵ�� �ڽ� ��ü���� ������ ������ �ִٴ� ���� ������
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}	

}
