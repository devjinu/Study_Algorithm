package backjoon;

import java.util.Scanner;

// 자연수 N과 정수 K가 주어졌을 때 이항 계수
// N/K를 구하는 프로그램을 작성하시오.
// 첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 0 ≤ K ≤ N)
// N/K를 출력한다.
public class _11050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(fact(N)/(fact(N-K)*fact(K)));
    }

    public static int fact(int n) {
        int i=1;
        for(int j=1; j<=n; j++) {
            i*=j;
        }
        return i;
    }
}
