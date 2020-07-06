package com.exception.controller;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ChildMethodException extends MethodOverrideTest {

	@Override
	public void exceptionOverride() throws FileNotFoundException, EOFException, IOException {
		//Exception 위임할 때 같거나 낮은 범위만 됨. 개수는 제한 없다
		//override 했을 때 접근제한자와 반대
		
	}
	
}
