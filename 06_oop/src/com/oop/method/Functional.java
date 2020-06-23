package com.oop.method;

import java.util.Scanner;

import com.oop.model.vo.Member1;
import com.oop.model.vo.Student;

//��������� Ŭ����
//���⿡ �޼ҵ� �ټ� ����
public class Functional {
	//�Ű������ִ� ������ ��� �⺻�����ڰ� �ڵ����� ����� �� ��.
	//public Functional() {}
	
	//���� 
	
	//�Ű������� ���� ��ȯ���� ���� ���� ���(+��)
	public void calculator() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== ���� ���α׷� ===");
		System.out.print("���� : ");
		int su = sc.nextInt();
		System.out.print("���� : ");
		int su2 = sc.nextInt();
		System.out.println(su+"+"+su2+"="+(su+su2));
//		System.out.print("������(+,-,*,/)");
//		char op = sc.next().charAt(0);
		
		
	}
	
	//��ȯ�� ���� �Ű����� �ִ� �޼ҵ�� �����ϱ�
	//����ϴ� ��� ����. ���׿��� �� �� ���� ����
	//������ ����Ƿ��� �����ڵ� �Ű������� �޾ƾ� ��.
	public void calculator2(int su, int su2, String[] operation) {
		System.out.println("=== ���� ���α׷� ===");
		System.out.println("���� : "+su);
		System.out.println("���� : "+su2);
		
		double result = 0;
//		�ذ� ����
//		for(int i=0; i<operation.length; i++) {
//			switch(operation[i]) {
//			case "+" : result=su+su2; break;
//			case "-" : result=su-su2; break;
//			case "*" : result=su*su2; break;
//			case "/" : result=(double)su/su2; break;
//			}
//			System.out.println(su+operation[i]+su2+"="+(result));
//		}
		
		for(String op : operation) { //for each�� -0�� �ε������� �ϳ��� ��
			switch(op) { 
			case "+" : result=su+su2; break;
			case "-" : result=su-su2; break;
			case "*" : result=su*su2; break;
			case "/" : result=(double)su/su2; break;
		}
		
		System.out.println(su+op+su2+"="+(result));
		}
	}
	//�̰� ȣ���ϸ� �꿡 ���� stack�� �����ƴٰ� ���ೡ���� ��������
	
	//��ȯ���� �ְ� �Ű������� ���� �޼ҵ� ����
	//�� ���� ���� ���ϰ� �� ��ȭ�� ��ȯ�ϴ� ���
	public int calculator3() { 
		//��ȯ��(���� int)������ {}�ȿ� �ݵ�� return�̶�� ���� �־�� ��!!!!
		System.out.println("=== ���� ���α׷� ===");
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int su = sc.nextInt();
		System.out.print("���� : ");
		int su2 = sc.nextInt();
		return su+su2; //return �ڿ� ��ȯ���� ��ġ�ϴ� �ڷ��� ����/���ͷ� ��
		//return�� �� �� ���� �ڷ����� ����!���� �� �� ������ ������ �迭�̳� ��ü ���
	}
	
	//��ȯ���� �ְ� �Ű������� �ִ� �޼ҵ� ����
	public int calculator4(int su, int su2) {
		return su+su2;
	}
	
	//���ڿ� �� ���� ���޹ް� �� ���ڿ��� �����ϰ� �������ִ� �޼ҵ� �����
	//��ȯ�� �ְ� �Ű����� �ִ� �޼ҵ�
	public String str(String str1, String str2) {
		return str1+str2;
		
	}
	
	//���� �� ���� ���޹޾� ù ��° ������ �� ��° ������ ���� �������ִ� �޼ҵ�
	//��, ������ ù ��° ���� Ŀ����. ���� ������ ���� ���

	public int print(int first, int second) {
		int result=0;
		if(first<second) {
			System.out.println("�������!");
		} else {
			for(int i=second; i<=first; i++) {
				result+=i;
			}
		}
		return result;
	}
	
	//���� �� ��. ��ȯ�� ���� �Ű����� �ִ� �޼ҵ�
	public void su(int su1, int su2) {
		if(su1>su2) {
			System.out.println(su1+su2);
		} else {
			System.out.println("����");
		}
	}
	
	//���� �� ���� ���޹޾� ���������� Ȯ�� �� ����� �������ִ� �޼ҵ� 
	//true/false
	//��ȯ�� �ְ� �Ű����� �ִ� �޼ҵ�
	
	public boolean checkChar(char check) {
		return ('a'<=check&&check<='z')||
								('A'<=check&&check<='Z');
		
	}
	
	//�迭�� �Ű������� �޴� �޼ҵ� ����
	public void updateArray(int[] nums) {
		//�迭�� �Է¹޴� ������ �ʱ�ȭ�ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("=== �迭 �����ϱ� ===");
		
		for(int i=0; i<nums.length; i++) { //4ȸ��
			System.out.print("������ : ");
			nums[i]=sc.nextInt();
		}
	}
	
	//�⺻ �ڷ����� �Ű������� �ް� �����ϱ� -> �� ��!
	//�Ʊ�� ���� �ּҰ��̾ �������� ���������� �̰� �ƴ�.
