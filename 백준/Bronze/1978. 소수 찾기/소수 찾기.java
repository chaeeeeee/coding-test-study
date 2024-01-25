import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int num;
        int count = 0;

        for (int i = 0; i < N; i++) {
            num = sc.nextInt();

            for (int j = 2; j <= num; j++) {    //소수 2부터 시작이니까

                if (j == num) {                 //j=num이면 자기 자신까지 수가 온거라 카운트
                    count++;
                }
                if (num % j == 0) {             //나머지 발생하지 않으면 j 빠져나옴
                    break;
                }
            }
        }

        System.out.println(count);
    }
}