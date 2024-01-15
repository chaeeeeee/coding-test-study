import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int N = sc.nextInt();
    	int var[] = new int[N];
    	
    	for (int i = 0; i < N; i++) {
    		var[i] = sc.nextInt();
    	}
    	
    	Arrays.sort(var);
    	System.out.println(var[0]);
    	System.out.println(var[N-1]);
    }  	
} 	