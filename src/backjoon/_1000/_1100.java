package backjoon._1000;

import java.util.Scanner;

//체스판은 8×8크기이고, 검정 칸과 하얀 칸이 번갈아가면서 색칠되어 있다. 가장 왼쪽 위칸 (0,0)은 하얀색이다. 체스판의 상태가 주어졌을 때, 하얀 칸 위에 말이 몇 개 있는지 출력하는 프로그램을 작성하시오.
//첫째 줄부터 8개의 줄에 체스판의 상태가 주어진다. ‘.’은 빈 칸이고, ‘F’는 위에 말이 있는 칸이다.
//첫째 줄에 문제의 정답을 출력한다.
public class _1100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (int x = 0; x < 8; x++) {
            String input = sc.next();
            for (int y = 0; y < 8; y++) {
                if ((x + y) % 2 == 0 && input.charAt(y) == 'F') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
