package chapter10_5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

// プロパティファイルへの書き込み
public class Main {
    public static void main(String[] args) throws IOException {
        Writer fw = new FileWriter("c:¥¥rpgsave.properties");
        Properties p = new Properties();
        // データのセット
        p.setProperty("HeroName", "アサカ");
        p.setProperty("HeroHp", "62");
        p.setProperty("HeroMp", "45");
        // ファイルへ書き出す
        p.store(fw, "勇者の情報");
        fw.close();
    }
}
