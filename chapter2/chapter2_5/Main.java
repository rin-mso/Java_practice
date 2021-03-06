package chapter2_5;

import java.time.LocalDate;
import java.time.Period;

// Periodクラスの利用例
public class Main {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2012,1,1);
        LocalDate d2 = LocalDate.of(2012,1,4);

        // 3日間を表すPeriodを2通りの方法で生成
        Period p1 = Period.ofDays(3);
        Period p2 = Period.between(d1, d2);

        // d2の3日後を計算
        LocalDate d3 = d2.plus(p2);
      }
}
