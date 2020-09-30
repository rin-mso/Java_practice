package chapter10_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

// CSV形式でデータを書き出すプログラム
public class Main {
    public void saveHeroToFile(Hero h) throws IOException {
        Writer bw = new BufferedWriter(new FileWriter("rpgsave.dat"));

        bw.write(h.name);
        bw.write(",");
        bw.write(h.hp);
        bw.write(",");
        bw.write(h.mp);
    }
}
