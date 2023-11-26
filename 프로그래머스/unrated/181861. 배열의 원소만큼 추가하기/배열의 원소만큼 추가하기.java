class Solution {
    public int[] solution(int[] arr) {
        
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        
        int[] X = new int[sum];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                X[index] = arr[i];
                index++;
            }
        }
        
        return X;
    }
}