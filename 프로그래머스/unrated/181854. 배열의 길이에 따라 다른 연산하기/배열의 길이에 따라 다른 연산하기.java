class Solution {
    public int[] solution(int[] arr, int n) {
        
        int[] result = new int[arr.length];
        
        if (arr.length % 2 == 0) {  //짝수
            for (int i = 0; i < result.length; i++) {
                if (i % 2 != 0) {
                    result[i] = arr[i] + n;
                }
                else {
                    result[i] = arr[i];
                }
            }
        }
        else {                      //홀수
            for (int i = 0; i < result.length; i++) {
                if (i % 2 == 0) {
                    result[i] = arr[i] + n;
                }
                else {
                    result[i] = arr[i];
                }
            }
        }
        
        return result;
    }
}