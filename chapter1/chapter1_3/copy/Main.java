package chapter1_3.copy;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        String s1 = "Java programming";
        out.println("文字列s1の4文字目以降は" + s1.substring(3));
        out.println("文字列s1の4〜7文字目は" + s1.substring(3, 8));
    }
}
