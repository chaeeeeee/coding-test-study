import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	int a, b, c, money;
    	
    	Scanner sc = new Scanner(System.in);
    	a = sc.nextInt();
    	b = sc.nextInt();
    	c = sc.nextInt();
    	
    	if ((a==b)&&(b==c)) {
    		money = 10000 + a * 1000;
    		System.out.println(money);
    	}
    	else if ((a==b) || (b==c) || (a==c)) {
    		if (a==b) {
    			money = 1000 + a * 100;
    			System.out.println(money);
    		}
    		else if (b==c) {
    			money = 1000 + b * 100;
    			System.out.println(money);
    		}
    		else if (a==c) {
    			money = 1000 + a * 100;
    			System.out.println(money);
    		}
    	}
    	else if ((a!=b) && (b!=c)) {
    		if ((a>b) && (a>c)) {
				money = a * 100;
				System.out.println(money);
    		}
    		else if ((b>a) && (b>c)) {
    			money = b * 100;
				System.out.println(money);
    		}
    		else if ((c>a) && (c>b)) {
    			money = c * 100;
				System.out.println(money);
    		}
    	}
    }
}