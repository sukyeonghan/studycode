package com.test.inputout;
//1.Ű���忡 �Էµ� ���� �������� ���� Scanner��ü �̿�
import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
	
		//2.Scanner ����  
		Scanner sc=new Scanner(System.in);
		
		//3.Scanner�� �����ϴ� ���(�޼���)�� �̿��ؼ� ���� �޾ƿ�.
		//nextInt() : ����, nextFloat() �Ǵ� nextDouble() : �Ǽ�
		//next() �Ǵ� nextLine() : ���ڿ�
		
		//sc.nextInt();
		//�ϸ� �ƹ��͵� �Ⱥ���. ���� �ڽ� ����-runtime ���̴�.
		//�Է��ϴ� ���� ��� ��.
		//�ֿܼ� 19�Է��ϰ� ����ġ�� ���α׷� ����(������ ����)�������ͷ��� ��ȯ
		//sc.nextInt();�� �� ���� ��
		//�ؿ��� �̿��Ϸ��� ������ �����ؾ� ��
		//System.out.println(sc.nextInt());
		
		System.out.print("����� �ּ� : ");
		String address=sc.nextLine();
		System.out.println("�ּ� : "+address);
		
		System.out.print("���̸� �Է� : ");
		//Ŭ���̾�Ʈ���� ������ �Է����� ������
		int age=sc.nextInt();
		System.out.println("����� �Է��� ���̴� : "+age);
		
		System.out.print("�����Է� : ");
		String msg=sc.next();
		//���⸦ �������� ���� �տ� ���ڸ� ������
		//���� ���ְ� �Ծ����? - '����'�� ������ �� ���ڵ��� ����(�ӽ� ����)��.�ڿ��� ����Ϸ� ��
		//������� ��� �����Ϸ��� sc.nextLine(); ��� ��.
		sc.nextLine();//���۸� ����ִ� ����!
		System.out.println("����� �Է��� ���ڴ� : "+msg);
		//�� age �����ϰ� ���ڵ� ����
		//���������� ���� �� �ִ� ������.
		
		System.out.print("����� Ű : ");
		double height=sc.nextDouble();
		System.out.println("����� Ű�� : "+height+"cm");
		
		sc.nextLine();
		//sc.nextChar();�� ����
		//char������ �Է¹ޱ�!
		//���ڿ��� �����ͼ� ���� �����-charAt();
		System.out.print("���� : ");//�Ѽ���
		char gender=sc.nextLine().charAt(0);
		//charAt(���� ��ġ); 0,1,2..������ ��
		System.out.println(gender);
		
		
		
		
	}
	
}
