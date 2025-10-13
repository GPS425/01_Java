package edu.kh.project.model.dto;

import java.util.List;

public class Member {
	private String name;
	private int age;
	private String job;
	private String region;
	private char gender;
	private List<String> hobby;
	
	public Member() {}
	
	public Member(String name, int age, String job, String region, char gender, List<String> hobby) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
		this.region = region;
		this.gender = gender;
		this.hobby = hobby;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the job
	 */
	public String getJob() {
		return job;
	}

	/**
	 * @param job the job to set
	 */
	public void setJob(String job) {
		this.job = job;
	}

	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * @return the gender
	 */
	public char getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}

	/**
	 * @return the hobby
	 */
	public List<String> getHobby() {
		return hobby;
	}

	/**
	 * @param hobby the hobby to set
	 */
	public void setHobby(List<String> hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "Solo [name=" + name + ", age=" + age + ", job=" + job + ", region=" + region + ", gender=" + gender
				+ ", hobby=" + hobby + "]";
	}
}
