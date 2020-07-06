package com.streamTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileStreamTest {
	//데이터 지정파일로 출력(저장)하기
	public void outputStream(String data) {
		//RAM -> file 로 이동시키기/데이터를 영속성있게 저장하기 위해서
		//1. 데이터를 옮길 위치 지정(file) -> file 객체 생성
		//2. file과 Stream 연결 -> OutputStream객체 생성
			//ram에 있는 걸 file로 옮기기 위해 전송통로(stream)필요
		//3. 메소드를 통해서 data를 보내줌 -> Write();
		//4. OutputStream 반환 -> close();
		
		File saveFile = new File("data.bs");//확장자명 상관없다
		//byte로 데이터를 주고받는 FileOutputStream 을 사용해보자
		FileOutputStream fos = null; 
		//checkedException으로 반드시 예외처리를 해줘야 함.
		
		try {
			fos = new FileOutputStream(saveFile); 
			//Stream을 열면서 매개변수로 들어온 파일객체를 생성해줌. 파일 생성!
			//그리고 나서 램과 파일을  연결함. 
			//fos.write("123456".getBytes());
			//문자열을 바이트로 바꿔서 1byte씩 넘겨줌
			
			//외부에서 전달받은 값을 file로 저장하기
			fos.write(data.getBytes());
			
			//fos.write("funtion test(){alert('하이');}".getBytes());
			//없을 땐 파일 생성. 파일 있으면 그 파일과 연결함
		} catch(IOException e) {
			
			e.printStackTrace();
		
		} finally { //close 안하면...
			if(fos!=null) {
				try {
					fos.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	public void InputStreamTest() {
		//file에 저장된 내용을 읽어오기
		//InputStream을 사용하게 됨
		//1. file을 선택 -> File객체
		//2. FileInputStream을 생성함
		//3. read()메소드로 데이터를 읽어 옴
		//4. Stream 닫기
		
		File load = new File("data.bs");
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(load);
			//파일 읽어올 때는 read로 읽어 옴
			//byte단위로 data를 읽어오기 때문에 전체 데이터를 받으려면
			//date의 내용이 끝날 때까지 반복문을 사용하여 받아옴 
			int value = 0;//byte연산처리. 아스키코드 규칙
			
			StringBuffer sb = new StringBuffer();
			
			while((value=fis.read())!=-1) {
				//-1의 기준값은 file에 더 이상 읽어 올 데이터가 없는 경우 반환
				// -> 데이터 다 읽었다는 의미
				sb.append((char)value); //뒤에 문자열 추가
				
			}
			
			System.out.println(sb);
			
		} catch(IOException e) {
			e.printStackTrace();
			
		} finally {
			if(fis!= null) {
				try {
					fis.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	
	//문자열 전용 스트림
	//Writer / Reader
	
	public void writerTest() {
		//1. file 선정
		//2. Stream 생성
		//3. 데이터 전송 -> write
		//4. 스트림 반환
		
		File f = new File("strData.bs");
		//try with resource 로 쓰기
		try(FileWriter fw = new FileWriter(f);) {
			String msg = "눕고 싶다";
			fw.write(msg);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	//파일에 저장된 문자열 데이터 불러오기
	public void readerTest() {
		//1. 파일 선정 -> File
		//2. Stream 생성 ->FileReader
		//3. 파일 불러오기 -> read();
		//4. 스트림반환 -> close();
		
		File f = new File("strData.bs");
		
		try(FileReader fr = new FileReader(f)) {
			
			int value = 0;
			String msg="";
			while((value=fr.read())!=-1) {
				//System.out.println((char)value);
				msg+=(char)value;
			}
			
			System.out.println(msg);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
