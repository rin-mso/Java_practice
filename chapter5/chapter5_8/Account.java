package chapter5_8;

// Accountクラス（朝香ver)
// 【利用例】new Account("2732050", Account.FUTSU)
public class Account {
    private String accountNo;
    private int balance;
    private String accountType;
    // 口座種別を整数で受け取り格納する
    public Account(String aNo, int aType) {
        /* ... */
    }
    /* ... */
    // 口座種別を表す定数宣言
    public static final int FUTSU = 1;
    public static final int TOUZA = 2;
    public static final int TEIKI = 3;
}
