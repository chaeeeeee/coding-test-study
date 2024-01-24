import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();   //낮에 올라갈 수 있는 거리
        int B = sc.nextInt();   //밤에 미끌어지는 거리
        int V = sc.nextInt();   //나무 막대 길이

        int day = (V - B) / (A - B);

        if (((V - B) %(A - B) != 0)) {
            day++;
        }

        System.out.println(day);
    }
}
