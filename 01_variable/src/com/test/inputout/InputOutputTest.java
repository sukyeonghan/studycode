package com.test.inputout;

public class InputOutputTest {
	
	public static void main(String[] args) {
		
		//print(), println() ����
		System.out.println("�ȳ��ϼ���");
		System.out.println("���� �Ѽ����Դϴ�.");
		
		System.out.print("�ȳ��ϼ���");
		System.out.print("���� �Ѽ����Դϴ�.");
		//System.out.println(""); �̷��� �ϸ� �����ٿ� ��µ�.
		System.out.println("�̰� ��� ��µɱ�?"); //���� ���� �ٿ� ��µ�.
		System.out.println("�̰Ŵ�?"); //�� �ٿ� ���
		
		//printf ����ϱ�
		System.out.printf("%d��", 27);
		//%d �� ����, ���Ŀ� �´� ���� �����ؾ� ��. 
		System.out.printf("%d�� �� �̸��� %s�Դϴ�.", 27, "�Ѽ���");
		
		double dnum=1234.567678;
		System.out.println(dnum);
		System.out.printf("%.2f", dnum);
		//�Ҽ��� �Ʒ� 2�ڸ� ������ ǥ��
		
		String name="�Ѽ���";
		int age=27;
		char gender='��';
		String name2="����";
		int age2=34;
	    char gender2='��';
		System.out.println(name+" "+age+" "+gender);
		System.out.println(name+" "+age+" "+gender);
		System.out.printf("%-5s %d %c\n", name,age,gender);
		System.out.printf("%-7s %d %c\n", name2,age2,gender2);
		//%d : ������, %c : ����, %s : ���ڿ� 
		//%-5s : 5ĭ�� Ȯ���ϰ� ���� ����, %5s : 5ĭ�� Ȯ���ϰ� ������ ����
		
		//�̽��������� �̿��ϱ�
		// /n : �ٹٲٱ�, \t : ������ ������ŭ ����
		System.out.print("�ȳ��ϼ��� ���� \n");
		System.out.print("\t �Ѽ����Դϴ�.");
		//""ǥ���ϰ� ���� ��
		System.out.println("���� ���ߴ�. \"���!\"");
		// /ǥ���� ��
		System.out.println("c:\\user01\\");
		//���ڿ����� ����
		String msg="�ȳ�\t �ϼ���\n ����";
		System.out.println(msg);
		
		
	}

}
