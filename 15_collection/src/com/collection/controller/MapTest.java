package com.collection.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.collection.model.vo.Member;

public class MapTest {

	public void mapTest() {
		//Map : 객체 데이터를 보관하는 클래스
		//저장방식 - key : value 쌍형식으로 되어있음(나중에 써먹으니 잘 알아두길)
		//key 자료형 : Object; -> 주로 String,Integer로 많이 사용. 구분자역할
		//value 자료형 : Object -> 모든 객체 사용
		//종류 : HashMap, TreeMap,LinkedHashMap;
		
		//클래스기때문에 메소드를 이용해서 데이터를 처리함
		
		//생성
		HashMap map = new HashMap();
		//Map자료형에 값을 넣는 방법
		//put(key,value);
		map.put(1,"유병승");
		map.put(2,"김세민");
		map.put(3,"윤테레사");	
		
		//key,value에는 모든 객체가 들어갈 수 있음
		map.put("펭수", "남지선");
		map.put("admin", new Member("admin","1234","관리자",19));	
		map.put(new Member("user01","1111","유저1",20),1);
		
		//map에 들어가 있는 값을 출력하기
		//get(key); -> value값을 가져올 수 있음
		System.out.println(map.get(1));
		System.out.println(map.get("admin"));
		System.out.println(map.get(new Member("user01","1111","유저1",20)));
		//동등성 비교하려면 이퀄스오버라이딩, 해쉬코드 있어야 함
		
		//web에서 프론트단에서 보내는 값을 key:value 형식으로 가져오게 됨!
		//request.getPatameter("userId");  key : value 형식으로 비슷하니 잘 알아두자
		
		//map -> list특성, set특성을 둘 다 가지고 있음
		//key는 중복 안됨!
		//key를 Set방식으로 저장함
		//map에 보관하고 있는 key전체를 출력하려면 Set으로 받아와서 출력해야함.
		System.out.println("=== key값 출력 ===");
		Set keys = map.keySet();
		Iterator it = keys.iterator();
		
		//key값 출력
//		while(it.hasNext()) {//값있는지 확인
//			System.out.println(it.next()); // 그 값을 가져옴
//		}
		
		//key와 value값  전체 출력
		while(it.hasNext()) {
			Object key = it.next();
			System.out.println(key+" : "+map.get(key)); // get에 key를 넣으면 value값
			//System.out.println(map.get(key)); //값만 출력
		}
		System.out.println("==== Map.Entry 객체로 출력 ====");
		
		//전체 출력하는 다른 방법
		//Map.Entry 객체를 이용해서 한 번에 key,value값을 출력함
		Set mapEntry = map.entrySet();//entrySet은 key,value값을 순서대로 넣음
		Iterator it2 = mapEntry.iterator(); //둘을 합쳐서 mapEntry라는 객체를 넘김
		//iterator하니까 트레이 안에 하나씩 들어감. 이거 자료형이 mapEntry
		while(it2.hasNext()) {
			//System.out.println(it2.next());
			
			Map.Entry entry = (Map.Entry)it2.next();
			//Map.Entry객체 안에 key와 value값을 동시에 보관하고 있음
			//key값 : Map.Entry.getKey();
			//value값 : Map.Entry.getValue():
			System.out.println("key : "+entry.getKey());
			System.out.println("value : " +entry.getValue());
		}
		
		//키값가져오기
		System.out.println("=== for each문으로 처리하기 ===");
		for(Object o : map.keySet()) {
			
			System.out.println(o);
			System.out.println(map.get(o)); //value값
		}
		
		for(Object a : map.entrySet()) {
			Map.Entry entry = (Map.Entry)a;
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		} //이렇게도 가능
		
		
		//map객체 저장하고 활용하기
		HashMap members = new HashMap();
		//member 객체 3개 넣기
		members.put(1,new Member("tnrud","4567","user",23));
		members.put(2,new Member("admin","1234","관리자",19));
		members.put(3,new Member("adm3","1267","매니저",34));
		
		//저장된 멤버의 id만 출력하기
		//iterator//다 형변환함..주의!
		
		Set memKey = members.keySet();
		Iterator it3 = memKey .iterator();
		while(it3.hasNext()) {
			//it3.next()//key값
			Object o = members.get(it3.next()); //value값
			System.out.println(((Member)o).getId()); 
			
		}
		
		//entrySet
		Set memEntry = members.entrySet();
		it3 = memEntry.iterator();
		while(it3.hasNext()) {
			Map.Entry en = (Map.Entry)it3.next();
			Member m = (Member)en.getValue();
			System.out.println(m.getId());
		}
		
		
		System.out.println("=== for each문 ===");
		
		for(Object o : members.keySet()) {
			Member m = (Member)members.get(o); //en.getValue(); 둘다 내부적으로 멤버. 멤버 주소 가져오니까
			System.out.println(m.getId());
			
			//System.out.println(((Member)members.get(o)).getId());
			//한 줄로 줄임
		}
		
		//map은 key값이 중복이 안된다
		
		System.out.println(members.get(1));
		members.put(1, "이건 어떻게 되니?");
		System.out.println(members.get(1));//덮어쓰기 된다
		
		//value값은 중복이 된다
		members.put(4, new Member("tnrud","4567","user",23));
		members.put(5, new Member("tnrud","4567","user",23));
		members.put(6, new Member("tnrud","4567","user",23));
		
		System.out.println(members);
		
		//map 객체 갯수 확인 가능
		System.out.println(members.size());
		
		//key값이 있는지 value값이 있는지 확인하는 것
		//containsKey() / containsValue();
		System.out.println(members.containsKey(1));
		System.out.println(members.containsKey(5));
		System.out.println(members.containsValue(new Member("tnrud","4567","user",23)));
		
		//map에 있는 데이터 지우기
		members.remove(5);
		System.out.println(members);
		members.remove(6,new Member("tnrud","4567","user",23));
		System.out.println(members);
		members.clear();
	}
}
