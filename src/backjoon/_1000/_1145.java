package backjoon._1000;

import java.util.Scanner;

//다섯 개의 자연수가 있다. 이 수의 적어도 대부분의 배수는 위의 수 중 적어도 세 개로 나누어 지는 가장 작은 자연수이다.
//서로 다른 다섯 개의 자연수가 주어질 때, 적어도 대부분의 배수를 출력하는 프로그램을 작성하시오.
//첫째 줄에 다섯 개의 자연수가 주어진다. 100보다 작거나 같은 자연수이고, 서로 다른 수이다.
//첫째 줄에 적어도 대부분의 배수를 출력한다.
public class _1145 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = new int[5];
        int count;
        int result = 1;

        for (int i = 0; i < 5; i++) {
            arr[i] = s.nextInt();
        }

        while (true) {
            count = 0;
            for (int i = 0; i < 5; i++) {
                if (result % arr[i] == 0) count++;
            }
            if (count >= 3) {
                break;
            }
            result++;
        }
        System.out.println(result);
    }
}

