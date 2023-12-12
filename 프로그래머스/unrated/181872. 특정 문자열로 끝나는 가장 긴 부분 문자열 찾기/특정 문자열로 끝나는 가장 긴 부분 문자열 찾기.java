import java.util.*;

class Solution {
    public String solution(String myString, String pat) {
        
        String result = "";
        int idx = myString.lastIndexOf(pat);
        
        result = myString.substring(0, idx) + pat;
        
        return result;
    }
}