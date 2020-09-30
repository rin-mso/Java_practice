package chapter10_1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

// 勇者インスタンスの情報を保存するメソッド
public class Main {
    public void savaHeroToFile(Hero h) throws IOException {
        Writer w = new BufferedWriter(new FileWriter("rpgsave.dat"));
        w.write(h.name + "\n"); // 名前の末尾に改行をつけ保存
        w.write(h.hp + "\n");   // HPの末尾に改行をつけ保存
        w.write(h.mp + "\n");   // MPの末尾に改行をつけ保存
        w.flush();
        w.close();
    }
}
