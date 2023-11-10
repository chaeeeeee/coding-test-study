class Solution {
    public int solution(int[] array, int n) {
        int result = 0;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < array.length; i++) {
            int diff = Math.abs(n - array[i]);
            
            if(diff < min) {
                min = diff;
                result = array[i];
            }
            else if(diff == min && array[i] < result) {
                result = array[i];
            }
        }
        
        return result;
    }
}