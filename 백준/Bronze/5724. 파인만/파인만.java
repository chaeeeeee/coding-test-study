import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            int sum = 0;
            int n = Integer.parseInt(br.readLine());
            
            if (n == 0) {
                break;
            }
            
            for (int i = 1; i <= n; i++) {
                sum += i * i;
            }
            
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}