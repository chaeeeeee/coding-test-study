import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int result = numbers[numbers.length-1] * numbers[numbers.length-2];
        return result;
    }
}