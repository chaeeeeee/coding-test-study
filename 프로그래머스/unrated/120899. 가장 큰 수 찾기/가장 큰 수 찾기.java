import java.util.Arrays;

class Solution {
    public int[] solution(int[] array) {
        int[] sort = Arrays.copyOf(array, array.length);
        int[] result = new int[2];
        
        Arrays.sort(sort);
        
        result[0] = sort[sort.length-1];
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] == result[0]) {
                result[1] = i;
            }
        }
        
        return result;
    }
}