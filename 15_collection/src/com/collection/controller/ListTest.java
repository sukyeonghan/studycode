package com.collection.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.collection.model.vo.Sports;

import common.sort.NumberSort;
import common.sort.SportPlayerSort;
import common.sort.StringSort;

public class ListTest {
	
	public void arrayListTest() {
		
		
		
		//List에 대해 알아보자 - 인터페이스!(추상메소드 가지고 있음, 상속 시 구현)
		//특징 : 배열과 유사한 자료구조를 가지고 있음
		//  -> index값을 가지고 있음. 순서가 있음. 중복값을 저장할 수 있음
		//종류 : ArrayList, LinkedList,Vector
		
		//ArrayList
		
		//객체를 보관하는 데이터 보관용 클래스 == object[]방식으로 보관
		//클래스를 생성(인스턴스화)하여 활용 함
		ArrayList list = new ArrayList();
		//활용하는 방식은 배열과 거의 비슷함!
		//배열은 출력이나 대입[]를 이용
		//List는 객체이기 때문에 메소드를 이용해서 처리함
		
		//List에 값을 넣는 방법 - add(객체)메소드를 이용
		list.add("유병승"); //0번
		//add메소드로 값을 넣으면 순차적으로 0번 인덱스부터 값이 대입됨
		list.add("조현"); //1번
		
		//List는 다양한 객체를 보관할 수 있음
		list.add(new GregorianCalendar()); //2
		list.add(new Scanner(System.in)); //3
		
		//List에 저장된 객체 출력하기
		//get(인덱스)메소드를 이용
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		//list.get() => 변수명 => 객체의 주소가 들어가 있다
		//object형으로 저장을 하고 있기 때문에-자료형에 맞춰서 형변환해야함!
		System.out.println(((String)list.get(0)).charAt(0));
		
		//반복문을 활용해서 데이터에 접근하여 처리할 수 있음.
		int[] a = new int[10]; //a.length-저장공간의 개수
		//list의 길이는?? -> list.size();
		System.out.println(list.size()); //list에 실제 대입되어 있는 객체의 수!
//		list=new ArrayList();
//		System.out.println(list.size());//새로 생성해서 0이 나옴
		
		//for문으로 출력 
		for(int i=0;i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//list데이터 중 GregorianCalendar 객체면, 년도 출력!
		for(int i=0;i<list.size(); i++) {
			if(list.get(i) instanceof GregorianCalendar) {//object니까 
				GregorianCalendar gc = (GregorianCalendar)list.get(i);
				System.out.println(gc.get(Calendar.YEAR));
		
			}
		}
		
		//List 인터페이스를 구현 -> ArrayList니까 (상속)
		List sports = new ArrayList();
		//내가 좋아하는 스포츠 4개를 대입해보자-규칙 생략
		sports.add(new Sports("구기종목","축구",11,new String[5]));//할당만해도 됨
		//sports.get(0) = new Sports("구기종목","축구",11,null));
		sports.add(new Sports("구기종목","야구",9,null));
		sports.add(new Sports("기구운동","헬스",1,null));
		sports.add(new Sports("물종목","수영",8,null));
		
		//for문으로 전체 출력하기
//		for(int i=0;i<sports.size(); i++) {
//			System.out.println(sports.get(i));
//		}
		//for each문으로 출력
		for(Object o : sports) {
			System.out.println(o);
		}
		
		//종목이 구기종목인 스포츠만 출력하기
		for(int i=0; i<sports.size(); i++) {
			if(sports.get(i) instanceof Sports) {
				//sports.get(i)도 변수. return값이 Object
			Sports gs = (Sports)sports.get(i);
			if(gs.getType().equals("물종목")) {
				System.out.println(gs);
				}
			}
		}
		
		for(Object o : sports) {
			if(o instanceof Sports) {
				Sports s = (Sports)o;
				if(s.getType().equals("구기종목")) {
					System.out.println(s);
				}
			}
			
		}
		
		//list는 원하는 위치에 손쉽게 데이터를 넣을 수 있음
		//add(index,data); index위치에 data를 대입!
		System.out.println("==== 원하는 위치에 값넣기 ====");
		System.out.println(sports.get(2));
		sports.add(2,new Sports("구기종목","농구",5,null));//자동으로 하나씩 밀림
		System.out.println(sports.get(2));
		System.out.println(sports.get(3));
		
		//list의 특정위치의 값을 변경할 수도 있음
		//set(index,data); 특정 위치의 값을 변경!
		System.out.println("==== 특정위치 값 변경하기 ====");
		System.out.println(sports.get(sports.size()-2));
		//인덱스는 개수-1이니까 맨 마지막 값을 호출함
		sports.set(sports.size()-2, "오늘 비와요??");
		System.out.println(sports.get(sports.size()-2));
		//오늘 비와요?? 로 바뀌고 원래 있던 헬스 데이터 사라짐
		System.out.println(sports.get(sports.size()-1));
		//전체 출력시 이렇게 해도 됨(toString 호출)
		System.out.println(sports);
		
		//list에 데이터가 있는지 없는지 확인 어떻게?
		
		//데이터 한 번에 다 지우는 것
//		sports.clear();
				
//		if(sports.size()>0) {
//			System.out.println("데이터 있다.");
//		} else {
//			System.out.println("데이터 없다.");
//		}
		
		//isEmpty() 컬렉션이 비어있는지 조사
		if(!sports.isEmpty()) {
			System.out.println("데이터 있다.");
		} else {
			System.out.println("데이터 없다.");
		}
		
		//원하는 데이터를 삭제해보자
		//remove(index);
		System.out.println(sports.size());
		sports.remove(3);
		System.out.println(sports.size());
		System.out.println(sports.get(3));//있음! 앞으로 땡겨짐!
		//System.out.println(sports.get(5));//5번 인덱스 없음
		
		//remove(객체);
		System.out.println("지우기 전 개수");
		System.out.println(sports.size());
		sports.remove(new Sports("구기종목","축구",11,new String[5]));
		System.out.println("지운 후 개수");
		System.out.println(sports.size()); //그냥 이렇게하면 안됨~
		//해당 객체에 @Override equals() 해야함
		//sport.get(1).equals(new...)
		
		System.out.println(sports.get(0));
	
		
		//list내부에서 특정 객체를 찾는 메소드
		//contains() - 결과가 true/false로 나옴
		System.out.println(sports.contains(new Sports("물종목","수영",8,null)));
		System.out.println(sports.contains(new Sports("구기종목","축구",11,new String[5])));
		
		//list는 중복값 저장 가능
		list = new ArrayList();
		for(int i=0; i<10; i++) {
			list.add("유병승");
		}
		for(Object n : list) {
			System.out.println(n);
		}
		
	}
	
	//list에는 인덱스를 기준으로 순서가 존재한다!
	//그러면 정렬은?
	public void listSort() {
		//list자료 정렬해보기
			
		List nums = new ArrayList();
		for(int i=0; i<10; i++) {
			nums.add((int)(Math.random()*30+1));
		}
//		for (Object o : nums) {
//			System.out.println(o);
//		}
		printList(nums);
	
		//오름차순 정렬
		Collections.sort(nums);
		System.out.println("=== 오름차순 정렬 후 ===");
		printList(nums);
		
		//내림차순 정렬 방법
		//1. 내림차순을 위한 객체를 생성 -> Comparator인터페이스 구현
		//별도의 클래스에서 만들 때 사용. compare() 추상메소드 구현
		//2. 객체 내부에서 정렬순서를 정하는 방법 -> comparable 인터페이스를 구현 
		//데이터 보관용 객체에서 사용. compareTo() 구현
		
		//1. Comparator
		Collections.sort(nums, new NumberSort());
		System.out.println("=== 내림차순 정렬 후 ===");
		printList(nums); 
		//퀵정렬
		//정렬할 전체 값들을 정렬을 수행하지 않고 기준값(피봇)을 중심으로 왼쪽 부분집합과 오른쪽 부분집합으로 분할.
	
		System.out.println("==내림차순 숫자 익명클래스==");
		Collections.sort(nums, new Comparator() {
			
			@Override
			public int compare(Object o1,Object o2) {
				return ((Integer)o2)-((Integer)o1);
			}
		});
		printList(nums);
		
		System.out.println("===내림차순 숫자 람다식 ===");
		Collections.sort(nums,(o1,o2)->
		((Integer)o2)-((Integer)o1));
		printList(nums);
		
		
		//문자열 정렬하기
		nums.clear();
		nums.add("남지선");
		nums.add("강수정");
		nums.add("황진호");
		nums.add("설진호");
		nums.add("김다희");
		nums.add("유병승");
		System.out.println("==== 문자열 정렬하기 ====");
		printList(nums);
		
		//문자열 오름차순
		Collections.sort(nums);
		System.out.println("=== 문자열 오름차순 정렬 후 ===");
		printList(nums);
		
		//문자열 내림차순
		Collections.sort(nums, new StringSort());//만든 객체 넣기
		System.out.println("=== 내림차순 정렬 후 ===");
		printList(nums);
		
		//객체가 들어가 있는 list정렬하기
		nums.clear();
		nums.add(new Sports("구기종목","축구",11,null));
		nums.add(new Sports("구기종목","농구",5,null));
		nums.add(new Sports("헬스","헬스",1,null));
		nums.add(new Sports("구기종목","테니스",2,null));
		nums.add(new Sports("구기종목","골프",9,null));
		
		System.out.println("=== 정렬 전 ===");
		printList(nums);
		//Collections.sort(nums);//compareTo메소드가 있어야 함
		//Collections.sort(nums, new SportPlayerSort()); //Comparator이용
		Collections.sort(nums, new SportPlayerSort(true));//오름
		System.out.println("=== 정렬 후 ===");
		printList(nums);
		
		Collections.sort(nums, new SportPlayerSort(false));//내림
		System.out.println("=== 정렬 후 ==="); 
		printList(nums);
		
		
		//익명클래스를 이용해서 정렬하기. 임시클래스(명칭없어서 다시 못부름)
		System.out.println("=== 익명클래스 ===");
		Collections.sort(nums, new Comparator() {//인터페이스
			
			@Override
			public int compare(Object o1,Object o2) {
				
				return ((Sports)o2).getPlayer()-((Sports)o1).getPlayer();
			}
		});//바로 구현해서 집어넣음!
		printList(nums);
		
		//람다식을 이용해서 정렬하는 것
		System.out.println("==== 람다식 ====");
		Collections.sort(nums,(o1,o2)->
		(((Sports)o2).getPlayer()-((Sports)o1).getPlayer()));
		printList(nums);
	}
	

	public void printList(List list) {
		//프린트하는 메소드
		for(Object o : list) {
			System.out.print(o+" ");
		}
		System.out.println();
	}
	
	
	
	//LinkedList
	public void linkedList() {
		// ArrayList와 비슷-저장방식의 차이
		LinkedList list = new LinkedList();
		
		//값대입
		list.add("유병승");
		list.add("설진호");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		System.out.println(list.getFirst());//가장 처음 출력
		System.out.println(list.getLast());//가장 마지막 출력
		
		list.add(1,"박현우");//수정, 삭제 등 속도가 더 빠름
		list.remove(1);
	}

}
