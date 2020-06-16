package com.oper.single;

import java.util.Scanner;

public class ComplexOperator {
	
	public static void main(String[] arsg ) {
	
	//복합 대입 연산자
    //누적연산, 총합계, 변경사항 있을 때
	//원하는 수를 지정한 변수에 산술연산 후 대입하는 연산자		
		int account=100000000;
		//1. 입금
		account+=10;//account=account+10;
		System.out.println(account);
        //2. 인출 500000
		account-=5000000;
		System.out.println(account);
		
		//입력받은 값의 합계를 구하는 프로그램을 만드시오.
		Scanner sc=new Scanner(System.in); 
		System.out.print("정수입력 : ");
		int sum=sc.nextInt();
		System.out.print("정수입력 : ");
		sum+=sc.nextInt();
		System.out.print("정수입력 : ");
		sum+=sc.nextInt();
		System.out.println("합계 : "+sum);
		
		//사용자에게 문자를 3번 입력하게 하고 그 값을 모두 출력하는 프로그램
		sc.nextLine();
		System.out.print("메세지 입력 : ");
		String write=sc.nextLine();
		System.out.print("메세지 입력: ");
		write+=sc.nextLine();
		System.out.print("메세지 입력: ");
		write+=sc.nextLine();
		System.out.println(write);
		
		//String msg=""; 처음에 이걸 넣으면 그 뒤부터 바로
		//write+=sc.nextLine(); 넣을 수 있음
		//지금은 초기값이 없어서 안됨
		
		//국어,영어,수학,코딩 성적을 입력받아 합계와 평균 구하기
		//*점수들은 따로 보관할 필요 없음
		int score=0;
		int count=0;
		//수를 직접 세고 싶다면!
		System.out.print("국어 점수 입력 : ");
		//int score=sc.nextInt(); //보관할 필요없으면 이렇게!
		score+=sc.nextInt();
		count++;
		System.out.print("엉어 점수 입력 : ");
		score+=sc.nextInt();
		count++;
		System.out.print("수학 점수 입력 : ");
		score+=sc.nextInt();
		count++;
		System.out.print("코딩 점수 입력 : ");
		score+=sc.nextInt();
		count++;
		System.out.println("합계 : "+score+"평군 : "+(score/4.0));
		System.out.println("합계 : "+score+"평군 : "+((double)score/count));
		//평균은 소수점이 나올 수 있으니 더블형으로 바꿔준다!!
	    System.out.printf("합계 : %d 평균 : %.1f" , score, (score/4.0));
	    //이렇게 히면 소수점 첫째 자리 까지만 구할 수 있음
		
		
	}

}
