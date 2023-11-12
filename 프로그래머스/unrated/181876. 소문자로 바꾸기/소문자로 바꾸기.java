class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(int i = 0; i < myString.length(); i++) {
            char ch = myString.charAt(i);
            
            if(Character.isUpperCase(ch)) {
                answer += Character.toLowerCase(ch);
            }
            else {
                answer += ch;
            }
        }
        return answer;
    }
}