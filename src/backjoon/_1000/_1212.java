package backjoon._1000;

import java.util.Scanner;

//8진수가 주어졌을 때, 2진수로 변환하는 프로그램을 작성하시오.
//첫째 줄에 8진수가 주어진다. 주어지는 수의 길이는 333,334을 넘지 않는다.
//첫째 줄에 주어진 수를 2진수로 변환하여 출력한다. 수가 0인 경우를 제외하고는 반드시 1로 시작해야 한다.
public class _1212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            String a = Integer.toBinaryString(str.charAt(i) - '0');

            if (a.length() == 2 && i != 0) a = "0" + a;
            else if (a.length() == 1 && i != 0) a = "00" + a;

            sb.append(a);
        }

        System.out.println(sb);
    }
}

