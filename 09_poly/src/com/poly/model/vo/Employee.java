package com.poly.model.vo;

public class Employee extends Person{
	
	private String department;
	private String job;
	private int salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	

	public Employee(String name, int age, String address, String department, String job, int salary) {
		super(name, age, address);
		this.department = department;
		this.job = job;
		this.salary = salary;
	} //부모생성자까지 추가해서 호출함//단축키 alt+s+a하고 밑으로 내리기


	public Employee(String department, String job, int salary) {
		super();
		this.department = department;
		this.job = job;
		this.salary = salary;
	}

	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String getName( ) {
		return "내가 누구게?";
	}
	
	@Override //부모 있는지 확인
	public String toString() { //Object에 있는 toString메소드를 재정의한 것 
		//return "Employee 부서"+department+"직책"+job+"월급"+salary;
		return getName()+getAge()+getAddress()+department+job+salary;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee e = (Employee)obj;
			if(super.getName().equals(e.getName())//부모 것도 불러서 할 수 있음
					&&this.salary==e.salary) { //get안써도 쓸 수 있게 해줌
				return true;
			}
		}
		return false;
	}
	
	@Override
	public Employee clone() {//깊은 복사
		return new Employee(getName(),getAge(),getAddress(),
				department, job,salary);
		
	}
}
