package com.oper.single;

import java.util.Scanner;

public class SingleOperator {
	
	public static void main(String[] args) {
		//단항연산자 활용하기
		//부정연산자 활용하기
		boolean flag=true;
		System.out.println(flag);
		System.out.println(!flag);
		//!!하면 다시 true가 됨
		//부정연산은 논리변수에 드물게 사용하고  비교연산, 논리연산과 함께 많이 사용
		
		//증가,감소 연산
		//++, --
		int su=19;
		su++; //su=su+1
		System.out.println(su);
		su--;
		su--;
		System.out.println(su);
		
		//전위-변수 앞에 연산자 작성(++a), 후위 연산(a++)
		//다른 연산자와 연산할 때 차이가 발생함. 단독으로 사용하면 결과값은 변함없음.
		//전위 : 먼저 증/감하고 다른 연산처리
		//후위 : 다른 연산 먼저 처리하고 증/감

		int su1=29;
		int su2=0;
		int su3=0;
		su2=++su1;
		su1=29;
		su3=su1++;
		System.out.println("su2 : "+su2);
		System.out.println("su3 : "+su3);
		
		//주로 언제 사용?
		//1. 반복문에 자주 사용
		//2. 특정한 값의 개수 셀 때
		//count++;
		
		int su4=30;
		int su5=0;
		//su5=++su4+20; //51
		//su5=su4+++20; //50
		
		
		//산술 연산자 활용하기
		//기본적인 더하기,빼기,나누기, 곱하기, 나머지값 구하기
		//숫자 연산을 하는 것. 더하기는 문자연산도 가능 ex) 기차 칙칙폭폭
		
		//더하기
		int su6=7;
		int su7=10;
		System.out.println(su6+su7); //변수에 대입, 출력해야 함
		System.out.println(su6+20); //리터널과도 연산 가능
		System.out.println(20+15);
		
		//연산 결과를 변수에 대입
		int result=su6+su7;
		//byte result2=su6+su7; 자료형 달라서 안됨.
		System.out.println(result);
		
		//빼기
		System.out.println(su6-su7);
		result=su6-su7;
		System.out.println(result);
		
		//곱하기
		System.out.println(su6*su7);
		result=su6*su7;
		System.out.println(result);
		
		//나누기 *자료형에 주의 하기
		System.out.println(su6/su7);
		// 0.7이 아닌 값이 0이 나옴 (int여서)
		System.out.println((double)su6/su7);
		//강제로 형변환 
		//소수점까지 정상 출력
		//result=(double)su6/su7; result가 int형이라서 안됨
		double result2=(double)su6/su7;
		System.out.println(result);
		
		//나머지
		System.out.println(su6%su7);
		System.out.println(5%3);
		//짝수(2로 나눴을 때 0), 홀수, 배수, 최대공약수 등등 구할 수 있음
		
		//수 입력받는 프로그램 구현 후 짝수인지 홀수인지 확인하기
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		int su8=sc.nextInt();
		System.out.println(su8%2);
		
		
		}

}
