import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] arr2 = new int[N];
        HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < N; i++) {
            arr[i] = arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr2);

        int rank = 0;
        for(int v : arr2) {
            if(!rankingMap.containsKey(v)) {
                rankingMap.put(v, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int key : arr) {
            int ranking = rankingMap.get(key);	
            sb.append(ranking).append(' ');
        }

        System.out.println(sb);
    }
}