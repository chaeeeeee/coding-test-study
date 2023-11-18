class Solution {
    public String solution(String s) {
        String answer = "";
        
        if(s.length() % 2 == 0) {   //짝수
            char ch1 = s.charAt(s.length()/2-1);
            char ch2 = s.charAt(s.length()/2);
            answer += ch1;
            answer += ch2;
        }
        else {                      //홀수
            char ch = s.charAt(s.length()/2);
            answer += ch;
        }
        
        return answer;
    }
}