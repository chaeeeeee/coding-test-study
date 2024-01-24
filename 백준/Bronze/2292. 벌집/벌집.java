import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int room = 1;
        int range = 2;

        if (N == 1) {
            System.out.println("1");
        }
        else {
            while (range <= N) {
                range = range + (6 * room);
                room++;
            }
            System.out.println(room);
        }

    }
}
/*
* 음.. 이거는
* N=1 -> 벌집 1개, 방 1개
* N=2~7 -> 벌집 6개, 방 2개
* N=8~19 -> 벌집 12개, 방 3개
* N=20~37 -> 벌집 18개, 방 4개
* 최소 개수 방 1개당 벌집 6개 증가임.
*
* N 입력받은게 벌집 어디에 해당하는지를 찾아야함.*/