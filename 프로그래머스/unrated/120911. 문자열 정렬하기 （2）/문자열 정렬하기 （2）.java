import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            
            if(Character.isUpperCase(ch)) {
                char a = Character.toLowerCase(ch);
                answer += a;
            }
            else {
                answer += ch;
            }
        }
        
        char[] arr_ch = answer.toCharArray(); 
        Arrays.sort(arr_ch); 
        String result = new String(arr_ch);
        
        return result;
    }
}