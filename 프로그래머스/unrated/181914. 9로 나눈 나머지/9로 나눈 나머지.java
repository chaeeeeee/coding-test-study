class Solution {
    public int solution(String number) {
        
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            
            sum += Character.getNumericValue(ch);
        }
        
        return sum % 9;
    }
}