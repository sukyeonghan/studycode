package com.oop.model.vo;

import java.util.Scanner;

public class DtoEmployee {
	
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;
	
	public DtoEmployee() {
		// TODO Auto-generated constructor stub
	}

	public DtoEmployee(int empNo, String empName, String dept, String job, int age, char gender, int salary,
			double bonusPoint, String phone, String address) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.address = address;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void empInput() {
		//키보드 입력용
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사번 : ");
		int empNo = sc.nextInt();
		setEmpNo(empNo);
		sc.nextLine();
		
		System.out.print("이름 : ");
		String name = sc.next();
		setEmpName(name);
		
		System.out.print("소속부서 : ");
		String dept = sc.next();
		setDept(dept);
		
		System.out.print("직급 : ");
		String job = sc.next();
		setJob(job);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		setAge(age);
		sc.nextLine();
		
		System.out.print("성별 : ");
		char gender = sc.nextLine().charAt(0);
		setGender(gender);
		
		System.out.print("급여 : ");
		int salary = sc.nextInt();
		setSalary(salary);
		
		System.out.print("보너스포인트 : ");
		double bonus = sc.nextDouble();
		setBonusPoint(bonus);
		sc.nextLine();
		
		System.out.print("핸드폰 : ");
		String phone = sc.next();
		setPhone(phone);
		
		System.out.print("주소 : ");
		String address = sc.next();
		setAddress(address);
		
		System.out.println("등록 완료하였습니다.");
	}
	
	public void empOutput() {
		//출력용 메소드
		System.out.println("사번 : "+empNo+", 이름 : "+empName+", 부서 : "+dept+", 직급 : "+job+
				", 나이 : "+age+", 성별 : "+gender+", 급여 : "+salary+", 보너스포인트 : "+bonusPoint
				+", 핸드폰 : "+phone+", 주소 : "+address);
	}
	
	public void setNewName(String newName) {
		//각 필드 값 변경용 메소드
		
		setEmpName(newName);
		System.out.println(empName);
		System.out.println("변경되었습니다.");
	}
	
	public void setNewSalary(int newSalary) {
		setSalary(newSalary);
		System.out.println(salary);
		System.out.println("변경되었습니다.");
	}
	
	public void setNewDept(String newDept) {
		setDept(newDept);
		System.out.println(dept);
		System.out.println("변경되었습니다.");
	}
	
	public void setNewJob(String newJob) {
		setJob(newJob);
		System.out.println(job);
		System.out.println("변경되었습니다.");
	}
	
	public void delete() {
		//사원 정보 삭제
		
		empNo=0;
		empName="";
		dept="";
		job="";
		age=0;
		gender=' ';
		salary=0;
		bonusPoint=0.0;
		phone="";
		address="";
		
		System.out.println("삭제되었습니다.");
		
	}

}
