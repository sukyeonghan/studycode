package com.vari.input;

public class VariableInputTest {
	
	public static void main(String[] args) {
		//���� �����ϰ� ���ֱ�
		
		int age;
		age=27;//��������
		double height;
		height=180.5;
		String name;
		name="�Ѽ���"; //String type�� ""ǥ��!
		char gender;
		gender='��'; //char type�� ''ǥ��!

		byte bnum;
		bnum=100;
		//bnum=128; �ȵ�.int������ ~127������ ��
		
		//long lnum=10000000000; int������ �Ѿ
		long lnum=1000000000L; //long type�� Lǥ��!(�ҹ��ڷ� �ϸ� ����1�� ȥ���Ǵϱ�)
		
		float fnum=3.14f; //float type�� fǥ��!
		//����� ���ÿ� �ʱ�ȭ
		//������ ���� ó�� �����ϴ� �� : �ʱ�ȭ
		//���������� �ݵ�� �ʱ�ȭ�� �ϰ� ����ؾ���.
		
		//���ú���(main �ȿ��� ����) �ȿ��� �������� �����Ǹ� �ȵȴ�.
		
		int a=0;double dnum2=0.0;
		char ch=' ';String str="";
		
		System.out.println(a);
		
		//������ ����� ������(��) ���������� �������� �̿��ϸ� ��.
		
		System.out.println("�ȳ��ϼ���!");
		System.out.println(name);
		name="�Ѽ���";
		System.out.println(name); //���������� ��µ�.
		//������ ���� ����. ���ͷ��� �ƴ� ������ �̿��� �� �ִ�.
		String name2=name;
		System.out.println(name2);
		//�������� �ڵ忡 ������ ������ �ִ� ���� �� ��ġ�� �ҷ��´�.
		//������ ������ name-�Ѽ����� ����
		
		//��� Ȱ���ϱ�
		//�� ���� ������ �� �ִ� ���� ����
		final int NUM_FINAL=19;
		//NUM_FINAL=30; �ȵ�.
		//�� �� ���� �������� �빮�ڷ� ǥ���ϰ� �� �� �̻� �ܾ��_�����.
		
		System.out.println(NUM_FINAL);
		
		
		//���ڿ� Ȱ���ϱ�. �⺻ ���� �� �����ϱ�
		String str1="����";
		String str2=new String("����");
		System.out.println(str1);
		System.out.println(str2);
		
		str1="����"+"ĢĢ����";
		str2=new String("����"+"ĢĢ����");
		System.out.println(str1);
		System.out.println(str2);
		str1="����"+123+45+"ĢĢ����";
		System.out.println(str1);
		str2=123+45+"����"+"ĢĢ����";
		System.out.println(str2);
		str2=""+123+45+"����"+"ĢĢ����";//�߰� ���ڰ� ���ڿ� ó�� ��.
		System.out.println(str2);
		
		//+���� ����
		System.out.println("�̸� : "+ name+",���� : "+age+",Ű : " + height+ ",���� : "+ gender);
		
		int aa=100; long bb=10000L;
		float cc=234.567f; double dd=567.12356;
		char ee='A'; String ff="Hello world";
		boolean gg=true;
		
		System.out.println(""+aa+", "+bb+", "+cc+", "+dd+", "+ee+", "+ff+", "+gg+"");

		
	}

}
