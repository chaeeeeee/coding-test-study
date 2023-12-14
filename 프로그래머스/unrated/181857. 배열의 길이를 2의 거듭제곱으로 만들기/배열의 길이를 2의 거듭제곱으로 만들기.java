import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        int length = arr.length;
        int count = Integer.bitCount(length);       //비트연산 사용하여 거듭제곱 확인
        
        if (count == 1) {                           //거듭제곱이라면
            return arr;
        }      
        
        //거듭제곱이 아니라면
        int length2 = (int)Math.pow(2, Math.ceil(Math.log(length) / Math.log(2)));
        int[] result = new int[length2];
            
        System.arraycopy(arr, 0, result, 0, arr.length);   
        Arrays.fill(result, length, length2, 0);
            
        return result;
    }
}