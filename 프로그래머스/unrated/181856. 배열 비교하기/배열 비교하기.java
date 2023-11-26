class Solution {
    public int solution(int[] arr1, int[] arr2) {
        
        int arr1_length = arr1.length;
        int arr2_length = arr2.length;
        
        if (arr1_length < arr2_length) {
            return -1;
        }
        else if (arr1_length > arr2_length) {
            return 1;
        }
        else if (arr1_length == arr2_length) {
            int arr1_sum = 0;
            int arr2_sum = 0;
            for (int i = 0; i < arr1.length; i++) {
                arr1_sum += arr1[i];
            }
            for (int i = 0; i < arr2.length; i++) {
                arr2_sum += arr2[i];
            }
            
            if (arr1_sum > arr2_sum) {
                return 1;
            }
            else if (arr1_sum < arr2_sum) {
                return -1;
            }
            else if (arr1_sum == arr2_sum) {
                return 0;
            }
        }
        
        return 0;
    }
}