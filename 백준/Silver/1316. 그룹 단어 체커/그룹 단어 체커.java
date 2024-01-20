import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int count = 0;
		
		for (int i = 0; i < N; i++) {
			String S = sc.next();
			boolean alpha[] = new boolean[26]; 
			boolean group = true; 
			
			for (int j = 0; j < S.length(); j++) {
				
				int index = S.charAt(j)-'a';
				if(alpha[index]) { 
					if(S.charAt(j) != S.charAt(j-1)) { 
						group = false; 
						break;
					}
				}
				else { 
					alpha[index] = true; 
				}
			}
			if(group) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}