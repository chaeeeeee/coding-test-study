class Solution {
    public int solution(int n) {
        int result = 1;
        int nn = 1;
        
        while(nn <= n) {
            result++;
            nn *= result;            
        }
        
        return result-1;
    }
}