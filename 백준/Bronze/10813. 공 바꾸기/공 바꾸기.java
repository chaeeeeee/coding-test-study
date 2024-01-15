import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int [] B = new int[N+1];	//가방 배열
			
		for (int k = 1; k <= N; k++) {
			B[k] = k;	//바구니에 공 1개씩 바구니 번호와 동일하게
		}
		
		for (int k = 0; k < M; k++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			int temp = B[i];
			B[i] = B[j];
			B[j] = temp;
		}
		
		for (int k = 1; k <= N; k++) {
			System.out.print(B[k] + " ");
		}
	}
}