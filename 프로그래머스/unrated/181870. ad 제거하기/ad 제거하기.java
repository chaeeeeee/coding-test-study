class Solution {
    public String[] solution(String[] strArr) {
        
        int count = 0;
        for (int i = 0; i < strArr.length; i++) {
            String word = strArr[i];
            
            if (!word.contains("ad")) {
                count++;
            }
        }
        
        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < strArr.length; i++) {
            String word = strArr[i];
            
            if (!word.contains("ad")) {
                result[index] = strArr[i];
                index++;
            }
        }
        
        return result;
    }
}