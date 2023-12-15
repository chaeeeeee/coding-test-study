import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        
        Map<Integer, Integer> m = new HashMap<>();
        
        // 길이 측정해서 map에 저장
        for (int i = 0; i < strArr.length; i++) {
            int length = strArr[i].length();
            m.put(length, m.getOrDefault(length, 0) + 1);
        }
        
        int maxCount = 0;
        for (int count : m.values()) {
            maxCount = Math.max(maxCount, count);
        }
        
        return maxCount;
    }
}