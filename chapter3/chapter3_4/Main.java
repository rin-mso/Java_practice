package chapter3_4;

import static java.lang.System.*;

import java.util.HashSet;
import java.util.Set;

// 重複した値は追加が無視される
public class Main {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<String>();
        colors.add("赤");
        colors.add("青");
        colors.add("黄");
        colors.add("赤"); // 重複のため、追加が無視される
        out.println("色は" + colors.size() + "種類");
    }
}
