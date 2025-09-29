package edu.kh.poly.ex2.model.service;

import edu.kh.poly.ex2.model.vo.Animal;
import edu.kh.poly.ex2.model.vo.Fish;
import edu.kh.poly.ex2.model.vo.Person;

public class AbstractService {
	
	public void ex1() {
		// Animal 객체 생성
		
		//Animal a1 = new Animal();
		// >> 객체화할 수 없는 클래스
		// 하지만 부모타입 참조변수로서의 역할은 가능하기 때문에
		// Animal을 상속받아 미완성 부분을 구체적으로 구현한 자식 클래스를 이용하여 객체 생성 가능
		
		// 다형성 업캐스팅
		Animal a1 = new Person("인간", "잡식", "홍길동");
		
		Animal a2 = new Fish("어류", "잡식");
		
		a1.breath();
		a1.move();
		a1.eat();
		System.out.println(a1.toString());
		
		System.out.println("==================================");
		
		a2.breath();
		a2.move();
		a2.eat();
		System.out.println(a2.toString());
	}
}
