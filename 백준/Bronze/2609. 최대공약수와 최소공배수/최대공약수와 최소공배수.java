import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int max = Math.max(A, B);
        int min = Math.min(A, B);

        int a = max;
        int b = min;

        //최대공약수
        while (a % b != 0) {
            int ab = a;
            a = b;
            b = ab % b;
        }
        System.out.println(b);

        //최소공배수
        int j = max;
        while (max % min != 0) {
            max += j;
        }
        System.out.println(max);
    }
}
