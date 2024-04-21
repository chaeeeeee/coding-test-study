import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        
        boolean[] check = new boolean[101];
        int size = sc.nextInt();
        int count = 0;
        
        for (int i = 0; i < size; i++) {
            int temp = sc.nextInt();
            if (check[temp] == true) {
                count++;
            } else {
                check[temp] = true;
            }
        }

        System.out.println(count);

    }
}