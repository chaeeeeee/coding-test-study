import java.util.Arrays;

class Solution {
    public long solution(long n) {
        
        int count = 0;
        long nn = n;
        
        while(nn > 0) {
            nn /= 10;
            count++;
        }
        
        int[] arr = new int[count];
        int index = 0;
        while(n > 0) {
            arr[index] = (int)(n % 10);
            n /= 10;
            index++;
        }
        
        String str = "";
        Arrays.sort(arr);   // 오름차순 정렬
        for(int i = arr.length-1; i >= 0; i--) {
            str += Integer.toString(arr[i]);
        }
        
        long answer = Long.parseLong(str);
        return answer;
    }
}
