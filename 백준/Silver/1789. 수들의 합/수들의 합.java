import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();
        long sum = 0;
        long count = 0;

        for (int i = 1; ; i ++) {
            if (sum > num) {
                break;
            }
            
            sum += i;
            count++;
        }

        System.out.println(count - 1);
    }
}