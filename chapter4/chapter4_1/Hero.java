package chapter4_1;

// toString()メソッドのオーバーライド
public class Hero {
    private String name;
    private int hp, mp;
    /* ....*/
    public String toString() {
        return "勇者（名前 =" + this.name + "/HP=" + this.hp + "/MP=" + this.mp + ")";
    }
}
