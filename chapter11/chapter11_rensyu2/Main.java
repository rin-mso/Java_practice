package chapter11_rensyu2;

import java.io.OutputStream;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws Exception {
        Socket sock = new Socket("smtp.example.com", 60025);
        OutputStream os = sock.getOutputStream();
        os.write("HELLO example.com\r\n".getBytes());
        os.write("MAIL FROM: asaka@example.com\r\n".getBytes());
        os.write("RCPT TO: minato@example.com\r\n".getBytes());
        os.write("DATA\r\n".getBytes());
        os.write("From: asaka@example.com\r\n".getBytes());
        os.write("Subject: Please send me your RPG\r\n".getBytes());
        os.write("Hello minato. I would like to play your RPG.\r\n".getBytes());
        os.write("Could you please send it to me ?\r\n".getBytes());
        os.write(".\r\n".getBytes());
        os.write("QUIT\r\n".getBytes());
        os.flush();
        sock.close();
    }
}
