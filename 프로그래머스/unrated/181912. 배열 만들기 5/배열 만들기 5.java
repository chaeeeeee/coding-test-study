import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
    
        
        int count = 0;
        
        for (int i = 0; i < intStrs.length; i++) {           
            String temp = intStrs[i].substring(s, s + l);
            int num = Integer.parseInt(temp);
            
            if (num > k) {
                count++;
            }
        }
        
        int[] result = new int[count];
        int index = 0;
        
        for (int i = 0; i < intStrs.length; i++) {          
            String temp = intStrs[i].substring(s, s + l);
            int num = Integer.parseInt(temp);
            
            if (num > k) {
                result[index] = num;
                index++;
            }
        }
        
        return result;
    }
}