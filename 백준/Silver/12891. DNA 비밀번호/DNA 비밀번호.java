import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int answer = 0;
        int N = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        char[] dna = br.readLine().toCharArray();
        
        st = new StringTokenizer(br.readLine());
        int[] check = new int[4];
        for (int i = 0; i < 4; i++) {
            check[i] = Integer.parseInt(st.nextToken());
        }
        
        int[] countAlpha = new int[4];
        for (int j = 0; j < P; j++) {
            switch (dna[j]) {
                case 'A' : 
                    countAlpha[0]++;
                    break;
                case 'C' :
                    countAlpha[1]++;
                    break;
                case 'G' :
                    countAlpha[2]++;
                    break;
                case 'T':
                    countAlpha[3]++;
                    break;
            }
        }
        
        for (int i = 0; i <= N - P; i++) {
            boolean flag = false;
            
            for (int j = 0; j < 4; j++) {
                if (countAlpha[j] < check[j]) {
                    flag = true;
                    break;
                }
            }
            
            if (!flag) {
                answer++;
            }
            
            if (i == N - P) {
                break;
            }
            
            countAlpha[position(dna[i])]--;
            countAlpha[position(dna[i + P])]++;
        }

        System.out.println(answer);
    }

    private static int position(char alpha) {
        switch (alpha) {
            case 'A' : return 0;
            case 'C' : return 1;
            case 'G' : return 2;
            case 'T' : return 3;
        }
        
        return -1;
    }
}
