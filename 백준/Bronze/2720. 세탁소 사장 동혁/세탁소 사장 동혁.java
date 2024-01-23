import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int C = sc.nextInt();

            int quarter = C / 25;
            int dime = (C - quarter * 25) / 10;
            int nickel = (C - quarter * 25 - dime * 10) / 5;
            int penny = C - quarter * 25 - dime * 10 - nickel * 5;

            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
    }
}