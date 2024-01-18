import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);    	
    	int num1 = sc.nextInt();
    	int num2 = sc.nextInt();
    	
    	String str1 = String.valueOf(num1);
    	String str2 = String.valueOf(num2);
    	String reverse1 = "", reverse2 = "";
    	
    	for (int i = 3; i > 0; i--) {
    		reverse1 = reverse1 + str1.charAt(i - 1);
    	}
    	for (int i = 3; i > 0; i--) {
    		reverse2 = reverse2 + str2.charAt(i - 1);
    	}
    	
    	System.out.println((Integer.parseInt(reverse1) > Integer.parseInt(reverse2)) ? Integer.parseInt(reverse1) : Integer.parseInt(reverse2));
    }
}