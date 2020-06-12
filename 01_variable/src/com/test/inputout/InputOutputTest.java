package com.test.inputout;

public class InputOutputTest {
	
	public static void main(String[] args) {
		
		//print(), println() 차이
		System.out.println("안녕하세요");
		System.out.println("저는 한수경입니다.");
		
		System.out.print("안녕하세요");
		System.out.print("저는 한수경입니다.");
		//System.out.println(""); 이렇게 하면 다음줄에 출력됨.
		System.out.println("이건 어디에 출력될까?"); //위와 같은 줄에 출력됨.
		System.out.println("이거는?"); //밑 줄에 출력
		
		//printf 사용하기
		System.out.printf("%d살", 27);
		//%d 는 정수, 형식에 맞는 변수 대입해야 함. 
		System.out.printf("%d살 내 이름은 %s입니다.", 27, "한수경");
		
		double dnum=1234.567678;
		System.out.println(dnum);
		System.out.printf("%.2f", dnum);
		//소수점 아래 2자리 수까지 표현
		
		String name="한수경";
		int age=27;
		char gender='여';
		String name2="이현";
		int age2=34;
	    char gender2='남';
		System.out.println(name+" "+age+" "+gender);
		System.out.println(name+" "+age+" "+gender);
		System.out.printf("%-5s %d %c\n", name,age,gender);
		System.out.printf("%-7s %d %c\n", name2,age2,gender2);
		//%d : 정수형, %c : 문자, %s : 문자열 
		//%-5s : 5칸을 확보하고 왼쪽 정렬, %5s : 5칸을 확보하고 오른쪽 정렬
		
		//이스케이프문 이용하기
		// /n : 줄바꾸기, \t : 정해진 공간만큼 띄우기
		System.out.print("안녕하세요 저는 \n");
		System.out.print("\t 한수경입니다.");
		//""표현하고 싶을 때
		System.out.println("내가 말했다. \"우왓!\"");
		// /표현할 때
		System.out.println("c:\\user01\\");
		//문자열에도 가능
		String msg="안녕\t 하세요\n 하하";
		System.out.println(msg);
		
		
	}

}
