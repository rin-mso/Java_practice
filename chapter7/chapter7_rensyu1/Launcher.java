package chapter7_rensyu1;

import static java.lang.System.*;

import java.lang.reflect.Method;

// TODO 要復習！しっかりと書き方を理解すること。
public class Launcher {
    public static void main(String[] args) {
        // コマンドライン引数から、次の２つの情報を受け取る
        String fqcn = args[0];
        String sw = args[1];
        showMemory();
        try {
            Class<?> clazz = Class.forName(fqcn);
            listMethods(clazz);
            if(sw.equals("E")) {
                launchExternal(clazz);
            } else if(sw.equals("I")) {
                launchInternal(clazz);
            } else {
                throw new IllegalArgumentException("起動方法の指定が不正です.");
            }
        } catch(Exception e) {
            out.println(e.getMessage());
            e.printStackTrace();
            exit(1);
        }
        showMemory();
        exit(0);
    }

    // FQCNクラスがもつ、全てのメソッド名を画面に表示する
    public static void listMethods(Class<?> clazz) {
        out.println("メソッドの一覧を表示します.");
        Method[] methods = clazz.getDeclaredMethods();
        for(Method m : methods) {
            out.println(m.getName());
        }
    }

    // 起動の仕方がEのとき、ProcessBuilderで別プロセスとして起動する
    public static void launchExternal(Class<?> clazz) throws Exception {
        ProcessBuilder pb = new ProcessBuilder("java", clazz.getName());
        Process proc = pb.start();
        proc.waitFor();     // プロセスの終了まで待つ
    }

    // 起動の仕方がIのとき、リフレクションでmainメソッドを呼び出す
    public static void launchInternal(Class<?> clazz) throws Exception {
        Method m = clazz.getMethod("main", String[].class);
        String[] args = {};
        m.invoke(null, (Object)args);   // 静的メソッド呼び出し時は第一引数は任意
    }

    // 現在のメモリ使用量を表示する
    public static void showMemory() {
        long free = Runtime.getRuntime().freeMemory();
        long total = Runtime.getRuntime().totalMemory();
        long usage = (total - free) / 1024 / 1024;
        out.println("現在のメモリ使用量: " + usage + "MB");
    }
}
