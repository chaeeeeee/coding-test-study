import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String letter) {
            
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        Map<String, Character> m = new HashMap<>();
        
        char ch = 'a';
        for(int i = 0; i < morse.length; i++) {   //모스부호-알파벳 매칭 과정
            m.put(morse[i], ch++);
        }
        
        String[] cut = letter.split(" "); //공백 기준으로 잘라서 배열에 저장
        String result = "";
        for(int i = 0; i < cut.length; i++) {
            if(m.containsKey(cut[i])) {     //cunt[i]가 hashmap m에 key 값에 존재하는지 확인
                result += m.get(cut[i]);    //존재하면 해당 key 값의 value 값을 result에 저장
            }
        }
        
        return result;
    }
}