package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 나이는 ? : ");
		int age = sc.nextInt();
		
		String result1 = age >= 20 ? "저는 성인 입니다" : "저는 미성년 입니다";
		System.out.println(result1);
		
		System.out.print("청소년 입니까? ");
		boolean result2 = age >= 13 && age <= 19;
		System.out.println(result2);
		
		System.out.print("노인이거나 어린이입니까? ");
		boolean result3 = age >= 65 || age <= 12;
		System.out.println(result3);
		
		sc.close();
		
	}
}
