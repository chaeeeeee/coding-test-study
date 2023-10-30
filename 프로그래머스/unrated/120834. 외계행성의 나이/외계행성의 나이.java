class Solution {
    public String solution(int age) {
        String answer = Integer.toString(age);
        String result = "";
        
        for(int i = 0; i < answer.length(); i++) {
            char ch = answer.charAt(i);
            if(ch == '0') {
                result += 'a';
            }
            else if(ch == '1') {
                result += 'b';
            }
            else if(ch == '2') {
                result += 'c';
            }
            else if(ch == '3') {
                result += 'd';
            }
            else if(ch == '4') {
                result += 'e';
            }
            else if(ch == '5') {
                result += 'f';
            }
            else if(ch == '6') {
                result += 'g';
            }
            else if(ch == '7') {
                result += 'h';
            }
            else if(ch == '8') {
                result += 'i';
            }
            else if(ch == '9') {
                result += 'j';
            }
        }        
        return result;
    }
}