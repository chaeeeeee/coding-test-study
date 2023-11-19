class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            
            if (alp.equals(String.valueOf(ch))) {
                answer += Character.toUpperCase(ch);
            }
            else {
                answer += ch;
            }
        }
        
        return answer;
    }
}