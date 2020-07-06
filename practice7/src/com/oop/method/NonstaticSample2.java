package com.oop.method;

public class NonstaticSample2 {
	
	public int[] intArrayAllocation(int a) {
		//���޹��� ���� ������ŭ�� �迭������ �Ҵ��Ͽ�
		//������ ���� 1���� 100������ ���� ����ϰ� �ּ� �����ϱ�
		int[] intArr = new int[a];
		for(int i=0; i<a; i++) {
			intArr[i]= (int)((Math.random()*+100)+1);
		}
		return intArr;
	}
	
	public void display(int[] intArr) {
		//�迭�� ���޹޾� ȭ�鿡 ����ϱ�
		for(int i=0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}
	
	public static void swap(int[] intArr, int in1, int in2) {
		//�迭�� �� ������ �ε����� ���޹޾� �� �ε����� ���� ��ȯ��
		int result1 = intArr[in1];
		intArr[in1] = intArr[in2];
		intArr[in2]= result1;
		
	}
	
	public void sortDescending(int[] intArr) {
		//swap�޼ҵ带 �̿��Ͽ� �迭�� ������ ������������ ������
		for(int i=0; i<intArr.length; i++) {
			for(int j=i+1; j<intArr.length; j++) {
				if(intArr[i]<intArr[j]) {
					swap(intArr,i,j);
				}
			}
		}
		for(int i=0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}
	
	public void sortAscending(int[] intArr) {
		//swap�޼ҵ带 �̿��Ͽ� �迭�� ������ ������������ ������
		for(int i=0; i<intArr.length; i++) {
			for(int j=i+1; j<intArr.length; j++) {
				if(intArr[i]>intArr[j]) {
					swap(intArr,i,j);
				}
			}
		}
		for(int i=0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}
	
	public void countChar(String str, char ch) {
		//���ڿ��� ���� �ϳ��� ���� �޾�, ���ڿ��� ���Ե� ������ ������ ����
		int count=0;
		char[] strr = new char[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			strr[i]=(str.charAt(i));
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		System.out.print("���ڿ� ���� : "+count);
	}
	
	public void totalValue(int su, int su1) {
		//���� �� ���� ���޹޾�, �� ���� ���� ������ ū �������� �������� �հ踦 ����
		int sum=0;
		
		if(su<su1) {
			for(int i=su; i<=su1; i++) {
				sum+=i;
			} 
		} else if (su1<su){
			for(int i=su1; i<=su; i++) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
	
	
	public String pCharAt(String str3, int su3) {
		//���ڿ��� �ε����� ���޹޾�, �� ��ġ�� ���ڸ� ����
		String ch3 = str3.substring(su3, su3+1);
		return ch3;
	}

	public String pConcat(String str4, String str5) {
		//�� ���� ���ڿ��� ���޹޾�, �ϳ��� ���ڿ��� ���ļ� ����
		String sumStr = str4+str5;
		return sumStr;
	}
}
