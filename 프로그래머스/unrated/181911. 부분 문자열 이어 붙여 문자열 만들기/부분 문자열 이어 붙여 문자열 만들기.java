class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        
        String answer = "";
        
        for (int i = 0; i < my_strings.length; i++) {
            
            String word = my_strings[i];
            int start = parts[i][0];
            int end = parts[i][1];
            
            for (int j = start; j <= end; j++) {
                char ch = word.charAt(j);
                
                answer += ch;
            }
        }
        
        return answer;
    }
}