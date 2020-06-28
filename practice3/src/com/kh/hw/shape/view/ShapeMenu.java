package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;
import com.kh.hw.shape.model.vo.Shape;

public class ShapeMenu {
	
	private static Scanner sc = new Scanner(System.in);
	
	private static SquareController scr = new SquareController();
	private static TriangleController tc = new TriangleController();
	
	public ShapeMenu() {
		// TODO Auto-generated constructor stub
	}
	
	public static void inputMenu() {
		//�ﰢ���� �簢�� ����
		while(true) {
		System.out.println("===== ���� ���α׷� =====");
		System.out.println("3. �ﰢ��");
		System.out.println("4. �簢��");
		System.out.println("9. ���α׷� ����");
		System.out.println("�޴� ��ȣ : ");
		int menuNum = sc.nextInt();
		
		if(menuNum!=3&&menuNum!=4&&menuNum!=9) {
			System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է��ϼ���.");
			} else {
				if (menuNum==3) {
					ShapeMenu.triangleMenu();
				} else if (menuNum==4) {
				ShapeMenu.squarMenu();
				} else if(menuNum==9) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
				}
			}
		}
		return;
	
	}
	
	public static void triangleMenu() {
		//�ﰢ�� �޴� ���
		while(true) {
		System.out.println("===== �ﰢ�� =====");
		System.out.println("1. �ﰢ�� ����");
		System.out.println("2. �ﰢ�� ��ĥ");
		System.out.println("3. �ﰢ�� ����");
		System.out.println("9. ��������");
		System.out.println("�޴� ��ȣ : ");
		int menuNum = sc.nextInt();
		
		if(menuNum==1) {
			System.out.println("���� : ");
			double h = sc.nextDouble();
			System.out.println("�ʺ� : ");
			double w = sc.nextDouble();
			System.out.println("�ﰢ�� ���� : "+ tc.calcArea(h, w));
			
		} else if (menuNum==2) {
			System.out.println("������ �Է��ϼ��� : ");
			String color = sc.nextLine();
			tc.paintColor(color);
			System.out.println("���� �����Ǿ����ϴ�.");
		} else if (menuNum==3) {
			printInformation(menuNum);
			System.out.println();
		} else if (menuNum==9) {
			System.out.println("�������� ���ư��ϴ�");
			inputMenu();
			break;
			}
		}
	}
	
	public static void squarMenu() {
		//�簢�� �޴� ���
		while(true) {
		System.out.println("===== �ﰢ�� =====");
		System.out.println("1. �簢�� �ѷ�");
		System.out.println("2. �簢�� ����");
		System.out.println("3. �簢�� ��ĥ");
		System.out.println("4. �簢�� ����");
		System.out.println("9. ��������");
		System.out.println("�޴� ��ȣ : ");
		int menuNum = sc.nextInt();
		
		if(menuNum==1) {
			System.out.println("���� : ");
			double h =sc.nextDouble();
			System.out.println("�ʺ� : ");
			double w = sc.nextDouble();
			System.out.println("�簢�� �ѷ� : "+ scr.calcArea(h, w));
		} else if(menuNum==2) {
			System.out.println("���� : ");
			double h = sc.nextDouble();
			System.out.println("�ʺ� : ");
			double w = sc.nextDouble();
			System.out.println("�簢�� ���� : "+ scr.calcArea(h, w));
		} else if (menuNum==3) {
			System.out.println("������ �Է��ϼ��� : ");
			String color = sc.nextLine();
			scr.paintColor(color);
			System.out.println("���� �����Ǿ����ϴ�.");
		} else if (menuNum==4) {
			printInformation(menuNum);
			System.out.println();
		} else if (menuNum==9) {
			System.out.println("�������� ���ư��ϴ�");
			inputMenu();
			break;
		}
	
		}
	}
	
	public void inputSize(int type, int menuNum) {
		//�ʺ�� ���̸� �޾� ��û ������ ó���ϰų� ������ �޾� ��û������ ó��
		
		  if (type==3) {

			   if (menuNum == 1) {

			    System.out.print("���� : ");

			    double height = sc.nextDouble();

			    System.out.print("�ʺ� : ");

			    double width = sc.nextDouble();

			    System.out.println("�ﰢ�� ���� : " + tc.calcArea(height, width));

			   } else {

			    printInformation(3);

			   }

			  } else {

			   if (menuNum == 1) {

			    System.out.print("���� : ");

			    double height = sc.nextDouble();

			    System.out.print("�ʺ� : ");

			    double width = sc.nextDouble();

			    System.out.println("�簢�� �ѷ� : " + scr.calcPerimeter(height, width));

			   } else if (menuNum == 2) {

			    System.out.print("���� : ");

			    double height = sc.nextDouble();

			    System.out.print("�ʺ� : ");

			    double width = sc.nextDouble();

			    System.out.println("�簢�� ���� : " + scr.calcArea(height, width));

			   } else {

			    printInformation(4);

			   }

			  }

			 }
		
	
	public static void printInformation(int type) {
		//�Ű������� ���� �ﰢ��/�簢���� ������ ���
		if(type==3) {
			System.out.println(tc.print());
		} else if (type==4){
			System.out.println(scr.print());
		}
		
	}

}
