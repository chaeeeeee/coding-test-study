import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	int H, M;
    	
    	Scanner sc = new Scanner(System.in);
    	H = sc.nextInt();
    	M = sc.nextInt();
    	
    	if (M<45) {
    		H--;
    		M = 60-(45-M);
    		
    		if (H < 0) {
    			H = 23;
    		}
    		System.out.println(H);
    		System.out.println(M);
    	}
    	else {
    		M = M - 45;
    		System.out.println(H);
    		System.out.println(M);
    	}
    }
}