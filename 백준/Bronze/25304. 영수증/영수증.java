import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	int amount, N, price, number;
    	int sum = 0;
    	
    	Scanner sc = new Scanner(System.in);
    	amount = sc.nextInt();
    	N = sc.nextInt();
    	
    	while (N != 0) {
    		price = sc.nextInt();
    		number = sc.nextInt();
    		sum += price * number;
    		N--;
    	}
    	
    	if (amount == sum) {
    		System.out.println("Yes");
    	}
    	else {
    		System.out.println("No");
    	}
    }  	
} 	