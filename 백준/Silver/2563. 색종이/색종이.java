import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();                   //색종이 수
        int[][] white = new int[100][100];      //100x100 사이즈이 흰 도화지
        int area = 0;

        for(int i = 0; i < N; i++) {            //각 색종이의 위치 입력받음
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    white[j][k] = 1;
                }
            }
        }


        for(int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if(white[i][j] == 1) {
                    area++;
                }
            }
        }

        System.out.println(area);
    }
}