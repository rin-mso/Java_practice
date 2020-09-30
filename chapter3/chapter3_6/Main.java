package chapter3_6;

import static java.lang.System.*;

import java.util.Set;
import java.util.TreeSet;

// 要素を自然順序づけで整列させる
public class Main {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>();
        words.add("dog");
        words.add("cat");
        words.add("wolf");
        words.add("panda");
        for (String s : words) {
            out.print(s + "→");
        }
    }
}
