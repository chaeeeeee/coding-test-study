class Solution {
    public String solution(String code) {
        
        String answer = "";
        int mode = 0;
        
        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);
            
            if (ch == '1') {        //mode 변경 조건
                if (mode == 0) {
                    mode = 1;       //mode가 0이었을 때 1로 변경
                }
                else {
                    mode = 0;       //mode가 1이었을 때 0으로 변경
                }
            }
            
            if ((mode == 0) && (ch != '1')) {
                if (i % 2 == 0) {
                    answer += ch;
                }
            }
            else if ((mode == 1)&& (ch != '1')) {
                if (i % 2 != 0) {
                    answer += ch;
                }
            }
        }
        
        if (answer.equals("")) {
            return "EMPTY";
        }
        
        return answer;
    }
}