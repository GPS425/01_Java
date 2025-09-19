package edu.kh.op.ex;

import java.util.Scanner;

//예제 코드 작성용 클래스(기능용/메서드용)
public class OpExample {
	
//	//기능들만 나열 >> 메서드들만 모아둔 곳
//	public void ex1() {
//		System.out.println("안녕!");
//	}
//	
//	public void ex2() {
//		System.out.println("배고파요");
//	}
	
	public void testEx1() {
		
		//증감연산자(증가, 감소) : ++ , --
		//1을 더하거나 감소시키는 연산자
		int iNum1 = 10;
		int iNum2 = 10;
		
		iNum1++;
		iNum2--;
		
		System.out.println("iNum1 : " + iNum1);
		System.out.println("iNum2 : " + iNum2);
		
		//전위 연산 (먼저 연산)
		int temp1 = 5;
		System.out.println(++temp1 + 5);
		
		//후위 연산 (나중에 연산)
		int temp2 = 3;
		System.out.println(temp2-- + 2);
		//3-- + 2 = 5
		//>>3-- > 2
		
		System.out.println(temp2);
		
		int a = 3;
		int b = 5;
		int c = a++ + --b;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//a = 4, b = 4, c = 7
		
		
	}
	
	public void testEx2() {
		
		//비교 연산자 :  >, <, >=, <=, ==, !=
		// - 비교 연산자의 결과는 항상 논리값(true/false)
		
		int a = 10;
		int b = 20;
		System.out.println((a == b) == false);	//(false) == false >> true
		
		int c = 4;
		int d = 5;
		
		System.out.println((++c != d) == (--c != d));
		//(5 != 5) == (4 != 5) >> false == true >> false
		
		System.out.println(100 > 99); 	//true
		System.out.println(100 >= 100);	//true
		System.out.println(99 < 64);	//false
		System.out.println(99 <= 100);	//true
		
	}
	
	public void testEx3() {
		//논리 연산자 : &&(AND), ||(OR)
		//&&(AND) : ~와, 그리고, ~면서, ~부터 ~까지, ~사이
		//			둘 다 true 면 true, 나머지 경우 false
		
		int a = 101;
		//a는 100 이상이면서 짝수인가?
		System.out.println((a >= 100) && (a % 2 == 0));
		
		int b = 5;
		// b는 1부터 10까지의 숫자범위에 포함되어 있는가?
		// >> b는 1보다 크거나 같으면서 10보다 작거나 같은가?
		System.out.println((b >= 1) && (b <= 10));
		
		// ||(OR) : 둘 다 false면 false, 나머지 경우 true
		// 또는, 혹은, ~거나
		
		int c = 10;
		// c는 10을 초과하거나 짝수인가?
		System.out.println((c > 10) || (c % 2 == 0));
		// false || true >> true
		
	}
	
	public void testEx4() {
		// 삼항 연산자 : 조건식 ? true일 때 수행될 값 : false일 때 수행될 값
		// 조건식: 연산결과가 true/false인 식
		
		int num = 30;
		// num이 30보다 크면 "num은 30보다 큰 수이다"
		// 아니라면 "num은 30 이하의 수이다" 출력하라.
		
		String result = num > 30 ? "num은 30보다 큰 수이다" 
								 : "num은 30 이하의 수이다";
		System.out.println(result);
	}
	
	public void testEx5() {
		//----------------------
		//입력받은 정수가 음수인지 양수인지 구분하라
		//단, 0은 양수로 처리
		
		//ex)
		//정수 입력 : 4(키보드로 입력)
		//양수입니다.
		//-----------------------
		//정수 입력 : -5
		//음수입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		String result = num >= 0 ? "양수 입니다." : "음수 입니다.";
		System.out.println(result);
		
		sc.close();
	}
	
	public void testEx6() {
		//복합 대입연산자
		//+=, -=, *=, /=, %=
		
		int a = 10;
		a += 10;	//a = a + 10		
		System.out.println(a);	//20
		
		int b = 20;
		b -= 10;	//b = b - 10
		System.out.println(b);	//10
		
		//부정 연산자 : !논리값
		//논리값을 반대로 적용하는 것
		
		System.out.println(!true);			//false
		System.out.println(!(10 != 10));	//true
		
		// 비트 단위 부정연산자(NOT) : ~
		int c = 5;
		System.out.println(~c);		//-6, 이런 것도 있다. 존재한다는 걸 알기만 해두자.
	}
}


