class Solution {
    public String solution(String n_str) {
        String answer = "";
          
        if (n_str.charAt(0) != '0') {
                return n_str;
        }
        
        int start_index = 0;
        for (int i = 0; i < n_str.length(); i++) {           
            char ch = n_str.charAt(i);
            
            if (ch != '0') {
                start_index = i;
                break;
            }
        }
        
        for (int i = start_index; i < n_str.length(); i++) {
            char ch = n_str.charAt(i);
            answer += ch;
        }

        return answer;
    }
}