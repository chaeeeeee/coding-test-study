class Solution {
    public int solution(int a, int b, int n) {
        
        int result = 0;
        
        while (true) {
            if (n < a) {
                break;
            }
            else {
                result += (n / a) * b;
                int have = n % a;
                
                n = (n / a) * b + have;
            }
        }
        
        return result;
    }
}
