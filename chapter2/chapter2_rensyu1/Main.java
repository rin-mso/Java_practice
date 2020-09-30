package chapter2_rensyu1;

import static java.lang.System.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// 現在の日付の100日後の日付を表示する
public class Main {
    public static void main(String[] args) {
        // ①現在の日時をDate型で取得
        Date now = new Date();
        Calendar c = Calendar.getInstance();
        // ②取得した日時情報をCalendarにセット
        c.setTime(now);
        // ③Calendarから「日」の情報を取得
        int day = c.get(Calendar.DAY_OF_MONTH);
        // ④取得した値に100を足してCalendarの「日」にセット
        day += 100;
        c.set(Calendar.DAY_OF_MONTH, day);
        // ⑤Calendarの日付情報をDate型に変換
        Date future = c.getTime();
        // ⑥指定された形式で表示
        SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
            out.println(f.format(future));
        }
    }