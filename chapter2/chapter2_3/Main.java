package chapter2_3;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

// LocalDateTimeの利用例
public class Main {
    public static void main(String[] args) {
        // LocalDateTimeの生成
        LocalDateTime l1 = LocalDateTime.now();  // 現在日時を取得
        LocalDateTime l2 = LocalDateTime.of(     // 2014年1月1日9時5分を指定して取得
          2014, 1, 1, 9, 5, 0, 0);

        // LocalDateTimeとZoneDateTimeの相互変換
        ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
        LocalDateTime l3 = z1.toLocalDateTime();
      }
}
