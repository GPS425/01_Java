package edu.kh.project.model.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import edu.kh.project.model.dto.Toy;

public class ToyFactory {
	
	Scanner sc = new Scanner(System.in);
	
	private List<Toy> toys = new ArrayList<>();
	
	private Map<Integer, String> ingredients = new LinkedHashMap<>();
	
	public Set<String> addIngredient(Integer... keys) {
		Set<String> materialSet = new LinkedHashSet<>();
		for (Integer key : keys) {
			materialSet.add(ingredients.get(key));
		}
		return materialSet;
	}

	public ToyFactory() {
		ingredients.put(1, "면직물");
		ingredients.put(2, "플라스틱");
		ingredients.put(3, "유리");
		ingredients.put(4, "고무");
		
		toys.add(new Toy("마미롱레그", 8, 36000, "분홍색", 19950805, addIngredient(1, 4)));
		toys.add(new Toy("허기워기", 5, 12000, "파란색", 19940312, addIngredient(1, 2)));
		toys.add(new Toy("키시미시", 5, 15000, "분홍색", 19940505, addIngredient(1, 2)));
		toys.add(new Toy("캣냅", 8, 27000, "보라색", 19960128, addIngredient(1, 2)));
		toys.add(new Toy("파피", 12, 57000, "빨간색", 19931225, addIngredient(1, 2, 4)));
	}
	
	
	
	
	public void displayMenu() {

		int menuNum = 0; 

		do {
			try {

				System.out.println("\n<<플레이타임 공장>>");
				System.out.println("1. 전체 장난감 조회하기");
				System.out.println("2. 새로운 장난감 만들기");
				System.out.println("3. 장난감 삭제하기");
				System.out.println("4. 장난감 제조일 순으로 조회하기");
				System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
				System.out.println("6. 재료 추가");
				System.out.println("7. 재료 제거");
				System.out.println("0. 프로그램 종료");

				System.out.print("선택 : ");
				menuNum = sc.nextInt();
				sc.nextLine();

				switch (menuNum) {
				case 1:
					selectToy();
					break;
				case 2:
					System.out.println(makeToy());
					break;
				case 3:
					System.out.println(removeToy());
					break;
				case 4:
					// sortToyByDate();
					break;
				case 5:
					// toyByAge();
					break;
				case 6:
					// addIngredient();
					break;
				case 7:
					// removeIngredient();
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
	
	public void selectToy() {
		
		System.out.println("\n<전체 장난감 목록>");
		
		if(toys.size() == 0) {
			System.out.println("장난감이 없습니다.");
			return;
		}
		
		int index = 0;
		for(Toy toy : toys) {
			System.out.print(++index);
			System.out.println(toy.toString());
		}
		
	}
	
	public String makeToy() {
		
		System.out.println("\n<새로운 장난감 추가>");
		
		System.out.print("장난감 이름 : ");
		String name = sc.nextLine();
		
		System.out.print("사용 가능 연령 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("색상 : ");
		String color = sc.nextLine();
		
		System.out.print("제조일 : (YYYYMMDD 형식으로 입력) : ");
		int manufacture = sc.nextInt();
		sc.nextLine();
		
		Set<String> selectedIngredients = new HashSet<>();
		 while(true) {
		        System.out.print("재료를 입력하세요(종료하려면 'q'를 입력하세요): ");
		        String input = sc.nextLine();
		        
		        if(input.equals("q")) {
		            break;
		        }
		        
		        if(ingredients.containsValue(input)) {
		            selectedIngredients.add(input);
		        } else {
		            System.out.println("목록에 없는 재료입니다. 다시 입력해주세요.");
		        }
		    } 

		    if(toys.add(new Toy(name, age, price, color, manufacture, selectedIngredients))) {
		        return "새로운 장난감이 추가되었습니다.";
		    } else {
		        return "장난감 추가에 실패했습니다.";
		    }
	}
	
	public String removeToy() {
		if(toys.isEmpty()) {
			return "장난감이 없습니다.";
		}
		
		System.out.print("삭제할 장난감의 이름을 입력하세요: ");
		String input = sc.nextLine();
		
		int index = -1;
		for(int i = 0; i < toys.size(); i++) {
			if(toys.get(i).getName().equals(input)) {
				index = i;
				break;
			}
		}
		
		if(index == -1) {
			return "해당 장난감이 없습니다.";
		}
		
		toys.remove(index);
		return "장난감이 삭제되었습니다.";
	}
}
