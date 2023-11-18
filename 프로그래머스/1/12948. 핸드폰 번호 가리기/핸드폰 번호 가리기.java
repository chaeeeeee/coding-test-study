class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        for(int i = 0; i < phone_number.length(); i++) {
            char ch = phone_number.charAt(i);
            
            if(i >= phone_number.length()-4) {
                answer += ch;
            }
            else {
                answer += "*";
            }
        }
        
        return answer;
    }
}