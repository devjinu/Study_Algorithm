package backjoon;

import java.util.Scanner;

// 정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.
public class _11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 2; i <= Math.sqrt(N); i++) {	// 또는 i * i <= N
            while (N % i == 0) {
                System.out.println(i);
                N /= i;
            }
        }
        if (N != 1) {
            System.out.println(N);
        }
    }
}
