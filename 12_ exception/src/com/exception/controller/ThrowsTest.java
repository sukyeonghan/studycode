package com.exception.controller;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class ThrowsTest {
	
	//1. �ٸ� �޼ҵ忡 ����
	public void exceptionTest2() throws FileNotFoundException{
		
		throw new FileNotFoundException();
	
	}
	
	public void exceptionTest3() throws EOFException {
		throw new  EOFException();
	}
	//����ó������ ��Ӱ��谡 ����!�ڽİ�ü�� Exception�� �θ� Exception�� ó���� �� ����
	//��� Exception�� �ֻ��� ��ü�� Exception�̾ �̰ɷ� �� ó�� ����
	//IOException�� FileNotFoundException�� �θ𿩼� ó�� ����
	//EOFException�� FileNotFoundException���� �����̾ ó�� ����
	//throws�� ���� �� exception�� �� ����
	//FileNotFoundException,EOFException �� �� �Ⱦ��� IOException�� �ᵵ ��
	
	public void exceptionTest() throws FileNotFoundException,EOFException { 
		//checkedException ���ܸ� �߻���Ŵ 
		//�ݵ�� ó�� ������ �ۼ��� �ؾ���
		//throw new IOException(); //���ܸ� �߻���Ŵ
		
		exceptionTest2();
		exceptionTest3();
	}

	

}
