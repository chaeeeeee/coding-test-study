import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] A = new int[9][9];			//9x9 행렬
		int max = 0;
		int row = 0, col = 0;
		
		for (int i = 0; i < 9; i++) {			//행 입력
			for (int j = 0; j < 9; j++) {		//열 입력
				A[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < 9; i++) {			
			for (int j = 0; j < 9; j++) {		
				if (max < A[i][j]) {
					max = A[i][j];
					row = i;
					col = j;
				}
			}
		}
		
		System.out.println(max);
		System.out.println((row +1) + " " + (col + 1));
        
	}
}