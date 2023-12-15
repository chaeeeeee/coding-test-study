class Solution {
    public int solution(String s) {
        
        String[] str = s.split(" ");        
        int sum = Integer.parseInt(str[0]);       //s는 Z로 시작하지 않기 때문에
        
        for (int i = 1; i < str.length; i++) {
            if (str[i].equals("Z")) {
                sum -= Integer.parseInt(str[i-1]);
            }
            else {
                sum += Integer.parseInt(str[i]);   
            }
        }
        
        return sum;
    }
}