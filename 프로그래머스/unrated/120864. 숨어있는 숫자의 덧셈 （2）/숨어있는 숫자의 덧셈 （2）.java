class Solution {
    public int solution(String my_string) {
        
        String replaced = my_string.replaceAll("[a-zA-Z]", "-");
        
        int count = 0;
        String[] splitArr = replaced.split("-");
        
        for (int i = 0; i < splitArr.length; i++) {
            if (!splitArr[i].isEmpty()) {
                count++;
            }
        }
        
        int index = 0;
        int[] intArr = new int[count];
        for (int i = 0; i < splitArr.length; i++) {
            if (!splitArr[i].isEmpty()) {
                intArr[index] = Integer.parseInt(splitArr[i]);
                index++;
            }
        }
        
        int sum = 0;
        for (int i = 0; i < intArr.length; i++) {
            sum += intArr[i];
        }
        
        return sum;
    }
}