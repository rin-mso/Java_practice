package chapter1_2.copy;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        String s1 = "Java abd JavaScript";
        if (s1.contains("Java")) {
            out.println("文字列s1は、Javaを含んでいます");
        }
        if (s1.endsWith("Java")) {
            out.println("文字列s1は、Javaが末尾にあります");
        }
        out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
        out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));
    }
}
