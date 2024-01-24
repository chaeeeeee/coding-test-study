import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int count = 0;
        int n = 0;

        while(true) {
            n++;
            count += n;

            if (count >= X) {
                if(n%2 == 0) {
                    System.out.println((X - count + n) + "/" + (count - X + 1));
                }
                else {
                    System.out.println((count - X + 1) + "/" + (X - count + n));
                }
                break;
            }

        }

    }
}
