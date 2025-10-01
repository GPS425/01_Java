package edu.kh.collection.pack1.model.dto;

public class Student implements Comparable<Student>{
	
	private String name;
	private int age;
	private String region;
	private char gender;
	private int score;
	
	public Student() {}

	public Student(String name, int age, String region, char gender, int score) {
		super();
		this.name = name;
		this.age = age;
		this.region = region;
		this.gender = gender;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", region=" + region + ", gender=" + gender + ", score="
				+ score + "]";
	}

	@Override
	public int compareTo(Student o) {
		// compareTo() : 두 객체를 비교하고 순서를 결정
		// 반환값 : 0(같음), 양수(왼쪽 객체가 더 큼), 음수(왼쪽 객체가 작음)
		
		// 나이를 기준으로 오름차순 정렬 (작 >> 큰)
		return this.age - o.age;
		
		// 나이를 기준으로 내림차순 정렬 (큰 >> 작)
		// return o.age - this.age;
	}
}
