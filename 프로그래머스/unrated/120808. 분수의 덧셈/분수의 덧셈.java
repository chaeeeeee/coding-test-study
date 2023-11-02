class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numerator = (numer1 * denom2) + (numer2 * denom1);    //분자
        int denominator = denom1 * denom2;  //분모
        
        for(int i = numerator-1; i > 1; i--) {
            if(numerator%i == 0 && denominator%i == 0) {
                numerator /= i;
                denominator /= i;
            }
        }
        
        int[] answer = new int[2];
        answer[0] = numerator;
        answer[1] = denominator;
        
        return answer;
    }
}