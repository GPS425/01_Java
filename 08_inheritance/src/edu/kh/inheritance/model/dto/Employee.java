package edu.kh.inheritance.model.dto;

/*
 * Object
 *    ㄴ Person
 *          ㄴ Employee, Student (두 클래스는 아무런 관계가 없음)
 * */

//final 클래스 : 상속 불가(누군가의 부모 클래스가 될 수 없다)
public /*final*/ class Employee extends Person{
	
	private String company;		//회사명

	public Employee() {}
	
	public Employee(String name, int age, String nationality, String company) {
		super(name, age, nationality);	//Person 매개변수 생성자
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	//Person으로부터 상속받은 메소드 중
	//move() 메소드를 Employee에 맞게 재정의(== 오버라이딩)
	
	//@Override 어노테이션 : 해당 메소드가 오버라이딩되었음을 컴파일러에게 알려줌
	// >> 컴파일러에게 문법체크를 하도록 알린다
	// >> 부모에게 해당 메소드가 있는지 체크
	// >> 이름, 매개변수 타입과 개수, 순서 일치하는 여부 검사
	
	@Override
	public void move() {
		System.out.println("오버라이딩된 move()");
		System.out.println("효율적으로 빨리 일하고 퇴근함");
	}
	
	@Override
	public String toString() {
		return super.toString() + " / " + company;
	}
	
	// final 메소드 >> 오버라이딩 불가
	// - 메소드의 기능이 변하면 안되는 경우
	public final void onlyEmployee() {
		System.out.println("final 메소드입니다");
	}
	
	
	
	
}
