import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean student[] = new boolean[31];
		
		for (int i = 0; i < 28; i++) {
			int temp = sc.nextInt();
			student[temp] = true;
		}
		
		for (int i = 1; i < 31; i++) {
			if (student[i] == false) {
				System.out.println(i);
			}
		}	
	}
}