package chapter5_rensyu1;

/* 型が開発時に未定で、put()でインスタンスを保存し、
   キャストを使用せずにget()でインスタンスを取得できるクラス */
public class StrongBox<E> {
    private E item;
    public void put(E i) {
        this.item = i;
    }
    public E get() {
        return this.item;
    }
}
