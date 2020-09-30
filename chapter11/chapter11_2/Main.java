package chapter11_2;

import static java.lang.System.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

// Socketを用いてhttp://dokojava.jp/index.htmlを取得する
public class Main {
    public static void main(String[] args) throws IOException {
        // サーバー名とポート番号を指定
        Socket sock = new Socket("dokojava.jp", 80);
        // ②Socketから入力ストリームと出力ストリームを取得する
        InputStream is = sock.getInputStream();
        OutputStream os = sock.getOutputStream();
        // ③HTTP要求を送信
        os.write("GET /index.html HTTP/1.0\r\n".getBytes());
        os.write("\r\n".getBytes());
        os.flush();
        InputStreamReader isr = new InputStreamReader(is);
        // ③応答を送信
        int i = isr.read();
        while(i != -1) {
            out.print((char) i);
            i = isr.read();
        }
        // ④Socketを閉じる
        sock.close();
    }
}
