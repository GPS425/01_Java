package edu.kh.project.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.kh.project.model.dto.Member;

public class SoloApp {
	
	public void displayMenu() {
		
		Scanner sc = new Scanner(System.in);
		
		private List<Member> members = new ArrayList<>();
		
		
		
		System.out.println("1. 전체 참가자 조회");
		System.out.println("2. 첫인상 투표");
		System.out.println("3. 데이트 신청");
		System.out.println("4. 모든 참가자별 호감도 조회");
		System.out.println("5. 마지막 선택");
		System.out.println("0. 종료");
	}
}
