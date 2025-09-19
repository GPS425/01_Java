//alt + 방향키로 코드 줄단위로 위아래로 움직이기 가능

package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {

//		키보드로 입력 받은 정수가 양수이면서 짝수일 때만 “짝수입니다.”를 출력하고
//		짝수가 아니면 “홀수입니다.“를 출력하세요.
//		양수가 아니면 “양수만 입력해주세요.”를 출력하세요.

		System.out.print("숫자를 한 개 입력하세요 : ");
		String result = null;
		int input = sc.nextInt();
		if (input <= 0) {
			result = "양수만 입력해주세요.";
		} else if (input % 2 == 0) {
			result = "짝수입니다.";
		} else {
			result = "홀수입니다.";
		}

		System.out.println(result);
	}

	public void practice2() {
//		국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
//		합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
//		(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
//
//		합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
//		불합격인 경우에는 “불합격입니다.”를 출력하세요.

		System.out.print("국어점수 : ");
		int kor = sc.nextInt();

		System.out.print("수학점수 : ");
		int math = sc.nextInt();

		System.out.print("영어점수 : ");
		int eng = sc.nextInt();

		int sum = kor + math + eng;
		double avg = sum / 3.0;
		String result = "";

		if (kor < 40 || math < 40 || eng < 40 || avg < 60) {
			result = "불합격입니다.";
		} else {
			System.out.printf("국어 : %d\n수학 : %d\n영어 : %d\n합계 : %d\n평균 : %.1f\n", kor, math, eng, sum, avg);
			result = "축하합니다, 합격입니다!";
		}

		System.out.println(result);
	}

	public void practice3() {
//		1~12 사이의 수를 입력 받아 해당 달의 일수를 출력하세요.(2월 윤달은 생각하지 않습니다.)
//		잘못 입력한 경우 “OO월은 잘못 입력된 달입니다.”를 출력하세요. (switch문 사용)
//		
//		[실행화면 1]
//			1~12 사이의 정수 입력 : 8
//			8월은 31일까지 있습니다.
//			[실행화면 2]
//			1~12 사이의 정수 입력 : 99
//			99월은 잘못 입력된 달입니다.

		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();

		switch (month) {
		case 2:
			System.out.printf("%d월은 28일까지 있습니다.", month);
			break;

		case 4, 6, 9, 11:
			System.out.printf("%d월은 30일까지 있습니다.", month);
			break;

		case 1, 3, 5, 7, 8, 10, 12:
			System.out.printf("%d월은 31일까지 있습니다.", month);
			break;

		default:
			System.out.printf("%d월은 잘못 입력된 달입니다.", month);
		}
	}

	public void practice4() {
//		키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
//		저체중/정상체중/과체중/비만을 출력하세요.
//
//		BMI = 몸무게 / (키(m) * 키(m))
//		BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
//		BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
//		BMI가 30이상일 경우 고도 비만

		System.out.print("키(m)를 입력해주세요 : ");
		double height = sc.nextDouble();

		System.out.print("몸무게(kg)를 입력해주세요 : ");
		double weight = sc.nextDouble();

		String result = null;

		double bmi = weight / (height * height);
		System.out.println("BMI 지수 : " + bmi);

		if (bmi < 18.5) {
			result = "저체중";
		} else if (bmi < 23) {
			result = "정상 체중";
		} else if (bmi < 25) {
			result = "과체중";
		} else if (bmi < 30) {
			result = "비만";
		} else {
			result = "고도 비만";
		}

		System.out.println(result);
	}

	public void practice5() {
//		중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass 또는 Fail을 출력하세요.
//		평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
//		이 때, 출석 횟수는 총 강의 횟수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
//		70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
		
//		[실행 화면 1]
//		중간 고사 점수 : 80
//		기말 고사 점수 : 30
//		과제 점수 : 60
//		출석 횟수 : 18
//		================= 결과 =================
//		중간 고사 점수(20) : 16.0
//		기말 고사 점수(30) : 9.0
//		과제 점수		 (30) : 18.0
//		출석 점수 		 (20) : 18.0
//		총점 : 61.0
//		Fail [점수 미달]
		
		System.out.print("중간 고사 점수 : ");
		double midScore = sc.nextDouble();
		
		System.out.print("기말 고사 점수 : ");
		double finalScore = sc.nextDouble();
		
		System.out.print("과제 점수 : ");
		double subjScore = sc.nextDouble();
		
		System.out.print("출석 횟수 : ");
		double attScore = sc.nextDouble();
		
		double sumScore = (midScore * 0.2) + (finalScore * 0.3) + (subjScore * 0.3) + (attScore);
		
		System.out.println("================= 결과 =================");
		if (attScore <= 20 * 0.7) {
			System.out.printf("Fail [출석 횟수 부족 (%.0f/20)", attScore);
		} else {
			System.out.printf("중간 고사 점수(20) : %.1f\n", midScore);
			System.out.printf("기말 고사 점수(30) : %.1f\n", finalScore);
			System.out.printf("과제 점수\t(30) : %.1f\n", subjScore);
			System.out.printf("출석 점수\t(20) : %.1f\n", attScore);
			System.out.printf("총점 : %.1f\n", sumScore);
			
			if(sumScore >= 70) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail [점수 미달]");
			}
			
		}
		
		
		
	}

}
