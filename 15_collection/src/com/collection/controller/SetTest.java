package com.collection.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.collection.model.vo.Member;

public class SetTest {

	public void setTest() {
		//set에 대해 알아보자
		//특징 : 순서가 없음, 데이터를 구분할 수 있는 구분자가 없음(따로 호출불가), 중복값 저장 불가능
		//종류 : HashSet,TreeSet
		//객체방식으로 메소드를 호출해서 저장, 호출...
		HashSet set = new HashSet();
	
		//데이터 대입
		//add(값)메소드 사용 - List와 같음
		set.add("설진호");
		set.add("조현");
		set.add("강경록");
		set.add("이세현");
		set.add("황진호");
		set.add("남지선");
		
		//set에 저장된 데이터는 데이터를 구분할 수 있는 구분자가 없기 때문에
		//모든 자료를 불러올 수 있는 객체(Iterator)를 이용해서 출력함.
		Iterator it = set.iterator(); //set이 가지고 있는 모든 객체를 넘겨줌
		
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);//이렇게 출력해라~
			//랜덤 출력 후 그 뒤부턴 고정
			//1,3..이렇게 빼옴
			//System.out.println(it.next());
			//2개쓰면 2개씩 불러움. 홀수로 쓰면 NoSuchElementException 에러 뜸
			//2,4..이렇게 빼옴
			//출력 후 삭제! 토큰처럼.
			//재사용 불가능 Iterator it2=set.Iterator();처럼 다시 넣어줘야 함
			
		}
		
		//set 저장된 이세현을 찾으세요
		Iterator it2 = set.iterator();
		while(it2.hasNext()) {
			Object o = it2.next();
			if(o.equals("이세현")) { 
				System.out.println(o); //두 번 next하면 다음 사람이 나오므로 이렇게 해야 함
			}
		}
		
		System.out.println("=== for each이용 ===");
		//set에 있는 전체 객체를 조회할 때는
		//for each문 사용가능
		for(Object o : set) {
			System.out.println(o);
		}
		
		//set 중복값 저장이 될까요? 안됨
		
		set.add("조현");
		set.add("조현");
		set.add("조현");
		set.add("조현");
		set.add("설진호");
		set.add("설진호");
		set.add("설진호");
		set.add("설진호");
		
		//전체 출력하기
		Iterator it3 = set.iterator();
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		
		//로또 중복값 제거
		HashSet lotto = new HashSet();
//		for(int i=0; i<7; i++) {
//			lotto.add((int)(Math.random()*45)+1);
//		}
		while(true) {
			lotto.add((int)(Math.random()*45)+1);
			if(lotto.size()==7) {
				break;
			}
		}
		for(Object o : lotto) {
			System.out.print(o+ " ");
		}
		System.out.println();
		
		//set에 있는 데이터를 확인 할 수 있음
		//size()메소드를 통해서 가능함
		lotto.clear();
		if(lotto.size()==0) {
			System.out.println("데이터가 없습니다.");
		}
		
		//set에 내가 만든 객체를 넣어보자
		//Member 클래스를 만들고. id,pw,name,age 
		//id가 중복되면 들어가지 않게 넣고 출력
		//1. admin,1234,관리자,19
		//2. user01,1111,유저1,20
		//3. user02,2222, 유저2,21
		//4. user03,3333,유저3,22
		//5. admin,1234,관리자,19
		Set members = new HashSet();

		members.add(new Member("admin","1234","관리자",19));
		members.add(new Member("user01","1111","유저1",20));
		members.add(new Member("user02","2222","유저2",21));
		members.add(new Member("user03","3333","유저3",22));
		members.add(new Member("admin","1234","관리자",19));
		//같은 값으로 보게 하기 위해 오버라이딩 해야 함
		
		for(Object o : members) { //실제 들어가있는 members를 호출(동적바인딩)
			System.out.println(o);
		}
		
		//set 삭제가 가능
		//전체 삭제(clear), 일부 삭제 - remove(객체);
		members.remove(new Member("user01","5555","유병승",20)); 
		//일치하는 값-id,age일치하는 거 지움- 두개가 같으면 같은 거라고 선언해놨으니까
//		System.out.println("=== 삭제 후 ===");
//		for(Object o : members) { 
//			System.out.println(o);
//		}
		
		System.out.println("=== Iterator는 재활용이 불가능 ===");
		//위에서 이미 썼던 Iterator를 다시 활용하려면 재할당해줘야함
		it = members.iterator();
		System.out.println(it.next()); //for문 안돌렸으니까 하나만 출력
		//for each랑  Iterator 둘 다 사용해서 출력 가능함. 원래 iterator가 정석임
		//Iterator는 하나씩 가능
		//for each는 무조건 전체 다 출력
		
		//Set,List는 Collection 자식임
		//set <--> List 서로 호환이 가능!
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		//set이용해서 중복 삭제
		//HashSet temp = new HashSet(list);
		//list = new ArrayList(temp);
		list = new ArrayList(new HashSet(list)); //한 줄로 줄임
		System.out.println(list);
	}
	
}
