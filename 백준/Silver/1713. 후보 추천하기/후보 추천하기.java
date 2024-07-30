import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int total = 0;
        int now = 0;
        int changeIdx = 0;
        int pictureNum = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        int[] student = new int[pictureNum];
        int[] recommend = new int[pictureNum];
        int[] time = new int[pictureNum];
        
        total = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        for (int x = 0; x < total; x++) {
            now = Integer.parseInt(st.nextToken());
            changeIdx = 0;
            
            for (int y = 0; y < pictureNum; y++) {
                if (student[y] == 0 || student[y] == now) {
                    changeIdx = y;
                    break;
                }
                
                if (recommend[changeIdx] > recommend[y] || (recommend[changeIdx] == recommend[y] && time[changeIdx] > time[y])) {
                    changeIdx = y;
                }
            }
            
            if (student[changeIdx] != now) {
                student[changeIdx] = now;
                recommend[changeIdx] = 0;
                time[changeIdx] = x;
            }
            recommend[changeIdx]++;
        }
        
        Arrays.sort(student);
        
        for (int x : student) {
            if (x != 0) {
                bw.write(String.valueOf(x) + " ");
            }
        }
        
        bw.flush();
    }
}
