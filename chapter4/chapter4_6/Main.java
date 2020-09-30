package chapter4_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 口座インスタンスの並び替え
public class Main {
    public static void main(String[] args) {
        List<Account> list = new ArrayList<Account>();
        /* ... */
        Collections.sort(list); // 並び替えの順序を指定していないためエラーとなる
    }
}
