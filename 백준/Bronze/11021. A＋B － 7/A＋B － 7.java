import java.util.*;

public class Main {
    public static void main(String[] args) {
    	
    	int A, B, T;
    	
    	Scanner sc = new Scanner(System.in);
    	T = sc.nextInt();
    	
    	for (int i = 1; i <= T; i++) {
    		A = sc.nextInt();
    		B = sc.nextInt();
    		System.out.println("Case #" + i + ": " + (A+B));
    	}
    	
    }  	
} 	