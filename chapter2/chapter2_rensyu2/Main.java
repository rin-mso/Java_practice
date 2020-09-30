package chapter2_rensyu2;

import static java.lang.System.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Java８以降で利用可能なAPIを利用して、現在の日付の100日後の日付を表示する
public class Main {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate future = now.plusDays(100);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
        out.println(future.format(f));
    }
}
