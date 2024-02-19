import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = n % 10;
            n = n / 10;
        }

        for (int i = 0; i < 5; i++) {
            sum += arr[i] * arr[i] * arr[i] * arr[i] * arr[i];
        }

        System.out.println(sum);
    }
}
