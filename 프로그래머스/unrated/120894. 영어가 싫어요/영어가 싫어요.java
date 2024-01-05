import java.util.*;

class Solution {
    public long solution(String numbers) {
        
        Map<String, Integer> number = new HashMap<>();
        number.put("zero", 0);
        number.put("one", 1);
        number.put("two", 2);
        number.put("three", 3);
        number.put("four", 4);
        number.put("five", 5);
        number.put("six", 6);
        number.put("seven", 7);
        number.put("eight", 8);
        number.put("nine", 9);
        
        long result = 0;
        StringBuilder currentNumber = new StringBuilder();
        for (int i = 0; i < numbers.length(); i++) {
            currentNumber.append(numbers.charAt(i));
            
            if (number.containsKey(currentNumber.toString())) {
                result = result * 10 + number.get(currentNumber.toString());
                currentNumber.setLength(0);
            }
        }
        
        return result;
    }
}