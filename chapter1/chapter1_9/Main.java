package chapter1_9;

import static java.lang.System.*;

// キャラクター状態１人分の表示のためのコード
public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();

        final String FORMAT = "%8s %6s 所持金%,5d";
        String s = String.format(FORMAT,
          hero.getName(), hero.getGold(), hero.getGold());
        out.println(s);

    }
}
