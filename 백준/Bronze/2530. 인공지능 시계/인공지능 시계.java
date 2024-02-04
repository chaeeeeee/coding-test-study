import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //현재시각
        int H = sc.nextInt();
        int M = sc.nextInt();
        int S = sc.nextInt();

        int D = sc.nextInt();       //요리하는데 필요한 시간 (초단위)
        M += D / 60;
        S += D % 60;

        if (S >= 60) {
            M += S / 60;
            S %= 60;
        }
        if (M >= 60) {
            H += M / 60;
            M %= 60;
        }
        if (H >= 24) {
            H %= 24;
        }

        System.out.println(H + " " + M + " " + S);
    }
}
