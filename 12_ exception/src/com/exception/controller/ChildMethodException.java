package com.exception.controller;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ChildMethodException extends MethodOverrideTest {

	@Override
	public void exceptionOverride() throws FileNotFoundException, EOFException, IOException {
		//Exception ������ �� ���ų� ���� ������ ��. ������ ���� ����
		//override ���� �� ���������ڿ� �ݴ�
		
	}
	
}
