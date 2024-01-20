import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	int[] alpha = new int[26];
    	String str = sc.next();
    	int max = 0;
    	char result = 0;
    	
    	for (int i = 0; i < str.length(); i++) {
    		if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
    			alpha[str.charAt(i) - 'A']++; 
    		}
    		else {
    			alpha[str.charAt(i) - 'a']++; 
    		}
    	}
    	
    	for (int i = 0; i < alpha.length; i++) {
    		if (alpha[i] > max) {
    			max = alpha[i];
    			result = (char)(i + 'A');
    		}
    		else if (alpha[i] == max) {
    			result = '?';
    		}
    	}
    	
    	System.out.println(result);
    }
}