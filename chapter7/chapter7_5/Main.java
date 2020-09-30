package chapter7_5;

import static java.lang.System.*;

// APIを用いた型情報の取得
public class Main {
    public static void main(String[] args) {
        // Stringに関する情報を取得して表示する
        Class<?> info1 = String.class;
        out.println(info1.getSimpleName());         // クラス名のみの取得
        out.println(info1.getName());               // FQCNを取得
        out.println(info1.getPackage().getName());  // 所属するパッケージ名を取得
        out.println(info1.isArray());               // 配列であればtrueを返す

        // Stringの親クラスの情報を取得する
        Class<?> info2 = info1.getSuperclass();
        out.println(info2.getName());

        // なおargsは、きちんと文字列配列として判定される
        Class<?> info3 = args.getClass();
        out.println(info3.isArray());
    }
}
