package com.oop.model.vo;

public class Member {
	
	//������ �׽�Ʈ ��ü	
	private String name;
	private String memberId;
	private String memberPw;
	private String phone;
	private String personNo; //�ֹι�ȣ�� ��ȣȭ ó�� �ʿ�
	private int memberNo;
	private static int count;
	
	//��ü ���� �����ڸ� �ۼ����� ������
	//�⺻�����ڸ� �ڵ����� �����Ͽ� ��������.
	
	//�⺻������ �����غ���!
	//�⺻������ : ó���ϴ� ������ �Ű������� ����
	//����������(public) Ŭ������(){}
	//�̰� �ּ�ó���ϸ� ������. �ؿ� �Ű����� �ִ� ������ �����ϱ� �ڵ����� ����������
	public Member() {
		//memberId="test"; �ʱ�ȭ ���ϰ� �ٸ� �� ����.
		System.out.println("�⺻ ������ ȣ��!");
	}
	
	//�Ű������� �ִ� ������
	//new member������ �� �ܺο��� ���� �޵��� ��������� ����
	//���������� ������ ���� �ʰ� ������ �ڷ������� ������..  
	//������ ���� ��Ʈ�� 5�� �ϳ� �� ����� ������. ������ �� ��
	public Member(String memberId, String memberPw, 
			String name,String phone,String personNo) {
		//���� ���ִ��� Ȯ�� ���
//		System.out.println("�Ű����� memberId" + memberId);
//		System.out.println("�Ű����� memberPw" + memberPw);
//		System.out.println("�Ű����� name" + name);
//		System.out.println("�Ű����� phone" + phone);
//		System.out.println("�Ű����� personNo" + personNo);
		this.memberId=memberId;
		this.memberPw=memberPw;
		this.name=name;
		this.phone=phone;
		this.personNo=personNo;
		//�������� �� �ּҰ��� �ִ´�
		//���������� �ٲ��..
	}
	
	//�����ε�
	//������ �� �� ���� �ʿ���� �ʿ��� �͸� �ص� ��
	//��ü�� �Ϻθ�������� �ʱ�ȭ�ϴ� �Ű������ִ� ������
	public Member (String memberId, String memberPw) {
		this.memberId=memberId;
		this.memberPw=memberPw;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setMemberId(String id) {
		this.memberId=id;
	}
	public String getMemberId() {
		return memberId;
	}
	
	public void setMemberPw(String pw) {
		memberPw=pw; 
		//public void setMemberPw(String memberPw) {
		//this.memberPw=memberPw;
		//�⺻������ �߰�ȣ �ȿ����� �̸��� ������ ������ ���� ����
		//���� �ȿ� memberPw �ߺ��� �� ��� this ��������
		//����� ���ú��� ����{} �ȿ����� �� �� �ִ�.
		//memberPw=memberPw;�̷��� ���� �� �� ����� ��
	}
	public String getMemberPw() {
		return memberPw;
	}
	
	public void setPhone(String phone) {
		this.phone=phone;
	}
	public String getPhone() {
		return phone;
	}
	
	public void setPersonNo(String no) {
		personNo=no;
	}
	public String getPersonNo() {
		return personNo;
	}
	//�ܺο��� ���� ���ϰ� set�� ����� ���� ����
	public int getMemberNo() {
		return memberNo;
	}

}