package chapter5_3;

// ジェネリクスを使わず実現したPocketクラス
public class Pocket {
    private Object data;    // 格納用の変数
    public void put(Object d) {
        this.data = d;
    }
    public Object get() {
        return this.data;
    }
}
