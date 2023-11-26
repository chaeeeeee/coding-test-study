class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int count = 0;
        for (int i = 0; i < num_list.length; i+=n) {
            count++;
        }
        
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < num_list.length; i+=n) {
            result[index] = num_list[i];
            index++;
        }
        
        return result;
    }
}