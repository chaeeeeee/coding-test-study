import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String n = sc.nextLine();
            
            if (n.equals("#")) {
                System.exit(0);
            }
            
            String strArr[] = n.toLowerCase().split("");
            
            int count = 0;
            for (int i = 0; i < strArr.length; i++) {
                if (n.split(" ")[0].equals(strArr[i])) {
                    count++;
                }
            }

            System.out.println(n.split(" ")[0] + " " + (count - 1));
        }
    }
}