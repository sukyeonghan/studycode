package com.io.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StreamTest {
	//사용자에게 메세지를 입력받고 (0 누를 때까지) 
	//그 메세지를 저장메소드에 전달하여 저장하기
	
	public String saveMsgData(String msg, String fname) {//저장할 데이터와 파일 이름을 입력받기
		//데이터를 받아서 값을 저장
		//호출하면 알려줄게,저장되면 알려줄게 ->메세지 반환
		//File f = new File("msg.data");
		//파일명 수정
		File f = new File(fname);
		
		String returnMsg = "정상적으로 처리되었습니다.";
		
		try(FileWriter fw = new FileWriter(f)) {
			
			fw.write(msg);//데이터를 file에 저장
			
		} catch(IOException e) {//매개변수에  Exception 정보 담김
			e.printStackTrace();
			returnMsg="정상적으로 처리되지 않았습니다. 다시 시도하세요.";
		}
		
		return returnMsg;
	}
	
	//원하는 파일명 검색해서 반환
	public String loadMsgData(String fname) {
		
		//File f = new File("msg.data");
		//try(FileReader fr = new FileReader(f)) {
		
		String result ="";
		
		try(FileReader fr = new FileReader(fname)) {
			
			int value = 0;
			
			while((value=fr.read())!=-1) {
				result+=(char)value;
			}
			
			} catch (IOException e) {
				e.printStackTrace();
				result ="파일을 불러오는데 에러가 발생했습니다.";
		}
		return result;
	} 
	
}
