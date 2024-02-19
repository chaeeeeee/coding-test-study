import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int S = sc.nextInt();

        if ((12 <= T) && (16 >= T) && (S == 0)) {
            System.out.println("320");
        }
        else if ((S == 1) || (11 >= T) || (16 < T)) {
            System.out.println("280");
        }
    }
}
