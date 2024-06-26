import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int count = 0 ;
        String[] arr = new String[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
            if (arr[i].contains("X") == false) {
                count++;
            }
        }
        
        int max = count;
        count = 0;
        for (int i = 0; i < m; i++) {
            int counts = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j].charAt(i) == '.') {
                    counts++;
                }
            }
            if (counts == n) {
                count++;
            }
        }
        
        max = Math.max(max, count);
        System.out.println(max);
    }
}