package chapter5_10;

// 列挙型を活用して型安全にしたAccountクラス
// 【利用例】new Account("1732050", AccountType.FUTSU)
public class Account {
    private String accountNo;
    private int balance;
    private AccountType accountType;
    // 口座種別を列挙型で受け取り格納
    public Account(String aNo, AccountType aType) {
        /* ... */
    }
}
