package chapter9_1;

import java.io.FileWriter;
import java.io.IOException;

// FileWriterを用いたサンプルコード
public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("c:¥¥rpgsave.dat", true);    // STEP1
        fw.write('A');                                              // STEP2
        fw.flush();                                                 // STEP3
        fw.close();                                                 // STEP4
    }
}
