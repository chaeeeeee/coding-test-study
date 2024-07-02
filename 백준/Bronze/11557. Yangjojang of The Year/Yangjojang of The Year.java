import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int testcase = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < testcase; i++) {
            Map<String, Integer> wordCountMap = new HashMap<>();
            final int wordCount = Integer.parseInt(br.readLine());

            for (int j = 0; j < wordCount; j++) {
                final String[] input = br.readLine().split(" ");
                wordCountMap.put(input[0], Integer.parseInt(input[1]));
            }

            Map.Entry<String, Integer> maxEntry = Collections.max(wordCountMap.entrySet(), Map.Entry.comparingByValue());
            sb.append(maxEntry.getKey()).append("\n");
        }
        
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }

        System.out.print(sb);
    }
}