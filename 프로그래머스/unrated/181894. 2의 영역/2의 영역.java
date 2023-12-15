import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        // 2의 개수 카운트
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                count2++;
            }
        }
        
        // ArrayList에 조건에 맞게 할당
        ArrayList<Integer> temp = new ArrayList<>();
        if (count2 == 0) {
            temp.add(-1);
        }
        else if (count2 == 1) {
            temp.add(2);
        }
        else {
            // 제일 처음 등장하는 2의 인덱스 찾기
            int firstIndex = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 2) {
                    firstIndex = i;
                    break;
                }
            }
            
            // 제일 마지막에 등장하는 2의 인덱스 찾기
            int lastIndex = 0;
            for (int i = firstIndex+1; i < arr.length; i++) {
                if (arr[i] == 2) {
                    lastIndex = i;
                }
            }
            
            // 처음 2 인덱스 ~ 마지막 2 인덱스까지 ArrayList에 할당
            for (int i = firstIndex; i <= lastIndex; i++) {
                temp.add(arr[i]);
            }
        }
        
        // ArrayList -> int[] 변환
        int[] result = temp.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}