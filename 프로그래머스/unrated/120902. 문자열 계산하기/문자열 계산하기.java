class Solution {
    public int solution(String my_string) {
        
        String[] sentence = my_string.split(" ");
        int result = Integer.parseInt(sentence[0]);
        
        for (int i = 1; i < sentence.length; i+=2) {
            if (sentence[i].equals("+")) {
                result += Integer.parseInt(sentence[i+1]);
            } else {
                result -= Integer.parseInt(sentence[i+1]);
            }
        }
        
        return result;
    }
}