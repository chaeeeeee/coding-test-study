class Solution {
    public int[] solution(int n, int k) {
        
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                count++;
            }
        }
        
        int[] result = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                result[index] = i;
                index++;
            }
        }
        
        return result;
    }
}