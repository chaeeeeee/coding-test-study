import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> factors = new ArrayList<>();
        int divisor = 2;

        while (n > 1) {
            while (n % divisor == 0) {
                factors.add(divisor);
                n /= divisor;
            }
            divisor++;
        }

        Set<Integer> uniqueFactors = new LinkedHashSet<>(factors);

        int[] result = new int[uniqueFactors.size()];
        int index = 0;
        for (int factor : uniqueFactors) {
            result[index++] = factor;
        }

        return result;
    }
}