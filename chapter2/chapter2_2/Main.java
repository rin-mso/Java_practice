package chapter2_2;

import static java.lang.System.*;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

// InstantおよびZonedDateTimeの利用例
public class Main {
    public static void main(String[] args) {
        // Instantの生成
        Instant i1 = Instant.now();       // 現在日時を取得

        // Instantとlong値との相互変換
        Instant i2 = Instant.ofEpochMilli(31920291332L);
        long l = i2.toEpochMilli();

        // ZonedDateTimeの生成
        ZonedDateTime z1 = ZonedDateTime.now();  // 現在日時を取得
        ZonedDateTime z2 = ZonedDateTime.of(     // 日時を指定して取得
          2014, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo") );

        // InstantとZoneDateTimeの相互変換
        Instant i3 = z2.toInstant();
        ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

        // ZonedDateTimeの利用
        out.println("東京:" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
        out.println("ロンドン:" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());
        if(z2.isEqual(z3)) {
          out.println("これらは同じ瞬間を指しています");
        }
      }
}
