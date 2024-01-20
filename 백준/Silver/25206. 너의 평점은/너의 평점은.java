import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double sum = 0.0;                       //이수한 과목의 학점 총합
        double sum_point = 0.0;                 //전공평점 합

        for (int i = 0; i < 20; i++) {
            String subject = sc.next();         //과목명
            double point = sc.nextDouble();     //학점
            String grade = sc.next();           //등급

            if(!grade.equals("P")) {            //등급 P이면 계산 pass
                sum += point;

                switch(grade){
                    case "A+":
                        sum_point += 4.5 * point;
                        break;
                    case "A0":
                        sum_point += 4.0 * point;
                        break;
                    case "B+":
                        sum_point += 3.5 * point;
                        break;
                    case "B0":
                        sum_point += 3.0 * point;
                        break;
                    case "C+":
                        sum_point += 2.5 * point;
                        break;
                    case "C0":
                        sum_point += 2.0 * point;
                        break;
                    case "D+":
                        sum_point += 1.5 * point;
                        break;
                    case "D0":
                        sum_point += 1.0 * point;
                        break;
                    case "F":
                        sum_point += 0.0;
                        break;
                }
            }
        }

        double average = sum_point / sum;
        System.out.println(average);
    }
}