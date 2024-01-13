import java.util.*;

public class Main {
    public static void main(String[] args) {
    	int n, result = 0;
    	
    	Scanner sc = new Scanner(System.in);
    	n = sc.nextInt();
    	
    	while (n != 0) {
    		result += n;
    		n --;
    	}
    	
    	System.out.println(result);
    }
}