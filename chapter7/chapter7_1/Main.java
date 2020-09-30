package chapter7_1;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        // 何らかのデータを読み込む処理
        if (/* データが正しくないなら */) {
            out.println("データが壊れてます。以上終了します。");
            exit(1);    // ここでJVMを異常終了
        }
        out.println("正常終了しました。");
    }
}
