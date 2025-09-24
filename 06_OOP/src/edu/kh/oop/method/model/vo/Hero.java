package edu.kh.oop.method.model.vo;

public class Hero {
	
	private String nickname;
	private String job;
	private int hp;
	private int mp;
	private int level;
	private double exp;
	
	public Hero() {}
	
	public Hero(String nickname, String job, int hp, int mp, int level, double exp) {
		this.nickname = nickname;
		this.job = job;
		this.hp = hp;
		this.mp = mp;
		this.level = level;
		this.exp = exp;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
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

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}
	
	public void attack(double exp) {
		this.exp += exp;
		System.out.printf("'%s'은/는 공격을 했다!!! 현재 경험치 : %.1f\n", nickname, this.exp);

		if(this.exp >= 300.0) {
			level += 1;
			System.out.println("레벨이 올랐습니다!! 현재레벨 : " + level);
		}
	}
	
	public void dash() {
		mp -= 10;
		if(mp < 0) {
			System.out.println("[마력 부족]더 이상 대시 할 수 없어요~!");
			mp = 0;
		} else {
			System.out.printf("'%s'의 엄청 빠른 대시!!! 남은 마력 : %d\n", nickname, mp);
		}
	}
	
	@Override
	public String toString() {
		return "- 현재 레벨 : " + level + "\n현재 hp : " + hp + "\n현재 mp : " + mp + "\n현재 exp : " + exp;
	}
	
	
	
}
