package com.hw1.run;

import com.hw1.model.dto.Book;
import com.hw1.model.dto.Novel;
import com.hw1.model.dto.Poetry;
import com.hw1.model.dto.TextBook;

public class Run {

	public static void main(String[] args) {
		Book b1 = new Novel("해리 포터", "J.K. 롤링", "판타지");
		Book b2 = new TextBook("자바 프로그래밍", "James Gosling", "컴퓨터 과학");
		Book b3 = new Poetry("우리들의 사랑시", "김소월", 30);
		
		b1.displayInfo();
		b2.displayInfo();
		b3.displayInfo();
		
	}

}
