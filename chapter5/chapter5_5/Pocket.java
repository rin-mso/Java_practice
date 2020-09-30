package chapter5_5;

// Pocket<E>から裏で作られるPoket<String>クラス
public class Pocket<String> {
    private String data;
    public void put(String d) {
        this.data = d;
    }
    public String get() {
        return this.data;
    }
}
