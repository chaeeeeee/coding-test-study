import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	boolean[] arr = new boolean[42];
    	int count = 0;
    	
    	for (int i = 0; i < 10; i++) {
    		int num = sc.nextInt();
    		int temp = num % 42;
    		
    		arr[temp] = true;
    		
    	}
    	
    	for (int i = 0; i < arr.length; i++) {
    		if (arr[i] == true) {
    			count++;
    		}
    	}
    	
    	System.out.println(count);
    	
    }
}