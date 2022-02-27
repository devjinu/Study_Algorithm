package backjoon;

import java.util.Arrays;
import java.util.Scanner;

// N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
public class _10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        Arrays.sort(arr);

        System.out.println(arr[0] + " " + arr[a - 1]);
    }

}
