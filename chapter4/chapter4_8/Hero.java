package chapter4_8;

// clone()による複製をサポートしたHeroクラス
// ①Cloneableインターフェースを実装
public class Hero implements Cloneable {
    String name;    // 名前
    int hp;         // HP
    Sword sword;    // 装備している剣
    /* ... */

    // ②cloneメソッドをpublicでオーバーライド
    public Hero clone() {
        Hero result = new Hero();
        result.name = this.name;
        result.hp = this.hp;
        result.sword = this.sword;
        return result;
    }
}
