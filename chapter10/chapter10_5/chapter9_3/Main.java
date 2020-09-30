package chapter9_3;

import java.io.FileOutputStream;
import java.io.IOException;

// ファイルに2進数の01000001を追記するプログラム
public class Main {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("rpgsave.dat", true);
        fos.write(65);      // 62は2進数で01000001
        fos.flush();
        fos.close();
    }
}
