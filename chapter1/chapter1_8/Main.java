package chapter1_8;

import static java.lang.System.*;

// splitメソッドを使った文字列の分割
public class Main {
    public static void main(String[] args) {
        String s = "abc,def:ghi";
        String[] words = s.split("[,:]");   // 正規表現パターン
        for(String w : words) {
            out.println(w + "->");
        }
    }
}
