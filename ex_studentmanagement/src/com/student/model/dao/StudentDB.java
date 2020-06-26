package com.student.model.dao;

import com.student.model.vo.Student;

public class StudentDB {
	//데이터를 저장하는 역할을 하는 객체
	//입력된 데이터를 관리하는 역할을 함
// 힙 영역에 저장공간 확보. 학생 6명	
//	private Student s;
//	private Student s1;
//	private Student s2;
//	private Student s3;
//	private Student s4;
//	private Student s5;
	
	//위에 걸 객체배열로 한 줄로 쓸 수 있다
	private Student[] students = new Student[6];
	
	//1.전달받은 데이터를 멤버변수에 저장하여 관리하기. 매개변수==파라미터
//	public void saveStudent(Student s) {
//			
//		//전달받은 Student s를 멤버저장공간 중 빈 곳에 저장
//		//s는 호출될 때마다 바뀜
//		if(this.s==null) this.s=s; //기본 저장방식. 변수명으로 받아서 for문 쓸 수 없음.
//		else if (this.s1==null) this.s1=s; //변수는 한 개의 값만 받을 수 있으므로 나눠서 담아야 함
//		else if (this.s2==null) this.s2=s;
//		else if (this.s3==null) this.s3=s;
//		else if (this.s4==null) this.s4=s;
//		else if (this.s5==null) this.s5=s;
//		else {
//			System.out.println("더 이상 저장할 공간이 없습니다!");
//		} //비어있으면 넣어라. 다 채워지면 저장공간 끝.
//	}
	
	
//	//성공 여부 알림 메세지 띄우기로 변경
	
//	public boolean saveStudent(Student s) { //반환형있으니 return써야함
//				
//		boolean result = true; //입력되면 true, 안되면 false
//		
//		if(this.s==null) this.s=s;
//		else if (this.s1==null) this.s1=s;
//		else if (this.s2==null) this.s2=s;
//		else if (this.s3==null) this.s3=s;
//		else if (this.s4==null) this.s4=s;
//		else if (this.s5==null) this.s5=s;
//		
//		else {
//			return=false;
//		}
//	
//		return result;
//	}

	
	public boolean saveStudent(Student s) { //반환형있으니 return써야함
				
		boolean result = true; //입력되면 true, 안되면 false
		
		
		int count=0;
		for(int i=0; i<students.length; i++,count++) {
			if(students[i]==null) {
				students[i]=s;
				break;
			} 
		}
		if(count==students.length) {
			result=false;
			
		}
		return result;
	}
	
	
	//전달받은 이름으로 검색해서 결과 반환하기
	//이름 중복 없다는 가정 하에

//		public Student searchName (String name) {		
//		if(s!=null&&s.getName().equals(name)) return s;
//		else if (s1.getName().equals(name)) return s1;
//		else if(s2.getName().equals(name)) return s2;
//		else if(s3.getName().equals(name)) return s3;
//		else if(s4.getName().equals(name)) return s4;
//		else if(s5.getName().equals(name)) return s5;
//		else return null; //없을 때
//		}
	
	public Student searchName (String name) {
		for(int i=0; i<students.length; i++) {
			if(students[i].getName().equals(name)) {
				return students[i];
			}
		}
		return null;
	}
	
	
	
	
		//전체조회하기
		public Student[] searchAll() {
			return students;
		}
		
		
		//학년으로 조회
		public Student searchGrade (int grade2) {
			for(int i=0; i<students.length; i++) {
				if(students[i].getGrade()==grade2) {
					return students[i];
				}
			}
			return null;
		}
		
		
	}
		

