package backjoon._11000;

import java.util.Scanner;

//꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!
//첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.
//A+B+C의 값을 출력한다.
public class _11382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long A = sc.nextLong();
        Long B =sc.nextLong();
        Long C = sc.nextLong();

        System.out.println(A+B+C);
    }
}
