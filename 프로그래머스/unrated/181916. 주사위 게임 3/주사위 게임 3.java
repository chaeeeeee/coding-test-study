import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        
        int point = 0;
        int[] arr = {a, b, c, d};
        
        Arrays.sort(arr);
        
        if (arr[0] == arr[3]) {
            point = 1111 * arr[3];
        } 
        else if (arr[0] == arr[2] || arr[1] == arr[3]) {
            point = (int) Math.pow(arr[1] * 10 + (arr[0] + arr[3] - arr[1]), 2);
        } 
        else if (arr[0] == arr[1] && arr[2] == arr[3]) {
            point = (arr[0] + arr[3]) * (arr[3] - arr[0]);
        } 
        else if (arr[0] == arr[1]) {
            point = arr[2] * arr[3];
        } 
        else if (arr[1] == arr[2]) {
            point = arr[0] * arr[3];
        } 
        else if (arr[2] == arr[3]) {
            point = arr[0] * arr[1];
        } 
        else {
            point = arr[0];
        }
        
        return point;
    }
}
