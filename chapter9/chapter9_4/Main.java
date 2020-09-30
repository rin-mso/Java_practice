package chapter9_4;

import static java.lang.System.*;

import java.io.FileWriter;
import java.io.IOException;

// 正しく例外処理を行うプログラム（9-1を改訂）
public class Main {
    public static void main(String[] args) {
        FileWriter fw = null;       // tryブロックの外で宣言し、nullで初期化しないと、finallyブロック内でclose()が呼べない
        try {
            fw = new FileWriter("rpgsave.dat", true);
            fw.write('A');
            fw.flush();
        } catch (IOException e) {
            out.println("ファイル書き込みエラーです");
        } finally {
            if (fw != null) {
               try {
                   fw.close();
               } catch (IOException e2) {
                   ;
               }
            }
        }

    }
}
