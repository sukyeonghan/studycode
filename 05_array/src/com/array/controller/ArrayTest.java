package com.array.controller;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
	
	public void basicArray() {
		//�⺻ �迭 ����� �Ҵ��ϱ�
		
		int[] intArr = new int[3];
		//������ ������. �ּҰ��� �������ϱ� �Ҵ��� �ؾ��Ѵ�.
		//�⺻�� ������ int,double...���� ������ ��
		double[] doubleArr=new double[3];
	
		String[] strArr=new String[3];
		
		char[] chArr=new char[3];
		
		//�������� Ȯ��
		System.out.println(doubleArr[0]); //0.0
		System.out.println(strArr[0]); //null
		System.out.println(chArr[0]); //(����)
		
		//���� ����/����ϱ� - �ڷ��� ���߱�
		intArr[0] = 20;
		//intArr[1] = "����"; �ٸ� Ÿ���� �� ��
		System.out.println(intArr[0]);
		System.out.println(intArr[1]); 
		//������ߴµ� 0�� ��µ�. �� ������ �� �� �ڵ����� �⺻��(default) 0 ������.
		//String �� null; double�� 0.0 ...
		//int a;
		//System.out.println(a); //�̰� �� �ȳ־ ��¾ȵ�.
	
		//String 5���� ������ �� �ִ� ������ Ȯ���ϰ�
		//�ڽ��� �����ϴ� ������ 5�� ������ �����ϰ� ����ϱ�
		String[] strArr2 = new String[5];
		strArr2[0] = "���"; //strArr2[0] �̰� ��ü�� ������
		strArr2[1] = "������";
		strArr2[2] = "����";
		strArr2[3] = "����";
		strArr2[4] = "����";
		System.out.println(strArr2[0]);
		System.out.println(strArr2[1]);
		System.out.println(strArr2[2]);
		System.out.println(strArr2[3]);
		System.out.println(strArr2[4]);
		
		//for���� �̿��Ͽ� ����ϱ�
		for(int i=0;i<5;i++) {
			//System.out.println(i); 0,1,2,3,4
			System.out.println(strArr2[i]);
		}
		
		strArr2=new String[3];
		System.out.println("[3]"+strArr2.length); //3�� ����
		strArr2=new String[100];
		System.out.println("[100]"+strArr2.length); //100�� ����
		//���Ҵ��. ������ ������ �� ���� ������ ��.gc(������ �÷���)�� ����
		//ArryIndexOutOfBoundsException:3 ������ !!�߿�!!!!
		//���� ������ �Ѿ. �� ����(������ ���� ����) �ε��� ��ȣ�� �Է����� ��
		//for���� �̿��� �ʱ�ȭ ����
		
		//for���� �̿��Ͽ� �� �����ϱ�
		//for(int i=0;i<5; i++) {
		for(int i=0;i<strArr2.length; i++) {
			//������ �� ���̰� ���� ��.
			strArr2[i] = "����";
		}
		//for(int i =0; i<5; i++) {
		for(int i=0;i<strArr2.length; i++) {
			System.out.println(strArr2[i]);
		}//�� ���� ������ ���� ���� �� ����
		
		//���� 5���� ������ �� �ִ� ������ Ȯ���ϰ�
		//�� ������ 1~5���� ���� �����ϱ�
		
		int[] a =new int[5];
		for(int i =0; i<a.length; i++) {
			a[i]=i+1;
		}
		for(int i =0;i<a.length;i++) {
		System.out.println(a[i]);
		}
		
		//�̸��� �Է¹ް� ��� ���α׷� �����
		//1.��� �̸��� �Է����� �Է¹ް�
		//2.�� �� ��ŭ �迭�� ����� �̸��� �Է¹޾� �����ϰ�
		//3.�迭�� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο� �� :");
		int pe = sc.nextInt();
		
		String[] pe2 = new String[pe];
		//�̸��� ������ �� �ִ� �迭�� �����
		//pe2[0]=�̸�..
		for(int i=0; i<pe2.length; i++) {
			System.out.print("�̸� �Է� : ");
			pe2[i]=sc.next();
		}
		for(int i=0; i<pe2.length; i++) {
			System.out.println(pe2[i]);	 	
		}
		
		//�迭�� ������ ��
		//����� ���ÿ� �ʱ�ȭ
		int age = 19;
		int[] numbers= {1,2,3,4,5};
		//0�� �ε����� 1,1�� �ε����� 2, 2�� �ε����� 3..
		System.out.println(numbers[2]); //3�� ����
		
		String[] nn= {"����","������","���Ͽ�","������"};
		System.out.println(nn[0]); //������ ����
		//nn = {"����","���߱�","����","ȫ��õ"};
		//�̷��� �ϸ� �̹� ����� �� �ٽ� �Ҵ��� �� ��
		nn=new String[] {"����","���߱�","����","ȫ��õ"};
		System.out.println(nn[0]);
		//�̷��� ���Ҵ� ����
	}
	public void arrayCopy() {
		//���� ����==�ּҰ��� �����ؼ� heap������ ������ �迭������ ���� ���� ��!
		char[] chs= {'A','B','C','D'};
		char[] copyCh=chs;
		chs[0]='��'; //�����ϸ� �� �� �ٲ�
		copyCh[copyCh.length-1]='��';
		//�̷��� �ϸ� 'D'�ڸ��� �ٲ�.���̴�4�ϱ�.
		
		System.out.println("==== chs ������ ===");
		for(int i=0; i<chs.length;i++) {
			System.out.print(chs[i]);
		}
		System.out.println();
		System.out.println("=== ����� �� ===");
		for(int i=0; i<copyCh.length;i++) {
			System.out.print(copyCh[i]);
		}
		System.out.println();
		System.out.println(chs+" : "+copyCh);
		//�Ȱ��� ��ġ�� ���� �����Ѵ�.���� �ּҸ� ������ ����
		
		//���� ����(4�������)
		//heap������ �迭������ �߰������� ���� ���� �����ϴ� ��!
		//�ּҰ��� ����. ������ ���� ������.
		//����, �纻 �ΰ� �۾��ϰ� ���� ��/�������� Ȯ���ϰ� ���� ��
		String[] str= {"��","��","��","��"};
		String[] str2 = new String[str.length];
		
		//1. for�� �̿� ����(��ü����)
		for(int i =0 ; i<str.length; i++) {
			str2[i]=str[i]; //�����ؼ� �ִ� ��
		}
		str[0]="����"; //str => ���� �� �� ��
		str2[str2.length-1]="������"; //str2=>�� �� �� ������
		for(int i =0 ; i<str.length; i++) {
			System.out.print(str[i]);
		}
		System.out.println();
		for(int i =0 ; i<str.length; i++) {
			System.out.print(str2[i]);
		}
		System.out.println();
		
		//2. System.arraycopy�޼ҵ� �̿� �����ϱ�
		//���ϴ� ��ġ�� ���� ���ϴ� ��ġ�� ���� ����(�̹� ������������ ���� ����)
		String[] str3=new String[str.length];
		//System.arraycopy(str,0,str3,0,str.length);//��ü ����
		System.arraycopy(str, 2, str3, 2, 2);
		//str(�迭)(������ ��)�� 2��° �ε��� ���� str3(�迭)(����� ��)�� 2��° �ε��� ������ ���� 2��ŭ ����
		//���ڴϱ� ������ null������ ��Ÿ��
		//������ ���� ���� �� �� ���� ��� ���ؾ� ��->ArrayIndex~~ ���� ���� 
		
		//��2���� �迭�� ���� �Ҵ��ؼ� �Ҵ��� �迭 ������ ���� �����ϴ� ��
		
		//for(int i=0; i<str.length...) �����ϱ�
		//for each���� ����غ���
		//��ü ����� �� �ַ� ��.�ε��� ���� �����ؼ� ó���� �� ����
		//�迭�̳� collection��ü�� ���� ������ �� ���
		//for(�迭�ڷ����� ���� : �迭 �Ǵ� collection��ü) {����}
		System.out.println();
		for(String v : str) { //���� : �迭(���� ���� ������ �ִ� ��)//���� �� �� ��
			System.out.print(v);
		}
		System.out.println();
		for(String v : str3) {
			System.out.print(v);
		}
		System.out.println();
		
		//Arrays.copyof(), clone()�� �迭������ �����ϰ� �������ָ� ��. *�Ҵ��� �ʿ����!(new~�� �����ϴ� ��)
		//Arrays.copyof()�޼ҵ� �̿��ؼ� ����
		//�迭�� �Ҵ����� �ʰ� ������ ������ �� ������
		String[] str4; //���� ��.���� �ƹ��͵� ���� ����
		str4 = Arrays.copyOf(str,str.length);//Arrays.copyOf�� �ּҰ� �����ؼ� �迭 �־��ش�. 
		str4[0]="�� ���!"; //�굵 ���ε��� ����.
		for(String temp : str4) {
			System.out.print(temp);
		}
		System.out.println();
		
		//���� 0������ ����. �޴� ��ġ�� ������ �� ����.
		String[] str5;
		str5 = Arrays.copyOf(str,2);
		System.out.println(str5);
		for(String v : str5) {
			System.out.print(v);
		}
		
		//clone() -> ��ü(�迭�� �ϳ��� ��ü)�� �����ϴ� ����� �ϴ� �޼ҵ�
		//�迭������.clone();
		//������ �� ���� ������ ��ä�� �� ����
		str5=str.clone();
		for(String v : str5) {
			System.out.println(v);
		}
	}
	
	//�迭�� ���� �ִ� ���
	//���� ��ɺ��� ������������(�Ǵ� �ٸ� Ŭ������)
	//�츰 ���� �Ŵϱ� �̾ �� ����.
	public void inputArray(String[] temp) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<temp.length; i++) {
			System.out.print("�Է� :");
			temp[i] = sc.nextLine();
		}
	}
	public void printArray(String[] t) {
		
		for(int i=0; i<t.length; i++) {
			System.out.print(t[i]);
			
		}
	}
	
	
	public void arrayTest() {
		int[] nums= {1,2,3,4,5};
		//nums=new int[5];
		//nums[0]=1;
		//nums[1]=2;
		//nums[2]=3;
		//nums[3]=4;
		//nums[4]=5;
		//�� �۾����� �� �ٷ� ó����.
		//�� �����Ͱ� ������ ������ �̷��� �ϸ� ����
		nums=new int[]{4,5,6,7,8};
		//�ϸ� ���Ҵ��
	}
	//������ �迭 ����ϱ�
	public void doubleArray() {
		
		//2���� �迭
	    //2�� �̻��� �迭�� �����ִ� ���� 
		//�� ĭ,�� ĭ�� ������.
		//�ڷ���[��][��] �迭��
	    //���������� �Ҵ��ϸ� �� ������ ����
		//�迭 �Ҵ� : �ڷ���[][] �迭�� = new�ڷ���[��ũ��][��ũ��];
	// int[][] arr = new�ڷ���[2][4];
	// �ּҰ���...?
	//�迭�� 3�� - �ּҰ��� ������ �ִ� �迭, , .
		//������ �迭 �����ϱ�
		int[][] numbers=new int[3][3];
		//������ �迭 �� �����ϱ�
		numbers[0][0]=300;
		numbers[0][1]=100;
		numbers[0][2]=200;
		numbers[1][0]=30;
		numbers[1][1]=20;
		numbers[1][2]=50;
		
		//������ �迭 ����ϱ�
		System.out.print(numbers[1][1]); //1��
		System.out.println(numbers[0]); //0���� ����Ǿ� �ִ� �ε����� �ּ�
		System.out.println(numbers[1]); //1���� ����Ǿ� �ִ� �ε����� �ּ�
		System.out.println(numbers);
		
		//������ �迭�� ����� ���ÿ� �ʱ�ȭ!
		int[] a= {1,2,3,4};
		int[][] num2= {{1,2,3,4},{5,6,7,8}};
		//new int[2][4];�� �ȴ�
		
	
		//numbers=new int[][]{{10,20,30,40},{50,60,70,80}};
		//������[3][3]�̾���. ���� [2][4]�� �Ǿ���
		
		//for���� �̿��Ͽ� �������迭 ó���ϱ�!
		
		numbers=new int[][]{{10,20},{50,60}};
		numbers=new int[5][];
		numbers[0]=new int[10];
		numbers[1]=new int[2];
		//�̷��� ���� �ٸ� ���̷� ������ �� �ִ�.
		
		//�̷��� �ٲ㼭 ����ϸ� ������. �׷��� length�� ��
		//numbers ����ϱ�
		//for(int i=0; i<3; i++) {
		//for(int j=0;j<3;j++) {
		
		for(int i=0; i<numbers.length; i++) { //�ܰ��� �ִ� ����
			for(int j=0; j<numbers[i].length; j++) {
			//�ึ�� ���� �ٲ� ���� �����ϱ� �����̷� �޴´�..
			//System.out.println(i+" :"+j);
				//0:0 0:1 0:2 1:0 ...���
			System.out.print(numbers[i][j]+" ");
		}
		System.out.println();
	}
					
}
		
		public void doubleArray22() {
			//���� ���̰� 15, ���� ���̰� 11�� 2���� �迭�� �����ϱ�
			//1~165���� �ε��� ������� ���� �ʱ�ȭ�ϰ� �� ���� ����ϱ�
			int a =0;
			int[][] arr = new int[15][11]; 
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=a++;
				System.out.println(a);
				}
			}
			
			//12���� �л����� �⼮�� ������ 2�� 6������ �ڸ���ġ�Ͽ� �д��� ������,
			//1�д� ���ʺ��� ������, 1�࿡�� �Ʒ� ������ ��ȣ������ �ڸ��� ��ġ�ϴ� ���α׷��� �ۼ��ϱ�
			//1���� �迭�� 2���� �迭�� �ű��
