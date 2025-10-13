import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력을 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        
        int length = sc.nextInt();
        
        int num = sc.nextInt();
        
        int[] arr = new int[length];
        for(int i = 0; i < length; i++) {
        	arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i < length; i++) {
        	if(arr[i] < num) {
        		System.out.print(arr[i] + " ");
        	}
        }
        sc.close();
    }
    
    
}