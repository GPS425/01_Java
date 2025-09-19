package edu.kh.control.practice;

import java.util.Scanner;

public class ATMSimulator {

	Scanner sc = new Scanner(System.in);

	public void ex1() {
//		문제 설명
//		여러분은 은행의 간단한 ATM 기계를 자바 콘솔 프로그램으로 구현하는 팀 프로젝트를 맡았습니다.
//		사용자는 프로그램 실행 후 메뉴를 보고 원하는 기능을 선택할 수 있어야 합니다.
//		메뉴는 다음과 같습니다:
//		1. 입금하기
//		2. 출금하기
//		3. 잔액 조회하기
//		4. 프로그램 종료
//		사용자는 숫자로 메뉴를 선택하며, 각 메뉴에 맞는 동작을 수행해야 합니다.
//		출금 시 잔액이 부족하면 경고 메시지를 출력해야 하고, 반복문을 통해 사용자가 종료(4번)를 누를 때까지 계속 실행됩니다.
//		요구사항
//		1. 변수를 사용하여 초기 잔액(예: 10,000원)을 저장한다.
//		2. 조건문(if, switch 등)을 활용하여 사용자가 선택한 메뉴에 따라 다른 기능이 실행되도록 한다.
//		3. 연산자를 활용해 입금/출금 시 잔액을 계산한다.
//		4. 반복문을 활용하여 사용자가 4번(종료)을 선택할 때까지 프로그램이 반복 실행되도록 한다.
//		5. 예외 처리 로직: 출금 금액이 잔액보다 많으면 "잔액 부족!" 메시지를 출력하고 잔액은 변하지 않는다.
//		6. 각 기능이 실행될 때마다 "현재 잔액: xxxx원" 을 출력한다.

		int money = 10000;
		System.out.println("=== ATM 프로그램 시작 ===");
		System.out.println("현재 잔액 : " + money + "원\n");

		int num = 0;
		while (num != 4) {
			System.out.println("메뉴를 선택하세요: ");
			System.out.println("1. 입금하기");
			System.out.println("2. 출금하기");
			System.out.println("3. 잔액조회");
			System.out.println("4. 종료");
			System.out.print(">> ");

			num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.print("\n입금할 금액을 입력하세요 : ");
				int input = sc.nextInt();
				money += input;
				System.out.println("입금 완료! 현재 잔액 : " + money + "원\n");
				break;
			case 2:
				System.out.print("\n출금할 금액을 입력하세요 : ");
				int output = sc.nextInt();
				if (money < output) {
					System.out.println("잔액 부족! 현재 잔액은 " + money + "원입니다.\n");
					continue;
				} else {
					money -= output;
					System.out.println("출금 완료! 현재 잔액: " + money + "원\n");
				}
				break;
			case 3:
				System.out.println("현재 잔액은 " + money + "원입니다.\n");
				break;
			case 4:
				System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다!");
				break;
			default:
				System.out.println("잘못된 입력입니다. 1~4번 중에서 선택하세요.\n");
			}
		}
	}
}
