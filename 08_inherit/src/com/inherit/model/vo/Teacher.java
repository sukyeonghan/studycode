package com.inherit.model.vo;

//����� �̿��Ͽ� �ʿ��� �κи� �����ϰ� 
//�ٸ� ���� �ٸ� ��ü���� ������ �� �� ����
public class Teacher extends Person{
	//�̸�, ����, �ּ�, ��ȭ��ȣ, ����, ����
	private String subject;
	private String major;
	
	
	public Teacher() {
		
	}

	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
	
}