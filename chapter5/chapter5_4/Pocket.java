package chapter5_4;

// ジェネリクスを使ったPocketクラス
public class Pocket<E> {    // 仮引数を伴うクラス宣言
    private E data;
    public void put (E d) {
        this.data = d;
    }
    public E get() {
        return this.data;
    }
}
