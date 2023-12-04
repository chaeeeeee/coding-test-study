class Solution {
    public String solution(String my_string, int[] indices) {
        
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            boolean check = false;
            
            for (int j = 0; j < indices.length; j++) {
                if (indices[j] == i) {
                    check = true;
                    break;
                }
            }
            
            if (!check) {
                answer += ch;
            }
        }
        
        return answer;
    }
}