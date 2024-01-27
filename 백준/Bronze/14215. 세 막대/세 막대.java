import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] length = {a, b, c};
        Arrays.sort(length);

        if (length[0] + length[1] > length[2]) {
            System.out.println(a+b+c);
        }
        else {
            System.out.println((length[0]+length[1]) * 2 - 1);
        }
    }
}