class Solution {
    public int solution(String myString, String pat) {
        
        int count = 0;
        for (int i = 0; i < myString.length(); i++) {
            String temp = myString.substring(0, i+1);
            
            if (temp.endsWith(pat)) {
                count++;
            }
        }
        
        return count;
    }
}