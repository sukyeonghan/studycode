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
	} //�θ�����ڱ��� �߰��ؼ� ȣ����//����Ű alt+s+a�ϰ� ������ ������


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
		return "���� ������?";
	}
	
	@Override //�θ� �ִ��� Ȯ��
	public String toString() { //Object�� �ִ� toString�޼ҵ带 �������� �� 
		//return "Employee �μ�"+department+"��å"+job+"����"+salary;
		return getName()+getAge()+getAddress()+department+job+salary;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee e = (Employee)obj;
			if(super.getName().equals(e.getName())//�θ� �͵� �ҷ��� �� �� ����
					&&this.salary==e.salary) { //get�Ƚᵵ �� �� �ְ� ����
				return true;
			}
		}
		return false;
	}
	
	@Override
	public Employee clone() {//���� ����
		return new Employee(getName(),getAge(),getAddress(),
				department, job,salary);
		
	}
}
