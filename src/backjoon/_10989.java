package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
//첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.
//첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
public class _10989 {
   /* public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //입력되는 n <= 10000인 '자연수'이므로 입력 범위 0 ~ 10000
        int[] count = new int[10001];

        for(int i = 0; i < n; i++) {
            // 해당 인덱스의 값을 1 증가
            count[sc.nextInt()]++;
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < 10001; i++) {
            while(count[i] != 0) {
                sb.append(i).append("\n");
                count[i]--;
            }
        }
        System.out.println(sb);
    }*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[10001];

        for(int i = 0; i < N; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }

        for(int i = 0; i < 10001; i++) {
            while(arr[i] > 0) {
                sb.append(i).append("\n");
                arr[i]--;
            }
        }
        System.out.println(sb);
    }

}


