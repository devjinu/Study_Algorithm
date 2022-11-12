package backjoon._1000;

import java.util.Scanner;

//두 자연수 A와 B에 대해서, A의 배수이면서 B의 배수인 자연수를 A와 B의 공배수라고 한다. 이런 공배수 중에서 가장 작은 수를 최소공배수라고 한다.
// 예를 들어, 6과 15의 공배수는 30, 60, 90등이 있으며, 최소 공배수는 30이다.
//두 자연수 A와 B가 주어졌을 때, A와 B의 최소공배수를 구하는 프로그램을 작성하시오.
//첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 둘째 줄부터 T개의 줄에 걸쳐서 A와 B가 주어진다. (1 ≤ A, B ≤ 45,000)
//첫째 줄부터 T개의 줄에 A와 B의 최소공배수를 입력받은 순서대로 한 줄에 하나씩 출력한다.
public class _1934 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int [] A = new int[T];
        int [] B = new int[T];

        for(int i=0; i< T; i++){
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            System.out.println(operation(A[i], B[i]));
        }
    }
    public static int operation(int a, int b){
        // 최대공약수(GCD) : A와 B의 공통된 약 중에서 가장 큰 정수
        // 최소공배수(LCM) : A와 B의 공통된 배수 중에서 가장 작은 정수

        int GCD = 0;
        int A = a;
        int B = b;

        // 재귀함수를 사용하지 않은 유클리드 호제법(최대공약수)
        while (B != 0) {
            int R = A % B;
            A = B;
            B = R;
            GCD = A;
        }

        // 최소공배수 : 최대공약수 * (A / 최대공약수) * (B / 최대공약수)
        int LCM = GCD * (a / GCD) * (b / GCD);
        return LCM;
    }
}
