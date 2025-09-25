package edu.kh.oarr.model.service;

import java.util.Scanner;

import edu.kh.oarr.model.vo.Member;

public class MemberService {
	// 속성
	
	Member m = new Member();

	private Scanner sc = new Scanner(System.in);

	// 회원가입한 사람의 정보를 저장해둘 참조변수 생성
	// Member 5칸짜리 객체배열 선언 및 할당
	private Member[] memberArr = new Member[5];

	// 현재 로그인한 회원의 정보를 저장할 참조 변수 선언
	private Member loginMember = null;

	// 기능
	public MemberService() {
		// memberArr 배열 0,1,2 인덱스 초기화
		memberArr[0] = new Member("user01", "pass01", "홍길동", 30, "서울");
		memberArr[1] = new Member("user02", "pass02", "계보린", 25, "경기");
		memberArr[2] = new Member("user03", "pass03", "고길동", 45, "강원");

	}

	// 메뉴 출력용 메서드
	public void displayMenu() {
		int menuNum = 0;

		// 무조건 1회는 수행하도록 do~while 사용
		do {
			System.out.println("======회원 가입 프로그램 v2======");
			System.out.println("1. 회원 가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 검색(지역)");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 입력 : ");
			menuNum = sc.nextInt();

			// 입력 버퍼에 남은 개행문자 제거
			sc.nextLine();

			switch (menuNum) {
			case 1:
				System.out.println(signUp());
				break;
			case 2:
				System.out.println(login());
				break;
			case 3:
				System.out.println(selectMember());
				break;
			case 4:
				int result = updateMember();
				switch(result) {
				case -1:
					System.out.println("로그인 후 이용바람");
					break;
				case 0:
					System.out.println("회원 정보 수정 실패(비밀번호 불일치)");
					break;
				case 1:
					System.out.println("회원 정보가 수정되었습니다! :)"); 
					break;
				}
				break;
			case 5:
				searchRegion();
				break;
			case 0:
				System.out.println("프로그램 종료..");
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 메뉴에 있는 번호만 선택하세요.");
			}

		} while (menuNum != 0); // menuNum이 0이 되면 반복 종료
	}

	// 사이드 메소드 : 메인 기능은 아니나, 다른 메소드에 도움이 되는 메소드
	// memberArr에 비어있는 인덱스 번호를 반환
	// 단, 비어있는 인덱스가 없다면 -1 반환
	public int emptyIndex() {
		for (int i = 0; i < memberArr.length; i++) {
			// 현재 인덱스에 있는 요소가 참조하는 값이 null인 경우의 인덱스 반환

			if (memberArr[i] == null) {
				return i;
				// 현재 메소드를 종료하고 호출한 곳으로 i값을 가지고 되돌아감
			}
		}
		// for 문을 수행했지만 인덱스값이 return되지 않은 경우 해당 위치 코드 수행
		// >> 배열에 빈 칸이 없다.
		return -1;
	}

	public String signUp() {
		System.out.println("\n=======회원 가입======");

		// 객체 배열 memberArr에 새로 가입할 회원 정보를 저장할 예정
		// >> memberArr 배열에 빈자리 있는지 확인
		// >> 빈 자리가 있을 때는 빈 공간에 인덱스 번호를 얻어오기
		// >> 빈 자리가 없다면 -1 반환
		int index = emptyIndex();
		
		if (index == -1) {		//비어있는 공간이 없음 >> 회원 가입 불가
			return "회원 가입이 불가능합니다(인원 수 초과).";
		}
		
		// 회원 가입 가능한 상태일 때
		System.out.print("아이디 : ");
		String memberId = sc.next();
		
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		
		System.out.print("비밀번호 확인 : ");
		String memberPwCheck = sc.next();
		
		System.out.print("이름 : ");
		String memberName = sc.next();
		
		System.out.print("나이 : ");
		int memberAge = sc.nextInt();
		
		System.out.print("지역 : ");
		String memberRegion = sc.next();
		
		//비밀번호와 비밀번호 확인이 일치하면 회원가입 진행, 아니면 회원가입 실패
		if(memberPw.equals(memberPwCheck)) {			//일치하는 경우
			
			// 새로운 멤버 객체 생성, 할당된 주소를 memberArr의 비어있는 인덱스에 대입
			memberArr[index] = new Member(memberId, memberPw, memberName, memberAge, memberRegion);
			return "회원 가입 성공✔✔";			
			
		} else {		//불일치
			return "회원 가입 실패(비밀번호 불일치)";
		}

	}
	
