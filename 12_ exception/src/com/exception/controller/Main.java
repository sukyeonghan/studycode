package com.exception.controller;

public class Main {

	public static void main(String[] args) { //throws Exception {//JVM���� ����
		//System.out.println("�̰� ����Ǵ�?");
		//new ThrowsTest().exceptionTest(); //JVM�� �̰� ����ϰ� �����Ŵ.Uncheckedó��
		//System.out.println("Exception �Ʒ� ����");//�̰� ��� �� ��
		
		try {
			throw new MyException("������");
		} catch(MyException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
