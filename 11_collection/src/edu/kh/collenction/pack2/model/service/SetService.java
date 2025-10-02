package edu.kh.collenction.pack2.model.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import edu.kh.collection.pack2.model.dto.Person;

public class SetService {
	
	/* Set(집합)
	 * - 기본적으로 순서를 유지하지 않음(index 없음)
	 * 
	 * - 중복데이터 저장 X
	 * 
	 * Set 인터페이스의 자식 클래스
	 * 1. HashSet(대표) : 처리 속도가 빠른 Set
	 * 2. LinkedHashSet : 순서를 유지하는 Set
	 * 3. TreeSet : 자동 정렬되는 Set
	 * 
	 * */
	
	public void method1() {
		
		// HashSet 객체 생성
		Set<String> set = new HashSet<>();
		
		// 1. boolean add(E e) : 요소를 추가
		set.add("네이버");
		set.add("카카오");
		set.add("라인");
		set.add("쿠팡");
		set.add("배달의민족");
		set.add("당근마켓");
		set.add("토스");
		set.add("직방");
		set.add("야놀자");
		
		System.out.println(set);
		
		// 중복 저장 확인 -> 중복 저장 안 되는 것 확인
		
		set.add("배달의민족");
		set.add("배달의민족");
		set.add("배달의민족");
		set.add("배달의민족");
		set.add("배달의민족");
		
		System.out.println(set);
		
		// null도 중복 안 되는 것 확인하기
		
		set.add(null);	// TreeSet은 null 저장 지원하지 않음.
		set.add(null);	// (자동정렬을 위해 내부적으로 compareTo() 메서드 이용 시
		set.add(null);	// NullPointerException 발생하기 때문)
		set.add(null);

		System.out.println(set);
		
		// 2. int size() : Set 컬렉션에 저장된 객체의 수 반환
		
		System.out.println("set의 크기 : " + set.size());
		
		// 3. boolean remove( E e ) : 전달받은 인자 e를 Set에서 제거
		// 제거에 성공하면 true, 없으면 false
		System.out.println(set.remove(null));
		
		System.out.println(set);
		System.out.println(set.remove("set"));
		
		// 4. boolean contains(E e)
		// 전달받은 e가 Set에 있으면 true, 없으면 false
		
		System.out.println("쿠팡 있는지 검사 : " + set.contains("쿠팡"));
		System.out.println("삼성 있는지 검사 : " + set.contains("삼성"));
		
		// 5. void clear() : Set에 있는 내용을 모두 삭제
		set.clear();
		
		// 6. boolean isEmpty() : 비어있으면 true, 아니면 false
		System.out.println(set.isEmpty());
		
	}
	
	
	/*
	 * Set에 저장된 요소(객체)를 꺼내는 방법
	 * 
	 * 1. Iterator(반복자) 이용
	 * 2. List 로 변환
	 * 3. 향상된 for문 이용
	 * 
	 * */
	public void method2() {
		Set <String> set = new HashSet<>();
		
		set.add("몽쉘");
		set.add("꼬북칩");
		set.add("쿠크다스");
		set.add("빈츠");
		set.add("포카칩");
		
		// 1. Iterator (반복자)
		// - 컬렉션 개체에 저장된 요소를 하나씩 순차 접근하는 객체
		
		System.out.println("[Iterator 이용 방법]");
		// Iterator set.iterator()
		// - 현재 Set을 순차접근 할 수 있는 Iterator 객체 반환
		
		Iterator<String> it = set.iterator();
		
		// boolean Iterator.hasNext() : 다음 순차접근할 요소가 있으면 true, 없으면 false 반환
		
		while(it.hasNext()) {
			// 다음 요소가 있으면 반복, 없으면 멈춤
			// E Iterator.next() : 다음 요소를 꺼내와서 반환
			String temp = it.next();
			System.out.println(temp);
			
		}
		
		
		System.out.println("-------------------");
		System.out.println("[List로 변환]");
		
		// Set에 저장된 객체를 이용해서 List를 생성
		List<String> list = new ArrayList<>(set);
		// Set >> List로 변환
		
		// 일반 for문
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("------------------------");
		
		System.out.println("[향상된 for문 이용]");
		
		for(String snack : set) {
			System.out.println(snack);
		}
		
		
		
	}
	
	/*
	 * 직접 만든 클래스(Person)를 이용해 만든 객체를
	 * Set에 저장(중복제거 확인)
	 * 
	 * */
	public void method3() {
		
		// ******************************************
		// Hash 라는 단어가 포함된 컬렉션 이용 시
		// hashcode(), equals() 오버라이딩 필수적으로 진행(Person)
		// ******************************************
		
		Person p1 = new Person("홍길동", 25, '남');
		Person p2 = new Person("홍길동", 25, '남');
		Person p3 = new Person("홍길동", 30, '남');
		Person p4 = new Person("김길순", 20, '여');
		
		// Set 객체 생성 후 p1 ~ p4 추가
		Set<Person> personSet = new HashSet<>();
		personSet.add(p1);
		personSet.add(p2);
		personSet.add(p3);
		personSet.add(p4);
		
		for(Person p : personSet) {
			System.out.println(p);
		}
		// - 같은 필드값을 가진객체는 해시코드 번호가 같다!	
		System.out.println("p1 : " + p1.hashCode());
		System.out.println("p2 : " + p2.hashCode());
		System.out.println("p3 : " + p3.hashCode());
		System.out.println("p4 : " + p4.hashCode());
		
		// - A.equals(B) : A와 B가 가지고 있는 필드값이 전부 같으면 true
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
				
	}
	
	
	/**
	 * TreeSet 이용한 로또번호 생성기
	 * >> 기본 오름차순 정렬
	 * 
	 * ** TreeSet 안에 저장되는 객체는 Comparable 인터페이스 상속이 필수다!
	 * >> 컬렉션에 저장될 수 있는 형태는 객체만!
	 * >> int >> Integer 라는 Wrapper 클래스 이용하여 저장해야 한다.
	 * 
	 * TreeSet<Integer>
	 * >> Integer는 Comparable 인터페이스 이미 상속되어있음
	 * >> 바로 사용 가능 ! (자동 정렬됨)
	 * 
	 */
	public void method4() {
		
		// Integer를 저장할 TreeSet 객체 생성
		Set<Integer> lotto = new TreeSet<Integer>();
		
		// 난수 생성
		// 1) Math.random()
		// 2) Random.nextInt(10) : 0 ~ 9 범위 내 정수 반환
		
		// Random 객체 생성
		Random random = new Random();
		
		// lotto에 저장된 값이 6개 미만이면 반복
		// >> 6개면 멈춰야 함.
		
		while(lotto.size() < 6) {
			// 1 ~ 45 사이의 난수 발생
			lotto.add(random.nextInt(45) + 1);
		}
		
		System.out.println(lotto);
		
		// TreeSet을 이용하여 자동 정렬이 되고 Set을 사용하여 중복이 없어짐
	}
	
	
	
	
	
	
	
	
	
}
