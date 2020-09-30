package chapter10_4;

import static java.lang.System.*;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

// プロパティファイルを読み込むコード
public class Main {
    public static void main(String[] args) throws IOException {
        Reader fr = new FileReader("c:¥¥fpgdata.proparties");
        Properties p = new Properties();
        // ファイル内容を読み込む
        p.load(fr);
        // キーを指定し、値を取り出す
        String name = p.getProperty("heroName");
        String strHp = p.getProperty("HeroHp");
        int hp = Integer.parseInt(strHp);
        out.println("勇者の名前：" + name);
        out.println("勇者のHP：" + hp);
        fr.close();
    }
}
