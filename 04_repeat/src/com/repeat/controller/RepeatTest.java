package com.repeat.controller;

import java.util.Scanner;
import java.util.*; //util �ȿ� �ִ� �� ��ü ���ڴ�

public class RepeatTest {

	public void basicRepeat() {
		//�ݺ���
		//���α׷� ���� �帧�� �ٲٴ� ������ �ϴ� ��� �� �ϳ���
		//Ư�� ������� �ݺ��ؼ� �����Ѵ�.
		
		//�⺻ for�� �ۼ��ϱ�
		//for(�ʱ��; ���ǽ�; ������) {����� ����;}
		//������ ���� ���������� �ݺ��� ��,�ݺ� Ƚ���� �˰� ���� �� 
		
		//�ȳ��ϼ��� 10�� ���
		System.out.println("�ȳ��ϼ���!");
		System.out.println("�ȳ��ϼ���!");
		System.out.println("�ȳ��ϼ���!");
		//.
		//.
		System.out.println("===for������ ����ϱ�===");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			System.out.println("�ȳ��ϼ���!");
		}
		
		//1���� 100���� ����ϱ�
		System.out.println("1���� 100���� ����ϱ�");
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			// for (int i = 0; i <100; i++) {
			// System.out.println("i : "+ (i+1));
			// �̷��Ե� ��
			// System.out.println("i : " + i++);
			//�̷��� �ϸ� i ���� ¦���� ����!! i���� ���⼭ +1�� �� ��Ŵ
		}
		
		//100���� 1����
		System.out.println("100���� 1���� �Ųٷ� ����ϱ�");
		for (int i = 100; i > 0; i--) {
			System.out.println("i :" + i);
			//int su = 100;
			//for(int i = 0; i <100; i++) {
			//	System.out.println(su--);
			//�̷��Ե� ��. �� �ʱⰪ�� ������� �ʾƵ� ��.
			//if�� ó�� for�� �ȿ��� ������ ������ �� �߰�ȣ���� ��� �� ��.
			//�ʱ�� ������ ����������. - �׷��� ���� i��� ������ ���� �ʾ���!
			}
		
		//1���� 100���� Ȧ���� ����ϱ�
		System.out.println("1���� 100���� Ȧ���� ����ϱ�");
		for (int i = 1; i < 100; i+=2) {
			System.out.println("i :"+i);
		}
		//for (int i = 1; i <= 100; i++) {
		//if(i%2==1) {  for�� �ȿ� if���� �� �� �ִ�!
		//�Ǵ�
		//int su2 = 1; �����ϰ�
		//for(int i=1; i<50, i++)
		//System.out.println("i :"+(i+2));
		
		//1���� 100���� ��ü ���� ���ϱ�
		System.out.println("1���� 100���� ��ü �� ���ϱ�");
		//������ ���� ���� �����ؼ� �����س���
		int sum=0;
		for (int i = 1; i<=100; i++) {
			//if(i%2==0) { ¦�� �ո� ���� ��
			sum+=i;  //sum=sum+1;
		//} ¦�� �ո� ���� ��
	}
			System.out.println("��ü �� :" + sum);
		

		//System.out.println("1���� 100���� ¦���� ���ϱ�");
		//int sum2=0;
		//for (int i = 1; i<=100; i++) {
		//	if(i%2==0) {
		//	sum2+=i;
		//}
		//System.out.println("¦�� �� :" + sum2);
		
		//�Է¹��� Ƚ����ŭ "�ڵ��� ��ſ�" �ݺ� ����ϱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ݺ��� Ƚ�� �Է� :");
		int su1 = sc.nextInt();
		for (int i = 0; i < su1; i++) {
			//������ �ݺ��� Ƚ������ ����Ѵ�!! 
			//������ 0���� �����ϱ� ������ '='�� ���̸� �� �� �� ��µȴ�!!
			System.out.println("�ڵ��� ��ſ�");
		}
		
		//���� 3���� �Է� �ް� �� �հ踦 �� ������ ����ϱ�
		
		int sum2 = 0;
		for (int i = 0; i <3; i++) {
			System.out.print("���� :");
			sum2+=sc.nextInt();
		}
		System.out.println(sum2);
	
		//for���� �ٸ� ����
		//for(�ʱ��;���ǽ�;������) {����}
