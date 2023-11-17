import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        
        Arrays.sort(numbers);   //오름차순 정렬
        int sum = 0;
        
        for(int i = 0; i < 10; i++) {
            boolean found = false;
            
            for(int j = 0; j < numbers.length; j++) {
                if(numbers[j] == i) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                sum += i;
            }
        }
        
        return sum;
    }
}
