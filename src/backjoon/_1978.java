package backjoon;

import java.util.Scanner;

//주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

public class _1978 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int isPrime;
        int count = 0;

        for (int i = 0; i < num; i++) {
            isPrime = input.nextInt();
            for (int p = 2; p <= isPrime; p++) {
                if (p == isPrime) {
                    count++;
                }
                if (isPrime % p == 0) {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}

