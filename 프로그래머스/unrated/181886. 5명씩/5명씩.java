class Solution {
    public String[] solution(String[] names) {
        
        int group = (int)Math.ceil((double)names.length / 5);
        String[] answer = new String[group];
        
        int index = 0;
        for (int i = 0; i < names.length; i+= 5) {
            answer[index] = names[i];
            index++;
        }
        
        return answer;
    }
}