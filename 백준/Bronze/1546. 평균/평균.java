import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int subject  = sc.nextInt();
		double score[] = new double[subject];
		double sum = 0;
		
		for (int i = 0; i < subject; i++) {
			score[i] = sc.nextInt();
		}
		
		Arrays.sort(score);	
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i] / score[score.length - 1] * 100;
		}
		
		System.out.println(sum / score.length);
	}
}