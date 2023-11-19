class Solution {
    public boolean solution(String s) {
        
        if(s.length() == 4 || s.length() == 6) {
            for(int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                
                if(Character.isUpperCase(ch) || Character.isLowerCase(ch)) {
                    return false;
                }
            }
            return true;
        }
        
        return false;
    }
}