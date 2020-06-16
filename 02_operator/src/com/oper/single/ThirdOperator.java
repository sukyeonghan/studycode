package com.oper.single;

import java.util.Scanner;

public class ThirdOperator {

	public static void main(String[] args) {
		
		//삼항연산자 활용하기
		int sum1=30;
		int sum2=20;
		System.out.println(sum1>sum2?"크다":"작다");
		
		//이름을 입력 받고 그 이름이 설진호면 같습니다를 출력, 아니면 아닙니다 출력하기
		Scanner sc=new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name=sc.nextLine();
		System.out.println(name.equals("설진호")?"같습니다":"아닙니다");
		// 문자열은 .equals로 비교해야 됨!!
		//System msg=name.equals("설진호"?"맞아요!":"아닙니다!");
		//System.out.println(msg);
		//이렇게 해도 됨
		
		//티켓이 있고, 나이가 19초과면 "들어오세요!" 아니면 "입장 불가"
		//티켓 번로 : 333
		//티켓 번호, 나이 입력받아 처리
		
		System.out.print("티켓 번호 : ");
		int ticket=sc.nextInt();
		System.out.print("당신의 나이 : ");
		int age=sc.nextInt();
		String result=ticket==333&&age>19?"들어오세요!":"입장불가!";
		System.out.println(result);
		
		int plus=age>19?age++:age--;
		System.out.println(plus+" "+age);
		//증감 연산이나 복합 대입도 가능
		
		//화면 구현.간단한 조건으로 분기 처리 할 때 이용
		// <input type='text' value='age>19?"안녕":""' > 
		
		//삼항 연산 내부에 삼항연산자 넣기
		//나이가 19살 이상이면 "성년입니다", 17이상 18살 이하면 "고등학생", 
		//14이상 16이하면 중학생, 아니면 초등학생 
		
		//String result2=age>=19?"성년입니다":age>=17?"고등학생":age>14?"중학생":"초등학생";
		//System.out.println(result2);
		System.out.println(age>=19?"성년입니다":age>=17?"고등학생":age>=14?"중학생":"초등학생");
		//모든 조건 등호식을 다 안써도 됨! 범위 확인하기!
		
		
		
		
		
		
	}
	
}