//			
//			aa=new String[12];
//			aa[1]="ȫ�浿";
//			aa[2]="�̼���";
//			aa[3]="������";
//			aa[4]="������";
			
			
			String [] aa = {"ȫ�浿","�̼���","������","������","�念��",
					"�Ӳ���","�庸��","���¹�","������","������","������","�̻��"};
			for(int i=0; i<aa.length; i++) {
				
				System.out.println((i+1)+"."+aa[i]+
						(i+7)+"."+aa[i+7]);
	
			}
			
			
//			String [][] bb = new String[6][2];
//			
//			for(int i=1; i<=bb.length; i++) {
//				System.out.println();
//			
//					
//					String aa[];
		
	
	}
}
	
	
	
	
//Ŭ���� ���̾�׷� ��
//��Ű��, Ŭ������
// �ʵ�,��� ����
//-,�����̺� : ����������. ������ �� �ִ� ������ ���� ����
//�ؿ� ���(�޼ҵ�)

//new�����ڷ� Ŭ���������ϸ� ��ü�� ����
//�ν��Ͻ�ȭ : �ڵ带,������ ������ �ڷ������ ���������� �� �� �ְ� ���� ��.���赵��� �������.
//ĸ��ȭ : ������ �����͸� ���� �� �ְ� ����. ���ܳ��� ��. �����̺��� ���. ������� ������
//Ư�� �޼ҵ带 ȣ���ؼ� �����ϰ� ��.�����̺����� �������� 1��1�� �޼ҵ� ����.
//ex)���� ������ �� �ް�, ���� ����

