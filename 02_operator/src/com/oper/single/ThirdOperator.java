package com.oper.single;

import java.util.Scanner;

public class ThirdOperator {

	public static void main(String[] args) {
		
		//���׿����� Ȱ���ϱ�
		int sum1=30;
		int sum2=20;
		System.out.println(sum1>sum2?"ũ��":"�۴�");
		
		//�̸��� �Է� �ް� �� �̸��� ����ȣ�� �����ϴٸ� ���, �ƴϸ� �ƴմϴ� ����ϱ�
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�̸� �Է� : ");
		String name=sc.nextLine();
		System.out.println(name.equals("����ȣ")?"�����ϴ�":"�ƴմϴ�");
		// ���ڿ��� .equals�� ���ؾ� ��!!
		//System msg=name.equals("����ȣ"?"�¾ƿ�!":"�ƴմϴ�!");
		//System.out.println(msg);
		//�̷��� �ص� ��
		
		//Ƽ���� �ְ�, ���̰� 19�ʰ��� "��������!" �ƴϸ� "���� �Ұ�"
		//Ƽ�� ���� : 333
		//Ƽ�� ��ȣ, ���� �Է¹޾� ó��
		
		System.out.print("Ƽ�� ��ȣ : ");
		int ticket=sc.nextInt();
		System.out.print("����� ���� : ");
		int age=sc.nextInt();
		String result=ticket==333&&age>19?"��������!":"����Ұ�!";
		System.out.println(result);
		
		int plus=age>19?age++:age--;
		System.out.println(plus+" "+age);
		//���� �����̳� ���� ���Ե� ����
		
		//ȭ�� ����.������ �������� �б� ó�� �� �� �̿�
		// <input type='text' value='age>19?"�ȳ�":""' > 
		
		//���� ���� ���ο� ���׿����� �ֱ�
		//���̰� 19�� �̻��̸� "�����Դϴ�", 17�̻� 18�� ���ϸ� "����л�", 
		//14�̻� 16���ϸ� ���л�, �ƴϸ� �ʵ��л� 
		
		//String result2=age>=19?"�����Դϴ�":age>=17?"����л�":age>14?"���л�":"�ʵ��л�";
		//System.out.println(result2);
		System.out.println(age>=19?"�����Դϴ�":age>=17?"����л�":age>=14?"���л�":"�ʵ��л�");
		//��� ���� ��ȣ���� �� �Ƚᵵ ��! ���� Ȯ���ϱ�!
		
		
		
		
		
		
	}
	
}
