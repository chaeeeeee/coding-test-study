import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	int N;
    	
    	Scanner sc = new Scanner(System.in);
    	N = sc.nextInt();
    	int blank = N;
    	
    	for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
    	
    }  	
} 	