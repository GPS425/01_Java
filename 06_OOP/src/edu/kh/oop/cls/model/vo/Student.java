package edu.kh.oop.cls.model.vo;

public class Student {			//클래스의 선언부
	//[접근제한자] [예약어] class 클래스명 {}  		[]내부는 필요 시 작성
	
	//접근제한자 public : 같은 프로젝트 내에서 어떤 클래스에서든 import 하여 사용 가능
	
	// TestVO testvo = new TestVO();
	// (default) 클래스는 같은 패키지에서만 사용 가능
	
	// 1. 필드(field)
	
	// 필드 접근제한자 예제
	// 필드 접근제한자 뜻 : 직접 접근 가능한 범위를 나타냄
	
	public int v1 = 10;		// 같은 프로젝트 내 전체에서 접근 가능
	protected int v2 = 20;	// 후손 클래스까지 접근 가능
	int v3 = 30;			// 같은 패키지 내까지 접근 가능
	private int v4 = 40;	// 해당 클래스 내부에서만 접근 가능
	//private는 Getter/Setter가 있어야만 사용이 가능함
	
	// static 예약어
	public static String schoolName = "KH고등학교";
	
	// final 예약어
	private final int TEMP1 = 100;

	//getter만 만들어지는 이유 : final 예약어가 붙은 상수 TEMP1은
	//							 재대입이 불가하여 setter를 만들어주지 않음
	public int getTEMP1() {
		return TEMP1;
	}
	

	// 2. 생성자
	//
	
	
	
	// 3. 메서드



	public void ex() {
		// 필드에 접근제한자 확인하기
		// v1 ~ v4까지 전부 Student 클래스 내부에서 생성된 변수이기 때문에
		// v1 ~ v4 전부 직접 접근 가능
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
	}
	
	
}
