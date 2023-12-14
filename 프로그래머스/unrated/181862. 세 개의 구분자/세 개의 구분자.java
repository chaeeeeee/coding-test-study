class Solution {
    public String[] solution(String myStr) {
        
        char[] replaceChar = {'a', 'b', 'c'};       //구분자 배열에 저장
        
        for (char ch : replaceChar) {
            myStr = myStr.replace(ch, '*');         //구분자를 *로 replace
        }
        
        String[] result = myStr.split("\\*");       //* 기준으로 split하여 배열에 저장
        int count = 0;
        
        for (int i = 0; i < result.length; i++) {   //잘려진 문자열 카운트
                if (!result[i].isEmpty()) {
                    count++;
                }
        }
        
        String[] real = new String[count];
        int index = 0;
        
        if (count == 0) {                           //비어있다면 EMPTY를 리턴
            String[] empty = {"EMPTY"};
            return empty;
        }
        else {
            for (int i = 0; i < result.length; i++) {
                if (!result[i].isEmpty()) {
                    real[index] = result[i];        //비어있지 않은 문자열만 real에 할당
                    index++;
                }
            }
        }
        
        return real;
    }
}