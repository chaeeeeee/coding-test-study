class Solution {
    public int solution(int order) {
        String str = Integer.toString(order);
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            char str2 = str.charAt(i);
            if(str2 == '3' || str2 == '6' || str2 == '9') {
                count++;
            }
        }
        return count;
    }
}