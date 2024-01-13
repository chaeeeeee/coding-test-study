import java.util.*;

public class Main {
    public static void main(String[] args) {
    	int N, result;
    	
    	Scanner sc = new Scanner(System.in);
    	N = sc.nextInt();
    	
    	for (int i = 1; i < 10; i++) {
    		result = N * i ;
    		System.out.println(N + " * " + i + " = " + result);
    	}
    }
}