	public String login() {
		System.out.println("\n======로그인======");
		
		// 1) 아이디, 비밀번호 입력받기
		System.out.print("아이디 : ");
		String memberId = sc.next();
		
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		
		// 2) memberArr 배열 내 요소를 순서대로 접근
		for(int i = 0; i < memberArr.length; i++) {
			
			// 2-1) 현재 접근한 요소가 null이 아닌지 확인
			if(memberArr[i] != null) {		//회원의 정보가 있다면
				
				// 2-2) 회원 정보가 있을 경우 회원정보의 아이디, 비밀번호와 입력받은(로그인) 아이디, 비밀번호가 같은지 비교
				if(memberArr[i].getMemberId().equals(memberId) && memberArr[i].getMemberPw().equals(memberPw)) {
					
					// 2-3) 아이디, 비밀번호 같다면 로그인 회원 정보 객체를 참조할 변수 
					// loginMember에 현재 접근중인 memberArr[i] 요소에 저장된 주소를 얕은 복사
					loginMember = memberArr[i];
					break;	// 더 이상 같은 아이디와 비밀번호가 없을 것이라고 예상, 효율을 위해 for문 종료
				}
			}
		}
		
		// 3) 로그인 성공/실패 여부에 따라 결과값 반환
		// 로그인 성공 : 홍길동님 환영합니다.
		// 로그인 실패 : 아이디 또는 비빌번호가 일치하지 않습니다.
		if(loginMember == null) {
			return "아이디 또는 비빌번호가 일치하지 않습니다.";
		} else {
			return loginMember.getMemberName() + "님 환영합니다.";
		}
	}
	
	//회원 검색(지역) 메서드
	public void searchRegion() {
		System.out.println("\n======회원 검색(지역)======");
		System.out.print("검색할 지역을 입력하세요 : ");
		String inputRegion = sc.next();
		
		// 1) memberArr 배열의 모든 요소 순차 접근
		
		boolean flag = true;		//검색 결과 신호용 변수
		for(int i = 0; i < memberArr.length; i++) {
			// 2) memberArr[i] 요소가 null인 경우 반복 종료
			if(memberArr[i] == null) {
				break;
			}
			
			// 3) memberArr[i] 요소가 null이 아닐 때
			// memberArr[i] 요소에 저장된 지역(region)이
			// 입력받은 지역(inputRegion)과 같은 경우
			// memberArr[i] 요소에 저장된 객체의 아이디, 이름 출력
			if(memberArr[i].getRegion().equals(inputRegion)) {
				System.out.printf("아이디 : %s, 이름 : %s", memberArr[i].getMemberId(), memberArr[i].getMemberName());
				flag = false;		// 찾았다는 신호
			}
			
		}
		
		// 4) 입력한 지역과 일치하는 회원이 없다면
		// 일치하는 검색결과가 없습니다! 출력
		if(flag) {
			System.out.println("일치하는 검색결과가 없습니다!");
		}
		
	}
	
	public String selectMember() {
		System.out.println("\n======회원 정보 조회======");
		if(loginMember == null) {
			return "로그인 후 이용바람\n";
		}
		
		String str= "이름 : " + loginMember.getMemberName();
		str += "\n아이디 : " + loginMember.getMemberId();
		str += "\n나이 : " + loginMember.getMemberAge();
		str += "\n지역 : " + loginMember.getRegion();
		
		return str;
		
	}
	
	public int updateMember() {
		System.out.println("\n======회원 정보 수정======");
		if(loginMember == null) {
			return -1;
		}
		System.out.println("수정할 이름 입력 : ");
		String inputName = sc.next();
		
		System.out.println("수정할 나이 입력 : ");
		int inputAge = sc.nextInt();
		
		System.out.println("수정할 지역 입력 : ");
		String inputRegion = sc.next();
		
		System.out.println("비밀번호 입력 : ");
		String inputPw = sc.next();
		
		if(loginMember.getMemberPw().equals(inputPw)) {
			loginMember.setMemberName(inputName);
			loginMember.setMemberAge(inputAge);
			loginMember.setRegion(inputRegion);
			return 1;
		} else {
			return 0;
		}
		
	}
	
	
}
