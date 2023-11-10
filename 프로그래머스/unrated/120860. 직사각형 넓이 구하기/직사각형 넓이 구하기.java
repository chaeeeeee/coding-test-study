import java.util.Arrays;

class Solution {
    public int solution(int[][] dots) {
        int x_pos[] = new int[4];
        int y_pos[] = new int[4];
        
        for(int i = 0; i < 4; i++) {
            x_pos[i] = dots[i][0];
            y_pos[i] = dots[i][1];
        }
        Arrays.sort(x_pos);
        Arrays.sort(y_pos);
        
        int width = x_pos[3] - x_pos[0];
        int height = y_pos[3] - y_pos[0];
        
        int result = width * height;
        return result;    
    }
}