class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        
        int count = 0;
        for(int i = 0; i < finished.length; i++) {
            if(!finished[i]) {
                count++;
            }
        }
        
        String[] result = new String[count];
        int index = 0;
        for(int i = 0; i < finished.length; i++) {
            if(!finished[i]) {
                result[index] = todo_list[i];
                index++;
            }
        }
        
        return result;
    }
}