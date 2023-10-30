class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int even = 0;   //짝
        int odd = 0;    //홀
        
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i]%2 == 0) { //짝인 경우
                even++;          
            }
            else {                  //홀인 경우
                odd++;  
            }
        }
        answer[0] = even;
        answer[1] = odd;
        
        return answer;
    }
}