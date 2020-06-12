package yese2;

import java.util.Scanner;

public class Yese2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름"+"\t나이"+"\t성별"+"\t지역"+"\t전화번호"+"\t\t이메일");
		System.out.println("------------------------------------------------------------------");
		String name1="홍두깨";
		int age1=22;
		char gender1='남';
		String home1="서울";
		String phone1="01012345678";
		String email1="myemail@email.com";
		System.out.println(name1+"\t"+age1+"\t"+gender1+"\t"+home1+"\t"+phone1+"\t"+email1);
		
		System.out.println("------------------------------------------------------------------");
		String name2="고길동";
		int age2=50;
		char gender2='남';
		String home2="경기도";
		String phone2="01098765432";
		String email2="mrgogo@email.com";
		System.out.println(name2+"\t"+age2+"\t"+gender1+"\t"+home2+"\t"+phone2+"\t"+email2);
		
		
	}
}
