class Solution {
    public int[] solution(String my_string) {
        
        int[] result = new int[52];     
        
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            
            if (ch >= 'A' && ch <= 'Z') {
                int index = ch - 'A';
                result[index]++;
            }
            else {
                int index = ch - 'a' + 26;
                result[index]++;
            }
        }
        
        return result;
    }
}