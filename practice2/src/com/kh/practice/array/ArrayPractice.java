package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		//���̰� 10�� �迭�� �����ϰ� 1���� 10������ ���� �ݺ����� �̿��Ͽ�
		//������� �迭 �ε����� ���� �� �� ���� ����ϱ�
		
		int [] su1 = new int[10];
		for(int i = 0; i<su1.length; i++) {
			su1[i]=i+1;
		}
		for(int i = 0; i<su1.length; i++) {
			System.out.print(su1[i]+" ");
		}
	}
	
	public void practice2() {
		//���̰� 10�� �迭�� �����ϰ� 1���� 10������ ���� �ݺ����� �̿��Ͽ�
		//�������� �迭 �ε����� ���� �� ����ϱ�
		System.out.println();
		int [] su2 = new int[10];
		for(int i = 0; i<su2.length; i++) {
			su2[i]=10-i;
		}
		for(int i = 0; i <su2.length; i++) {
			System.out.print(su2[i]+" ");
		}
	}
	
	public void practice3() {
		//����ڿ��� �Է� ���� ���� ������ŭ �迭 ũ�⸦ �Ҵ��ϰ�
		//1���� �Է� ���� ������ �迭�� �ʱ�ȭ�� �� ����ϱ�
		
		System.out.println();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int su3 = sc.nextInt();
		int [] su4 = new int[su3];
		for(int i = 0; i<su4.length; i++) {
			su4[i]=i+1;
		}
		for(int i = 0; i<su4.length; i++) {
			System.out.print(su4[i]+" ");
		}
	}
	
	public void practice4() {
		//���̰� 5�� String �迭�� �����ϰ� "���","��", "����", "������","����"�� �ʱ�ȭ �� ��
		//�迭 �ε����� Ȱ���ؼ� ���� ����ϱ�
		System.out.println();
		
		String [] fruits = {"���","��","����","������","����"};
		System.out.print(fruits[1]);
	}
	
	public void practice5() {
		//���ڿ��� �Է� �޾� ���� �ϳ��ϳ��� �迭�� �ְ� �˻��� ���ڰ� ���ڿ��� �� �� �� �ִ���
		//������ �� ��° �ε����� ��ġ�ϴ��� �ε����� ����ϱ�
		System.out.println();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("���ڿ� :");
		String strs = sc.nextLine();
		System.out.print("���� :");
		char str = sc.nextLine().charAt(0);
		int count = 0;
		String arr="";
				
		char[] chrArray = new char[strs.length()]; //String ���� �迭
		
		for(int i = 0; i<strs.length(); i++) {
			chrArray[i]=(strs.charAt(i)); //��Ʈ���� �ѱ��ھ� ����
			if(strs.charAt(i)==str) {
				count++;    //���� ����
				arr+=i+" "; //��ġ ���
			}	
		} 
		System.out.print(strs +"�� "+ str +"�� �����ϴ� ��ġ(�ε���) :"+arr+"\n"+str+"���� :"+count);
	}
	
	public void practice6() {
		//"��"~"��"���� �ʱ�ȭ�� ���ڿ� �迭�� ����� 0���� 6���� ���ڸ� �Է¹޾� 
		//�Է��� ���ڿ� ���� �ε����� �ִ� ������ ����ϰ�
		//������ ���� ���ڸ� �Է� �� "�߸� �Է��ϼ̽��ϴ�"����ϱ�
		Scanner sc= new Scanner(System.in);
		
		System.out.print("0~6���� ���� �Է� :");
		int a = sc.nextInt();
		String [] b = {"������","ȭ����","������","�����","�ݿ���","�����","�Ͽ���"};
		if (0<=a&&a<=6) {
			System.out.println(b[a]);
		} if (a>6) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	public void practice7() {
		//����ڰ� �迭�� ���̸� ���� �Է��Ͽ� �� ����ŭ ������ �迭�� ���� �� �Ҵ��ϰ�
		//�迭�� ũ�⸸ŭ ����ڰ� ���� ���� �Է��Ͽ� ������ �ε��� ���� �ʱ�ȭ�ϼ���
		//�׸��� �迭 ���� ���� �����ϰ� �� �ε����� ����� ������ ���� ����ϱ�
		Scanner sc= new Scanner(System.in);
		
		System.out.print("���� :");
		int a = sc.nextInt();
		int sum=0; 
		int [] su = new int[a];
		
		for(int i =0; i<su.length; i++) {
			System.out.print("�迭 "+i+"��° �ε����� ���� �� :");
			su[i] = sc.nextInt();	
		} 
			for(int j=0;j<su.length; j++) {
				System.out.print(su[j]+" ");	
				sum+=su[j];
			} System.out.println();

			System.out.println("�� �� :"+sum);
		}
		
	
	public void practice8() {
		
		//3�̻��� Ȧ�� �ڿ����� �Է� �޾� �迭�� �߰������� 1���� 1�� �����Ͽ� ������������ ���� �ְ�
		//�߰� ���ĺ��� �������� 1�� �����Ͽ� ������������ ���� �־� ����ϱ�
		//��, �Է��� ������ Ȧ���� �ƴϰų� 3�̸��� ��� "�ٽ� �Է��ϼ���"�� ����ϰ�
		//�ٽ� ���� �ޱ�
		Scanner sc = new Scanner(System.in);

		int a=0;
		do {
			System.out.print("���� :");
			a = sc.nextInt();
			int s = 1;
			String str = "";
			
			if(a%2==0||a<3) {
				System.out.println("�ٽ� �Է��ϼ���.");
			} else {
				int mid = a/2+1; 
				
				for(int i=1; i<=a; i++) {
					if(i<mid) {
						str += s++ +", ";
					} else if(i>=mid){
						str += s-- +", ";
					}  
				} 
				System.out.println(str);
			}
		} while(a%2==0||a<3);
	}
	
	public void practice9() {
		//����ڰ� �Է��� ���� �迭�� �ִ��� �˻��Ͽ� 
		//������ "000ġŲ ��� ����", ������ "000ġŲ�� ���� �޴��Դϴ�"�� ����ϱ�
		//��, ġŲ �޴��� �� �ִ� �迭�� ���� ������ ���ϱ�
		Scanner sc = new Scanner(System.in);
		
		String [] chi = {"���߹ٻ��","����޺�","�Ѹ�Ŭ","�����Ķ��̵��"};
		System.out.print("ġŲ �̸��� ���ϼ��� :");
		String chi2 = sc.nextLine();
		
		for(int i=0; i<chi.length; i++) {
			if(chi2.equals(chi[i])) {
			System.out.println(chi2+" ġŲ ��� ����");
			break;
		} else {
			System.out.println(chi2+" ġŲ�� ���� �޴��Դϴ�.");
			break;
		}
	}
		
}
	
	public void practice10() {
		//�ֹε�Ϲ�ȣ �����ڸ� ���ĺ��� *�� ������ ����ϱ�
		//��, ���� �迭 ���� ���� ���� �迭 ���纻���� �����ϱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹε�Ϲ�ȣ(-����) :");
		String num = sc.nextLine(); 
		String result = "";
		
		
		char [] nums = new char[num.length()];
		for(int i=0; i<nums.length; i++) {
			nums[i]=(num.charAt(i));
		}
		
		char[] str=new char[nums.length];
		System.arraycopy(nums, 0, str, 0, 8);
		
		for(int i=0; i<8; i++) {
			result += str[i];
		} System.out.print(result+"******");
		
		for(int i=8; i<str.length; i++) {
			str[i]='*';
		}
		
	}
	
	public void practice11() {
		//10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�
		//1~10������ ������ �߻����� �迭�� �ʱ�ȭ�� �� ����ϱ�
		
		int [] su = new int[10];
		for(int i = 0; i<10; i++) {
			su[i]=(int)((Math.random()*10)+1);
			System.out.print(su[i]+" ");
		} 
	}
	
	public void practice12() {
		//10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�
		//1~10������ ������ �߻����� �迭�� �ʱ�ȭ�� �� 
		//�迭 ��ü���� �� �� �߿��� �ִ밪�� �ּҰ��� ����ϱ�
		
		int [] su = new int[10];
		
		for(int i = 0; i<10; i++) {
			su[i]=(int)((Math.random()*10)+1); 
			System.out.print(su[i]+" ");
		}
		
		int max = su[0];
		int min = su[0];
			
		for(int i =0; i<su.length; i++) {
			
			if(max<su[i]) {
				max = su[i];
			}
			else if (min>su[i]) {
				min = su[i];
			}
		} 
		System.out.println("\n�ִ밪 : " +max);
		System.out.println("�ּҰ� : " +min);
		
	} 
		
	public void practice13() {
		//10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�
		//1~10������ ������ �߻����� �ߺ��� ���� ���� �迭�� �ʱ�ȭ�� �� ����ϱ�

//		int [] su = new int [10];
//		su[0] = (int)((Math.random()*10)+1);
//		
//		String str = "";
//		str += su[0]+" ";
//		
//			
//		for(int i=1; i<10; i++) {
//			su[i] = (int)((Math.random()*10)+1);
//			
//			for(int j=i-1; j>=0; j--) {
//				if(su[j]==su[i]) {
//					su[i] = (int)((Math.random()*10)+1);
//				}
//			}
//			str += su[i]+" ";
//		} 
		
		 int[] su=new int[10];
		 
		  for(int i=0; i<su.length; i++) {
		   su[i]=(int)(Math.random()*10)+1;
		   
		   for(int j=0; j<i; j++) {
		    if(su[i]==su[j]) {
		     i--;
		    	}
		   	}
		 }
		  
		  for(int i=0; i<su.length; i++) {
		   for(i=0; i<su.length-1; i++) {
		    System.out.print(su[i]+" ");
		   	}
		   System.out.print(su[i]);
		 }
		 
	} 
	

	public void practice14() {
		//�ζ� ��ȣ �ڵ� ������ (�ߺ��� ���� ������������ ����)���α׷� �ۼ��ϱ�
		
		int []su = new int[6];
		
		for(int i=0; i<su.length; i++) {
		su[i] = (int)(Math.random()*45)+1;
			
			for(int j=0; j<i; j++) {
				if(su[i]==su[j]) {
					i--;
				}
			}
		}
		
		Arrays.sort(su);
		for(int i=0; i<su.length; i++) {
			System.out.print(su[i]+" ");
		}
	}
	
	
	public void practice15() {
		//���ڿ��� �Է� �޾� ���ڿ��� � ���ڰ� ������ �迭�� �����ϰ�
		//�ߺ��Ǵ� ���ڕ��� ������ ������ �Բ� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� :");
		String str = sc.nextLine();
		
		
		char arr[] = new char[str.length()];//�� ���ھ� ��ƾ��ϴϱ� char�� ����
		
		for(int i=0; i<str.length(); i++) {
			arr[i]= (str.charAt(i));
			if(i<str.length()-1) { //�� �� ',' ��� ���Ϸ���
			System.out.print(arr[i]+", ");
			} else {
				System.out.print(arr[i]);
			}
		} System.out.println();
		System.out.println("���� ���� :"+str.length());
		
	}
	
}
	

		