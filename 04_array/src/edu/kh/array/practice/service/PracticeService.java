package edu.kh.array.practice.service;

import java.util.*;

public class PracticeService {

	Scanner sc = new Scanner(System.in);

	public void practice1() {
		int[] arr = new int[9];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
			if (i % 2 == 0 || i == 0) {
				sum += arr[i];
			}
		}
		System.out.println("\n짝수 번째 인덱스 합 : " + sum);
	}

	public void practice2() {
		int[] arr = new int[9];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 9 - i;
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 1) {
				sum += arr[i];
			}
		}
		System.out.println("홀수 번째 인덱스 합 : " + sum);
	}

	public void practice3() {
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();

		int[] arr = new int[input];

		for (int i = 0; i < input; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	} 

	public void practice4() {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("입력 " + i + " : ");
			int input = sc.nextInt();
			arr[i] = input;
		}

		System.out.print("검색할 값 : ");
		int search = sc.nextInt();

		boolean found = false;

		for (int x = 0; x < arr.length; x++) {
			if (search == arr[x]) {
				System.out.println("인덱스 : " + x);
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}

	public void practice5() {
		System.out.print("문자열 : ");
		String input = sc.nextLine();

		char arr[] = new char[input.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
		}
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		int count = 0;
		String indexStr = "";

		for (int j = 0; j < arr.length; j++) {
			if (ch == (arr[j])) {
				indexStr += j + " ";
				count++;
			}
		}
		System.out.println(input + "에 " + ch + "가 존재하는 위치(인덱스) : " + indexStr);
		System.out.println(ch + " 개수 : " + count);
	}

	public void practice6() {
		System.out.print("정수 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int num = sc.nextInt();
			arr[i] = num;
			sum += num;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n총 합 : " + sum);
	}

	public void practice7() { // 해결못함

		System.out.print("주민등록번호(-포함) : ");
		String input = sc.next();
		
		char arr[] = new char[input.length()];
		
		for(int i = 0 ; i < arr.length; i++) {
			if(i <= 7) {
				arr[i] = input.charAt(i);
			} else {
				arr[i] = '*';
			}
			System.out.print(arr[i]);
		}

	}

	public void practice8() {

		int middlePoint = 0;

		while (true) {
			System.out.print("정수 : ");
			int input = sc.nextInt();
			if (input % 2 == 0 || input < 3) {
				System.out.println("다시 입력하세요.");
				continue;
			}
			int[] arr = new int[input];
			middlePoint = input / 2;
			int value = 1;

			for (int i = 0; i <= middlePoint; i++) {
				arr[i] = value++;
			}

			for (int i = middlePoint + 1; i < input; i++) {
				arr[i] = --value - 1;
			}

			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + (i == arr.length - 1 ? "" : ", "));

			}
			System.out.println();
		}

	}

	public void practice9() {
		int random = (int) (Math.random() * 10 + 1);

		int arr[] = new int[10];

		System.out.print("발생한 난수 : ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random;
			random = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}

	}

	public void practice10() {
		int random = (int) (Math.random() * 10 + 1);

		int arr[] = new int[10];

		System.out.print("발생한 난수 : ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random;
			random = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");

		}

		int max = arr[0];
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("\n최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

	public void practice11() {
		int[] arr = new int[10];
	    Random rand = new Random();

	    for (int i = 0; i < arr.length; i++) {
	        int random;
	        boolean isDuplicate;
	        do {
	            random = rand.nextInt(10) + 1;
	            isDuplicate = false;
	            for (int j = 0; j < i; j++) {
	                if (arr[j] == random) {
	                    isDuplicate = true;
	                    break;
	                }
	            }
	        } while (isDuplicate);
	        arr[i] = random;
	    }
	    for (int num : arr) {
	        System.out.print(num + " ");
	    }

	}
	
	public void practice12() {
		int[] lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {

			int random = (int)(Math.random() * 45 + 1);
			
			lotto[i] = random;
			
			for(int x = 0; x < i; x++) {

				if(random == lotto[x]) {
				i--;
				break;
				
				}
			}
			lotto[i] = random;
			
		}
		Arrays.sort(lotto);
		for(int random : lotto) {
			System.out.print(random + " ");
		}
	}
	
	public void practice13() {
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		
		int count = 0;
		
		char arr[] = new char[input.length()];
		
		for(int i = 0; i < arr.length; i++) {
			char ch = input.charAt(i);
			boolean isDuplicate = false;
			
			for(int j = 0; j < count; j++) {
				if(arr[j] == ch) {
					isDuplicate = true;
					break;
				}
			}
			
			if(!isDuplicate) {
				arr[count] = ch;
				count++;
			}
				
			}
		
		System.out.print("문자열에 있는 문자 : ");
		for(int i = 0; i < count; i ++) {
			System.out.print(arr[i]);
			if(i < count - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		System.out.println("문자 개수 : " + count);
		
	}
	
	public void practice14(){
		// 첫 번째 배열에 크기를 지정
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine();
		
		String arr[] = new String[size];
		
		// 첫 번째 배열에 저장할 문자열 입력받기
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 문자열 : ");
			arr[i] = sc.nextLine();
		}
		
		// 반복이 시작되는 구간부터 while문 작성, 내부에 종료조건 만들어 break
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.next().charAt(0);
			
			// 값을 더 입력할 경우
			if(ch == 'y' || ch == 'Y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				int addSize = sc.nextInt();
				sc.nextLine();
				
				//새로 값을 입력받을 배열을 다시 생성
				//기존 배열의 크기 + 추가 입력 갯수
				String newArr[] = new String[arr.length + addSize];
				
				//배열의 복사 + 새로운 문자열 입력 받기
				for(int i = 0; i < newArr.length; i++) {
					
					if(i < arr.length) {	//인덱스의 값이 기존 배열보다 작을 경우(깊은 복사)
						newArr[i] = arr[i];
						
					} else {	//인덱스의 값이 기존 배열보다 클 경우(새로운 값 입력)
						System.out.print((i + 1) + "번째 문자열 : ");
						newArr[i] = sc.nextLine();
						
					}
				}
				
				//기존 배열 공간을 참조하던 변수 arr에 새로운 배열 공간의 주소를 가진 newArr 대입(얕은 복사)
				arr = newArr;
			
			} else if(ch == 'n' || ch == 'N'){
				break;
				
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			
			}
		}
		
		// 배열 값 모두 출력
		System.out.println(Arrays.toString(arr));
	}
	
}
