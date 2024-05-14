import java.io.*;

public class Main {

    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        br.close();
        
        bw.write(n * (n - 1) + "\n");
        
        bw.flush();
        bw.close();
    }
}