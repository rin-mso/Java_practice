package chapter4_3;

import static java.lang.System.*;

import java.util.ArrayList;
import java.util.List;

// equals()オーバーライドをサボったHeroをコレクションに入れる
class Hero {
    public String name;
}

public class Main {
    public static void main(String[] args) {
        List<Hero> list = new ArrayList<Hero>();
        Hero h1 = new Hero();
        h1.name = "ミナト";
        list.add(h1);
        out.println("要素数=" + list.size());
        h1 = new Hero();
        h1.name = "ミナト";
        list.remove(h1);    // 名前がミナトの勇者を削除
        out.println("要素数=" + list.size());
    }
}
