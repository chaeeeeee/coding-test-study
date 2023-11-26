class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        
        int start_a = intervals[0][0];
        int end_a = intervals[0][1];
        int start_b = intervals[1][0];
        int end_b = intervals[1][1];
        
        int length = end_a - start_a + end_b - start_b + 2;
        int[] result = new int[length];
        int index = 0;
        
        for (int i = start_a; i <= end_a; i++) {
            result[index] = arr[i];
            index++;
        }
        for (int i = start_b; i <= end_b; i++) {
            result[index] = arr[i];
            index++;
        }
        
        return result;
    }
}