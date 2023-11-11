import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                result += ch;
            }
        }
        
        char[] sorted = result.toCharArray();
        Arrays.sort(sorted);
        return new String(sorted);
    }
}