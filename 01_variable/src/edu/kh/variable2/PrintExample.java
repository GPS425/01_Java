package edu.kh.variable2;

public class PrintExample {

	public static void main(String[] args) {
		//System.out.println(); : 한 줄 출력용 메서드(출력 후 줄바꿈 수행)
		System.out.println("테스트1");
		System.out.println("테스트2");
		
		//System.out.print(); : 단순 출력용 메서드(출력 후 줄바꿈 X)
		System.out.print("테스트3");
		System.out.println(); 	//내용이 없는 println() : 단순 줄바꿈
		System.out.print("테스트4");
		System.out.println();
		
		// 10 + 5 = 15
		int iNum1 = 10;
		int iNum2 = 5;
		System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
		System.out.printf("%d + %d = %d",iNum1, iNum2, (iNum1 + iNum2));

	}

}
