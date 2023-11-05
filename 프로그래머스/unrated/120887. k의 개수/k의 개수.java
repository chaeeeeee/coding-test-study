class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int m = i; m <= j; m++) {
            String str = Integer.toString(m);
            char compare_ch = (char) (k + '0');
            for(int n = 0; n < str.length(); n++) {
                char ch = str.charAt(n);
                if(ch == compare_ch) {
                    answer++;
                }
            }
        }
        return answer;
    }
}