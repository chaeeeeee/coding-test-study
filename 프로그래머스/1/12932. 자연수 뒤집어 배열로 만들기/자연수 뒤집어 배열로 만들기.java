class Solution {
    public int[] solution(long n) {
        int count = 0;
        long nn = n;
        
        while(nn > 10) {         
            nn /= 10;
            count++;
        }
        
        int[] answer = new int[count+1];
        for(int i = 0; i <= count; i++) {
            answer[i] = (int)(n % 10);
            n /= 10;
        }
        
        return answer;
    }
}