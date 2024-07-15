import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        long[] numbers = new long[T];
        
        for (int i = 0; i < T; i++) {
            numbers[i] = Long.parseLong(br.readLine());
        }
        
        br.close();
        
        printSection(numbers);
    }

    static BigInteger findPrimeNumber(BigInteger num) {
        if (num.isProbablePrime(10)) {
            return num;
        } else {
            return num.nextProbablePrime();
        }
    }
    
    static void printSection(long[] arr) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        for (int i = 0; i < arr.length; i++) {
            BigInteger bigNumber = new BigInteger(String.valueOf(arr[i]));
            bw.write(findPrimeNumber(bigNumber) + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}