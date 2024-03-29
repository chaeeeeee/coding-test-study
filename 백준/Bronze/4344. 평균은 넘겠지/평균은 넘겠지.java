import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();		
		int[] arr;
		
		for (int i = 0; i < C; i++) {
			int N = sc.nextInt();	
			arr = new int[N];
			double sum = 0;
			
			for (int j = 0; j < N; j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}
			
			double avg = (sum / N);
			double count = 0;
			
			for (int k = 0; k < N; k++) {
				if (arr[k] > avg) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n", (count/N)*100);
		}
		
	}
}