import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int N = sc.nextInt();
    	int var1[] = new int[N];
    	int count = 0;
    	
    	for (int i =0; i < N; i++) {
    		var1[i] = sc.nextInt();
    	}   	
    	
    	int v = sc.nextInt();
    	
    	for (int i =0; i < var1.length; i++) {
    		if (var1[i] == v) {
    			count++;
    		}
    	}
    	
    	System.out.println(count);
    }  	
} 	