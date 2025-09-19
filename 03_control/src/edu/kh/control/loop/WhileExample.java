package edu.kh.control.loop;

import java.util.Scanner;

public class WhileExample {
	/* while 문
	 * 
	 * -별도의 초기식, 증감식이 존재하지 않고 
	 *  반복 종료 조건을 자유롭게 설정하는 반복문
	 * 	
	 * 	확실히 얼마만큼 반복한 후에 끝날지는 모르지만
	 *  언젠가 반복조건이 false가 되는 경우 반복을 종료함.
	 * 
	 * */
	
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		int input = -1;
		while(input != 0) {		//input이 0이 아니면 반복, 0이면 멈춘다.
			System.out.println("--------메뉴선택--------");
			System.out.println("1. 떡볶이");
			System.out.println("2. 쫄면");
			System.out.println("3. 김밥");
			System.out.println("0. 종료");
			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt();
			
			switch(input) {
			
			case 1:
				System.out.println("떡볶이를 주문했다"); break;
			case 2:
				System.out.println("쫄면을 주문했다"); break;
			case 3:
				System.out.println("김밥을 주문했다"); break;
			case 0:
				System.out.println("프로그램을 종료합니다"); break;
			default : 
				System.out.println("메뉴에 있는 번호만 선택해주세요");
			}
		}
		
	}
}
	

