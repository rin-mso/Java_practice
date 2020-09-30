package chapter7_2;

import static java.lang.System.*;

// 計算処理が終了したらメモ帳を起動する
public class Main {
    public static void main(String[] args) throws Exception {
        out.println("計算を開始します");
        // この間に計算処理を行う
        out.println("計算完了。結果をメモ帳で表示します。");
        ProcessBuilder pb = new ProcessBuilder(
                "c:¥¥windows¥¥system32¥¥notepad.exe",   // 「メモ帳」の実行ファイル
                "calcreport.txt"
        );
        pb.start(); // メモ帳を起動
    }
}
