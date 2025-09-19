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
		
		for(int i = 0; i < input; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() {
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++) {
			System.out.print("입력 " + i + " : ");
			int input = sc.nextInt();
			arr[i] = input;
		}
		
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		
		boolean found = false;
		
		for(int x = 0; x < arr.length; x++) {
			if(search == arr[x]) {
				System.out.println("인덱스 : " + x);
				found = true;
				break;
			}
		}
		
		if(!found) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}
	
	public void practice5() {
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		
		char arr[] = new char[input.length()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
		}
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		int count = 0;
		String indexStr = "";
		
		for(int j = 0; j < arr.length; j++) {
			if(ch == (arr[j])) {
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
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int num = sc.nextInt();
			arr[i] = num;
			sum += num;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n총 합 : " + sum);
	}
	
	public void practice7() {	//해결못함
		
		System.out.println("주민등록번호(-포함) : ");
		String input = sc.nextLine();
		
	}
	
	public void practice8() {
		
	}
	
}
