import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();	
		int len = str1.length();
		
		char[] arr1 = new char[len];
		boolean flag = true;
		
		for (int i = 0; i < len; i++) {
		   	 arr1[i] = str1.charAt(i);
		}
		
		len = len - 1;
		
		for (int i = 0; i < len; i++) {
		      if (!(arr1[i] == arr1[len])) {
		      	flag = false;
		      }
		      len--;
		}
		
		if (flag == true) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
        
	}
}