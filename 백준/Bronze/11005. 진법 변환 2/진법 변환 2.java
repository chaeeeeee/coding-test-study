import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();        //진법변환할 수
        int B = sc.nextInt();        //?진법으로 할건지..
        char[] arr = new char[36];   //알파벳 or 숫자를 저장할 배열 (문제에서 36이라고 나와있음)
        int i = 0;

        while(N != 0) {             //N을 B로 계속 나눌건데 0이 될 때까지 반복

            if(N % B < 10) {        //숫자인 경우 (10 이하)
                arr[i] = ((char) (N % B + '0'));
            }
            else {
                arr[i] = ((char) (N % B - 10 + 'A'));
            }

            N /= B;
            i++;
        }

        for (int j = i; j >= 0; j--) {
            sb.append(arr[j]);
        }

        System.out.println(sb.toString().trim());
    }
}