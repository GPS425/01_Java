package com.hw1.run;

import com.hw1.model.vo.Student;
import java.util.Scanner;
import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Student[] stdArr = new Student[3];

		stdArr[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		stdArr[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		stdArr[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

		/*
		 * 향상된 for문 
		 * 
		 * 자바에서 배열, 컬렉션과 같은 데이터를 순차적으로 간단하게 반복할 수 있는 구조 제공
		 * 일반적인 for문보다 코드가 더 간결하고 가독성이 좋아서
		 * 반복 작업을 더 쉽게 작성할 수 있다.
		 * 
		 * for(자료형 변수명 : 배열 또는 컬렉션) {
		 * 		반복해서 실행할 코드 작성
		 * }
		 */
		
		for(Student std : stdArr) {
			System.out.print(std.information());			
		}

		System.out.println("===================================================================================");

		Employee[] empArr = new Employee[10];
		int count = 0;

		while (true) {
			
			System.out.print("이름 : ");
			String name = sc.next();

			System.out.print("나이 : ");
			int age = sc.nextInt();

			System.out.print("신장 : ");
			double height = sc.nextDouble();

			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();

			System.out.print("급여 : ");
			int salary = sc.nextInt();

			System.out.print("부서 : ");
			String dept = sc.next();

			empArr[count] = new Employee(name, age, height, weight, salary, dept);
			count++;

			if (count == 10) {
				System.out.println("사원 정보를 더 추가할 수 없습니다.");
				break;
			}
			
			System.out.print("계속 추가하시겠습니까? (y/n) : ");
			String str = sc.next().toUpperCase();		// String.toUpperCase() : 문자열을 대문자로 치환
														// String.toLowerCase() : 문자열을 소문자로 치환
			
			// 추가) equalsIgnoreCase() : 대소문자를 구분하지 않고 두 문자열이 같은지 비교
			if (str.equals("N")) {
				break;
			}
		}
		System.out.println("========== 기록된 사원 정보 ==========");
		for (int i = 0; i < count; i++) {
			System.out.println(empArr[i].information());
		}

		sc.close();

	}

}
