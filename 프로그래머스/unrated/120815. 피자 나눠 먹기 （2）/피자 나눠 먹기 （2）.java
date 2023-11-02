class Solution {
    public int solution(int n) {
        int result = 0;
        
        if(n % 6 == 0) {
            result = n / 6;
        }
        else {
            for(int i = 1; i < 100; i++) {
                if((i * 6)%n == 0) {
                    result = i;
                    break;
                }
            }
        }
        
        return result;
    }
}