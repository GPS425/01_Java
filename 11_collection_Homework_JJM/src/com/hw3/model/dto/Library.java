package com.hw3.model.dto;

public class Library {
	private String id;
	private String name;
	private String author;
	private int price;
	private String publisher;
	
	public Library() {}

	public Library(String id, String name, String author, int price, String publisher) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	@Override
	public String toString() {
		return "번 도서 : [도서제목 : " + name + " / 도서저자 : " 
				+ author + " / 도서가격 : " + price + "원 / 출판사 : " + publisher + "]";
	}
	
}
