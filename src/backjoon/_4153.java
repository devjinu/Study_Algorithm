package backjoon;

import java.util.Scanner;

//과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다. 주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.
//입력은 여러개의 테스트케이스로 주어지며 마지막줄에는 0 0 0이 입력된다. 각 테스트케이스는 모두 30,000보다 작은 양의 정수로 주어지며, 각 입력은 변의 길이를 의미한다.
//각 입력에 대해 직각 삼각형이 맞다면 "right", 아니라면 "wrong"을 출력한다.
public class _4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int a2 = a * a;
            int b2 = b * b;
            int c2 = c * c;
            if (a == 0 && b == 0 && c == 0) {
                break;
            }
            if ((a2 + b2) == c2) {
                System.out.println("right");
            } else if (a2 == (b2 + c2)) {
                System.out.println("right");
            } else if (b2 == (c2 + a2)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
        sc.close();
    }
}
