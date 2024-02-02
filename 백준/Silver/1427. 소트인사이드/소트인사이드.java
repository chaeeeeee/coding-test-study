import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[10];

        while (N != 0) {
            arr[N % 10]++;
            N /= 10;
        }

        for (int i = 9; i >= 0; i--) {
            while (arr[i]-- > 0) {
                System.out.print(i);
            }
        }
    }
}