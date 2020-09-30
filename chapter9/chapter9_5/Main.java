package chapter9_5;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

// 文字列型の変数から1文字ずつ読み込む
public class Main {
    public static void main(String[] args) throws IOException {
        String msg = "第1土曜";
        Reader sr = new StringReader(msg);
        char c1 = (char) sr.read();     // 「第」が入る
        char c2 = (char) sr.read();     // 「1」が入る
        /* ... */
    }
}
