class Solution {
    public long solution(long n) {
   
        double root = Math.sqrt(n);
        
        if(root == (int)root) {
            long answer = (long)((int)root+1)*((int)root+1);
            return answer;
        }
        
        return -1;
    }
}