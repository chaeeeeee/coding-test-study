import java.util.*;

class Solution {
    public int solution(int[] numbers, int k) {
     
        int result = 0;
        result = numbers[2 * (k - 1) % numbers.length];
        
        return result;
    }
}