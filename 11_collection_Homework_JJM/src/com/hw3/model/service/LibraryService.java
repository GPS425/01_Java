package com.hw3.model.service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.hw3.model.dto.Library;

public class LibraryService {

	Scanner sc = new Scanner(System.in);

	private List<Library> books = new ArrayList<>();
	private List<Library> favorite = new ArrayList<>();

	public LibraryService() {
		books.add(new Library("1111", "세이노의 가르침", "세이노", 6480, "데이원"));
		books.add(new Library("2222", "문과남자의 과학공부", "유시민", 15750, "돌베개"));
		books.add(new Library("3333", "역행자", "자청", 17550, "웅진지식하우스"));
		books.add(new Library("4444", "꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들"));
		books.add(new Library("5555", "도둑맞은 집중력", "요한 하리", 16920, "어크로스"));
	}

	public void displayMenu() {

		int menuNum = 0; // 메뉴 선택용 변수

		do {
			try {

				System.out.println("\n========도서 목록 프로그램==========");
				System.out.println("1. 도서 등록");
				System.out.println("2. 도서 조회");
				System.out.println("3. 도서 수정");
				System.out.println("4. 도서 삭제");
				System.out.println("5. 즐겨찾기 추가");
				System.out.println("6. 즐겨찾기 삭제");
				System.out.println("7. 즐겨찾기 조회");
				System.out.println("8. 추천도서 뽑기");
				System.out.println("0. 프로그램 종료");

				System.out.print("메뉴를 입력하세요 : ");
				menuNum = sc.nextInt();
				sc.nextLine();

				switch (menuNum) {
				case 1:
					System.out.println(addBook());
					break;
				case 2:
					System.out.println("\n=========도서 전체 조회=========\n");
					checkBook();
					break;
				case 3:
					System.out.println(updateBook());
					break;
				case 4:
					System.out.println(removeBook());
					break;
				case 5:
					System.out.println(addFavorite());
					break;
				case 6:
					System.out.println(removeFavorite());
					break;
				case 7:
					checkFavorite();
					break;
				case 8:
					System.out.println(recommendBook());
					break;
				case 0:
					System.out.println("프로그램 종료...");
					break;
				default:
					System.out.println("메뉴에 작성된 번호만 입력하세요.");
				}

			} catch (InputMismatchException e) {
				System.out.println("\nError : 잘못된 입력형식입니다. 다시 시도해주세요");
				sc.nextLine();
				menuNum = -1;
			}

		} while (menuNum != 0);
	}

	public String addBook() {

		System.out.println("\n=======도서 등록=======");

		System.out.print("도서 번호 : ");
		String id = sc.next();
		sc.nextLine();

		System.out.print("도서 제목 : ");
		String name = sc.nextLine();

		System.out.print("도서 저자 : ");
		String author = sc.nextLine();

		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();

		System.out.print("도서 출판사 : ");
		String publisher = sc.nextLine();

		if (books.add(new Library(id, name, author, price, publisher))) {
			return "등록 완료";
		} else {
			return "등록 실패";
		}

	}

	public void checkBook() {

		if (books.size() == 0) {
			System.out.println("책이 존재하지 않습니다.");
			return;
		}

		for (Library lib : books) {
			System.out.print(lib.getId());
			System.out.println(lib.toString());
		}
	}

