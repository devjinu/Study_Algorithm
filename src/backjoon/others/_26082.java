package backjoon.others;

import java.util.Scanner;

//WARBOY는 글로벌 AI 반도체 벤치마크 대회의 이미지 분류, 객체 검출 처리 속도 면에서 가장 좋은 성적을 받았다. 특히, WARBOY는 가격 대비 성능이 경쟁사 제품의 3배나 되어 많은 관심을 끌었다.
//가격 대비 성능은 아래와 같은 수식으로 계산된다.
// 가격대비성능 = 성능 / 가격
// 경쟁사 제품의 가격 A, 경쟁사 제품의 성능 B, WARBOY의 가격 C가 주어질 때, WARBOY의 성능을 구해보자.
//첫째 줄에 세 양의 정수 A, B, C(1 <= A, B, C <= 1000)가 공백으로 구분되어 주어진다.
//B는 항상 A의 배수이다.
//첫째 줄에 WARBOY의 성능을 출력한다.
public class _26082 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int x = (B / A) * 3 * C;
        System.out.println(x);
    }
}
