class Solution {
    public int[] solution(String myString) {
        
        String[] num = myString.split("x", -1); //-1 하면 빈 문자열도 배열에 포함시킴
        
        int[] result = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            String word = num[i];
            int count = 0;
            
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                count++;
            }
            
            result[i] = count;
        }
        
        return result;
    }
}