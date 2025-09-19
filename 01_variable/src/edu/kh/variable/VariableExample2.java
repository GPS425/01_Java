package edu.kh.variable;

public class VariableExample2 {

	public static void main(String[] args) {
		/* 자바의 기본 자료형 8가지
		 * 논리형 : boolean (1byte)
		 * 정수형 : byte(1byte), short(2byte), int(4byte), long(8byte)
		 * 실수형 : float(4byte), double(8byte)
		 * 문자형 : char(2byte) 
		 * 참조형 - 문자열 String
		 */
		
		// 변수의 선언 : 메모리(RAM)에 값을 저장할 공간을 할당하는 것.
		// 변수 값 대입 : 변수에 값을 집어 넣는 것. (== 초기화)
		
		boolean booleanData;			// 변수의 선언
		// 메모리에 논리값(T/F)을 저장할 공간을 1byte 할당
		// 할당된 공간의 이름을 booleanData로 정한다.
		
		booleanData = true;		//booleanData 변수에 true 논리값 대입.
		// 값을 변수에 최초로 대입 >> 초기화
		
		
		System.out.println("booleanData : " + booleanData);
		
		byte byteData; 			// 변수의 선언
		// 메모리에 정수값을 저장할 공간을 1byte 할당
		// 할당된 공간의 이름을 byteData로 정한다.

		byte byteNumber = 127; 	// 값의 범위(-128 ~ 127)
		// 변수의 선언과 동시에 대입(초기화)

		short shortNumber = 32767; 	// 값의 범위(-32768 ~ 32767)
		
		// 정수 자료형 대표 자료형(int)

		int intNumber = 2147483647;	
		

		// 리터럴 : 변수에 대입되거나 작성되어지는 값 자체.
		// 자료형에 따라 리터럴 표기법이 다름.
		long longNumber = 10000000000L;	//L : long 자료형에서의 리터럴
		// The literal 10000000000 of type int is out of range 
		// = 100억은 int의 범위를 벗어났다 > 리터럴 값 자체를 int로 인식중
		// > 왜? 우리가 int형 리터럴 표기법으로 100억을 나타냈기 때문
		// >> 뒤에 L을 붙여줌으로써 long 자료형인것을 나타낸다.
		

		float floatNumber = 1.2345f;	//f : float 자료형에서의 리터럴
		// 1.2345까지만 쓰면 double 자료형으로 인식하기 때문에
		// 변수 타입인 float 타입과 일치하지 않아 Type mismatch라는 에러 발생
		// >> float의 리터럴 표기인 f를 붙여서 float 자료형값임을 나타냄
		

		double doubleNumber = 3.141592;
		// double이 실수형 중에서 대표이기 때문에 리터럴 표기법이 없는 실수는 double로 인식
		// D/d를 쓸 수는 있다. 하지만 웬만하면 안 씀.
		
		// 문자형(char) 리터럴 표기법 : ''(홑따옴표)
		// >>문자 단 하나
		char ch = 'A';
		char ch2 = 66;
		
		System.out.println("ch : " + ch + "\nch2 : " + ch2);
		
		/* char 자료형에 숫자가 대입될 수 있는 이유
		    -컴퓨터에는 문자표가 존재하고 있음
		     숫자에 따라 지정된 문자 모양이 각각 매핑됨
		     'B' 문자 그대로 대임되면 변수에 숫자 66으로 변환되어 저장
		     >> 반대로 생각하면 변수에 애초에 66이라는 숫자를 저장하는것도 가능함 
		 */
		
		//-------------------------------------
		
		// 변수 명명 규칙
		
		// 1. 대소문자 구분, 길이제한 x

		int abcdefg123456789;
		int Abcdefg123456789;	//두 변수는 다른 변수
		
		// 2. 예약어 사용 X
		// double final;
		
		// 3. 숫자 시작 x (포함은 가능)
		// char 1abc; (불가능)
		char abc1;	//가능

		// 4. 특수문자는 _와 $만 허용 (하지만 쓰지 않는다)
		int $intNum;	// 문제 없음
		int int_Num;	// 통상적으로 자바는 camelCase 사용, _ 사용은 DB에서 사용
						// 자바의 상수에서 사용(PI_VALUE)
		
		// 5. 카멜표기법 (맨 처음 소문자 시작, 후속 단어 첫 글자 대문자)
		char helloWorldAppleBananaTomato;
		
		// 6. 변수명은 언어를 가리지 않음.
		int 한글명변수;	// 가능하지만 통상적으로 사용하지 않음
		
		// ------------------------------------------
		
		final double PI_VALUE = 3.14;
		// PI_VALUE = 2.23;  //상수는 재대입 불가
		
		/* 상수(항상 같은 수)
		 * - 변수의 한 종류
		 * - 한 번 값이 대입되면 다른 값을 대재입 할 수 없음
		 * - 자료형 앞에 final 키워드 작성
		 * - 상수 명명 규칙 : 모두 대문자, 단어 구분 시 _ 사용
		 * 
		 * - 상수를 사용하는 경우
		 * 1) 변하면 안 되는 고정된 값을 저장할 때
		 * 2) 특정한 값에 의미를 부여하는 경우
		 * 
		 */
		
		final int MIN_AGE = 1;
		final int MAX_AGE = 130;
		final int LEFT_MOVE = -1;
		final int RIGHT_MOVE = 1;
		

	}
	
}
