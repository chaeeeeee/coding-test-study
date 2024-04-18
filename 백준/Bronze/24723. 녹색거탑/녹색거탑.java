import java.io.*;
import java.math.BigInteger;

public class Main {
    
    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        final int towerHeight = Integer.parseInt(br.readLine());
        System.out.print(BigInteger.valueOf(1).shiftLeft(towerHeight));
    }
}