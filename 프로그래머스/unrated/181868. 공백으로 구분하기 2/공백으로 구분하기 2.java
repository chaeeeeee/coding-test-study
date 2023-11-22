class Solution {
    public String[] solution(String my_string) {
        
        String[] answer = my_string.split(" ");
        
        int count = 0;
        for (int i = 0; i < answer.length; i++) {
            if (!answer[i].equals("")) {
                count++;
            }     
        }
        
        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < answer.length; i++) {
            if (!answer[i].equals("")) {
                result[index] = answer[i];
                index++;
            }     
        }
        
        return result;
    }
}