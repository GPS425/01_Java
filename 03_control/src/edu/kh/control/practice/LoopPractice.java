package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.
//		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();

		if (input < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for (int i = 1; i <= input; i++) {
				System.out.print(i + " ");
			}
		}

	}

	public void practice2() {
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();

		if (input < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for (int i = input; i >= 1; i--) {
				System.out.print(i + " ");
			}
		}

	}

	public void practice3() {
		// 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.

		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= input; i++) {
			sum += i;

			if (i == input) {
				System.out.print(i);
			} else {
				System.out.print(i + " + ");
			}
		}
		System.out.println(" = " + sum);
	}

	public void practice4() {
//		사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
//		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		System.out.print("첫 번째 숫자 : ");
		int input1 = sc.nextInt();

		System.out.print("두 번째 숫자 : ");
		int input2 = sc.nextInt();

		if (input1 < 1 || input2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else if (input1 < input2) {
			for (int i = 0; input2 - input1 >= i; i++) {
				System.out.print(i + input1 + " ");
			}
		} else {
			for (int j = 0; input1 - input2 >= j; j++) {
				System.out.print(j + input2 + " ");
			}
		}
	}

	public void practice5() {
		// 사용자로부터 입력 받은 숫자의 단을 출력하세요.

		System.out.print("숫자 : ");
		int input = sc.nextInt();
		System.out.printf("===== %d단 =====\n", input);

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", input, i, (input * i));
		}
	}

	public void practice6() {
//		사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
//		단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를 출력하세요.
		System.out.print("숫자 : ");
		int input = sc.nextInt();

		if (input < 2 || input > 9) {
			System.out.println("2 ~ 9 사이 숫자만 입력해주세요.");
		} else {
			for (int i = input; i <= 9; i++) {
				System.out.printf("===== %d단 =====\n", i);

				for (int j = 1; j < 9; j++) {
					System.out.printf("%d X %d = %d", i, j, i * j);
					System.out.println();
				}
			}
		}
	}

	public void practice7() {
//		1부터 사용자에게 입력 받은 수까지 중에서
//		1) 2와 3의 배수를 모두 출력하고
//		2) 2와 3의 공배수의 개수를 출력하세요.

		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		int count = 0;

		for (int i = 1; i <= input; i++) {
			if (i % 6 == 0) {
				System.out.print(i + " ");
				count++;
			} else if (i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\ncount : " + count);
	}
}
