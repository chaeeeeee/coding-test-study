class Solution {
    public int solution(int a, int b, int c) {
        
        int score = 0;
        if ((a != b) && (b != c) && (c != a)) {
            score = a + b + c;
        }
        else if ((a == b) && (b == c) && (c == a)) {
            score = (a + b + c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        }
        else if ((a == b) && (a != c)) {
            score = (a + b + c) * (a*a + b*b + c*c);
        }
        else if ((b == c) && (a != b)) {
            score = (a + b + c) * (a*a + b*b + c*c);
        }
        else if ((a == c) && (a != b)) {
            score = (a + b + c) * (a*a + b*b + c*c);
        }
        
        return score;
    }
}