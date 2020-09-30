package chapter7_4;

import static java.lang.System.*;

// Javaプログラム起動時にシステムプロパティの追加を指定する
public class Main {
    public static void main(String[] args) {
        // RPGのバージョンを設定
        System.setProperty("rpg.version", "0.3");

        // RPGの作者を設定
        System.setProperty("rpg.author", "湊");

        /* 本来必要なコードはここから */
        String ver = System.getProperty("rpg.version");
        String author = System.getProperty("rpg.author");
        out.println("RPG：スッキリ魔王征伐 ver" + ver);
        out.println("Developed by" + author);
    }
}
