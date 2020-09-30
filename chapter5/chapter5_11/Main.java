package chapter5_11;

class Outer {
    int outerField; static int outerStaticField;
    static class Inner {
        void innerMethod() {
            // staticな外部クラスメンバのみ利用可
            outerStaticField = 10;
        }
    }
    void outerMethod() {
        // 外部クラスからはInnerで利用可
        Inner ic = new Inner();
    }
}
class Main {
    public static void main(String[] args) {
        // 無関係なクラスからはOuter.Innerで利用可
        Outer.Inner ic = new Outer.Inner();
    }
}
