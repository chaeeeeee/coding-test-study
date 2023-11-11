class Solution {
    public String solution(String my_string) {
        String result = "";

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);

            if (result.indexOf(ch) == -1) { //ch가 result에 존재하지 않다면
                result += ch;
            }
        }

        return result;
    }
}
