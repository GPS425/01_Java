package edu.kh.poly.ex1.model.service;

import edu.kh.poly.ex1.model.dto.Car;
import edu.kh.poly.ex1.model.dto.Spark;
import edu.kh.poly.ex1.model.dto.Tesla;

public class PolyService {

	// 다형성 확인 예제
	public void ex1() {

		// 부모타입 참조변수 = 부모객체주소

		// Car 객체 생성
		Car car = new Car();

		// Tesla 객체 생성
		Tesla tesla = new Tesla();

		// 자식타입 참조변수 = 자식객체주소
		// 여기까지는 당연한 것

		// *********다형성**************

		Car car2 = new Tesla(); // 오류 발생 안함
		// Tesla 객체를 참조하는 변수의 타입이 Car(d부모)이기 때문에
		// Tesla 객체가 Car(부모) 객체로 변화함
		// >> 업 캐스팅

		Car car3 = new Spark(); // 오류 발생 안함
		// Spark 객체를 참조하는 변수의 타입이 Car(부모)이기 때문에
		// Spark 객체가 Car(부모) 객체로 변화함
		// >> 업 캐스팅

		// 1) 자식 객체가 부모 객체로 변하였기 때문에
		// 자식만의 고유한 필드와 메소드를 사용할 수 없음

		// 1-1) car (부모 = 부모)
		car.setEngine("V6 6기통 엔진");
		car.setFuel("휘발유");
		car.setWheel(4);
		// Car 본인의 메소드 모두 사용 가능

		// 1-2) tesla (자식 = 자식)
		tesla.setEngine("전기모터");
		tesla.setFuel("전기");
		tesla.setWheel(4);
		tesla.setBatteryCapacity(1000000);
		// Tesla 부모, 본인의 메소드 모두 사용 가능(일반적인 상속 관계)

		// 1-3) car2 (부모 = 자식(Tesla))
		car2.setEngine("전기모터");
		car2.setFuel("전기");
		car2.setWheel(4);
		// car2.setBatteryCapacity(1000000);
		// The method setBatteryCapacity(int) is undefined for the type Car

		// car3 (부모 = 자식(Spark))
		car3.setEngine("경차엔진");
		car3.setFuel("휘발유");
		car3.setWheel(4);
		// car3.setDiscountOffer(0.5);
		// The method setDiscountOffer(double) is undefined for the type Car

		// >> car2, car3는 부모타입 참조변수(Car)이기 때문에
		// Tesla, Spark와 같은 자식객체의 고유 필드, 메소드가 사용 불가능함
		// 컴파일러가 Car라고 인식하고 있기 때문

		// 2) 다형성을 이용한 객체 배열
		Car[] arr = new Car[3];
		// 각 요소 Car 객체만 들어올 수 있는 객체배열 선언 및 할당

		arr[0] = car; // Car 주소

		arr[1] = car2; // Tesla 주소

		arr[2] = car3; // Spark 주소

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 인덱스의 엔진 : " + arr[i].getEngine());

		}
		// 상속 + 다형성
		// 상속 특징 : Car 상속 클래스는 모두 getEngine() 메소드를 이용할 수 있다
		// 다형성(업캐스팅) : 부모타입 참조변수 arr[i]로 자식 객체를 참조할 수 있다

	}

	// 전달받은 Car 또는 자식객체(Tesla, Spark)의 엔진, 연료, 바퀴개수를 출력
	public void printCar(Car temp) {
		// Car temp = t(Tesla)
		// Car temp = s(Spark)
		// Car temp = c(Car)
		
		// 부모타입 참조변수 = 자식타입객체
		// 다형성의 업캐스팅 모양과 똑같다
		// >> Car와 Spark/Tesla는 상속관계이기 때문에
		// temp라는 Car(부모타입) 매개변수에 Car, Tesla,Spark의 주소가 참조 가능
		
		System.out.println("엔진 : " + temp.getEngine());
		System.out.println("연료 : " + temp.getFuel());
		System.out.println("바퀴 개수 : " + temp.getWheel());
		System.out.println();
		
		
		
	}
	
	// 매개변수로 전달받은 정수값에 따라 Car, Tesla, Spark 중 객체를 만들어 반환하는 메소드
	public Car createCar(int num) {
		
		Car result = null;
		
		switch(num) {
		case 1:
			result = new Car();
			break;
		case 2:
			result = new Tesla();
			break;
		case 3:
			result = new Spark();
			break;
		}
		
		return result;
	}
	
	// 다형성(업캐스팅)을 이용한 매개변수 사용법
	public void ex2() {
		Tesla t = new Tesla("전기모터", "전기", 4, 1000000);

		Spark s = new Spark("경차엔진", "휘발유", 4, 0.5);

		Car c = new Car("경유엔진", "경유", 2);
		
		printCar(t);
		printCar(s);
		printCar(c);
		
		// 다형성을 이용한 반환형 사용법
		// Car[] arr = { new Car(), new Tesla(), new Spark() }
		
		Car[] arr = { createCar(1), createCar(2), createCar(3) };
						//Car	     Car(Tesla)		Car(Spark)
		
		// 객체가 어떤 자료형인지 검사
		// instanceof 연산자 : 객체의 자료형을 검사하는 연산자
		// >> 참조하는 객체가 특정 자료형이거나 상속관계인지 확인
		
		System.out.println(arr[1] instanceof Tesla); 	// true(자기 본인 맞음)
		System.out.println(arr[1] instanceof Spark); 	// false
		// Tesla와 Spark는 같은 부모 Car를 갖고있을 뿐 아무런 관계 아님
		System.out.println( arr[1] instanceof Car); 	// true(상속 관계)
		
		
	}
	
	// 다형성 중 다운캐스팅 확인 예제
	public void ex3() {
		// 다운캐스팅이란?
		// 부모타입 참조변수가 자식객체를 참조하는 기술(업캐스팅)이 적용된 상태에서만 진행가능.
		// 부모타입을 자식타입으로 "강제 형변환" 해서 자식 객체의 본래 필드, 메서드 사용 가능.
		
		Car c1 = new Tesla("전기모터", "전기", 4, 50000);
		// 업캐스팅 상태 (Tesla 자식 >> Car 부모)
		
		System.out.println(((Tesla)c1).getBatteryCapacity());
		// 주의!
		// "." 연산자 (Tesla) 형변환 연산자보다 우선순위가 높음
		// >> 형변환 부분을 우선연산 ()로 묶어두고 나서 . 연산을 진행해야
		// Tesla 객체의 getBatteryCapacity() 를 사용할 수 있음
		
		Tesla t1 = (Tesla)c1;
		System.out.println(t1.getBatteryCapacity());
		// () 연산자를 사용하고 싶지 않으면 새롭게 만들면 됨
	}
	
	// 다운캐스팅 주의사항 확인 예제
	public void ex4() {
		Car c1 = new Tesla();
		// Tesla 객체를 만들어 Car 타입 참조변수 c1에 담음
		// >> 업 캐스팅 상태
		
		// Spark s1 = (Spark)c1;	// c1을 관계없는 Spark로 다운 캐스팅하려고 함
		// 다운캐스팅 잘못 작성해도 컴파일 에러 발생 안함
		// 실행 시 런타임 에러 발생
		
		// 해결 방법 : instanceof와 같이 사용하면 간ㅇ
		
		// 예외 처리
		
		if(c1 instanceof Spark) { 	// c1 이 Spark이거나 상속 관계인가?
			//맞다면
			Spark s1 = (Spark)c1;	// 다운캐스팅
			System.out.println("성공");
			
		} else {	// 아니라면
			System.out.println("실패 : c1은 Spark 타입/상속 관계 아님");
		}
	}
	
	// 바인딩 확인 예제
	public void ex5() {
		// 바인딩
		// 실제 실행할 메소드 코드와 호출하는 코드를 연결시키는 것
		
		Car c1 = new Car("경유엔진", "경유", 8);
		
		System.out.println(c1.toString());
		// String edu.kh.poly.ex1.model.dto.Car.toString()
		// 반환형 출처
		// Car 객체에 있는 toString 메소드 호출
		// 프로그램 실행 전 컴파일러는 toString() 메소드가 Car 클래스에 있는걸로 인식하여
		// c1.toString() 호출코드와 edu.kh.poly.ex1.model.dto.Car.toString() 메서드 선언부 코드를 연결
		// >> 정적 바인딩

		// ** 다형성 적용 시 바인딩 **
		Car c2 = new Spark("경차엔진", "휘발유", 4, 0.5);	// 업캐스팅 >> 부모 부분만 이용 가능 상태
		
		System.out.println(c2.toString()); 
		// String edu.kh.poly.ex1.model.dto.Car.toString()
		// c2가 Car타입이므로 toString() 호출부가 car.toString() 메소드와 연결
		// >> 정적 바인딩
		
		// 실행해보면 자식(Spark)의 toString() 호출되는것을 확인
		// >> 컴파일 시에는 부모(Car)와 바인딩 == 정적 바인딩
		// >> 실생 시에는 Spark에 오버라이딩된 toString()이 우선시되어 Spark 메소드와 바인딩
		// == 동적 바인딩
		
		
		
	}
	

	
	
}
