class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        int index = str1.indexOf(str2);
        
        if(index != -1) {
            answer = 1;
        }
        else {
            answer = 2;
        }
        
        return answer;
    }
}