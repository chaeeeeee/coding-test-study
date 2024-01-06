import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	int testcase;
    	
    	Scanner sc = new Scanner(System.in);
    	testcase = sc.nextInt();
    	
    	while (testcase != 0) {
    		int a, b;
    		
    		a = sc.nextInt();
    		b = sc.nextInt();
    		
    		System.out.println(a + b);
    		testcase--;
    	}
    }
}