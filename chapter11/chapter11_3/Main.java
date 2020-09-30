package chapter11_3;

import static java.lang.System.*;

import java.net.ServerSocket;
import java.net.Socket;

// ServerSocketを使ったシンプルなサーバープログラム
public class Main {
    public static void main(String[] args) throws Exception {
        out.println("起動完了。");
        ServerSocket svSock = new ServerSocket(39648);      // 待ち受けポート
        // 呼び出すと誰かから接続されるまで待ち続ける
        Socket sock = svSock.accept();
        out.println(sock.getInetAddress() + "から接続");
        sock.getOutputStream().write("WELCOME".getBytes());
        sock.getOutputStream().flush();
        sock.close();
    }
}
