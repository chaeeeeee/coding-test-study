class Solution {
    public int solution(String myString, String pat) {
        
        String result = "";
        for (int i = 0; i < myString.length(); i++) {
            char ch = myString.charAt(i);
            
            if (ch == 'A') {
                result += 'B';
            }
            else if (ch == 'B') {
                result += 'A';
            }
        }
        
        if (result.contains(pat)) {
            return 1;
        }
        return 0;
        
    }
}