//Ŭ������ �ڷ����� �ȴ�.
//�޼ҵ带 �� ���� ��ü�� �����ؾ��Ѵ�.
//new ArrayTest().doubleArray();
//�̰͵� ����������! Ŭ������().�޼ҵ��()
//��ɰ����� �ִ� Ŭ����/������ ���� �� �ִ� Ŭ������ ���� �� ����
//Ŭ������ ������� ��ü�� �����ϰ� ��������� �ִ� ������ ���..?

//Ŭ���� ����- ��ü ���� ���
//Ŭ����-���赵�� ����
//��� : ��ü �� ���踦 �ξ��༭ �� �� �ְ� ���.�̸� ����� ���� Ŭ���� �����پ��� ��. 
//������ : �ڷ����� �ٸ��� ���� �� �ڽİ�ü�� �θ�ü���� ���� �� ����

//Ŭ���� ����
//������ ��Ӱ� ���õǾ��־ ������ �н�
//Ŭ���� �߰�ȣ �ȿ��� ���� ���� =>�ʵ�, ��� ����
//�����ڸ�()[] ->���� �� ����Ǵ� ��
//�޼ҵ�(���)-> Ŭ������ �ο��Ǵ� ���ҿ� ���� �����

//public(���� ������) class Ŭ���� �̸�
//public : Ŭ���� �� �ִ� ��� ��Ű������ ��밡��
//default : ���� ����, ��Ű�� �������� ����. �ٸ� ��Ű�� ���� import�ؼ� �� �� ����

//�ʵ� - �������. �����ؾ����� ����̰���
//�ʵ� - �������=����
//[����������-public,default,private(�츮�� ���� ��)...][�����-final,static..]�ڷ��� ������(-���� ����)
//���ٿ����� -'.'
//���� ���� : public�� ��  -> �ּҰ�.a(-������)
//protected�� �ڽ��� ���� �� ���������� ����
//default�� ���� ��Ű�� �ȿ����� ���� ����
//private�� Ŭ���� {}�ȿ����� ���� ����