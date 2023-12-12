import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> x = new ArrayList<>(); // ArrayList는 길이 동적 생성

        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int j = 1; j <= arr[i] * 2; j++) {
                    x.add(arr[i]);
                }
            }
            else {
                for (int j = 0; j < arr[i]; j++) {
                    x.remove(x.size() - 1);
                }
            }
        }

        return x;
    }
}
