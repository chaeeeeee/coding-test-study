class Solution {
    public String[] solution(String[] strArr) {
        
        String[] result = new String[strArr.length];
        
        for (int i = 0; i < strArr.length; i++) {
            String word = strArr[i];
            String trans = "";
            
            if (i % 2 != 0) {
                for (int j = 0; j < word.length(); j++) {
                    char ch = word.charAt(j);
                    trans += Character.toUpperCase(ch);
                }
            }
            else {
                for (int j = 0; j < word.length(); j++) {
                    char ch = word.charAt(j);
                    trans += Character.toLowerCase(ch);
                }
            }
            
            result[i] = trans;
        }
        
        return result;
    }
}