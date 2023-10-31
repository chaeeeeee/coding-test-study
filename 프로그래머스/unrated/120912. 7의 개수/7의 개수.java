class Solution {
    public int solution(int[] array) {
        String[] str = new String[array.length];
        int count = 0;
        
        for(int i = 0; i < array.length; i++) {
            str[i] = Integer.toString(array[i]);
        }
        
        for(int i = 0; i < str.length; i++) {
            for(int j = 0; j < str[i].length(); j++) {
                char ch = str[i].charAt(j);
                if(ch == '7') {
                    count++;
                }
            }
            
        }
        
        return count;
    }
}