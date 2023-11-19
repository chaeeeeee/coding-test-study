class Solution {
    public int solution(int[] num_list) {
        
        String odd = "";
        String even = "";
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                even += Integer.toString(num_list[i]);
            }
            else {
                odd += Integer.toString(num_list[i]);
            }
        }
        
        int sum = Integer.parseInt(even) + Integer.parseInt(odd);
        return sum;

    }
}