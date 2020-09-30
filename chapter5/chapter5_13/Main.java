package chapter5_13;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Pocket<Object> pocket = new Pocket<Object>();
        out.println("使い捨てのインスタンスを作りpocketに入れます");
        // メンバを２つ持つ匿名クラスを宣言すると同時にインスタンス化
        pocket.put(new Object() {
           String innerField;
           void innerMethod() {
               /* ... */
           }
        });
    }
}
