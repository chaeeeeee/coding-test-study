import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int c = sc.nextInt();
        int k = sc.nextInt();
        
        double num = Math.pow(10, k);
        
        int ans = (int) ((int)Math.round(c / num) * num);

        System.out.println(ans);
    }
}