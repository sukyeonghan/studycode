package yese2;

import java.util.Scanner;

public class Yese3 {
	
	public static void main(String[] args) {
		
//		�ڽ��� �̸�(String), ����(int), �ּ�(String), 
//		Ű(double), ������(double), ����(char)�� �Է�
//		�ް� ����ϴ� ���α׷��� �ۼ��ϼ���.
//
//
//		  *�����Դ� ù°�ڸ����� ���
//		    Ű�� ������ ��ȯ�Ͽ� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name=sc.next();
		
		System.out.print("���� : ");
		int age=sc.nextInt();
		
		sc.nextLine();
		System.out.print("�ּ� : ");
		String address=sc.nextLine();
		
		System.out.print("Ű :");
		double height=sc.nextDouble();
		
		System.out.print("������ : ");
		double weight=sc.nextDouble();
		
		sc.nextLine();
		System.out.print("���� : ");
		char gender=sc.nextLine().charAt(0);
		
		System.out.printf("%s,%d,%s,%d,%.1f,%c", name, age, address, (int)height, weight, gender);
			
	}	
	
}
