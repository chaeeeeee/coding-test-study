import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		String[] str = new String[T];
		
		for (int i = 0; i < str.length; i++) {
			str[i] = sc.next();
		}
		
		for (int i = 0; i < str.length; i++) {

			if (str[i].length() < 1) {
				System.out.print(str[i]);
				System.out.println(str[i]);
			} else {
				if (str[i].length() < 1) {
					System.out.println(str[i] + "" + str[i]);
				} else {
					System.out.print(str[i].substring(0, 1)); 
					System.out.println((str[i].substring(str[i].length() - 1, str[i].length())));
				}
			}
		}
	}
}