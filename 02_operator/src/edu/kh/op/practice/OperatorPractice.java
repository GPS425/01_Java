package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int person = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		int avg = candy / person;
		int left = candy % person;
		
		System.out.printf("1인당 사탕 개수 : %d\n남는 사탕 개수 : %d", avg, left);
		
		sc.close();
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(정수만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(정수만) : ");
		int classNum = sc.nextInt();
		
		System.out.print("번호(정수만) : ");
		int ID = sc.nextInt();
		
		System.out.print("성별(남학생/여학생) : ");
		sc.nextLine();
		
		String sex = sc.nextLine();
		//개행문자 제거용(입력버퍼에 남은 개행문자 비우기)
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다."
							, grade, classNum, ID, name, sex, score);
		
		sc.close();
		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		System.out.printf("\n합계 : %d\n평균 : %.1f\n", sum, avg);
		
		//각 과목이 40점 이상이고, 평균 60점 이상이어야 합격
		
		boolean result = kor >= 40 && eng >= 40 && math >= 40 && avg >= 60;
		System.out.println(result ? "합격": "불합격");
		
		sc.close();
	}
	
	
	
}
