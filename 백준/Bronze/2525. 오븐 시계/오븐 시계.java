import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	int H, M, time;
    	
    	Scanner sc = new Scanner(System.in);
    	H = sc.nextInt();
    	M = sc.nextInt();
    	time = sc.nextInt();
    	
    	int minute = 60 * H + M;
    	minute = minute + time;
    	
    	H = (minute / 60) % 24;
    	M = minute % 60;
    	
    	System.out.println(H);
    	System.out.println(M);
    }
}