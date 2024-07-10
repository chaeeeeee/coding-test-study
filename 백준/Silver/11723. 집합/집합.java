import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = 0;
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            String[] split = line.split(" ");

            switch (split[0]) {
                case "add": {
                    a = a | (1 << Integer.parseInt(split[1]));
                    break;
                }
                case "check": {
                    if (0 < (1 << Integer.parseInt(split[1]) & a)) {
                        bw.write(1 + "\n");
                    } else {
                        bw.write(0 + "\n");
                    }
                }
                    break;
                case "remove": {
                    a = a & ~(1 << Integer.parseInt(split[1]));
                    break;
                }
                case "toggle": {
                    if (0 < (1 << Integer.parseInt(split[1]) & a)) {
                        a = a & ~(1 << Integer.parseInt(split[1]));
                    } else {
                        a = a | (1 << Integer.parseInt(split[1]));
                    }
                }
                    break;
                case "all": {
                    a = a | (1 << 21) - 1;
                    break;
                }
                case "empty": {
                    a = 0;
                    break;
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}