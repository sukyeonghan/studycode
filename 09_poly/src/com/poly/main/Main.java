package com.poly.main;

import java.util.Date;
import java.util.Scanner;

import com.poly.controller.Functional;
import com.poly.model.vo.Animal;
import com.poly.model.vo.Cat;
import com.poly.model.vo.Duck;
import com.poly.model.vo.Employee;
import com.poly.model.vo.Lion;
import com.poly.model.vo.Person;
import com.poly.model.vo.Singer;

public class Main {
	
	public static void main(String[] args) {
		//다형성 활용하기
		//부모 타입으로 설정되어 있는 변수에
		//자식 타입의 객체가 대입 될 수 있는 것!
		Cat tom = new Cat();
		Duck donald = new Duck();
		Animal ani = new Animal();
		
		ani = new Cat(); //다형성 //변수명 하나로 여러 개를 받을 수 있다는 장점이 있다
		System.out.println(ani);
		
		ani = new Duck(); //다형성
		System.out.println(ani);
		
		ani = new Lion(); //에러! 상속관계가 없기 때문에! 다형성이 적용이 안됨.
		System.out.println(ani);
		//상속 관계가 전제 조건이 됨!
		
		//부모는 자식 타입의 변수에 들어갈 수 있니?
//		tom = new Animal();//부모타입은 자식타입에게 대입될 수 없다!
		
		//다형성에 의해 자식 객체가 부모 타입으로 대입되면,
		//부모객체의 내용만 볼 수 있게 설정됨(업캐스팅)
		Person p = new Employee("설진호",48,"포천","개발팀","연구원",100);//person인 척 함
		System.out.println(p.getName());
		//System.out.println(p.getDepartment());//부모가 가지고 있는 데이터만 볼 수 있음
		//자식의 내용은 볼 수 없게 됨. 뒤3개는 쓸 수 없게 되어 이용할 필요가 없게 됨.
	
		//Employee e = (Employee)p; //Employee가 p로 됬으니까 형변환해서 넣어 줌. 형변한 순서 주의
		
		//부모타입으로 대입된 자식객체의 데이터에 접근을 하려면
		//반드시 강제형변환을 해야 함!
		
		
		//괄호 안에 형변환할 객체
		//연산자 우선순위! ()나 .붙은 게 제일 빠름. 형변환 후 접근해야해서 괄호로 먼저 묶음
		//형변환하면 가려져있던 거 해제시킴..
		System.out.println(((Employee)p).getDepartment());
		p = new Singer("김세민", 32, "남양주", "너만 보인단 말이야",2,"밴드");
		
		//Singer s = (Singer)p; 
		
		//functional 객체에서 지원하는 출력메소드 이용 객체 출력하기
		
		Employee e = new Employee("설진호",48,"포천","개발팀","연구원",100);
		Singer s = new Singer("김세민", 32, "남양주", "너만 보인단 말이야",2,"밴드");
		//Employee e = (Employee)p;
		//Singer s = (Singer)p; 와 같은 의미. 값이 똑같으니까

		
		new Functional().print(e); //person의 자식이어서 매개변수 p로 받아도 에러 안남
		new Functional().print(s);
		new Functional().print(new Person()); //p에 대한 조건이 있으면 출력, 없으면 생략
		
		//p에는 singer가 있음
		//사실 p는 person인데 실제 들어가 있는 객체 확인
		p=new Employee();
		System.out.println(p instanceof Employee);
		System.out.println(p instanceof Singer);
		
		
		//부모객체를 이용한 여러 자식 객체 보관하기
		//객체배열로 보관하기
		Person[] persons = new Person[5];
		//본인 Person 포함한 자식객체가 모두 들어갈 수 있음
		persons[0] = new Singer("김세민",27,"경기도 남양주","너만보인단말이야",4,"가요");
		persons[1] = new Employee("유다해",22,"서울","개발팀","연구원",100);
		persons[2] = new Person("설진호",32,"지역차별");
		persons[3] = new Singer("조현",28,"서울","깡",10,"힙합");
		persons[4] = new Employee("이세현",27,"서울","연구팀","연구원",20); 
		//persons는 프로그램에서 등록되어 관리하고 있는 객체 모두를 보관.다형성 이용해서
		//-> 얘만 가지고 값을 구할 수 있다
		
		//프로그램에 현재 등록되어 있는 가수와 사원의 수는?
		System.out.println("=====");
		
		int singerCount = 0;
		int empCount = 0;
		
		for(int i=0; i<persons.length; i++) {
			if(persons[i] instanceof Singer) {
				singerCount++;
			} else if (persons[i] instanceof Employee) {
				empCount++;
			}
		}
		System.out.println("가수는"+singerCount+"명 있음");
		System.out.println("사원은"+empCount+"명 있음");
		
		//object -> 모든 클래스의 부모객체, 최상위 객체
		Object obj=new Person();
		System.out.println(obj); //Person들어가 있음- person거 toString 출력
		obj=new Employee();
		
		Object[] objs = new Object[10];
		objs[0] = new Scanner(System.in);
		objs[1] = new Date();
		
		//object클래스 안에서 잘 쓰는 거 
		//equals - 객체 동등비교하는 메소드. 들어가있는 값을 비교
		//오버라이딩해서 쓸 수 있다- public boolean equals(Object ob) 모든 객체 다 쓸 수 있다
		//clone() - 객체 복사.접근제한자 protected여서 오버라이딩해서 사용해라
		//hashCode - equals와 같이 씀
		//toString 오버라이딩하면 원하는대로 출력할 수 있음. 객체에 대한 정보 출력
		//오버로딩해서 사용하지 않으면 클래스 이름과 16진수 hasCode를 반환
		//com.poly.model.vo.Employee@14ae5a5
		
		System.out.println(obj); //Employee객체 들어가 있음 - employee거 toString 출력
		//Employee에 toString 오버라이딩 된 게 없으면 상위 객체인 person 거 호출해서 출력
		System.out.println(persons[0]); //그냥 이렇게 하면 Object.toString();을 자동으로 실행
		
		//부모로 선언되서 객체가 들어갔지만 toString이 구현된 게 있으면
		//자식 것도 실행할 수 있게 하는게 '동적바인딩'
		//person()에만 오버라이딩했는데 obj도 같은 게 출력됨. Employee에는 오버라이딩 안함
		//주소값의 자료형을 기준으로 재정의한 메소드를 호출할 때
		
		//동적 바인딩 정리
		//부모 객체가 가지고 있는 메소드를 자식 객체가 오버라이딩 하였을 때 
		//형변환 없이 자식 객체의 메소드를 실행할 수 있는 것
		
		//원래 이렇게 출력
		for(int i=0; i<persons.length; i++) {
			if(persons[i] instanceof Singer) {
				Singer ss = (Singer)persons[i];
				System.out.println(ss.getName()+ss.getAge()+ss.getAddress()
				+ss.getTitle()+ss.getYear()+ss.getGenre());
			} else if(persons[i] instanceof Employee) {
				Employee ee = (Employee)persons[i];
				System.out.println(ee.getName()+ee.getAge()+ee.getAddress()
				+ee.getDepartment()+ee.getJob()+ee.getSalary());
			} else if (persons[i] instanceof Person) { //부모인 person을 밑으로 써야 제대로 출력
				Person pp = persons[i];					//Person자료형이여서 다 포함되니까
				System.out.println(pp.getName()+pp.getAge()+pp.getAddress());
				
			}
		}
		
		System.out.println("===동적바인딩을 이용한 출력===");
		
		//위를 동적바인딩 이용해서 간단히 출력하기
		//동적바인딩을 이용하면 알아서 변수에 들어가 있는 객체의 오버라이딩되어있는 메소드를 호출하게 되어 
		//형변환없이 변수에 들어가 있는 객체의 메소드를 이용할 수 있음
		for(int i=0; i<persons.length; i++) {
			System.out.println(persons[i]);//object에 있는 toString메소드를 호출함
			//person(부모객체)에 들어있는 객체의 메소드(오버라이딩 된)들을 각각 호출함
		}
		
		System.out.println("====동적바인딩 재설명====");
		Person person = new Person("이순신",44,"거북선");
		System.out.println(person.getName());
		
		person = new Employee("유병승",19,"경기도 시흥시","자바학부","강사",100);
		System.out.println(person.getName());
		//getName()을 Employee에서 오버라이딩 했더니 그 값으로 바뀌어서 출력
		
		//toString ->참조변수를 출력할 때 매개변수로 넣으면 
		//참조형변수의 내용을 출력해야하는데 주소가 들어가 있으니 있는 그대로 주소를 출력하는게 아니고
		//보기 쉽게 출력하기 위해 자동으로 toString()메소드를 호출하여 출력
		//모든 객체에 반영되기 위해 Object 객체에 선언
		Date d = new Date();
		String str = new String("안녕");
		System.out.println(str);
		System.out.println(d);
		
		Animal ani1 = new Animal();
		System.out.println(ani1.toString());//참조형 변수 넣으면 toString 실행된다~
		System.out.println(ani1);//toString() 한 거랑 같은 값 나옴
		Object obj2 = ani1;
		System.out.println(obj2.toString());
		//부모가 자식 객체 걸 실행할 수 있음

		//객체의 동등비교
		Person jo = new Person("조현",28,"서울");
		Person jo2 = new Person("조현",28,"인천");
		System.out.println(jo==jo2);
		//객체를 비교할 때? equals를 사용 ex)String
		System.out.println(jo.equals(jo2));//위랑 같음. 주소값비교
		//객체의 동등성을 비교할 때는 object에 있는 equals() 메소드를 Override 하여 사용한다.
		//데이터의 무결성이 깨지지 않도록 값이 동일하면 동일한 객체로 인식되게 해야함
		System.out.println(jo.equals("하하하하"));//java.lang.ClassCastException:
		//string을 person으로 강제형변환 안됨
		
		//객체 복사 clone() Override하기
		Employee emp = new Employee("강경록",30,"수원","개발팀","팀장",5);
		System.out.println(emp);
		Employee emp2 = emp.clone();
		System.out.println(emp2);
		
	}
}