//	public void basicUpdate(int su) {
//		su=200;
//	}
	
	public int basicUpdate() {
		return 200;
	}
	
	
	//student ��ü�� ����� �̸�,�г�,��,��ȣ,Ű,������ 
	//�⺻���� �ڽ��� ������ �����ϰ�
	//studentUpdate�żҵ带 ����� �Է¹��� ������ ������ �� ����ϱ�
	//1.ù ���� ���-��ȯ���� �Ű��ְ�
	//�����ؼ� �����̴ϱ� �̰� �� ȿ����. ���� �޸� �߰������� Ȯ�����ϰ� �ִ� �� ���ϱ�
	public void studentUpdate(Student s) {
		//s�� �����ض�. ������ ���� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====�л���������====");
		System.out.print("�̸� : ");
		String name=sc.next();
		System.out.print("�г� : ");
		int grade=sc.nextInt();
		System.out.print("�� : ");
		int rclass=sc.nextInt();
		System.out.print("��ȣ : ");
		int number=sc.nextInt();
		System.out.print("Ű : ");
		double height=sc.nextDouble();
		System.out.print("������ : ");
		double weight=sc.nextDouble();
		
		//���޵� �Ű����� ���� ����
		s.setName(name);
		s.setGrade(grade);
		s.setRclass(rclass);
		s.setNumber(number);
		s.setHeight(height);
		s.setWeight(weight);
	}
	
	//2.�� ��° ��� �л����� �����ϴ� ���� - ��ȯ �ְ� �Ű� ����
	//gc�� �������� ������ ��Ʃ��Ʈ ������ �ʴ� �̻� ������� �������
	public Student studentUpdate() {
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("====�л���������====");
		System.out.print("�̸� : ");
		String name=sc.next();
		System.out.print("�г� : ");
		int grade=sc.nextInt();
		System.out.print("�� : ");
		int rclass=sc.nextInt();
		System.out.print("��ȣ : ");
		int number=sc.nextInt();
		System.out.print("Ű : ");
		double height=sc.nextDouble();
		System.out.print("������ : ");
		double weight=sc.nextDouble();
		Student s=new Student(name,grade,rclass,number,height,weight);
		//new�����ϱ� ���ο� ������� ����
		return s;
		
	}
	
	
		//�̸�, ����, ��ȭ��ȣ�� ���޹ް� �� ������ string���� ��ȯ�Ͽ� ����ϱ�
		//insertMember �޼ҵ� �����
		//id,pw,name,email,addr�� ���޹޾� Member ��ü�� �����Ͽ� ���.*��ȯ��
	
		public Member1 insertMember() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("���̵� : ");
			String id=sc.nextLine();
			System.out.print("��� : ");
			String pw=sc.nextLine();
			System.out.print("�̸� : ");
			String name=sc.nextLine();
			System.out.print("�̸��� : ");
			String email=sc.nextLine();
			System.out.print("�ּ� : ");
			String address=sc.nextLine();
			
			Member1 mem = new Member1(id,pw,name,email,address);
			return mem;
			
		}
}