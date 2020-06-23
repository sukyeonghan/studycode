package com.oop.main;

import java.util.Scanner;

import com.oop.method.Functional;
import com.oop.model.vo.Member1;
import com.oop.model.vo.Student;

public class MethodMain {
	
	public static void main(String[] args) {
		Functional fun = new Functional();
		//반환형 없고, 매개변수 없는 매소드 호출
		fun.calculator();
		
		//반환형 없고 매개변수 있는 메소드 호출
		//위와 마찬가지로 예약어에 static 없으면 무조건 생성 후 호출
		
		//fun.calculator2(10,10,"+");
	
		int su=10;
		int su2=10;
		fun.calculator2(10,20, new String[] {"*","/"});
		//두 방식 다 가능
		
		
		//반환형 있고 매개변수 없는 메소드 호출
		//System.out.println(fun.calculator3());
		//return 뒤 값을 여기로 가져와 리터럴로 찍힌다.
		//그러나, int 1개 값만 반환!
		
		int result = fun.calculator3();
		System.out.println(result*100);
		//변수로 받고 활용
		
		
		//반환형 있고 매개변수 있는 메소드 호출
		result = fun.calculator4(20,20);
		System.out.println(result);
		
		
		
		//문자열 두 개를 전달받고 두 문자열을 결합하고 리턴해주는 메소드 만들기
		//반환형 있고 매개변수 있는 메소드
		String strResult = fun.str("안녕","하세요");
		System.out.println(strResult);
	
		//정수 두 개를 전달받아 첫 번째 수부터 두 번째 수까지 합을 리턴해주는 메소드
		//단, 무조건 첫 번째 수가 커야함. 만약 작으면 "에러출력"
		fun.su(5,8);
		
		//선생님걸로 2번째
		int res=fun.print(10,1);
		System.out.println(res==0?"":res);
		

		//문자 한 개를 전달받아 영문자인지 확인 후 결과를 리턴해주는 메소드 
		//true/false
		//스캐너로 입력받았을 때
		Scanner sc = new Scanner(System.in);
		System.out.print("문자입력 :");
		System.out.println(fun.checkChar(sc.next().charAt(0)));
		
		//값 직접 입력했을 때
		System.out.println(fun.checkChar('1'));
		
		
		
		//객체, 배열 참조형 자료형 매개변수, 리턴으로 작성해보기
		//객체, 배열같은 참조형,자료형은 가지고 있는 주소를 전달하기 때문에
		//배열의 얕은 복사와 같은 개념으로 사용되어 원본값이 수정되는 결과를 가져온다.
		
		int[] nums = {1,2,3,4}; //heap에 1,2,3,4 값을 가진 4칸 배열 생김
		//main에 같은 주소값 가진 공간 생김
		System.out.println("=== 수정 전 ===");
		for(int a :nums) {
			System.out.print(a+" ");
		}
		System.out.println();//개행표시
		
		fun.updateArray(nums); //배열에 있는 값을 수정하는 로직
		//같은 주소값가짐. heap을 참조해서 값을 바꿈
		//for문 돌면 지워짐 - 메인은 남음
		System.out.println("=== 수정 후 ===");
		for(int a :nums) {
			System.out.print(a+" ");
		} //변경된 heap 참조해서 출력. 주소값을 가지고 이런 결과가!
		System.out.println();//개행표시
		
		
		System.out.println("수정 전 : "+su);
		//fun.basicUpdate(su);
		su=fun.basicUpdate();
		System.out.println("수정 후 : "+su);
		
		
		//student 객체를 만들고 이름,학년,반,번호,키,몸무게 
		//기본으로 자신의 정보로 세팅하고
		//studentUpdate매소드를 만들어 입력받은 값으로 수정한 뒤 출력하기
		//기능(MethodMain), 화면, db(Functional)으로 나눠서 써줌. mvc패턴
		
		//1.
		Student s = new Student("한수경",3,2,20,160,45);
		fun.studentUpdate(s);//참조형 변수 주소값으로 반환..?
		System.out.println(s.getName()+s.getGrade()+ s.getRclass()
				+s.getNumber()+s.getHeight()+s.getWeight());
		
		//2.
		s=fun.studentUpdate(); //리턴값 있어서
		System.out.println(s.getName()+s.getGrade()+ s.getRclass()
		+s.getNumber()+s.getHeight()+s.getWeight());
		
		//insertMember
		
		Member1 mem = fun.insertMember();
		System.out.println(mem.getId()+mem.getPw()+mem.getName()
		+mem.getEmail()+mem.getAddress());
	}
}
