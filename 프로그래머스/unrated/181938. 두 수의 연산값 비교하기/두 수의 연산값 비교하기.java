class Solution {
    public int solution(int a, int b) {
        
        String str = "";
        str += a;
        str += b;
        
        int num1 = Integer.parseInt(str);
        int num2 = a * b * 2;
        
        if(num1 > num2) {
            return num1;
        }
        else {
            return num2;
        }
    }
}