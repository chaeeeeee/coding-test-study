import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str[] = br.readLine().split(" ");
            System.out.println(str[1].substring(0, Integer.parseInt(str[0]) - 1) + str[1].substring(Integer.parseInt(str[0])));
        }
    }
}