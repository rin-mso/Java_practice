package chapter1_1.copy;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        String s1 = "スッキリJava";
        String s2 = "Java";
        String s3 = "java";
        // 内容が等しい場合
        if (s2.contentEquals(s3)) {
            out.println("s2とs3は等しい");
        }
        // 大文字・小文字を区別しなければ内容が等しい場合
        if (s2.equalsIgnoreCase(s3)) {
            out.println("s2とs3はケースを区別しなければ等しい");
        }
        out.println("s1の長さは" + s1.length() + "です");

        // s1が空文字の場合
        if (s1.isEmpty()) {
            out.println("s1は空文字です");
        }
    }
}
