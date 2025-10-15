import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		String OX = null;
		
		for(int i = 0; i < input; i++) {
			OX = sc.next();

			int total = 0;
			int combo = 0;
		
			for(int j = 0; j < OX.length(); j++) {
				char ch = OX.charAt(j);
				
				if(ch == 'O') {
					combo++;
					total += combo;
				} else {
					combo = 0;
				}
			}
			System.out.println(total);
		
		}
		sc.close();
    	
    }
}