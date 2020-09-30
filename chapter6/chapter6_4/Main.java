package chapter6_4;

import static java.lang.System.*;

import java.util.function.IntBinaryOperator;

// 関数をその場で生み出し、代入し、呼び出す
public class Main {
    public static void main(String[] args) {
        // 2つの引数の差を求める処理の実体を生み出し、代入する
        IntBinaryOperator func = (int a, int b) -> { return a - b; };   // 右辺が実行された瞬間、関数の実体が生み出される
        int a = func.applyAsInt(5, 3);
        out.println("5-3は" + a);
    }
}
