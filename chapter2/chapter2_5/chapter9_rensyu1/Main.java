package chapter9_rensyu1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// FileInputStreamとFileOutputStreamを使ってファイルをコピーするプログラムを作成
public class Main {
    public static void main(String[] args) throws IOException {
        String inFile = args[0];
        String outFile = args[1];
        FileInputStream fis = new FileInputStream(inFile);
        FileOutputStream fos = new FileOutputStream(outFile);
        int i = fis.read();
        while (i != -1) {
            fos.write(i);
            fis.read();
        }
        fos.flush();
        fos.close();
        fis.close();
    }
}
