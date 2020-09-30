package chapter6_3;

import static java.lang.System.*;

public class Main {
    public static int sub(int a, int b) {
        return a - b;
    }
    public static void main(String[] args) {
        // 宣言したインターフェースの型に代入
        MyFunction func = Main::sub;
        // インターフェースのメソッドで呼び出し
        int a = func.call(5, 3);
        out.println("5-3は" + a);
    }
}
