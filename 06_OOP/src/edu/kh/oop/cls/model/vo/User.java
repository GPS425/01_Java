package edu.kh.oop.cls.model.vo;

public class User {
	// 속성 (필드)
	// 아이디, 비밀번호, 이름, 나이, 성별 (추상화 진행)
	// 클래스 외부에서 데이터의 직접 접근 불가 원칙
	// >> 필드 접근제한자 private으로 설정(캡슐화 진행)

	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private char userGender;

	// 기본생성자 자동완성 단축키 : Ctrl + Space + Enter
	// 기본 생성자 (기본 생성자 == 매개변수 없는 생성자)
	public User() {
		//System.out.println("기본 생성자로 User 객체 생성");

		// 필드 초기화
		// 실제로 이렇게 사용하지는 않음
		userId = "user01";
		userPw = "pass01";
		userName = "홍길동";
		userAge = 20;
		userGender = '남';
	}

	// 매개변수 생성자
	// ** 매개변수 : 생성자나 메소드 호출 시 () 안에 작성되어
	// 				 전달되는 값을 저장하고 있는 변수
	public User(String userId, String userPw) {
		
		//필드 초기화
		this.userId = userId;
		this.userPw = userPw;
		// this 참조변수
		// - 객체가 자기 자신을 참조할 수 있도록 하는 변수?
		// 왜 사용하는거임?
		// >> 필드에 있는 변수명과 매개변수의 이름이 같은 경우
		//	  이를 구분하기 위하여 사용한다.
		// this 참조변수가 가지고 있는 값은 현재 자기 자신의 주소값.
		// this.userId >> 자기 자신이 갖고 있는 userId에 매개변수로 들어온 값 할당
		// 필드에 있는 값을 매개변수로 들어온 값으로 초기화한다.
	}
	
	
	// Alt + s > Generate Constructor Using Fields > 만들 거 선택 후 Generate
	// 필드를 전부 초기화하는 목적의 매개변수 생성자
	public User(String userId, String userPw, String userName,
				int userAge, char userGender) {
		

		// 위에 이미 2개를 초기화했으므로 위에 있는 걸 불러오겠음.
		this(userId, userPw);	//이런식으로 불러온다
		// this() 생성자
		// 같은 클래스의 다른 생성자를 호출할 때 사용
		// Why? >> 중복코드 제거, 코드 길이 단축, 재사용성 증가
		// 단점 : 가독성 저하
		// 주의할 점 : 반드시 생성자 내에서 첫 번째 줄에 작성해주기!
//		this.userId = userId;
//		this.userPw = userPw;
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;
	}

	
	
	// 기능 (메소드)
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public char getUserGender() {
		return userGender;
	}

	public void setUserGender(char userGender) {
		this.userGender = userGender;
	}
	
	
	
	// 자바는 기본적으로 필드명, 생성자명, 메소드명, 변수명의 중복을 허용 X
	
	// ** 오버로딩(Overloading) **
	// 클래스 내에 동일한 이름의 메소드(생성자도 포함)를 여러 개 작성하는 기법
	
	// 오버로딩 조건
	// 1) 메소드(생성자)명 동일할 것
	// 2) 매개변수의 개수, 타입(자료형), 순서 중 1개라도 달라야 한다.
	
	public User(String userId, int userAge) {}
	// 매개변수의 개수와 동일한 것은 있지만 하나의 타입이 다르다.
	
	public User(int userAge) {}
	// 매개변수의 갯수가 같은 것은 있으나 타입이 다르다.
	
	public User(int userAge, String userId) {}
	// 매개변수의 개수와 타입이 같은 것은 있지만, 순서가 다르다.
	
//	public User(int age, String name) {}
	// 매개변수의 개수, 타입, 순서 모두 같기 때문에 오류
	// 매개변수의 변수명은 신경쓰지 않기 때문에 오버로딩 불가
	
	/* 생성자(Constructor)
	 * 
	 * - new 연산자를 통해서 객체를 생성할 때
	 * 생성된 객체의 필드값 초기화 + 지정된 기능을 수행하는 역할
	 * 
	 * - 생성자 작성 규칙
	 * 1) 생성자의 이름은 반드시 클래스명과 같아야 한다
	 * 2) 생성자는 반환형이 존재하지 않는다
	 * 
	 * - 생성자 종류
	 * 1) 기본 생성자
	 * 2) 매개변수 생성자
	 * 
	 * *** 생성자가 하나도 없을 때 컴파일러가 기본 생성자 생성 ***
	 * 
	 * */
	

}
