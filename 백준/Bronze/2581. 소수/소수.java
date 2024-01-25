import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //M 이상 N 이하 수 중에서 소수 찾아서 합, 최솟값 출력하는 문제
        int M = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        int min = 10000;
        boolean[] check = new boolean[10001];

        for (int i = 0; i <= 10000; i++) {
            check[i] = true;
        }

        check[0] = false;
        check[1] = false;

        for (int i = 2; i <= Math.sqrt(10000); i++) {
            for (int j = i+i; j <= 10000; j += i) {
                check[j] = false;
            }
        }

        for (int i = M; i <= N; i++) {
            if(check[i]) {
                sum += i;
                min = Math.min(min, i);
            }
        }

        if(sum == 0) System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}