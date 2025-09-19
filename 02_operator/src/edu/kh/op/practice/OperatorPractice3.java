package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {
	
	//전역변수로 스캐너 생성하면 더 편함
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가격을 입력 하세요 : ");
		int price = sc.nextInt();
		
		System.out.print("멤버십 있으세요? (있으면 true / 없으면 false 입력) : ");
		boolean membership = sc.nextBoolean();
		// 자바에서는 문자열끼리 비교할 때 == 사용하지 않음
		// equals() 사용
		
		double lastPrice = membership == true ? price * 0.9 : price * 0.95;
		System.out.printf("할인을 포함한 최종금액 : %.1f원", lastPrice);
		
		sc.close();	
	}
	
	public void practice2() {	
		Scanner sc = new Scanner(System.in);
		System.out.print("출금할 금액 입력 : ");
		int money = sc.nextInt();
		
		System.out.print("50000원: ");
		int won50000 = money >= 50000 ? (money / 50000) : 0;
		System.out.println(won50000);
		int left1 = money - (50000 * won50000);
		
		System.out.print("10000원: ");
		int won10000 = left1 >= 10000 ? (left1 / 10000) : 0;
		System.out.println(won10000);
		int left2 = left1 - (10000 * won10000);
		
		System.out.print("5000원: ");
		int won5000 = left2 >= 5000 ? (left2 / 5000) : 0;
		System.out.println(won5000);
		int left3 = left2 - (5000 * won5000);
		
		System.out.print("1000원: ");
		int won1000 = left3 / 1000;
		System.out.println(won1000);
		
		sc.close();
	}
	
	public void practice2_revised() {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("출금할 금액 입력 : ");
	    int money = sc.nextInt(); // money 변수 하나를 계속 재사용

	    // 50000원
	    int won50000 = money / 50000;
	    money %= 50000; // money = money % 50000; 와 같음
	    System.out.println("50000원: " + won50000);

	    // 10000원
	    int won10000 = money / 10000;
	    money %= 10000;
	    System.out.println("10000원: " + won10000);

	    // 5000원
	    int won5000 = money / 5000;
	    money %= 5000;
	    System.out.println("5000원: " + won5000);

	    // 1000원
	    int won1000 = money / 1000;
	    // money %= 1000; // 마지막은 필요 없음
	    System.out.println("1000원: " + won1000);

	    sc.close();
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 수 : ");
		int num2 = sc.nextInt();
		
		String result = num1 % num2 == 0 ? "배수입니다" : "배수가 아닙니다";
		System.out.println(result);
		
		sc.close();
	}
}
