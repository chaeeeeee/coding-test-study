import java.util.*;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();		//바구니 개수
    	int M = sc.nextInt();		//공을 몇번 넣을건지
    	int[] arr = new int[N];
    	
    	for (int e = 0; e < M; e++) {
    		int i = sc.nextInt();
    		int j = sc.nextInt();
    		int k = sc.nextInt();
    		
    		for (int r = i - 1; r < j; r++) {
    			arr[r] = k;
    		}
    	}
    	
    	for (int i = 0; i < arr.length; i++) {
    		System.out.print(arr[i] + " ");
    	}
    	
    }
}