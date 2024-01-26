import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //직사각형 좌표는 (1, 1), (1, 5), (10, 5), (10, 1) 이렇게 구성
        //x, y 좌표 수가 각각 2개씩 존재
        int[] x_pos = new int[3];
        int[] y_pos = new int[3];

        for (int i = 0; i < 3; i++) {
            x_pos[i] = sc.nextInt();
            y_pos[i] = sc.nextInt();
        }

        int a = 0;      //찾아야 할 좌표 x,y 값
        int b = 0;

        if (x_pos[0] == x_pos[1]) {
            a = x_pos[2];
        }
        else {
            if (x_pos[0] == x_pos[2]) {
                a = x_pos[1];
            }
            else {
                a = x_pos[0];
            }
        }

        if (y_pos[0] == y_pos[1]) {
            b = y_pos[2];
        }
        else {
            if (y_pos[0] == y_pos[2]) {
                b = y_pos[1];
            }
            else {
                b = y_pos[0];
            }
        }

        System.out.println(a + " " + b);
    }
}