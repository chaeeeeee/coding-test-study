class Solution {
    public int[] solution(int n) {
        
        int original = n;
        
        int count = 0;
        while (n != 1) {
            count++;
            if (n % 2 == 0) {
                n /= 2;
            }
            else {
                n = 3 * n + 1;
            }           
        }
        
        int[] result = new int[count+1];
        n = original;

        for (int i = 0; i <= count; i++) {
            result[i] = n;
            
            if (n % 2 == 0) {
                n /= 2;
            }
            else {
                n = 3 * n + 1;
            }  
        }
        
        return result;
    }
}