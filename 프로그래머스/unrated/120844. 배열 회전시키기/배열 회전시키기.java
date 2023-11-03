class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] result = new int[numbers.length];
        int index = 0;
        
        if ("right".equals(direction)) {
            result[0] = numbers[numbers.length-1];   //젤 끝 인덱스를 결과 배열 맨 앞에 저장
            for(int i = 1; i < numbers.length; i++) {
                result[i] = numbers[index];
                index++;
            }
        }
        else {
            result[numbers.length-1] = numbers[0];  //젤 앞 인덱스를 결과 배열 맨 뒤에 저장
            for(int i = 1; i < numbers.length; i++) {
                result[index] = numbers[i];
                index++;
            }
        }
        
        return result;
    }
}