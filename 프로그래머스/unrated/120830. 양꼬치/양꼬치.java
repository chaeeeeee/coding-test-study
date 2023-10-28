class Solution {
    public int solution(int n, int k) {
        int drink = n/10;
        int answer = n*12000 + (k-drink)*2000;
        return answer;
    }
}