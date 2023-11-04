import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int plus_max = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        int minus_max = numbers[0] * numbers[1];
        
        if (plus_max > minus_max) {
            return plus_max;
        }
        return minus_max;
    }
}