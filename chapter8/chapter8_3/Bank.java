package chapter8_3;

import org.apache.commons.lang3.builder.EqualsBuilder;

// EqualsBuilderを用いたBankクラス
public class Bank {
    String name;
    String address;
    /* ... */
    public boolean equals(Object o) {
        // 全てのフィールドが等価であるか自動的に調べて返す
        return EqualsBuilder.reflectionEquals(this, o);
    }
}
