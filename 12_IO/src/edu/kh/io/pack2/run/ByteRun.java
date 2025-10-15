package edu.kh.io.pack2.run;

import edu.kh.io.pack2.model.service.ByteService;

public class ByteRun {

	public static void main(String[] args) {

		// 불변성의(Immutable) String
		
//		// 1. new 연산자
//		String str1 = new String("Hello");
//		String str2 = new String("Hello");
//		System.out.println(System.identityHashCode(str1));
//		System.out.println(System.identityHashCode(str2));
//		// 동일한 방식으로 new를 이용하여 똑같은 내용을 가진 String 을 생성해도 주소값이 다르다.
//		
//		str1 = str1 + " world";
//		System.out.println(System.identityHashCode(str1)); // 주소 바뀜
//		
//		// 2. 리터럴 표기법
//		String str3 = "Hello";
//		String str4 = "Hello";
//		System.out.println(System.identityHashCode(str3));
//		System.out.println(System.identityHashCode(str4));
//		// String 상수 풀 >> 주소값이 같음
//		
//		str3 = str3 + " world";
//		System.out.println(System.identityHashCode(str3)); // 주소 바뀜
//		
//		
//		// 가변성의(Mutable) StringBuilder , StringBuffer
//		
//		StringBuilder sb = new StringBuilder();
//		System.out.println(System.identityHashCode(sb));
//		sb.append("Hello World!");
//		sb.append("12345");
//		System.out.println(sb);
//		System.out.println(System.identityHashCode(sb)); // 주소 변함 없음
//	
		
		ByteService service = new ByteService();
		//service.fileByteOutput();
		//service.bufferedFileByteOutput();
		//service.fileByteInput();
		//service.bufferedFileByteInput();
		service.fileCopy();
	}
}
