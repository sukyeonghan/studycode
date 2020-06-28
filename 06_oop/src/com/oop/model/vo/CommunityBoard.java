package com.oop.model.vo;

public class CommunityBoard {
	//커뮤니키 사이트에서 게시판을 운영할 예정이다.
	//게시판 정보를 받을 객체를 3개 생성해서 출력하기
	private String boardCheck;
	private String boardHi;
	private String boardNotice;
	private int count;
	
	public CommunityBoard() {}

	public CommunityBoard (String boardCheck, String boardHi, String boardNotice,int count) {	
		this.boardCheck=boardCheck;
		this.boardHi=boardHi;
		this.boardNotice=boardNotice;
		this.count=count;
	}
	
	public CommunityBoard (String boardCheck, String boardHi, String boardNotice) {
		this(boardCheck,boardHi,boardNotice,0);
	}
	
	public void setBoardCheck(String boardcheck) {
		this.boardCheck=boardcheck;
	}
	public String getBoardcheck() {
		return boardCheck;
	}
	public void setBoardHi(String boardHi) {
		this.boardHi=boardHi;
	}
	public String getBoardHi() {
		return boardHi;
	}
	public void setBoardNotice(String boardNotice) {
		this.boardNotice=boardNotice;
	}
	public String getBoardNotice() {
		return boardNotice;
	}
	public void setCount(int count) {
		this.count=count;
	}
	public int getCount() {
		return count;
	}
 }
