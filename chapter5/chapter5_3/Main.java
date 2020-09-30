package chapter5_3;

import static java.lang.System.*;

// Pocketクラスを利用するプログラム
public class Main {
    public static void main(String[] args) {
        Pocket p = new Pocket();
        p.put("1192");
        String s = (String) p.get();    // 取り出すときにキャストが必要
        out.println(s);
    }
}
