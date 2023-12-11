class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder();
        
        // 맨 앞 ~ s
        for (int i = 0; i < s; i++) {
            char ch = my_string.charAt(i);
            answer.append(ch);
        }
        
        // s ~ e
        for (int i = e; i >= s; i--) {
            char ch = my_string.charAt(i);
            answer.append(ch);
        }
        
        // e ~ 맨 뒤
        for (int i = e+1; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            answer.append(ch);
        }
        
        return answer.toString();
    }
}