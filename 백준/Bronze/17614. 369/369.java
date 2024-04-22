import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String sN = "";
        int result = 0;
        char n;
        
        for (int i = 1; i <= N; i++) {
            sN = Integer.toString(i);
            for (int j = 0; j < sN.length(); j++) {
                n = sN.charAt(j);
                if (n == '3' || n == '6' || n == '9') {
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}