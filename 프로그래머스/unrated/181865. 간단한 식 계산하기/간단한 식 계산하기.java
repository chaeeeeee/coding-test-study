class Solution {
    public int solution(String binomial) {
        
        int result = 0;
        String[] sp = binomial.split(" ");
        
        if (sp[1].equals("+")) {
            result = Integer.parseInt(sp[0]) + Integer.parseInt(sp[2]);
        }
        else if (sp[1].equals("-")) {
            result = Integer.parseInt(sp[0]) - Integer.parseInt(sp[2]);
        }
        else if (sp[1].equals("*")) {
            result = Integer.parseInt(sp[0]) * Integer.parseInt(sp[2]);
        }
        
        return result;
    }
}