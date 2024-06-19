import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int x = Rev(X);
        int y = Rev(Y);
        int res = Rev(x + y);

        System.out.println(res);
    }

    private static int Rev (int n) {
        String str = "";

        while (n > 0) {
            str += n % 10;
            n /= 10;
        }

        return Integer.parseInt(str);
    }
}