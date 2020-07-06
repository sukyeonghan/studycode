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
		//Ű���� �Է¿�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� : ");
		int empNo = sc.nextInt();
		setEmpNo(empNo);
		sc.nextLine();
		
		System.out.print("�̸� : ");
		String name = sc.next();
		setEmpName(name);
		
		System.out.print("�ҼӺμ� : ");
		String dept = sc.next();
		setDept(dept);
		
		System.out.print("���� : ");
		String job = sc.next();
		setJob(job);
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		setAge(age);
		sc.nextLine();
		
		System.out.print("���� : ");
		char gender = sc.nextLine().charAt(0);
		setGender(gender);
		
		System.out.print("�޿� : ");
		int salary = sc.nextInt();
		setSalary(salary);
		
		System.out.print("���ʽ�����Ʈ : ");
		double bonus = sc.nextDouble();
		setBonusPoint(bonus);
		sc.nextLine();
		
		System.out.print("�ڵ��� : ");
		String phone = sc.next();
		setPhone(phone);
		
		System.out.print("�ּ� : ");
		String address = sc.next();
		setAddress(address);
		
		System.out.println("��� �Ϸ��Ͽ����ϴ�.");
	}
	
	public void empOutput() {
		//��¿� �޼ҵ�
		System.out.println("��� : "+empNo+", �̸� : "+empName+", �μ� : "+dept+", ���� : "+job+
				", ���� : "+age+", ���� : "+gender+", �޿� : "+salary+", ���ʽ�����Ʈ : "+bonusPoint
				+", �ڵ��� : "+phone+", �ּ� : "+address);
	}
	
	public void setNewName(String newName) {
		//�� �ʵ� �� ����� �޼ҵ�
		
		setEmpName(newName);
		System.out.println(empName);
		System.out.println("����Ǿ����ϴ�.");
	}
	
	public void setNewSalary(int newSalary) {
		setSalary(newSalary);
		System.out.println(salary);
		System.out.println("����Ǿ����ϴ�.");
	}
	
	public void setNewDept(String newDept) {
		setDept(newDept);
		System.out.println(dept);
		System.out.println("����Ǿ����ϴ�.");
	}
	
	public void setNewJob(String newJob) {
		setJob(newJob);
		System.out.println(job);
		System.out.println("����Ǿ����ϴ�.");
	}
	
	public void delete() {
		//��� ���� ����
		
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
		
		System.out.println("�����Ǿ����ϴ�.");
		
	}

}
