package backjoon;

import java.util.Scanner;

public class _1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            boolean isPrime = true;

            if (k == 1)
                continue;
            for (int j = 2; j < Math.sqrt(k); j++) {
                if (k % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                count++;
            }

        }
        System.out.println(count);
    }
}
