package backjoon._1000;

import java.util.Scanner;

//어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고,
// N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
//첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
//첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
public class _1065 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (i <= 99) {
                count += 1;
            } else if (i <= 999) {
                String[] num_str = Integer.toString(i).split("");
                if ((Integer.parseInt(num_str[1]) - Integer.parseInt(num_str[0])) == (Integer.parseInt(num_str[2])- Integer.parseInt(num_str[1]))) {
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}
