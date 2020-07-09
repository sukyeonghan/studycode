package com.collection.model.vo;

import java.util.Arrays;

public class Sports /*implements Comparable<Sports>*/{

	private String type;
	private String name;
	private int player;
	private String[] rule;
	
	public Sports() {
		// TODO Auto-generated constructor stub
	}

	public Sports(String type, String name, int player, String[] rule) {
		super();
		this.type = type;
		this.name = name;
		this.player = player;
		this.rule = rule;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		this.player = player;
	}

	public String[] getRule() {
		return rule;
	}

	public void setRule(String[] rule) {
		this.rule = rule;
	}

	
	@Override
	public String toString() {
		return "Sports [type=" + type + ", name=" + name + ", player=" + player + ", rule=" + Arrays.toString(rule)
				+ "]";
	}
	
	
	@Override public boolean equals(Object o) {
		//String을 equals로 비교할 수 있는 이유 : 스트링이 이퀄스를 오바라이딩해놨음
		if(o instanceof Sports) {
			Sports s =(Sports)o;
			if(this.name.equals(s.name)
				&&this.type.equals(s.type)
				&&this.player==s.player) {
					return true;
				}
		}
		return false;
	}
	
	
//	@Override
//	public int compareTo(Sports s) {
//		//compare 메소드와 마찬가지로 기준값을 가지고
//		//0,양수,음수를 반환
//		
//		//이름을 기준으로 정렬하기
//		
//		//return this.name.compareTo(s.name);
//		//return s.name.compareTo(this.name); //역순-내림차순/매개변수가 앞에
//		
//		//인원수 기준으로 정렬하기
////		if(this.name.compareTo(s.name)==0) { //항목이 중복될 때
////			return this.player-s.player;
////		} else if()
//		return this.player-s.player;
//	}
	
}
