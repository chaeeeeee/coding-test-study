import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int cute = 0;
        int notcute = 0;

        for (int i = 0; i < N; i++) {
            int opinion = sc.nextInt();

            if (opinion == 0) {
                notcute++;
            } else {
                cute++;
            }
        }

        if (cute > notcute) {
            System.out.println("Junhee is cute!");
        } else {
            System.out.println("Junhee is not cute!");
        }
    }
}
