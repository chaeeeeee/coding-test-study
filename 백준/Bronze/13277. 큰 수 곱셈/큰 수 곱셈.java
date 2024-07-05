import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger result = new BigInteger("1");
        
        try {
            for (String a : br.readLine().split(" ")) {
                result = result.multiply(new BigInteger(a));
            }
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}