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
		//String�� equals�� ���� �� �ִ� ���� : ��Ʈ���� �������� ���ٶ��̵��س���
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
//		//compare �޼ҵ�� ���������� ���ذ��� ������
//		//0,���,������ ��ȯ
//		
//		//�̸��� �������� �����ϱ�
//		
//		//return this.name.compareTo(s.name);
//		//return s.name.compareTo(this.name); //����-��������/�Ű������� �տ�
//		
//		//�ο��� �������� �����ϱ�
////		if(this.name.compareTo(s.name)==0) { //�׸��� �ߺ��� ��
////			return this.player-s.player;
////		} else if()
//		return this.player-s.player;
//	}
	
}
