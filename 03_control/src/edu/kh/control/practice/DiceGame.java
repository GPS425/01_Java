package edu.kh.control.practice;

import java.util.Scanner;

public class DiceGame {

	Scanner sc = new Scanner(System.in);

	public void ex1() {
		System.out.println("=== 주사위 맞히기 게임 시작 ===");
		System.out.println("1~6 사이 숫자를 맞혀보세요. (종료를 원하면 \"종료\" 입력)");

		int answer = (int) (Math.random() * 6 + 1);
		int count = 0;
		int win = 0;

		while (true) {
			System.out.print("숫자 입력 >> ");
			String input = sc.next();

			if (input.equals("종료")) {
				System.out.println("=== 게임 종료 ===");
				System.out.println("게임을 종료합니다.");
				System.out.printf("총 시도 횟수: %d번\n", count);
				System.out.printf("정답 횟수: %d번\n", win);

				if (count == 0) {
					System.out.print("게임을 플레이하지 않았습니다.");
				} else {
					System.out.println("정답률 : " + (win * 100) / count + "%");
				}
				break;
			}

			int numInput = Integer.parseInt(input);

			if (numInput < 1 || numInput > 6) {
				System.out.println("잘못된 입력입니다. 1~6 사이 숫자를 입력하세요.");
				continue;
			} else if (answer < numInput) {
				System.out.println("틀렸습니다. 더 작은 수를 입력하세요.");
				count++;
			} else if (answer > numInput) {
				System.out.println("틀렸습니다. 더 큰 수를 입력하세요.");
				count++;
			} else {
				System.out.println("정답입니다!");
				win++;
				count++;

				System.out.println("\n새로운 주사위 숫자가 생성되었습니다.");
				answer = (int) (Math.random() * 6 + 1);
			}
		}
	}


	public void ex1_geminiRevised() {
		Scanner sc = new Scanner(System.in);

		System.out.println("=== 주사위 맞히기 게임 시작 ===");
		System.out.println("1~6 사이 숫자를 맞혀보세요. (종료를 원하면 \"종료\" 입력)");

		int answer = (int) (Math.random() * 6 + 1);
		int count = 0;
		int win = 0;

		while (true) {
			System.out.print("숫자 입력 >> ");

			if (sc.hasNextInt()) {
				int numInput = sc.nextInt();

				if (numInput < 1 || numInput > 6) {
					System.out.println("잘못된 입력입니다. 1~6 사이 숫자를 입력하세요.");
					continue;
				}

				count++;

				if (answer < numInput) {
					System.out.println("틀렸습니다. 더 작은 수를 입력하세요.");
				} else if (answer > numInput) {
					System.out.println("틀렸습니다. 더 큰 수를 입력하세요.");
				} else {
					System.out.println("정답입니다!");
					win++;

					System.out.println("\n새로운 주사위 숫자가 생성되었습니다.");
					answer = (int) (Math.random() * 6 + 1);
				}

			} else {
				String input = sc.next();

				if (input.equals("종료")) {
					System.out.println("\n=== 게임 종료 ===");
					System.out.printf("총 시도 횟수: %d번\n", count);
					System.out.printf("정답 횟수: %d번\n", win);

					if (count == 0) {
						System.out.println("게임을 플레이하지 않았습니다.");
					} else {
						System.out.printf("정답률 : %.2f%%\n", (double) win * 100 / count);
					}
					break;
				} else {
					System.out.println("잘못된 입력입니다. 숫자 또는 '종료'를 입력해주세요.");
				}
			}
		}

		sc.close();
	}
}
