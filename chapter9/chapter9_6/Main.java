package chapter9_6;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

// バイト型配列に値に書き込む
public class Main {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(65);
        baos.write(66);
        byte[] data = baos.toByteArray();   // byteは「65」「66」が入った要素数2のbyte型配列
        /* ... */
    }
}
