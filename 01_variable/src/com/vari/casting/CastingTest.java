package com.vari.casting;

public class CastingTest {
	
	public static void main(String[] args) {
		//�ڵ�����ȯ Ȯ���ϱ�
		int age=19;
		double height=180.5;
		
		height=age;
		
		System.out.println(height);
		
		//��� ����� �ڵ�����ȯ
		int su=30;
		double weight=3.44;
		System.out.println(su+weight);
		//double�� �ڵ�����ȯ
		//����ȯ�� ����(�������)��ü�� ����Ǵ� ���� �ƴ϶�
		//������ �ִ� ��(���ͷ�)�� �ڷ����� �����ϴ� ����
		
		String name;
		char ch='A';
		//name=ch; int sul1=name; �ϸ� �ȵ�.
		int su1=ch; //�̰� ����
		//���ڿ��δ� �ڵ��� ��ȯ�� �Ұ���. ��ȯ�Ϸ��� ���(�޼���)�̿�.
		//name=String.String.valueOf(ch);
		
		double dnum=28.5;
		//���� ����ȯ �ϱ�
		//�������� �ս��� �־ �����Ѵ�.
		System.out.println("������ : "+dnum);
		su1=(int)dnum;
		System.out.println("dunm�� ���� ���� : " +su1);
		//0.5��ŭ �ս�
		
		int chTest=97;
		char ch1=(char)chTest;
		System.out.println(ch1);
		System.out.println((char)chTest);
		
		//���� �ڷ������� ����ȯ�ϸ� ������ �ս��� �߻���.
		//ǥ���� �� �ִ� ������ ���� ǥ���ϰ� �������� ����(���� �ڷ� �ս�).
		char t;
		t=290;
		byte b=(byte)t;
		System.out.println(b);
		
		
		
		
		
	}

}


