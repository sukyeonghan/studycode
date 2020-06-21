package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		//�� ���� ������ �Է� �޾� 1���� �� ���ڱ��� ��� ����ϱ�
		//��, �Է��� ���� 1���� ũ�ų� ���ƾ� ��
		//���� 1�̸��� ���ڰ� �Էµƴٸ� "1�̻��� ���ڸ� �Է����ּ���" ����ϱ�

		Scanner sc = new Scanner(System.in);

		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� :");
		int su1=sc.nextInt();
		sc.nextLine();
		String str1 = "";
		if(su1>0) {
			for(int i=1; i<=su1; i++) {
				str1+=i;
			} System.out.println(str1);
		} else {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
		}

	}

	public void practice2() {
		//�� ���� ������ �Է� �޾� 1���� �� ���ڱ��� ��� ����ϱ�
		//1�̸��� ���ڰ� �Էµƴٸ� "1�̻��� ���ڸ� �Է����ּ���."�� ��µǸ鼭
		//�ٽ� ����ڰ� ���� �Է��ϵ��� �ϱ�

		Scanner sc = new Scanner(System.in);

		int su1=0;
		do {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� :");
			su1=sc.nextInt();

			if(su1>=1) {
				for(int i=1; i<=su1; i++) {
					System.out.print(i+" ");
				} 
			} else if (su1<1) {
				System.out.println("1�̻��� ���ڸ� �Է����ּ���.");	
			}
		} while(su1<1);

	}


	public void practice3() {
		//�� ���� ������ �Է¹޾� 1���� �� ���ڱ��� ��� ���ڸ� �Ųٷ� ����ϱ�
		//�� �Է��� ���� 1���� ũ�ų� ���ƾ��Ѵ�
		Scanner sc = new Scanner(System.in);

		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� :");
		int su1=sc.nextInt();
		sc.nextLine();
		String str1 = "";
		if(su1>0) {
			for(int ii=su1; ii>0; ii--) {
				str1+=ii;
			} System.out.println(str1);
		} else {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
		}
	}

	public void practice4() {
		//�� ���� ������ �Է¹޾� 1���� �� ���ڱ��� ��� ���ڸ� �Ųٷ� ����ϱ�
		//1�̸��� ���ڰ� �Էµƴٸ� "1�̻��� ���ڸ� �Է����ּ���"�� ��µǸ鼭 
		//����ڰ� �ٽ� ���� �Է��ϵ��� �ϱ�
		Scanner sc = new Scanner(System.in);

		int su = 0;
		do {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� :");
			su=sc.nextInt();

			if(su>=1) {
				for(int i=su; i>0; i--) {
					System.out.print(i+" ");
				}
			} else if (su<1) {
				System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
			} 

		}while(su<1);

	}

	public void practice5() {
		//1���� ����ڿ��� �Է¹��� �������� �������� �� ����ϱ�
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �ϳ� �Է��ϼ��� :");
		int a = sc.nextInt();
		int a2 = 0;
		int i = 0;
		if (i<=a) {
			for(i=1; i<a; i++) {
				a2+=i;
				System.out.print(i + "+"); 
			}
			if(i==a) { 
				a2+=i;
				System.out.print(i);
			}
		} System.out.print("="+ a2);
	}


	public void practice6() {
		//�� ���� ���� �Է� �޾� �� ������ ���� ����ϱ�
		//���� 1�̸��� ���ڰ� �Էµƴٸ� "1�̻��� ���ڸ� �Է����ּ���"����ϱ�

		Scanner sc = new Scanner(System.in);

		System.out.print("ù ��° ���� : ");
		int a = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int b = sc.nextInt();

		if(a<1 || b<1) {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
		} else if(a>b) {
			for(int i=b; i<=a; i++) {
				System.out.print(i+" ");
			}
		} else if(a<b) {
			for(int i=a; i<=b; i++) {
				System.out.print(i+" ");
			}

		}
	}

	public void practice7() {
		//�� ���� ���� �Է� �޾� �� ������ ���� ����ϱ�
		//1�̸��� ���ڰ� �Էµƴٸ� "1�̻��� ���ڸ� �Է����ּ���."�� ��µǸ鼭
		//�ٽ� ����ڰ� ���� �Է��ϵ��� �ϱ�
		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;
		do {
			System.out.print("ù ��° ���� :");
			a = sc.nextInt();
			System.out.print("�� ��° ���� :");
			b = sc.nextInt();

			if(a<1 || b<1) {
				System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
			} else if(a>b) {
				for(int i=b; i<=a; i++) {
					System.out.print(i+" ");
				}
			} else if(a<b) {
				for(int i=a; i<=b; i++) {
					System.out.print(i+" ");
				}
			}

		} while(a<1||b<1);

	}

	public void practice8() {
		//����ڷκ��� �Է� ���� ������ �� ����ϱ�
		Scanner sc = new Scanner(System.in); 

		System.out.print("���� :");
		int a = sc.nextInt();
		System.out.println("====" + a +"�� ====");
		for(int i=1; i<=9; i++) {
			System.out.println(a+" * "+i+" = "+a*i);

		} 
	}

	public void practice9() {
		//�Է¹��� ������ �ܺ��� 9�ܱ��� ����ϱ�
		//�� 9�� �ʰ��ϴ� ���ڰ� ������ "9������ ���ڸ� �Է����ּ���" ����ϱ�

		Scanner sc = new Scanner(System.in); 

		System.out.print("���� :");
		int a = sc.nextInt();

		if(2<=a&&a<=9) {
			for(int i=a; i<=9; i++) {
				System.out.println("====" + i +"�� ====");
				for(int j=1; j<=9; j++) {
					System.out.println(i+" * "+j+" = "+i*j);
				}
			}

		} else if (a>9) {
			System.out.println("9������ ���ڸ� �Է����ּ���.");
		}

	}

	public void practice10() {
		//�Է¹��� ������ �ܺ��� 9�ܱ��� ����ϱ�
		//9�� �ʰ��ϴ� ���ڰ� ������ "9������ ���ڸ� �Է����ּ���" ����ϸ鼭
		//�ٽ� ����ڰ� ���� �Է��ϵ��� �ϱ�
		Scanner sc = new Scanner(System.in); 

		int a = 0;

		do {
			System.out.print("���� :");
			a = sc.nextInt();

			if(2<=a&&a<=9) {
				for(int i=a; i<=9; i++) {
					System.out.println("====" + i +"�� ====");
					for(int j=1; j<=9; j++) {
						System.out.println(i+" * "+j+" = "+i*j);
					} 
				}
			} else if (a>9) {
				System.out.println("9������ ���ڸ� �Է����ּ���.");
			} 
		} while(a>9);
	}

	public void practice11() {
		//����ڷκ��� ���� ���ڿ� ����(���ڵ� ������ ������ ��)�� �Է� �޾�
		//������ ������ ���ڰ� Ŀ���ų� �۾����� ���α׷� �����ϱ�
		//��, ��µǴ� ���ڴ� �� 10��
		Scanner sc = new Scanner(System.in);

		System.out.print("���� ���� :");
		int a = sc.nextInt();
		System.out.print("���� :");
		int b = sc.nextInt();

		int c=0;
		do {
			System.out.print(a+" ");
			a+=b;
			c++;
		} while(c<10);
		System.out.println(" ");
	}

	public void practice12() {
		//���� 2���� �����ڸ� �Է� �ް� �׿� ���� �˸��� ��� ����ϱ�
		//��, ������ �Է¿� 'exit'��� ���� ���� ������ ���ѹݺ��ϸ�
		//exit�� ������ "���α׷��� �����մϴ�"�� ����ϰ� �����ϱ�
		//���� �����ڰ� ������鼭 �� ��° ������ 0���� ������
		//"0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���." �� ����ϰ�
		//���� �����ڰ� ���� �� "���� ������ �Դϴ�. �ٽ� �Է����ּ���."��� ����ϰ� 
		//�� ��� ��� ó������ ���ư� ����ڰ� �ٽ� �����ں��� �Է��ϵ��� �ϱ�
		Scanner sc = new Scanner(System.in);

		exit:
			for(;;) {

				System.out.print("������(+,-,*,/,%) :");
				String a =sc.nextLine();

				if(a.equals("exit")) {
					System.out.println("���α׷��� �����մϴ�.");
					break exit;
				} else {
					System.out.print("����1 :");
					int su1 =sc.nextInt();
					System.out.print("����2 :");
					int su2 =sc.nextInt();
					sc.nextLine();

					if(a.equals("/")&&su2==0) {
						System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
					} else {
						switch(a) {
						case "+" :  System.out.println(su1+"+"+su2+"="+(su1+su2)); break;
						case "-" :  System.out.println(su1+"-"+su2+"="+(su1-su2)); break;
						case "*" :  System.out.println(su1+"*"+su2+"="+(su1*su2)); break;
						case "/" :  System.out.println(su1+"/"+su2+"="+(double)(su1/su2)); break;
						case "%" :  System.out.println(su1+"%"+su2+"="+(su1%su2)); break;
						default : System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.");
						} 
					}
				}

			}

	}


	public void practice13() {
		//�Էµ� ������ŭ �ﰢ�� ������� *ǥ���ϱ�
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� :");
		int a = sc.nextInt();

		for(int i = 0; i<a; i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
	public void practice14() {
		//�Էµ� ������ŭ ���ﰢ�� ������� *ǥ���ϱ�
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� :");
		int a = sc.nextInt();

		for(int i = 0; i<a; i++) {
			for(int j=0;j<a-i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}


	}

}	





