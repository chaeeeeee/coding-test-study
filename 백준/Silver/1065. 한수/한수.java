import java.util.*;

public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        boolean check[] = new boolean[N+1];	//default : false | for문에서 등차수열 조건 해당하면 true로 변경
        int count = 0;
        
        for (int i = 1; i < N+1; i++) {
        	if (i < 100) {	//1~99는 무조건 등차수열 조건 부합하기 때문에 true로 변경
        		check[i] = true;
        	}
        	else {	//100~999까지는 등차수열 조건 확인해야됨
        		int first = i / 100;        		
        		int second = (i / 10) % 10;
        		int third = i % 10;       		
        		
        		if ((first - second) == (second - third)) {		//등차수열 확인
        			check[i] = true;
        		}	
        	}
        }
        
        for (int i = 1; i < N+1; i++) {
        	if (check[i] == true) {
        		count++;
        	}
        }
        
        System.out.println(count);
    }
}