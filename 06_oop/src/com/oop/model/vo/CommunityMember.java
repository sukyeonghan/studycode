package com.oop.model.vo;

public class CommunityMember { //Testmain�� ����
	//Ŀ�´�Ƽ ����Ʈ�� ����� ���� ȸ�������� �������� �Ѵ�.
	//ȸ���� ���� ������ ������ ��ü�� ���弼��
	//�Ű����� �ִ� ������ �̿�/�� ���͵� 3���� ������ ���
	
	//1. �ʿ��� ���� (���̵�, �н�����, �̸���, ����..)
	//2. Ŭ���� �̸�(���), ������ �޴� �������(�ڷ��� ������) �����
	private String comName; //ȸ�� �̸�
	private String comId; //ȸ�� ���̵� 4~8���� ����
	private String comPw; //ȸ�� ��й�ȣ 8���� �̻�
	private double point; //���ƿ� ���Ƚ��

	//��ü�� ������ �� �ʿ��� ������ �ۼ�
	//3.�⺻ ������ ������ ������. ������ ���ؼ��� �̷��� �ڵ��ϴ� �������̱�.
	public CommunityMember() { //framework���� �̿��� �⺻�����ڷ� ������ �� �ٸ� setter�� ���� ������.
		//this()
		//������ ������ �ڽ��� ������ �ִ� �ٸ� ������ ȣ���� �� ��
		//����!this �����ڴ� �ݵ�� ������ �� ���� ����Ǿ� �Ѵ�!!
		//�̷��� �⺻ ���õ� ����
		this("userId","1111","print");
		this.point=100.10;

//		this.comId="userId";
//		this.comPw="1111"; ...
//		���� �̷��� �� ����
		
	}

	//4.�Ű����� �ִ� ������
	public CommunityMember (String comName, String comId, String comPw, double point) {
	//�ܺο��� �ִ� ������ ���ο� �����Ѵ�..
		this.comName=comName;
		this.comId=comId;
		this.comPw=comPw;
		this.point=point;
	}
	//point�ʱⰪ �����ϱ�..���� ����
	public CommunityMember (String comName, String comId, String comPw) {
		this(comName,comId,comPw,0);
		//���� �����ϱ� �� �� �ʿ� ����.
		
//		this.comName=comName;
//		this.comId=comId;
//		this.comPw=comPw;
		
	}
	//getter/setter -> ��ü�� ������ ������ �����ؼ� ���� �������� ���� �����ϴ� ����� ��
	public void setComName(String comName) {
		this.comName=comName;
	}
	public String getComName() {
		return comName;
	}
	public void setComId(String comId) {
		this.comId=comId;
	}
	public String getComId() {
		return comId;
	}
	public void setComPw(String comPw) {
		this.comPw=comPw;
	}
	public String getComPw() {
		return comPw;
	}
	public void setPoint(double point) {
		this.point=point;
	}
	public double getPoint() {
		return point;
	}
	
}