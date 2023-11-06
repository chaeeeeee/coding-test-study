import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int count = 0;
        
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (Character.isDigit(ch)) {
                count++;
            }
        }
        
        int[] result = new int[count];
        int index = 0;
        
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (Character.isDigit(ch)) {
                result[index] = Character.getNumericValue(ch);
                index++;
            }
        }
        Arrays.sort(result);
        return result;
    }
}
