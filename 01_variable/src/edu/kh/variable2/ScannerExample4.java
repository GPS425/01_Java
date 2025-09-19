package edu.kh.variable2;

import java.util.Scanner;

public class ScannerExample4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//nextInt(), nextDouble(), next() 공백은 수집하지 않음
		//>> 위 기능을 사용한 직후 nextLine()을 사용하면 문제가 발생함
		
		System.out.print("nextInt() 입력: ");
		int intNum = sc.nextInt();		//정수값 입력 >> 정수값과 공백문자(Enter)가 입력 버퍼에 들어감
										//nextInt()는 정수값 부분만 수집
										//입력버퍼에는 공백문자가 남은 상태
		
		// 입력버퍼에 남은 개행문자 제거
		sc.nextLine();
		
		System.out.print("nextLine() 입력: ");
		String word = sc.nextLine();		//공백까지 포함(개행 포함)
		
		sc.close();
	}

}
