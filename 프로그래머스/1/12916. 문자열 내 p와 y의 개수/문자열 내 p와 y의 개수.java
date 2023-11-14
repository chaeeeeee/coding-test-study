class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count_p = 0;
        int count_y = 0;
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'p' || ch == 'P') {
                count_p++;
            }
            else if (ch == 'y' || ch == 'Y') {
                count_y++;
            }
        }
        
        if (count_p == count_y) {
            answer = true;
        }
        else {
            answer = false;
        }

        return answer;
    }
}