package chapter8_2;

// EqualBuilderを用いないBankクラス
public class Bank {
    String name;
    String address;
    /* ... */
    public boolean equals(Object o) {
        // 基本的な判定
        if (o == this) return true;
        if (o == null) return false;
        if (!(o instanceof Bank)) return false;
        Bank r = (Bank) o;

        // 各フィールドを比較して判定する部分
        if (!(this.name.equals(r.name))) return false;
        if (!this.address.equals(r.address)) return false;
        return true;
    }
}
