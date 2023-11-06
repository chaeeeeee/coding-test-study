class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String temp = Integer.toString(num);
        
        for (int i = 0; i < temp.length(); i++) {
            char ch = temp.charAt(i);
            int a = Character.getNumericValue(ch);
            
            if(a == k) {
                answer = i + 1;
                break;
            }
        }
        return answer;
    }
}
