package com.api.controller;

import java.util.StringTokenizer;

public class StringTest {
	
	public static void main(String[] args) {
		//String 객체 이용해보자~
		//String은 String에 있는 값을 수정, 삽입, 삭제가 불가능함.
		String name ="유병승";
		//hashcode() -> 주소값을 의미함
		System.out.println(name+" : "+name.hashCode());
		
		name+="천재";
		System.out.println(name+" :"+name.hashCode());
		//주소값이 바뀜. 
		//두번째 글자만 따로 바꾸기? 불가능
		
		//String 객체에서 유용하게 사용하는 메소드!
		//문자열에 있는 문자 찾기 : contains();
		String test="가나다라마바사아자차카";
		//원래 이렇게 씀
//		for(int i=0; i<test.length(); i++) {
//			if(test.charAt(i).equals())
//		}
		
		System.out.println(test.contains("마"));
		System.out.println(test.contains("하"));
		
		test="설진호 화이팅! 공부 열심히 하세요 노트북이랑 그만싸우고!";
		System.out.println(test.contains("공부"));
		System.out.println(test.contains("황진호"));
	
		//특정 문자의 위치를 찾아주는 메소드 : indexOf();
		//찾은 문자의 인덱스를 반환해줌. 못 찾으면 -1을 반환함
		System.out.println(test.indexOf("설"));
		System.out.println(test.indexOf("노트북"));
		System.out.println(test.indexOf("황진호"));
		System.out.println(test.indexOf(" ")); //제일 먼저 발견된 거 출력하고 끝
		
		//중복값이 있을 때 두 번째 값 찾기
		System.out.println(test.indexOf(" ",test.indexOf(" ")+1));//2번째 공백 찾음
		System.out.println(test.indexOf(" ",test.indexOf(" ",test.indexOf(" ")+1)));
		
		//lastIndexOf() : 뒤에서부터 시작해서 찾음. 인덱스 숫자는 앞에서부터 0,1..
		test="ttt.file.txt";
		System.out.println(test.lastIndexOf("."));
	
		//문자열을 변경해주는 메소드 : replace(); 많이 씀
		//replace(변경대상문구, 새로운 문구)
		System.out.println(test.replace("txt", "hwp"));//원본값이 변경되지 않음
		String test2 = test.replace("txt", "jpg");
		System.out.println(test2);
		System.out.println(test);
	
		//문자열 공백을 제거해주는 메소드 : trim();
		//웹에서 데이터를 넘겨줄 때 자동으로 공백이 생길 수 있음
		//그러면 false가 뜰 수도 있다! 공백 빼고 비교하면 제대로 비교 가능
		test="   조   현      "; //글자 앞,뒤는 지워지지만 글자와 글자 사이는 trim으로 안지워짐
		test2="조현";
		System.out.println(test);
		System.out.println(test.trim().replace(" ",""));//글자 사이 공백 지움
		System.out.println(test.trim().equals(test2));
		
		//영어 대소문자 자동으로 바뀜 toUpperCase();, toLowerCase();
		
		//문자열을 원하는 만큼 잘라내는 메소드 : subString(시작인덱스,끝인덱스+1);
		test="식사시간 저녁시간 저녁메뉴 디너타임!";
		System.out.println(test.substring(0,4));
		//subString(인덱스); 시작만 지정한 것. 시작부터 끝까지 다 나옴
		System.out.println(test.substring(9));
		
		// substring() indexOf() 연결하여 사용
		System.out.println(test.substring(test.indexOf("저녁메뉴"),test.indexOf("뉴")+1));
		//파일에 대한 확장자만 짤라내기
		test="test.txt";
		System.out.println(test.substring(test.lastIndexOf(".")+1));
	
		//문자열이 특정구분자로 구분할 수 있으면 그 구분자를 기준으로
		//배열로 만들어주는 메소드 : split(구분자);  유용함.많이 씀~
		test="유병승,조현,설진호,정로희,김다희,유다해";
		String[] names = test.split(",");
		System.out.println(names[3]); //정로희
		
		//문자열-> 문자열배열 : split();
		//문자열배열 -> 문자열 : join(); 이것도 꽤 쓸일 있음
		for(String v : names) {
			System.out.println(v);
		}
		
		String returnStr = String.join("^.~*",names);
		System.out.println(returnStr);
		
		
		
		//StringBuffer : 문자열 저장하는 객체
		//저장된 문자열을 변경하는 것이 가능함. 특정 문자 수정, 특정 위치 삽입 등등
		//객체 -> 수정, 삭제, 삽입 메소드를 통해서 이루어짐
		StringBuffer sb = new StringBuffer("유병승");
		//StringBuffer를 출력하려면
		System.out.println(sb+" : "+sb.hashCode()); //toString 오버라이딩이 되어있다.참조형 변수니까
		//StringBuffer 값 수정
		//문자열 추가하기(뒤에 추가할 문구)
		sb.append("선생님"); //원본값이 수정됨. String += 랑 같음
		System.out.println(sb+" : "+sb.hashCode()); //원본과 주소값 같음
		
		//원본값의 특정 위치에 값을 넣을 수도 있음
		//insert(위치,넣을 문구)메소드 이용
		sb.insert(3,"아부지");
		System.out.println(sb);
		
		//특정 위치에 문자열을 삭제할 수 있음
		//delete();
		sb.delete(1,3);
		System.out.println(sb);
		
		//특정 위치의 문자를 변경
		//replace(시작인덱스, 끝인덱스, 추가할 문구);
		sb.replace(3, 6, "천재");
		System.out.println(sb);
		
		//string이랑 서로 호환됨
		String str = new String(sb);
		System.out.println(str);
		sb = new StringBuffer(str);
	
	
	
		//StringBuilder
		//쓰레드 각각의 저장공간. 흐름이 따로따로. 데이터를 안정적으로 보관
		//쓰레드가 순서를 정해줌.(쓰레드 safe)접근했을 때 조절해줌
		//이건 쓰레드 safe를 제공하지 않아서 속도가 더 빠름
		
		StringBuilder sbu = new StringBuilder("유병승");
		sb.append("하하하");
		System.out.println(sbu); //다른 기능 다 똑같음
		
		//토큰 메소드 호출
		stringTokenTest();
		
	}
	
	public static void stringTokenTest() {
		//stringTokenizer클래스 이용하기
		//문자열을 특정구분자로 분리해내는 객체 (분할할 문구, 특정구분자)
		//트레이를 하나 만들고 칸마다 
		String str = "java,oracle_c_c++,html,css,javascript,jquery,spring";
		//String[] lang = str.split(",");
		StringTokenizer st = new StringTokenizer(str,",_");//_추가
		//토큰을 하나씩 확인hasMoreTokens()하고 출력하고 지움nextToken()
		//없으면 false
		while(st.hasMoreTokens()) {
			
		//	System.out.println(st.nextToken());
			//System.out.println(st.nextToken());
			//2개쓰면 2개씩 찍힘-7개니까 1개 비어서 오류남
			//썼던 값 다시 쓰려면 저장해야 함
			
			String temp = st.nextToken();
			if(temp.contains("c")) {
				System.out.println(temp);
			}
			
//			if(st.nextToken().contains("c")) {
//				System.out.println(st.nextToken());
//			} //이건 잘못된 것! 2개 같이 도는데 하나씩 버려지니까 oracle에 c있어서 그 다음 것이 출력됨
		}
		
	}
	
}
