package com.subio.model.vo;

public class Character {
	
	private String name;
	private int level;
	private String job;
	private int hp;
	private int mp;
	private int exp;
	private long money;
	//private Item[] items; has a 관계로 할 수 있다/캐릭터가 아이템을 가지고 있다
	
	public Character() {
		// TODO Auto-generated constructor stub
	}

	public Character(String name, int level, String job, int hp, int mp, int exp, long money) {
		super();
		this.name = name;
		this.level = level;
		this.job = job;
		this.hp = hp;
		this.mp = mp;
		this.exp = exp;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public long getMoney() {
		return money;
	}

	public void setMoney(long money) {
		this.money = money;
	}
	
	
}
