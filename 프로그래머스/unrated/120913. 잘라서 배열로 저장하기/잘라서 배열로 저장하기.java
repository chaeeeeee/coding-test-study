import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        
        List<String> temp = new ArrayList<>();
        
        for (int i = 0; i < my_str.length(); i+=n) {
            int start = i;
            int end = Math.min(i + n, my_str.length());
            String str = "";
            
            for (int j = start; j < end; j++) {
                char ch = my_str.charAt(j);
                str += ch;
            }
            
            temp.add(str);
        }
        
        String[] result = new String[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            result[i] = temp.get(i);
        }
        
        return result;
    }
}