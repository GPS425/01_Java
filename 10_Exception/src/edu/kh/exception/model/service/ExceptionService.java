package edu.kh.exception.model.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionService {
	
	// 예외(Exception) : 소스코드의 수정으로 해결 가능한 오류
	
	// 예외는 두 종류로 구분됨
	// 1. Unchecked Exception : 선택적으로 예외 처리(RuntimeException 등...)
	// 2. Checked Exception : 필수적으로 예외 처리(IOException 등...)
	
	private Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		// 두 정수를 입력받아 나누기한 몫을 출력
		
		System.out.print("정수 1 입력 : ");
		int input1 = sc.nextInt();	// 정수를 입력하지 않았을 때 예외 java.util.InputMismatchException
		
		System.out.print("정수 2 입력 : ");
		int input2 = sc.nextInt();	// 나누는 수를 0으로 입력했을 때 예외 java.lang.ArithmeticException: / by zero
		
//		if(input2 != 0) {
//			System.out.println("결과 : " + (input1 / input2));
//			
//		} else {
//			System.out.println("0으로 나눌 수 없음.");
//		}
		
		// ---------------------------------------------------------
		
		try {
			//예외가 발생할 것 같은 코드
			System.out.println("결과 : " + (input1 / input2));
			// 산술적 예외 발생 우려 : input2에 0이 들어왔을때
			// ArithmeticException
			
		} catch (ArithmeticException e) {
			// try에서 던져진 예외를 catch문의 매개변수 e로 잡음.
			// e를 사용하여 예외 추적 코드를 작성할 수도 있음.
			// >> 이 예외를 어떻게 해결할 지 작성하는 구문
			System.out.println("0으로 나눌 수 없음.");
			e.printStackTrace();		// 발생한 예외에 대한 메서드와 그 위치에 대한 모든 내용을 출력
										// 예외 발생 지점 추적 메서드
		}
		
		// 발생하는 예외 중 일부 예외 try - catch 사용 안해도
		// if - else 로 예외 상황 방지 가능
		// 일부 예외 == 대부분 UncheckedException
	}
	
	public void ex2() {
		// 여러가지 예외에 대한 처리 방법
		
		try {
			
			System.out.print("정수 1 입력 : ");
			int input1 = sc.nextInt();	// InputMismatchException 가능성

			System.out.print("정수 2 입력 : ");
			int input2 = sc.nextInt();	// InputMismatchException가능성
			
			System.out.println("결과 : " + input1 / input2);
			// ArithmeticException 가능성 
			
			String str = null;
			System.out.println( str.charAt(0));
			// NullPointerException 가능성
			
		} catch (InputMismatchException e) {
			System.out.println("타입에 맞는 값만 입력하세요.");
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			
		} catch (NullPointerException e) {
			System.out.println("아무튼 안됩니다.");
			
		} catch (RuntimeException e) {
			System.out.println("으에에");
			// Exception간의 상속 관계 고려해야 한다.
			// 코드는 위에서 아래 순서로 흘러가기 때문에 부모 클래스가 위에 있으면 자식의 에러들을 모두 잡아버림
			// RuntimeException 위에는 Exception만 존재하기 때문에 아래의 catch에는 Exception만 가능함.
			
		} catch (Exception e) {
			System.out.println("응애");
			// 다형성 = 업캐스팅 : 부모 타입 참조변수로 자식 객체 참조
			// >> 상위 타입의 예외 클래스를 catch문에 작성하면
			// 다형성 업캐스팅에 의해 모든 후손 예외 클래스를 잡아서 한 번에 처리 가능
			
			e.printStackTrace();
		}
	}
	
	public void ex3() {
		try {
			System.out.print("정수 1 입력 : ");
			int input1 = sc.nextInt();
			
			System.out.print("정수 2 입력 : ");
			int input2 = sc.nextInt();
			
			System.out.println("결과 : " + input1 / input2);
			
		} catch (Exception e) {
			
			//매개변수 e : 예외 관련된 정보 + 예외 관련 기능
			System.out.println(e.getClass());
			// class java.lang.Ari...
			
			System.out.println(e.getMessage());
			// 예외 발생 시 출력된 내용
			
			System.out.println(e);	//e.toString()
			
			e.printStackTrace();	//상세한 예외 추적 메서드
		} finally {
			System.out.println("무조건 수행됨");
		}
		
		// try-with-resources : finally에서 일일이 close() 호출하지 않아도
		// 자동으로 사용하는 리소스들을 닫아주는 방식
		
		sc.nextLine();
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.println(name);
			
		} catch (Exception e){
			System.out.println("예외 발생 : " + e.getMessage());
		}
	}
	
	public void ex4(){
		
		try {
			methodA();
		} catch (Exception e) {
			System.out.println("methodC에서부터 발생한 예외를 ex4에서 잡아 처리함");
			e.printStackTrace();
		}
		
	}
	
	public void methodA() throws Exception{
		methodB();
	}
	
	public void methodB() throws IOException{	//부모의 예외는 처리 가능
		methodC();
	}
	
	public void methodC() throws FileNotFoundException {	//예외 집어던짐
		throw new FileNotFoundException();
		// throw : 예외 강제발생 구문
	}
	
	public void ex5() throws UserException {
		// 어떠한 상황이 발생햇음...
		// 이 상황에 맞춰 특별한 예외를 발생하고 싶음...
		// 근데 자바가 미리 만들어둔 예외 클래스 중 마땅한 게 업슴...
		// >> 사용자가 원하는 모양새의 예외 클래스를 만들어 사용할 수 있다
		// UserException 사용하여 강제 예외 발생

		throw new UserException("내가 만든 쿠키");
	}


}
