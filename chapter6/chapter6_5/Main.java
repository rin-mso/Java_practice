package chapter6_5;

import java.util.function.IntToDoubleFunction;

// ブロック外部の変数にアクセスするラムダ式
public class Main {
    double b = 1.41;
    IntToDoubleFunction func = (x) -> {
        return x * x * b;
    };
}
