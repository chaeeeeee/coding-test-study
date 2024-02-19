import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();       //친구들의 수를 의미

        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }

        int count = 0;
        String Alice = sc.next();
        for (int i = 0; i < arr.length; i++) {
            if (Alice.equals(arr[i])) {
                count++;
            }
        }

        System.out.println(count);

    }
}
