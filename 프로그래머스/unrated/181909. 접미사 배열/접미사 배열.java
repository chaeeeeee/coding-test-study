import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        
        String[] result = new String[my_string.length()];
        int index = 0;
        
        for (int i = my_string.length() - 1; i >= 0; i--) {
            String word = "";
            
            for (int j = i; j < my_string.length(); j++) {
                char ch = my_string.charAt(j);
                word += ch;
            }
            
            result[index] = word;
            index++;
        }
        
        Arrays.sort(result);
        return result;
    }
}