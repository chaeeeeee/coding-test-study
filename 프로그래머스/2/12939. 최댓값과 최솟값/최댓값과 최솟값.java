import java.util.Arrays;

class Solution {
    public String solution(String s) {
        
        String[] arr = s.split(" ");   // 공백 기준으로 문자열 쪼개기

        int[] intArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(intArr);

        String answer = intArr[0] + " " + intArr[intArr.length - 1];
        
        return answer;
    }
}
