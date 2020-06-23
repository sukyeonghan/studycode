package com.oop.model.vo;

public class CommunityBoard {
	//커뮤니키 사이트에서 게시판을 운영할 예정이다.
	//게시판 정보를 받을 객체를 3개 생성해서 출력하기
	private String boardCheck;
	private String boardHi;
	private String boardNotice;
	
//	public CommunityBoard() {
//		
//	}

	public CommunityBoard (String boardCheck, String boardHi, String boardNotice) {
		System.out.println("매개변수 boardCheck: " + boardCheck);
		System.out.println("매개변수 boardHi: " + boardHi);
		System.out.println("매개변수 boardNotice: "+ boardNotice);
		
//		this.boardCheck=boardCheck;
//		this.boardHi=boardHi;
//		this.boardNotice=boardNotice;
				
		
	}
}
