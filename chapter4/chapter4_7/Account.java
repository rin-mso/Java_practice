package chapter4_7;

// Comparebleインターフェースを実装し、自然順序づけする
public class Account implements Comparable<Account> {
    int number; // 口座番号
    /* ... */
    public int compareTo(Account obj) {
        // 自分自身がobjよりも小さい場合objの前に整列
        if (this.number < obj.number) {
            return -1;
        }
        // 自分自身がobjよりも大きい場合objの後に整列
        if (this.number > obj.number) {
            return 1;
        }
        // 等しい場合
        return 0;
    }

}
