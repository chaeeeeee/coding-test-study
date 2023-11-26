import java.util.*;

class Solution {
    public String[] solution(String myString) {
        
        String[] result = myString.split("x");
        Arrays.sort(result);
        
        int blank = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i].equals("")) {
                blank++;
            }
        }
        
        String[] real = new String[result.length-blank];
        int index = 0;
        for (int i = 0; i < result.length; i++) {
            if (!result[i].equals("")) {
                real[index] = result[i];
                index++;
            }
        }
        return real;
    }
}