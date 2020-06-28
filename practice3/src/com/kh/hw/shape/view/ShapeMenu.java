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
		//삼각형과 사각형 선택
		while(true) {
		System.out.println("===== 도형 프로그램 =====");
		System.out.println("3. 삼각형");
		System.out.println("4. 사각형");
		System.out.println("9. 프로그램 종료");
		System.out.println("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		
		if(menuNum!=3&&menuNum!=4&&menuNum!=9) {
			System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			} else {
				if (menuNum==3) {
					ShapeMenu.triangleMenu();
				} else if (menuNum==4) {
				ShapeMenu.squarMenu();
				} else if(menuNum==9) {
				System.out.println("프로그램을 종료합니다.");
				break;
				}
			}
		}
		return;
	
	}
	
	public static void triangleMenu() {
		//삼각형 메뉴 출력
		while(true) {
		System.out.println("===== 삼각형 =====");
		System.out.println("1. 삼각형 면적");
		System.out.println("2. 삼각형 색칠");
		System.out.println("3. 삼각형 정보");
		System.out.println("9. 메인으로");
		System.out.println("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		
		if(menuNum==1) {
			System.out.println("높이 : ");
			double h = sc.nextDouble();
			System.out.println("너비 : ");
			double w = sc.nextDouble();
			System.out.println("삼각형 면적 : "+ tc.calcArea(h, w));
			
		} else if (menuNum==2) {
			System.out.println("색깔을 입력하세요 : ");
			String color = sc.nextLine();
			tc.paintColor(color);
			System.out.println("색이 수정되었습니다.");
		} else if (menuNum==3) {
			printInformation(menuNum);
			System.out.println();
		} else if (menuNum==9) {
			System.out.println("메인으로 돌아갑니다");
			inputMenu();
			break;
			}
		}
	}
	
	public static void squarMenu() {
		//사각형 메뉴 출력
		while(true) {
		System.out.println("===== 삼각형 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 면적");
		System.out.println("3. 사각형 색칠");
		System.out.println("4. 사각형 정보");
		System.out.println("9. 메인으로");
		System.out.println("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		
		if(menuNum==1) {
			System.out.println("높이 : ");
			double h =sc.nextDouble();
			System.out.println("너비 : ");
			double w = sc.nextDouble();
			System.out.println("사각형 둘레 : "+ scr.calcArea(h, w));
		} else if(menuNum==2) {
			System.out.println("높이 : ");
			double h = sc.nextDouble();
			System.out.println("너비 : ");
			double w = sc.nextDouble();
			System.out.println("사각형 면적 : "+ scr.calcArea(h, w));
		} else if (menuNum==3) {
			System.out.println("색깔을 입력하세요 : ");
			String color = sc.nextLine();
			scr.paintColor(color);
			System.out.println("색이 수정되었습니다.");
		} else if (menuNum==4) {
			printInformation(menuNum);
			System.out.println();
		} else if (menuNum==9) {
			System.out.println("메인으로 돌아갑니다");
			inputMenu();
			break;
		}
	
		}
	}
	
	public void inputSize(int type, int menuNum) {
		//너비와 높이를 받아 요청 사항을 처리하거나 색깔을 받아 요청사항을 처리
		
		  if (type==3) {

			   if (menuNum == 1) {

			    System.out.print("높이 : ");

			    double height = sc.nextDouble();

			    System.out.print("너비 : ");

			    double width = sc.nextDouble();

			    System.out.println("삼각형 면적 : " + tc.calcArea(height, width));

			   } else {

			    printInformation(3);

			   }

			  } else {

			   if (menuNum == 1) {

			    System.out.print("높이 : ");

			    double height = sc.nextDouble();

			    System.out.print("너비 : ");

			    double width = sc.nextDouble();

			    System.out.println("사각형 둘레 : " + scr.calcPerimeter(height, width));

			   } else if (menuNum == 2) {

			    System.out.print("높이 : ");

			    double height = sc.nextDouble();

			    System.out.print("너비 : ");

			    double width = sc.nextDouble();

			    System.out.println("사각형 면적 : " + scr.calcArea(height, width));

			   } else {

			    printInformation(4);

			   }

			  }

			 }
		
	
	public static void printInformation(int type) {
		//매개변수에 따라 삼각형/사각형의 정보를 출력
		if(type==3) {
			System.out.println(tc.print());
		} else if (type==4){
			System.out.println(scr.print());
		}
		
	}

}
