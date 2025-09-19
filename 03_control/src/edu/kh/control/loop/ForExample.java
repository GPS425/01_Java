package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {

	Scanner sc = new Scanner(System.in);

	public void ex1() {
		// 1 ~ 10 까지 콘솔에 출력하기

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	public void ex2() {
		// 영어 알파벳 A부터 Z까지 한 줄로 출력
		// ABCD...XYZ

		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.print((char) i); // 강제 형변환
		}
		System.out.println("\n===================================");

		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
		}
	}

	public void ex3() {
		// 1부터 입력받은 수까지 1씩 증가하며 출력
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		for (int i = 1; i <= input; i++) {
			System.out.println(i);
		}
	}

	public void ex4() {
		// 정수 5개를 입력받은 후 합계 구하기;
		// [실행 결과]
		// 입력 1 : 10
		// 입력 2 : 20
		// 입력 3 : 30
		// 입력 4 : 40
		// 입력 5 : 50
		// 합계 : 150

		int sum = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.printf("입력 %d : ", i);
			int input = sc.nextInt();
			sum += input;
		}

		System.out.println("합계 : " + sum);
	}

	public void ex5() {
		// 1부터 20까지 1씩 증가하면서 출력
		// 단, 입력받은 수의 배수는 양쪽에 () 표시

		// [실행화면]
		// 괄호를 표시할 배수 : 3
		// 1 2 (3) 4 5 (6) 7 8 (9) ... 20

		System.out.print("괄호를 표시할 배수 : ");
		int input = sc.nextInt();

		for (int i = 1; i <= 20; i++) {
			if (i % input == 0) {
				System.out.print("(" + i + ") ");
			} else {
				System.out.print(i + " ");
			}
		}
	}

	public void ex6() {
		// 구구단 출력
		// 2 ~ 9 사이의 수를 하나 입력받아 해당 단을 출력하라
		// 단, 입력받은 수가 2 ~ 9가 아니라면 "잘못 입력하셨습니다." 출력

//		단 입력 : 9
//		9 X 1 = 9
//		9 X 2 = 18
//		9 X 3 = 27
//		9 X 4 = 36
//		9 X 5 = 45
//		9 X 6 = 54
//		9 X 7 = 63
//		9 X 8 = 72
//		9 X 9 = 81

		System.out.print("단 입력 : ");
		int input = sc.nextInt();

		if (input < 2 || input > 9) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			for (int i = 1; i <= 9; i++) {
				System.out.println(input + " X " + i + " = " + (input * i));
			}
		}
	}
	
	public void ex7() {
		//숫자 세기 count
		
		//1부터 20까지 1씩 증가하면서
		//입력받은 수의 배수의 총 개수 출력
		//입력받은 수의 배수의 합계 출력
		
		//배수 입력 : 3
		//3 6 9 12 15 18 : 6개
		//3의 배수 합계 : 63
		
		System.out.print("배수 입력 : ");
		int input = sc.nextInt();
		int count = 0, sum = 0;
		
		String result = "";	//배수를 나열할 문자열 변수
		
		for(int i = 1; i <= 20; i++) {
			
			if(i % input == 0) {
				result += i + " ";
				count++;
				sum += i;
			}
		}
		
		System.out.printf("%s: %d개", result, count);
		System.out.printf("\n%d의 배수 합계 : %d", input, sum);
	}
	
	public void ex8() {
		//구구단 모두 출력하기
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %2d  ", i, j, (i*j));
			}
			System.out.println();
		}
	}
}