	public String updateBook() {
		System.out.println("\n========도서 수정========\n");
		if (books.isEmpty()) {
			return "책이 없습니다.";
		}

		System.out.print("수정할 도서 번호를 입력하세요 : ");
		String id = sc.next();
		sc.nextLine();

		int index = -1;

		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getId().equals(id)) {
				index = i;
				break;
			}
		}

		if (index == -1) {
			return "일치하는 도서 번호가 없습니다.";
		}

		Library toUpdate = books.get(index);

		int input = -1;
		do {
			System.out.println("1. 도서명");
			System.out.println("2. 도서 저자");
			System.out.println("3. 도서 가격");
			System.out.println("4. 도서 출판사");
			System.out.println("0. 수정 종료");

			System.out.print("어떤 정보를 수정하시겠습니까? : ");

			try {
				input = sc.nextInt();
				sc.nextLine();
			} catch (java.util.InputMismatchException e) {
				System.out.println("\nError: 숫자로만 입력해주세요.");
				sc.nextLine();
				input = -1;
				continue;
			}

			switch (input) {

			case 1:
				System.out.print("수정할 도서명을 입력하세요 : ");
				String name = sc.nextLine();

				toUpdate.setName(name);
				System.out.println("도서명 수정 완료\n");
				break;
			case 2:
				System.out.print("수정할 도서 저자를 입력하세요 : ");
				String author = sc.nextLine();

				toUpdate.setAuthor(author);
				System.out.println("도서 저자 수정 완료\n");
				break;
			case 3:
				System.out.print("수정할 도서 가격을 입력하세요 : ");
				try {
					int price = sc.nextInt();

					toUpdate.setPrice(price);
					System.out.println("도서 가격 수정 완료\n");

				} catch (java.util.InputMismatchException e) {
					System.out.println("\nError: 가격은 숫자로만 입력해야 합니다.");

				} finally {
					sc.nextLine();
				}
				break;
			case 4:
				System.out.print("수정할 도서 출판사를 입력하세요 : ");
				String publisher = sc.nextLine();

				toUpdate.setPublisher(publisher);
				System.out.println("도서 출판사 수정 완료\n");
				break;
			case 0:
				System.out.println("종료합니다...");
				break;
			default:
				System.out.println("잘못된 메뉴 번호입니다.");

			}
		} while (input != 0);

		return "==모든 수정 완료==";
	}
	
	@SuppressWarnings("unused")
	private void showBookList(List<Book> list) {
		
		if(list.isEmpty()) {
			System.out.println("등록된 도서 없음.");
			
		} else {
			for(Book temp : list) {
				System.out.println(temp);
			}
		}
	}

	public String removeBook() {
		System.out.println("\n========도서 삭제========");
		checkBook();

		if (books.isEmpty()) {
			return "삭제할 책이 존재하지 않습니다.";
		}

		System.out.print("삭제할 도서의 번호를 입력하세요 : ");
		String input = sc.next();
		sc.nextLine();

		int index = -1;

		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getId().equals(input)) {
				index = i;
				break;
			}
		}

		if (index == -1) {
			return "일치하는 도서 번호가 없습니다.";
		}

		System.out.print("정말 삭제하시겠습니까? (Y/N) : ");
		char ch = sc.next().toUpperCase().charAt(0);

		if (ch == 'Y') {
			books.remove(index);
			return "삭제가 완료되었습니다.";
		}

		return "삭제를 진행하지 않습니다.";
	}

	public String addFavorite() {
		System.out.println("\n========즐겨찾기 추가========");

		if (books.isEmpty()) {
			return "책이 없습니다.";
		}

		System.out.print("즐겨찾기 할 도서 번호 : ");
		String input = sc.next();
		sc.nextLine();

		int index = -1;

		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getId().equals(input)) {
				index = i;
				break;
			}
		}

		if (index == -1) {
			return "해당 번호의 도서가 존재하지 않습니다.";
		}
		
		Library toAdd = books.get(index);
		
		if(favorite.contains(toAdd)) {
			return toAdd.getId() + "번 도서는 이미 즐겨찾기에 존재합니다.";
		}
		
		if(favorite.add(toAdd)) {
			return toAdd.getId() + "번 도서가 즐겨찾기에 추가 되었습니다.";
		} else {
			return "추가 실패";
		}

	}
	
	public String removeFavorite() {
		System.out.println("\n========즐겨찾기 삭제========");
		
		if (favorite.isEmpty()) {
			return "책이 없습니다.";
		}

		System.out.print("삭제할 도서 번호 : ");
		String input = sc.next();
		sc.nextLine();
		
		Library toRemove = null;
		
		for (Library book : books) {
			if (book.getId().equals(input)) {
				toRemove = book;
				break;
			}
		}

		if (toRemove == null) {
			return "해당 번호의 도서가 존재하지 않습니다.";
		}

		if (favorite.contains(toRemove)) {
			if (favorite.remove(toRemove)) {
				return toRemove.getId() + "번 도서가 삭제 되었습니다." ;
			} else {
				return "즐겨찾기에서 도서를 삭제하는 데 실패했습니다.";
			}
			
		} else {
			return "해당 번호의 도서는 즐겨찾기에 없습니다.";
		}
	}
	
	public void checkFavorite() {

		if (favorite.size() == 0) {
			System.out.println("등록된 도서가 없습니다. 도서를 등록해주세요!");
			return;
		}

		for (Library lib : favorite) {
			System.out.print(lib.getId());
			System.out.println(lib.toString());
		}
	}
	
	public String recommendBook() {
		
		if (books.isEmpty()) {
			return "책이 없습니다.";
		}
		
		Random random = new Random();
		int randomIndex = random.nextInt(books.size());
		Library recommendedBook = books.get(randomIndex);
		return recommendedBook.getName();
	}
	
}