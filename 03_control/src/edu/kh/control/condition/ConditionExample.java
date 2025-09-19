package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample {
	Scanner sc = new Scanner(System.in);	//필드변수
	
	//메서드 (+생성자)
	public void ex1() {
		//if문
		//조건식이 true일때만 내부 코드 수행
		
		//입력받은 정수가 양수인지 검사
		//양수라면 "양수입니다" 출력
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input > 0) {
			System.out.println("양수입니다");
		}
		
		if(input < 0) {
			System.out.println("양수가 아닙니다");
		}
	}
	
	public void ex2() {
		//if - else문
		//조건식 결과가 true면 if 구문,
		//false면 else 구문 수행됨
		
		
		//홀짝 검사
		//입력받은 정수값이
		//홀수이면 "홀수입니다" 출력
		//짝수이면 "짝수입니다" 출력
		//0이면 "0입니다" 출력
		//중첩 if문 사용
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if (input % 2 != 0) {		//홀수라면
			System.out.println("홀수입니다");
			
		} else {	//짝수거나 0인 경우
			
			if(input == 0) {
				System.out.println("0 입니다");
			} else {
				System.out.println("짝수입니다");
			}
			
		}
	}
	
	public void ex3() {
		//if(조건) - else if(조건) - else
		
		//양수, 음수, 0 판별
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input > 0) {
			System.out.println("양수입니다");
		} else if(input < 0 ) {
			System.out.println("음수입니다");
		} else {
			System.out.println("0입니다");
		}
	}
	
	public void ex4() {
		//달(month)을 입력받아 해당 달에 맞는 계절 출력
		//겨울 / 여름에는 온도(temperature) 입력받기
		//1, 2, 12 : 겨울 (-15도 이하 : "겨울 한파 경보" / -12도 이하 : "겨울 한파 주의보")
		//3 ~ 5 : 봄
		//6 ~ 8 : 여름 (35도 이상 : "여름 폭염 경보" / 33도 이상 : "여름 폭염 주의보")
		//9 ~ 11 : 가을
		//1 ~ 12 사이가 아닐 땐 "해당하는 계절이 없습니다" 출력
		
		System.out.print("달 입력 : ");
		int month = sc.nextInt();
		
		String season;
		
		if(month == 1 || month == 2 || month == 12) {
			season = "겨울";
			System.out.print("온도 입력 : ");
			int temperature = sc.nextInt();
			if (temperature <= -15) {
				season += " 한파 경보";
			} else if(temperature > -15 && temperature <= -12 ) {
				season += " 한파 주의보";
			}
			
		} else if(month >= 3 && month <= 5) {
			season = "봄";
			
		} else if(month >= 6 && month <= 8) {
			season = "여름";
			System.out.print("온도 입력 : ");
			int temperature = sc.nextInt();
			if (temperature >= 35) {
				season += " 폭염 경보";
			} else if(temperature >= 33 && temperature < 35) {
				season += " 폭염 주의보";
			} 
			
		} else if(month >= 9 && month <= 11) {
			season = "가을";
			
		} else {
			season = "해당하는 계절이 없습니다";
			
		}
		
		System.out.println(season);
		
	}
	
	public void ex5() {
		//나이를 입력받아
		//13세 이하면 "어린이 입니다"
		//13세 초과 19세 이하면 "청소년 입니다"
		//19세 초과 시 "성인 입니다" 출력
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		if(age <= 13) 	System.out.println("어린이 입니다");
		else if(age <= 19) 	System.out.println("청소년 입니다");
	    else 	System.out.println("성인 입니다");
	}
	
	public void ex6() {
		//점수를 입력받아(100점 만점)
		//90점 이상이면 A
		//80점 이상 90점 미만이면 B
		//70점 이상 80점 미만이면 C
		//60점 이상 70점 미만이면 D
		//60점 미만이면 F
		//0점 미만이나 100점 초과 : "잘못 입력하셨습니다"
		
		//[실행화면]
		//점수 입력 : 60
		//D	
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		String grade;
		
		if(score < 0 || score > 100) grade = "잘못 입력하셨습니다";	//범위에서 벗어난 경우를 먼저 처리
		else if(score >= 90) grade = "A";
		else if (score >= 80) grade = "B";
		else if (score >= 70) grade = "C";
		else if (score >= 60) grade = "D";
		else grade = "F";
		
		System.out.println(grade);
	}
	
	public void ex7() {
		// 놀이기구 탑승 제한 검사
		// 나이가 12세 이상, 키 140.0 이상일 경우에만 "탑승가능"
		// 나이가 12미만인 경우 : "적정 연령이 아닙니다"
		// 키가 140.0 미만 : "적정 키가 아닙니다"
		// 나이가 0세 미만, 100세 초과 시 : "잘못 입력하셨습니다" 
				
		// [실행화면]
		// 나이 입력 : 10
		// 키 입력 : 160
		// 적정 연령이 아닙니다
			
		// 나이 입력 : 15
		// 키 입력 : 110
		// 적정 키가 아닙니다
				
		// 나이 입력 : 15
		// 키 입력 : 160
		// 탑승 가능
				
		// 나이 입력 : 300
		// 잘못 입력하셨습니다
		
		System.out.print("나이 입력 : ");
		String result = "";
		int age = sc.nextInt();
		if (age < 0 || age > 100) {
			System.out.println("잘못 입력하셨습니다");
		} else {
			System.out.print("키 입력 : ");
			double height = sc.nextDouble();
			if (age < 12) {
				result = "적정 연령이 아닙니다";
			} else if (height < 140.0) {
				result = "적정 키가 아닙니다";
			} else {
				result = "탑승 가능";
			}
		}
		System.out.println(result);

		
	}
	
	public void ex8() {
		// 놀이기구 탑승 제한 검사 프로그램
		// 조건 - 나이 : 12세 이상
		// - 키 : 140.0cm 이상
		// 나이를 0~100세 사이로 입력하지 않은 경우 : "나이를 잘못 입력 하셨습니다."
		// 키를 0~250.0cm 사이로 입력하지 않은 경우 : "키를 잘못 입력 하셨습니다."
		// -> 입력이 되자 마자 검사를 진행하여 잘못된 경우 프로그램 종료
		// 나이 O , 키 X : "나이는 적절하나, 키가 적절치 않음";
		// 나이 X , 키 O : "키는 적절하나, 나이는 적절치 않음";
		// 나이 X , 키 X : "나이와 키 모두 적절치 않음";
		// 나이 O , 키 O : "탑승 가능"

		// [실행화면]
		// 나이 입력 : 130
		// 나이를 잘못 입력 하셨습니다

		// 나이 입력 : 30
		// 키 입력 : 300
		// 키를 , 키가 적절치 않음

		// 나이 입절잘못 입력 하셨습니다

		// 나이 입력 : 20
		// 키 입력 : 110
		// 나이는 적절하나하나, 나이가 적절치 않음

		// 나이 입력 : 10
		// 키 입력 : 110
		// 나이와 키 모두 적절치 않음

		// 나이 입력 : 력 : 10
		// 키 입력 : 150
		// 키는 적15
		// 키 입력 : 160
		// 탑승 가능
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		String result = "";
		if (age < 0 || age > 100) {
			result = "나이를 잘못 입력하셨습니다.";
		} else {
			System.out.print("키 입력 : ");
			double height = sc.nextDouble();
			
			boolean isAgeOk = (age >= 12);
			boolean isHeightOk = (height >= 140.0);
			
			if(height < 0.0 || height > 250.0) {
				result = "키를 잘못 입력하셨습니다.";
			} else if (!isAgeOk && !isHeightOk) {
				result = "나이와 키 모두 적절치 않음";
			} else if (isAgeOk && !isHeightOk) {
				result = "나이는 적절하나, 키가 적절치 않음";
			} else if (!isAgeOk && isHeightOk){
				result = "키는 적절하나, 나이가 적절치 않음";
			} else {
				result = "탑승 가능";
			}
		}
		System.out.println(result);
	}
	
	public void ex9() {
		//switch문 
		//여러 case 중 하나를 선택하여 수행하는 조건문
		
		//요일 번호 입력(1 ~ 7) : 3
		// >> 수요일
		
		System.out.print("요일 번호 입력 : ");
		int day = sc.nextInt();
		String result = null;
		switch(day) {
		case 1:
			result = "월요일"; break;
		case 2:
			result = "화요일"; break;
		case 3:
			result = "수요일"; break;
		case 4:
			result = "목요일"; break;
		case 5:
			result = "금요일"; break;
		case 6:
			result = "토요일"; break;
		case 7:
			result = "일요일"; break;
		default:
			result = "입력값이 잘못되었습니다.";
		}
		System.out.println(result);
		
		
		
	}
}
