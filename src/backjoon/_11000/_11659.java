package backjoon._11000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.
//첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다. 둘째 줄에는 N개의 수가 주어진다.
// 수는 1,000보다 작거나 같은 자연수이다. 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.
//총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.
public class _11659 {
    public static void main(String[] args) throws IOException {
        // 입력을 빨리 받기 위해 한 줄 단위로 입력 받는 BufferedReader 이용
        // -> StringTokenizer 클래스로 문자열을 파싱해줘야 함
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // N = 항의 개수, M = 문제에서 요구한 것들이 몇개인지
        // arr -> 누적합을 저장할 배열
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N + 1];

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++) {
            arr[0] = 0;
            //누적 합 저장
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            sb.append(arr[end] - arr[start - 1]).append("\n");
        }
        System.out.println(sb);

    }

}
