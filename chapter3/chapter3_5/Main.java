package chapter3_5;

import static java.lang.System.*;

import java.util.HashSet;
import java.util.Set;

// 要素の順序の確約なし
public class Main {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<String>();
        colors.add("赤");
        colors.add("青");
        colors.add("黄");
        for (String s : colors) {
            out.print(s + "→");
        }
    }
}
