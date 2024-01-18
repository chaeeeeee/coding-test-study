import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	String str = sc.next();
    	
    	int alpha[] = new int[26]; 					//알파벳 길이의 배열
    	for (int i = 0; i < alpha.length; i++) {
    		alpha[i] = -1;									//-1로 초기화
    	}
    	
    	for (int i = 0; i < str.length(); i++) {	
    		char ch = str.charAt(i);
    		
    		if (alpha[(int)ch - 97] == -1) {
    			alpha[(int)ch - 97] = i;
    		}
    	}
    	
    	for (int i = 0; i < alpha.length; i++) {
    		System.out.print(alpha[i] + " ");
    	}
    }
}