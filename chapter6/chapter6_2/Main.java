package chapter6_2;

import static java.lang.System.*;

import java.util.function.IntBinaryOperator;

public class Main {

    // 2つのint値を受け取り、その差を求め、結果を返す関数
    public static int sub(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        // subメソッドの処理ロジックを、変数funcに代入する
        IntBinaryOperator func = Main::sub;
        // 変数funcに格納されている処理ロジックを、引数5と3で実行する
        int a = func.applyAsInt(5, 3);
        out.println("5-3は" + a);
    }
}
