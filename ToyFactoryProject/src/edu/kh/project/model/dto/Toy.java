package edu.kh.project.model.dto;

import java.util.Set;

public class Toy {
	private String name;
	private int age;
	private int price;
	private String color;
	private int manufacture;
	private Set<String> ingredient;
	
	public Toy () {}
	
	public Toy(String name, int age, int price, String color, int manufacture, Set<String> ingredient) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.color = color;
		this.manufacture = manufacture;
		this.ingredient = ingredient;
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
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the manufacture
	 */
	public int getManufacture() {
		return manufacture;
	}

	/**
	 * @param manufacture the manufacture to set
	 */
	public void setManufacture(int manufacture) {
		this.manufacture = manufacture;
	}

	/**
	 * @return the ingredient
	 */
	public Set<String> getIngredient() {
		return ingredient;
	}

	/**
	 * @param ingredient the ingredient to set
	 */
	public void setIngredient(Set<String> ingredient) {
		this.ingredient = ingredient;
	}

	@Override
	public String toString() {
		return ". 이름 : " + name + " / 가격 : " + price + " / 색상 : " + color + 
				" / 사용가능연령 : " + age + " / 제조년월일: " + manufacture + " / 재료 : " + ingredient;
	}
	
	

	
	
}
