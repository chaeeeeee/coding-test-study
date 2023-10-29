class Solution {
    public int solution(int n) {
        int sum = 0;
        while(true) {
            if (n == 0) {
                break;
            }
            else {
                sum += n%10;
                n = n/10;
            }
        }
        return sum;
    }
}