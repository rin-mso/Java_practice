package chapter3_rensyu2;

import static java.lang.System.*;

import java.util.ArrayList;
import java.util.List;

// 勇者２名をHeroとしてインスタンス化してArrayListに格納後、１つずつ順番に取り出す
public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero("斎藤"); Hero h2 = new Hero("鈴木");
        List<Hero> heroes = new ArrayList<Hero>();
        heroes.add(h1); heroes.add(h2);
        for(Hero h : heroes) {
            out.println(h.getName());
        }
    }
}
