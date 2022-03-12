package backjoon;

import java.util.Scanner;

//N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
public class _11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        String num = new String();

        num = sc.next();
        char num2[] = num.toCharArray();
        for (int j = 0; j < num2.length; j++) {
            sum+=((int)num2[j]-48);
        }
        sc.close();
        System.out.print(sum);
    }

}
