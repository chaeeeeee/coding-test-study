import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        
        ArrayList<String> result = new ArrayList<>();
        
        int firstIndex = 0;
        int mode = 0;           // l = 0, r = 1
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                mode = 0;
                firstIndex = i;
                break;
            } else if (str_list[i].equals("r")) {
                mode = 1;
                firstIndex = i;
                break;
            }
        }
        
        if (mode == 0) {
            for (int i = 0; i < firstIndex; i++) {
                result.add(str_list[i]);
            }
        } else if (mode == 1) {
            for (int i = firstIndex+1; i < str_list.length; i++) {
                result.add(str_list[i]);
            }
        }
        
        String[] resultArray = result.toArray(new String[0]);
        return resultArray;
    }
}