//		(;;)�� ���ٸ�?
//		for(;;) { //���� ���� ex)ȸ�� ����ϰ� ���� ȭ�鰡��...������ �ü���� ���� ���.���ᰡ �ʿ���
//			System.out.println("=== �޴��� ===");
//			System.out.println("1. ĳ���");
//			System.out.println("2. ��â");
//			System.out.println("3. �۷ι���");
//			System.out.println("0. ���α׷� ����");
//			System.out.print("�Է� : ");
//			int choice=sc.nextInt();
//			switch(choice) {
//			case 1 : System.out.println("��� ĳ���"); break;
//			case 2 : System.out.println("��â�� ���ֿ�!"); break;
//			case 3 : System.out.println("�۷ι���??"); break;
//			case 0 : System.out.println("���α׷��� �����մϴ�."); return; 
//			} //return�� ���ѷ��� ����.�� �ڵ� �� ����.�޼ҵ� ��ü�� ����.
//			
//		}
		//for���� ���ǽ��� ����???
		for (int i = 0;;i++) { //���ѷ���. ���ǽľ����ϱ� ������ true
			System.out.println(i);
			if (i==10000) {
				break; //10000�Ǹ� ������
			}
		}
		
		int a = 0; //�̰� �ʱ���� �ȴ�.
		for (; a<10; a++) {
			System.out.println(a);
		}
		
		for(; a<20; ) {//���ǽĸ� �ᵵ ��. 
			//System.out.println(a); //false�� �� �����ϱ� ��� 10�� ����
			System.out.println(a++); //�ϸ� 19���� ������ �����
		}
		//�ʱ��, �����Ŀ��� ���� ���� ����/���� ��ų �� �ִ�.
		for(int i=0,j=10;i<10;i++,j+=20) {
			System.out.println(i+" "+j);
		} //i�� 10�� ������ i�� 1��, j�� 20�� ����
	}
		
	public void studentGrade() {
		//�л� ����
		//�л��� ����, ����, ���� ������ �Է¹ް�
		//�� �հ�� ����� ���ϴ� ���α׷� �����
		//������ 100 100 100 �հ� 300 ��� 100
		//��   �� 90  90  90  �հ�270   ��� 90
		//�� ������ ������ �� ��, ��� ���뿡 ���� ���� �� ��
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�л� �� :");
		int stu = sc.nextInt();
		sc.nextLine();
		String result=""; 
		//��ü ��갪 string �̴ϱ�..������ó���̴ϱ� �� ������� ó�� �Էµ�.�� ���� ������� �����Ǽ� ��µȴ�!!
		for(int i = 0; i < stu; i++) {
			
			
			System.out.print("�̸� :");
			String name = sc.nextLine();
			System.out.print("���� ���� :");
			int en = sc.nextInt();
			System.out.print("���� ���� :");
			int ma = sc.nextInt();
			System.out.print("���� ���� :");
			int ko = sc.nextInt();	
			sc.nextLine(); //�ٽ� ���� �ö󰡼� �����ϱ�
			//int result1 = en+ma+ko;
			//double result2 = result1/3.0;
			//System.out.printf("%s %d %d %d �հ� %d ��� %f \n", 
			//		name, en, ma, ko, result1, result2);
			//�̷��� ���� �� �� �� ������ ��� ��.
			result+=name+" "+ko+" "+en+" "+ma+
					" �հ� : "+(en+ko+ma)+" ��� :"+ ((ko+en+ma)/3.0) + "\n";

		} 
		System.out.println(result);
	//�̷��� �ϸ�  �� ���� ���� �ؿ� �Ѳ����� ��µ�.
	
	}
	
	public void whileTest() {
		//while(���ǽ�) {����� ����; [������or�б⹮]; }
		//�������� {} �ַ� �� �ؿ� ��(��ġ�� ���� ���� �޶��� �� ����)
		//�ַ� ���ѷ��� �� ��, �б⹮�� ������ ������ �� ��, 
		//���ư��ٰ� �ڵ����� false�� �Ǵ� �޼ҵ���� �� ��, ���ǽĸ� ������ true/false ���� �� ���� �� ���
		
		//���� �� ���� ���� ���̿���
		int i = 0; //�ʱ��
		while(i<3) { //���ǽ� 
			System.out.println("���� �� ���� ��!");
			i++; //������
					
		}
		
		//1~30���� ����ϱ�
		int i2 =1;
		while(i2<=30) {
			System.out.println(i2);
			i2++;
		//i=0;
		//while(i<30) {
		//System.out.println(i+1);
		//i++;
		}
		
		//����ڰ� �Է��ϴ� 3�� ���ڿ��� �� ���� ����ϴ� ���α׷� �ۼ�
		Scanner sc = new Scanner(System.in);
		
		int ii = 0;
		String result="";
		while(ii<3) {
			System.out.print("���ڿ� �Է� : ");
			result+= sc.nextLine(); //result+=�ؾ��Ѵٴ� ��!!
			//���ڿ��� +���길 �ȴ�
			ii++; //���⿡ ������ ����  ���� �� Ȯ���ϰ� �ֱ�!! str�־����� ���ѷ��� ����..
		}  //������ ������ ���ѷ���..
		System.out.println(result);
		
		//do ~ while��
		//do {���� ����} while (���ǽ�);
		//while���� true�� ����, f�� �������
		//do~while���� ������ do�� 1���� ����! �� ������ t/f�������. false�� ����.
		do {
			System.out.println("do~while��");
			ii++; //������ ����� �� ����(������,�б⹮)�ʿ�
		} while (ii<5); //while(false); �� �� �� ����
		
		while (ii<3) { //while(true) �ϸ� ���ѷ��� ��
			System.out.println("while��");
		}
		
		//while�� �̷��� ���� ���� ������ �˾Ƶֶ�. �ڿ��� ���
		Set<String> test = new HashSet();
		test.add("�ϳ�");
		test.add("��");
		test.add("��");
		Iterator it=test.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
	
}


