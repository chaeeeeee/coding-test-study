import java.io.*;
import java.math.BigInteger;

public class Main {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        
        StringBuilder sb = new StringBuilder();
        while ((s=br.readLine()) != null) {
            BigInteger n = new BigInteger(s);
            BigInteger base = BigInteger.ZERO;
            while(true) {
                base = base.multiply(BigInteger.TEN).add(BigInteger.ONE);
                if (base.mod(n).equals(BigInteger.ZERO)) {
                    sb.append(base.toString().length()).append('\n');
                    break;
                }
            }
        }
        System.out.print(sb);
    }
}
