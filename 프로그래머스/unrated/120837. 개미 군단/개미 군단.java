class Solution {
    public int solution(int hp) {
        int ant = 0;
        ant += hp / 5;
        ant += (hp % 5) / 3;
        ant += (hp % 5) % 3;
        
        return ant;
    }
}