package chapter8_4;

import org.apache.commons.lang3.builder.HashCodeBuilder;

// HashCodeBuilderを用いたBankクラス
public class Bank {
    String name;
    String address;
    /* ... */
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);    // ハッシュ値を生成
    }
}
