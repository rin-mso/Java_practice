package chapter7_6;

import static java.lang.System.*;

// リフレクションを用いてメンバを調節操作する
public class RefSample {
    public int times = 0;
    public RefSample(int t) {
        this.times = t;
    }
    public void hello(String msg) {
        this.hello(msg, this.times);
    }
    public void hello(String msg, int t) {
        out.println("hello, " + msg + " x" + t);
    }
}
