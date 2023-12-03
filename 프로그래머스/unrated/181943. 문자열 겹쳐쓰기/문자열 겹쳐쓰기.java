class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        String answer = "";
        
        //앞부분 ~ s
        for (int i = 0; i < s; i++) {
            char ch = my_string.charAt(i);
            answer += ch;
        }
        
        //s 길이만큼
        for (int i = 0; i < overwrite_string.length(); i++) {
            char ch = overwrite_string.charAt(i);
            answer += ch;
        } 
        
        //나머지
        for (int i = answer.length(); i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            answer += ch;
        }
        
        return answer;
    }
}