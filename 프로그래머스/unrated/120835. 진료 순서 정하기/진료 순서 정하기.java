import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] result = new int[emergency.length];
        int[] sort = Arrays.copyOf(emergency, emergency.length);

        Arrays.sort(sort);
        
        //배열 역순만들기 (응급도 높은 순서로)
        int start = 0;
        int end = sort.length - 1;
        while (start < end) {
            int temp = sort[start];
            sort[start] = sort[end];
            sort[end] = temp;
            start++;
            end--;
        }

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < sort.length; j++) {
                if (emergency[i] == sort[j]) {
                    result[i] = j + 1; 
                }
            }
        }

        return result;
    }
}
