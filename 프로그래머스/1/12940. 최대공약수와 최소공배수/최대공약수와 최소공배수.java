class Solution {
    public int[] solution(int n, int m) {
        
        // 최대공약수 구하기
        int max = 0;
        if (n == m) {
            max = n;
        } else {
            for (int i = 1; i <= n; i++) { 
                if ((n % i == 0) && (m % i == 0)) {
                    max = i;
                }
            }
        }
               
        // 최소공배수 구하기
        int min = (n * m) / max;
        
        int[] result = new int[2];
        result[0] = max;
        result[1] = min;
        
        return result;
    }
}
