package backjoon;

import java.text.SimpleDateFormat;
import java.util.Date;

//서울의 오늘 날짜를 출력하는 프로그램을 작성하시오.
//입력은 없다.
//서울의 오늘 날짜를 "YYYY-MM-DD" 형식으로 출력한다.
public class _10699 {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date d = new Date();
        System.out.println(format.format(d));
    }
}
