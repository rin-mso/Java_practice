package chapter3_9;

import static java.lang.System.*;

import java.util.ArrayList;
import java.util.List;

class Hero {
    public String name;
}

// 格納済み要素の変数のインスタンスの中身を書き換えると格納済みの要素の中身も変化する
public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "ミナト";
        List<Hero> list = new ArrayList<Hero>();
        list.add(h);    // hをリストに格納
        h.name = "スガワラ";    // 格納後にhを書き換える
        out.println(list.get(0).name);
    }
}
