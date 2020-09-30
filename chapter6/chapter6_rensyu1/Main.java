package chapter6_rensyu1;

import static java.lang.System.*;

interface Func1 {
    boolean call(int x);
}

interface Func2 {
    String call(boolean male, String name);
}

public class Main {
    public static void main(String[] args) {
        FuncList funclist = new FuncList();
        //TODO f1とf2のFuncListが大文字と小文字で違う理由を確認する
        Func1 f1 = FuncList::isOdd;
        Func2 f2 = funclist::addNamePrefix;
        out.println(f1.call(15));
        out.println(f2.call(true, "Smith"));
    }
}
