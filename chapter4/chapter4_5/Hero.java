package chapter4_5;

// HeroクラスでhashCode()をオーバーライドする
public class Hero {
    String name;
    int hp;
    public int hashCode() {
        // 適当な初期値を決める（0以外を指定）
        int result = 37;
        // 各フィールドの影響を加える（31は奇数かつ素数なのでよく使われる）
        result = result * 31 + name.hashCode();
        result = result * 31 + hp;
        // 結果を返す
        return result;
    }
}
