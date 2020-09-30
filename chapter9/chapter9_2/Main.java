package chapter9_2;

import static java.lang.System.*;

import java.io.FileReader;
import java.io.IOException;

// FileReaderを用いたサンプルコード
public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fw = new FileReader("rpgsave.dat");         // STEP1
        out.println("すべてのデータを読んで表示します");
        int i = fw.read();                                     // STEP2
        while (i != -1) {       // これ以上読めるデータがない場合は-1
            char c = (char) i;
            out.println(c);
            i = fw.read();
        }
        out.println("ファイルの末尾に到達しました");
        fw.close();                                             // STEP3
    }
}
