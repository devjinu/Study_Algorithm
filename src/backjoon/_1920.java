package backjoon;

import java.util.Arrays;
import java.util.Scanner;

// N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.
//첫째 줄에 자연수 N(1 ≤ N ≤ 100,000)이 주어진다. 다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다. 다음 줄에는 M(1 ≤ M ≤ 100,000)이 주어진다.
// 다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다. 모든 정수의 범위는 -231 보다 크거나 같고 231보다 작다.
//M개의 줄에 답을 출력한다. 존재하면 1을, 존재하지 않으면 0을 출력한다.
public class _1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int answer = 0;
            int start = 0, end = N - 1;
            int x = sc.nextInt();
            while (start <= end) {
                int mid = (start + end) / 2;
                if (arr[mid] == x) {
                    answer = 1;
                    break;
                }
                if (arr[mid] > x) end = mid - 1;
                else start = mid + 1;
            }
            System.out.println(answer);
        }
    }
}
