package test.array.premitive;

import java.util.Scanner;
import java.util.Calendar;

public class ArraySample {
	
	public void test1() {
		//10���� int�迭 �����ϰ� �Ҵ�
		//�� �濡 1~100 ������ ������ ������ ���
		//10���� �������� �հ踦 ���Ͽ� ����ϱ�
		
		int [] su = new int [10];
		int sum = 0;
		
		for(int i=0; i<10; i++) {
			su[i] = ((int)(Math.random()*100)+1);
			sum+=su[i];
		}
		System.out.println(sum);
	}
	
	public void test2() {
		//10���� int ����, �Ҵ�
		//1~100������ ������ ������ �߻����� ����ϱ�
		//10�� �� �� �ִ밪�� �ּҰ� ����ϱ�
		
		int [] su = new int [10];
		int max = su[0];
		int min = su[0];
		
		for(int i=0; i<10; i++) {
			su[i] = ((int)(Math.random()*100)+1);		
		}
		for(int j=0; j<10; j++) {
			if(max<su[j]) {
				max=su[j];
			}
			if(min>su[j]) {
				min=su[j];
			}
		}
		System.out.println("�ִ밪 : "+max+"\n�ּҰ� :"+min);
	}
	
	public void test3() {
		//10���� byte �迭 ���� �� �Ҵ�
		//������ ������ ����ϰ� ¦������ �հ踸 ���Ͽ� ����ϱ�
		
		byte [] su = new byte[10];
		int sum = 0; //����Ʈ�� ���ϸ� �ִ밪127�� �Ѿ�� �ּҰ�-128���� ���ư�!
		
		for(int i=0; i<10; i++) {
			su[i] = ((byte)(Math.random()*Byte.MAX_VALUE));
			if(su[i]%2==0) {
				System.out.print(su[i]+" ");
				sum+=su[i];
			}
		}
		System.out.println("¦���� :"+sum);
	}

	public void test4() {
		//���ڷ� �� ���ڿ��� �Է¹޾� �� �ڸ��� ���ڵ��� ���� ���Ͽ� ����ϱ�
		//substring() �޼ҵ� Ȱ��
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڷ� �� ���ڿ��� �Է��ϼ��� :");
		String suString = sc.next();
		
		String [] str = new String[suString.length()];
		int sum = 0;
		
		for(int i=0; i<suString.length(); i++) {
			str[i] = suString.substring(i,i+1);
			//���ڿ�.substring(������ġ, ������ ��ġ)
			//���ڿ� ������ġ���� ������ ��ġ���� ����
			//���� ��ġ���� ������ ���ڿ� �ڸ���
			//-3 ������ 3����
			sum+=Integer.parseInt(str[i]);
		}
		System.out.println("�հ� : "+ sum);
	}
	
	public void test5() {
		//���ڷ� �� ���ڿ��� �Է¹޾� �� �ڸ��� ���ڵ��� ���� ���Ͽ� ����ϱ�
		//substring() �޼ҵ� Ȱ��//�迭 �Ⱦ��� ��
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڷ� �� ���ڿ��� �Է��ϼ��� :");
		String suString = sc.next();
		
		
		int sum = 0;
		
		for(int i=0; i<suString.length(); i++) {
		
			sum+=Integer.parseInt(suString.substring(i,i+1));
		}
		System.out.println("�հ� : "+ sum);
	}
	
	public void test6() {
		//���ڷ� �� ���ڿ��� �Է¹޾� �� �ڸ��� ���ڵ��� ���� ���Ͽ� ����ϱ�
		//charAt() �޼ҵ� Ȱ��
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڷ� �� ���ڿ��� �Է��ϼ��� :");
		String suString = sc.next();
		
		String [] str = new String[suString.length()];
		int sum = 0;
		
		for(int i=0; i<suString.length(); i++) {
			sum += suString.charAt(i) - '0';
			//char�� int������ �ٲٱ�
			//char - '0' �� �̿��ϸ� �ƽ�Ű�ڵ尪 �ʿ���� int��ȯ ����
		}
		System.out.println("�հ� :"+sum);	
	}
	
	public void test7() {
		//���ڿ� ������ �ʱ�ȭ�� �� 
		//����,����,����,������ ���� ���� �и� �����ϱ� - substring() ���
		//java.util.Date ���� ����ؼ� ������ ������� ������ ��¥ ������ �����
		//������ ������ ���� �����̾����� �����Ǵ� �޼ҵ带 ����ؼ� ����ϱ�
		//�������� 1�̸� ����, 2�� ���ڶ�� ����ϱ�
		//��¥ �����ͷ� �ٲ� ������ ���� ��¥�� �⵵�� ���� ���� ����ϱ�
		
		String personID = "881225-1234567";
		int myYear = Integer.parseInt(personID.substring(0,2))+1900;
		int myMonth = Integer.parseInt(personID.substring(2,4));
		int myDate = Integer.parseInt(personID.substring(4,6));
		int gender = Integer.parseInt(personID.substring(7,8));
		
		Calendar cal = Calendar.getInstance();
		cal.set(myYear,myMonth,myDate);
		int whatDate = cal.get(Calendar.DAY_OF_WEEK);
		
		String day = "";
		switch(whatDate) {
		case 1 : day="��"; break;
		case 2 : day="��"; break;
		case 3 : day="ȭ"; break;
		case 4 : day="��"; break;
		case 5 : day="��"; break;
		case 6 : day="��"; break;
		case 7 : day="��"; 
		}
		System.out.print(day+"����");
		
		if(gender==0) {
			System.out.println("\n����");
		} else {
			System.out.println("\n����");
		}
		cal.set(Calendar.YEAR,2020);
		int age =cal.get(Calendar.YEAR)-myYear;
		System.out.println(age+1);
	}

}