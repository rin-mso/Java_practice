package chapter4_2;

public class Account {
    String accountNo;   // 口座番号（先頭に空白が入ることもある）
    /* ... */
    public boolean equals(Object o) {
        // 自分自身が引数として渡されてきた場合
        if (o == this) return true;
        // 引数がnullの場合
        if (o == null) return false;
        // 型を比較して異なる場合
        if (!(o instanceof Account)) return false;
        Account r = (Account) o;
        // フィールド同士を比較して等価か判定（先頭と末尾の空白を取り除いた口座番号が等しければ等価）
        if(!this.accountNo.trim().equals(r.accountNo.trim())) {
            return false;
        }
        return true;
    }
}
