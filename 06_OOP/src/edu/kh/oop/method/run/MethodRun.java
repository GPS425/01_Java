package edu.kh.oop.method.run;

import edu.kh.oop.method.model.service.MemberService;

//import edu.kh.oop.method.model.service.MethodExample;

public class MethodRun {

	public static void main(String[] args) {
//		MethodExample me = new MethodExample();
//		me.method1();
		
		MemberService service = new MemberService();
		service.displayMenu();

//		Member member = new Member("user01", "pass01", "홍길동", 20);
//		System.out.println(member);
//		System.out.println(member.toString());
	}
	
}
