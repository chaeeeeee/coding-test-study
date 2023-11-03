class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        for(int i = 1; i <= cipher.length(); i++) {
            
            if(i % code == 0) {
                char ch = cipher.charAt(i-1);
                answer += ch;
            }
        }
        return answer;
    }
}