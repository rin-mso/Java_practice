package chapter10_7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// 勇者インスタンスの情報を読み込むメソッド
public class Hero {
    String name;
    int hp;
    int mp;

    Hero(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public Hero loadHeroFromFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("c:¥¥rpgsave.dat"));
        String name = br.readLine();
        String hp = br.readLine();
        String mp = br.readLine();
        br.close();
        return new Hero(name, Integer.parseInt(hp), Integer.parseInt(mp));
    }
}
