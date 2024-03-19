import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(st.nextToken());
            
            if (m < 250) {
                bw.write("4 ");
            } else if (m < 275) {
                bw.write("3 ");
            } else if (m < 300) {
                bw.write("2 ");
            } else {
                bw.write("1 ");
            }
        }
        
        bw.flush();
    }
}