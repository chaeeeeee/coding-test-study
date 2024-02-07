import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] result = new int[N];

        for (int i = 0; i < N; i++) {
            int D1 = sc.nextInt();
            int D2 = sc.nextInt();
            int D3 = sc.nextInt();

            if (D1 == D2 && D2 == D3) {
                result[i] = 10000 + D1 * 1000;
            }
            else if (D1 == D2 && D2 != D3) {
                result[i] = 1000 + D1 * 100;
            }
            else if (D1 == D3 && D1 != D2) {
                result[i] = 1000 + D1 * 100;
            }
            else if (D2 == D3 && D1 != D2) {
                result[i] = 1000 + D2 * 100;
            }
            else if (D1 != D2 && D2 != D3) {
                if (D1 > D2 && D2 > D3) {
                    result[i] = D1 * 100;
                }
                else if (D1 > D3 && D3 > D2) {
                    result[i] = D1 * 100;
                }
                else if (D2 > D1 && D1 > D3) {
                    result[i] = D2 * 100;
                }
                else if (D2 > D3 && D3 > D1) {
                    result[i] = D2 * 100;
                }
                else if (D3 > D1 && D1 > D2) {
                    result[i] = D3 * 100;
                }
                else if (D3 > D2 && D2 > D1) {
                    result[i] = D3 * 100;
                }
            }
        }

        int max = 0;
        for (int i = 0; i < result.length; i++) {
            if (max < result[i]) {
                max = result[i];
            }
        }

        System.out.println(max);
    }
}
