package edu.kh.basic;									// 3레벨 패키지 >> 이후 도메인으로 변환 시 역으로 바뀜(basic.kh.edu)

public class JavaTest {								

	public static void main(String[] args) {			// 메인 메서드(Java 프로그램/애플리케이션을 
														// 실행하기 위해서 반드시 필요한 구문), main > ctrl+space > Enter

		System.out.println("Hello World!");				// main 메서드 안에 작성한 코드를 실행하는 단축키 > ctrl+F11
														// syso > ctrl+space > Enter
														// 복사하고 싶은 줄에 커서 > ctrl + alt + 위/아래 방향키 = 줄 복사
		
		System.out.println("1234");						// 단순 문자열 취급
		System.out.println(1234);						// 숫자/변수 타입 취급
		
		System.out.println("1 + 2");	 				// 출력: 1 + 2(문자열 그대로 출력)
		System.out.println(1 + 2); 						// 출력: 3	  (계산 후 출력)
		
		System.out.println(); 							// 단순 줄바꿈
		System.out.println("배고파요");
		
		System.out.println(50 - 23);					// 뺄셈 연산 -
		System.out.println(2 * 22);						// 곱셈 연산 *
		System.out.println(32 / 4);						// 나눗셈 연산 /
		System.out.println(32 % 3);						// 나머지 연산 %(모듈러 modulo)
		
		System.out.println("14 * 19 = " + 14 * 19); 	// ""(문자열) + 숫자 함께 작성 >> 이어쓰기 기능
		
		System.out.println("90 + 70 + 65 = " + 90 + 70 + 65); 	// 907065 출력값 >> 문자열 + 숫자 + 숫자 + 숫자 >> 문자열 취급
																// Java는 사칙연산의 우선순위를 따라감, ()괄호로 제어 가능
		System.out.println("90 + 70 + 65 = " + (90 + 70 + 65));	// 숫자 계산을 괄호로 묶어서 제어
		
	}
	
}


/*
-----------Java 기본 명명 규칙-----------
대소문자가 구분되어야하고, 길이에 제한이 없다
예약어를 사용해서는 안된다.
숫자로 시작해서는 안된다.
_와 $외의 다른 특수문자는 사용해서는 안된다.
파스칼 표기법 (PascalCase)과 카멜 표기법(camelCase)를 사용한다.
※PascalCase : 모든 단어에서 첫 번째 문자는 대문자, 나머지는 소문자.
※camelCase : 최초로 사용된 단어를 제외한 첫 번째 문자는 대문자, 나머지는 소문자.
반의어는 반드시 대응하는 개념으로 사용해야 한다.

-------------프로젝트 명명 규칙--------------
대/소문자 구분없이 시작 가능
첫 문자를 비롯해 모든 단어는 대문자로 시작하는 것을 권장
 */
//항상 프로그램 실행 전 저장하는 습관 들이기
