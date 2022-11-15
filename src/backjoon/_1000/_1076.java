package backjoon._1000;

import java.util.ArrayList;
import java.util.Scanner;

//전자 제품에는 저항이 들어간다. 저항은 색 3개를 이용해서 그 저항이 몇 옴인지 나타낸다. 처음 색 2개는 저항의 값이고, 마지막 색은 곱해야 하는 값이다. 저항의 값은 다음 표를 이용해서 구한다.
//색	값	곱
//black	0	1
//brown	1	10
//red	2	100
//orange	3	1,000
//yellow	4	10,000
//green	5	100,000
//blue	6	1,000,000
//violet	7	10,000,000
//grey	8	100,000,000
//white	9	1,000,000,000
//예를 들어, 저항의 색이 yellow, violet, red였다면 저항의 값은 4,700이 된다.
//첫째 줄에 첫 번째 색, 둘째 줄에 두 번째 색, 셋째 줄에 세 번째 색이 주어진다. 위의 표에 있는 색만 입력으로 주어진다.
//입력으로 주어진 저항의 저항값을 계산하여 첫째 줄에 출력한다.
public class _1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        list.add("black");
        list.add("brown");
        list.add("red");
        list.add("orange");
        list.add("yellow");
        list.add("green");
        list.add("blue");
        list.add("violet");
        list.add("grey");
        list.add("white");

        int color = list.indexOf(sc.next())*10;
        int color2 = list.indexOf(sc.next());
        long color3 = list.indexOf(sc.next());
        System.out.println((color+color2)*(long)Math.pow(10,color3));
    }
}