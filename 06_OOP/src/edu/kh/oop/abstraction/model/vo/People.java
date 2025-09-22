package edu.kh.oop.abstraction.model.vo;
//model : 프로그램 로직과 관련되어있는 데이터를 저장하는 용도 + 비즈니스 로직
//vo : Value Object : 값 저장용 객체를 만들기 위한 클래스를 모아두는 패키지

public class People {	//국민(사람) 클래스
	
	// 클래스란? 객체의 특성(속성과 기능)을 정의한 것
	// >> 객체를 만들기 위한 설계도
	
	// 속성 == 값, 데이터
	// 값을 저장하기 위한 변수 선언
	// >> 국민이라면 공통적으로 가지고 있는 속성만 작성(추상화)
	// 이름. 성별, 주민번호, 주소, 전화번호, 나이 등
	// 필드 == 필드 변수 == 멤버 변수
	
	//[접근제한자] 자료형 변수명;
	private String name;	//이름
	private char gender;	//성별
	private String pNo;	//주민등록번호
	private String address; //주소
	private String phone;	//전화번호 "0"으로 시작할 수 있음
	private int age;		//나이
	//double bitcoin >> 모든 국민이 가진 공통점이 아니므로 제거(추상화)
	
	
	// 캡슐화
	// - 데이터(속성)와 기능을 하나로 묶어서 관리하는 기법.
	// - 데이터의 직접적인 접근을 제한하는 것이 원칙이다.
	// >> 직접 접근하지 못하기 때문에 클래스 내부에 간접접근 방법을
	//	  제공하는 기능(메서드)을 작성하여 사용한다
	// >> getter/setter
	
	// 데이터 직접접근 제한
	// public (공공의) >> private (사적인, 개인적인) 변경
	
	
	// 기능 == 행동/동작 == method(메서드)
	public void tax() {
		System.out.println("세금을 낸다");
	}
	
	public void vote() {		//반환되는 것이 없을 때 void
		System.out.println("투표를 한다");
		//return 1; 	>> int형 반환이므로 public int vote()로 변환하면 정상작동
	}
	
	// 캡슐화에서 사용할 간접 접근 기능(getter/setter)
	// [접근제한자] 반환형 메서드명(매개변수) {}
	// name 변수의 값을 호출한 쪽으로 돌려보내주는 간접 접근 기능 중 getter
	
	// void : 반환할 값이 없다(반환형(자료형)이 없다)
	public String getName() {
		return name;
		// name이라는 반환값 있음
		// 반환형 : 반환되는 값의 자료형
		
		// return : 반환, 되돌려주다
		// return만 썼을 때 : 현재 메서드를 종료하고 호출한 쪽으로 되돌아감.
		// return 값/변수; : 현재 메서드를 종료하고 값/변수 가지고 호출한 쪽으로 되돌아감
		
	}
	public void setName(String name) {		//매개변수 자리에 홍길동 받아옴
		this.name = name;
	}
	
	// getter() : 반환형이 무조건 있음
	// getter는 필드에 작성된 변수값을 호출한 쪽을 되돌려주는 것.
	// >> 변수형은 자료형이 있음.
	// >> 그 변수를 되돌려준다면 당연히 반환형도 존재함.
	
	// setter() : 반환형이 없음
	// setter는 전달인자에 작성된 값을 통해 매개변수로 들어온 값을
	// 객체의 필드에 세팅하는 역할.
	// >> 매개변수가 항상 존재함(== 전달인자 값)
	// >> 전달인자에는 자료형이 있음 > 매개변수형도 자료형이 있음
	// >> 매개변수 작성법: (자료형 매개변수형) > 변수 선언과 같은 방식
	// >> 단순히 전달값으로 필드에 값을 세팅하는 역할이기 때문에
	//    호출한 쪽으로 되돌려줄 값은 없음 > 반환형도 없음(void)

	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String getPNo() {
		return pNo;
	}
	
	public void setPNo(String pNo) {
		this.pNo = pNo;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	// alt + s 또는 상단메뉴 Source >> Generate Getters and Setters
	// Select All 누르고 Generate 하면 한번에 위의 내용 전부 완성
}
