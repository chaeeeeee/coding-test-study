import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {

        if(arr.length == 1) {
            int[] result = new int[1];
            result[0] = -1;
            return result;
        }
        else {
            int[] sorted = Arrays.copyOf(arr, arr.length);
            int[] result = new int[arr.length - 1];
            int index = 0;
            
            Arrays.sort(sorted);
            int min = sorted[0];
            
            for(int i = 0; i < arr.length; i++) {
                if(min < arr[i]) {
                    result[index] = arr[i];
                    index++;
                }
            }
            
            return result;
        }

    }
}