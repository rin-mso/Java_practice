package chapter5_6;

import static java.lang.System.*;

// Pocketクラス（chapter5_4)を利用するプログラム
public class Main {
    public static void main(String[] args) {
        Pocket<String> p = new Pocket<String>();
        p.put("1192");
        String s = p.get();
        out.println(s);
    }
}
