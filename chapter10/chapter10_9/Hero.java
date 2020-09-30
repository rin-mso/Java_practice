package chapter10_9;

import java.io.Serializable;

// 直列化に対応したHeroクラス
public class Hero implements Serializable {
    private String name;
    private int hp;
    private int mp;
    /* ... */
    Hero (String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }
}
