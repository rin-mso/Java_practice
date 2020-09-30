package chapter5_12;

import static java.lang.System.*;

// ローカルクラスの利用例
public class Outer {
    int outerMember;    // 非staticメンバ
    void outerMethod() {
        int a = 10;     // 非finalローカル変数
        // Innerを定義
        class Inner {
            public void innerMethod() {
                out.println("innerMethodです");
                out.println(outerMember);
            }
        }
        // 同じメソッド内ですぐに利用
        Inner ic = new Inner();
        ic.innerMethod();
    }
}
