import java.util.*;

class Solution {
    public String solution(String s) {
        
        String Upper = "";
        String Lower = "";
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (Character.isUpperCase(ch)) {
                Upper += ch;
            }
            else {
                Lower += ch;
            }
        }
        
        char[] sort_Upper = Upper.toCharArray();
        char[] sort_Lower = Lower.toCharArray();
        
        Arrays.sort(sort_Upper);
        Arrays.sort(sort_Lower);
        
        String result_Upper = new String(sort_Upper);
        String result_Lower = new String(sort_Lower);
        
        StringBuilder reversed_Upper = new StringBuilder(result_Upper).reverse();
        StringBuilder reversed_Lower = new StringBuilder(result_Lower).reverse();
        
        StringBuilder result = new StringBuilder();
        result.append(reversed_Lower).append(reversed_Upper);
        return result.toString();
    }
}