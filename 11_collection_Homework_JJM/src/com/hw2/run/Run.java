package com.hw2.run;

import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;
import com.hw2.model.service.Zoo;

public class Run {

	public static void main(String[] args) {
		
		// Zoo 객체 생성
		Zoo z = new Zoo();
		
		// Tiger 객체 생성
		Tiger tiger = new Tiger("호랑이");
		z.addAnimal(tiger);
		
		// Monkey 객체 생성
		Monkey monkey = new Monkey("원숭이");
		z.addAnimal(monkey);
		
		// 호출
		z.displayMenu();
		

	}

}
