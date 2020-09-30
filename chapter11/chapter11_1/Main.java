package chapter11_1;

import static java.lang.System.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

// http://dokojava.jpを取得するプログラム
public class Main {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://dokojava.jp");
        InputStream is = url.openStream();
        InputStreamReader isr = new InputStreamReader(is);
        int i = isr.read();
        while(i != -1) {
            out.print((char) i);
            i = isr.read();
        }
        isr.close();
    }
}
