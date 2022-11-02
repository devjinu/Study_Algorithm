package backjoon._1000;

import java.util.Scanner;

//M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
//첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.
//한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
public class _1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        boolean[] arr = new boolean[N + 1];

        arr[0] = true;
        arr[1] = true;

        for (int i = 2; i <= Math.sqrt(N + 1); i++) {
            for (int j = i * i; j < N + 1; j += i) {
                arr[j] = true;
            }
        }

        for (int i = M; i < N + 1; i++) {
            if (arr[i] == false) {
                System.out.println(i);
            }
        }

    }
}
