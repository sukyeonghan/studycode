package com.oop.controller;

import com.oop.model.vo.Employee;

public class EmployeeController {
	
	private Employee e = new Employee();

	public void add(int empNo, String name, char gender,String phone) {
		e.setEmpNo(empNo);
		e.setName(name);
		e.setGender(gender);
		e.setPhone(phone);	
	}
	
	public void add(int empNo, String name, char gender, String phone,
			String dept, int salary, double bonus) {
		e.setEmpNo(empNo);
		e.setName(name);
		e.setGender(gender);
		e.setPhone(phone);
		e.setDept(dept);
		e.setSalary(salary);
		e.setBonus(bonus);
	}
	
	public void modify(String phone) {
		e.setPhone(phone);
	}
	public void modify(int salary) {
		e.setSalary(salary);
	}
	public void modify(double bonus) {
		e.setBonus(bonus);
	}
	
	public Employee remove() {
		e=null;
		return e;
	}

	public String inform() {
		if(e==null) {
			return null;
		} else {
			return e.printEmployee();
		}
	}

}
