class Solution {
    public String solution(String bin1, String bin2) {
        
        int sum = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);
        String result = Integer.toBinaryString(sum);
        return result;
    }
}