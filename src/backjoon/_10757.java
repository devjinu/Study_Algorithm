package backjoon;

import java.math.BigInteger;
import java.util.Scanner;

//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//첫째 줄에 A와 B가 주어진다. (0 < A,B < 1010000)
//첫째 줄에 A+B를 출력한다.
public class _10757 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());

        System.out.println(a.add(b));
    }
}
