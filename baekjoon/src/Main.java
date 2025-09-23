import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a == b && b == c) {
			System.out.println(a * 1000 + 10000);
		} else if(a != b && b != c && c != a) {
			int max = a;
			
			if(max < b) {
				max = b;
			}
			if(max < c) {
				max = c;
			}
			
			System.out.println(max * 100);
		} else {
			int sameNum = 0;
			
			if(a == b || a == c) {
				sameNum = a;
			} else {
				sameNum = b;
			}
			System.out.println(sameNum * 100 + 1000);
		}
		sc.close();
	}
}
