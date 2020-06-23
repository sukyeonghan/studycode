package com.oop.main;

import java.util.Scanner;

import com.oop.method.Functional;
import com.oop.model.vo.Member1;
import com.oop.model.vo.Student;

public class MethodMain {
	
	public static void main(String[] args) {
		Functional fun = new Functional();
		//��ȯ�� ����, �Ű����� ���� �żҵ� ȣ��
		fun.calculator();
		
		//��ȯ�� ���� �Ű����� �ִ� �޼ҵ� ȣ��
		//���� ���������� ���� static ������ ������ ���� �� ȣ��
		
		//fun.calculator2(10,10,"+");
	
		int su=10;
		int su2=10;
		fun.calculator2(10,20, new String[] {"*","/"});
		//�� ��� �� ����
		
		
		//��ȯ�� �ְ� �Ű����� ���� �޼ҵ� ȣ��
		//System.out.println(fun.calculator3());
		//return �� ���� ����� ������ ���ͷ��� ������.
		//�׷���, int 1�� ���� ��ȯ!
		
		int result = fun.calculator3();
		System.out.println(result*100);
		//������ �ް� Ȱ��
		
		
		//��ȯ�� �ְ� �Ű����� �ִ� �޼ҵ� ȣ��
		result = fun.calculator4(20,20);
		System.out.println(result);
		
		
		
		//���ڿ� �� ���� ���޹ް� �� ���ڿ��� �����ϰ� �������ִ� �޼ҵ� �����
		//��ȯ�� �ְ� �Ű����� �ִ� �޼ҵ�
		String strResult = fun.str("�ȳ�","�ϼ���");
		System.out.println(strResult);
	
		//���� �� ���� ���޹޾� ù ��° ������ �� ��° ������ ���� �������ִ� �޼ҵ�
		//��, ������ ù ��° ���� Ŀ����. ���� ������ "�������"
		fun.su(5,8);
		
		//�����԰ɷ� 2��°
		int res=fun.print(10,1);
		System.out.println(res==0?"":res);
		

		//���� �� ���� ���޹޾� ���������� Ȯ�� �� ����� �������ִ� �޼ҵ� 
		//true/false
		//��ĳ�ʷ� �Է¹޾��� ��
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� :");
		System.out.println(fun.checkChar(sc.next().charAt(0)));
		
		//�� ���� �Է����� ��
		System.out.println(fun.checkChar('1'));
		
		
		
		//��ü, �迭 ������ �ڷ��� �Ű�����, �������� �ۼ��غ���
		//��ü, �迭���� ������,�ڷ����� ������ �ִ� �ּҸ� �����ϱ� ������
		//�迭�� ���� ����� ���� �������� ���Ǿ� �������� �����Ǵ� ����� �����´�.
		
		int[] nums = {1,2,3,4}; //heap�� 1,2,3,4 ���� ���� 4ĭ �迭 ����
		//main�� ���� �ּҰ� ���� ���� ����
		System.out.println("=== ���� �� ===");
		for(int a :nums) {
			System.out.print(a+" ");
		}
		System.out.println();//����ǥ��
		
		fun.updateArray(nums); //�迭�� �ִ� ���� �����ϴ� ����
		//���� �ּҰ�����. heap�� �����ؼ� ���� �ٲ�
		//for�� ���� ������ - ������ ����
		System.out.println("=== ���� �� ===");
		for(int a :nums) {
			System.out.print(a+" ");
		} //����� heap �����ؼ� ���. �ּҰ��� ������ �̷� �����!
		System.out.println();//����ǥ��
		
		
		System.out.println("���� �� : "+su);
		//fun.basicUpdate(su);
		su=fun.basicUpdate();
		System.out.println("���� �� : "+su);
		
		
		//student ��ü�� ����� �̸�,�г�,��,��ȣ,Ű,������ 
		//�⺻���� �ڽ��� ������ �����ϰ�
		//studentUpdate�żҵ带 ����� �Է¹��� ������ ������ �� ����ϱ�
		//���(MethodMain), ȭ��, db(Functional)���� ������ ����. mvc����
		
		//1.
		Student s = new Student("�Ѽ���",3,2,20,160,45);
		fun.studentUpdate(s);//������ ���� �ּҰ����� ��ȯ..?
		System.out.println(s.getName()+s.getGrade()+ s.getRclass()
				+s.getNumber()+s.getHeight()+s.getWeight());
		
		//2.
		s=fun.studentUpdate(); //���ϰ� �־
		System.out.println(s.getName()+s.getGrade()+ s.getRclass()
		+s.getNumber()+s.getHeight()+s.getWeight());
		
		//insertMember
		
		Member1 mem = fun.insertMember();
		System.out.println(mem.getId()+mem.getPw()+mem.getName()
		+mem.getEmail()+mem.getAddress());
	}
}