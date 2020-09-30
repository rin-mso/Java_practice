package chapter10_9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// 勇者インスタンスを保存し、復元するサンプルコード
public class Main {
    public static void main(String[] args) throws Exception {
        Hero hero1 = new Hero("ミナト", 75, 18);
        // ①インスタンスの直列化と保存
        FileOutputStream fos = new FileOutputStream("c:¥¥rpgsave.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(hero1);     // インスタンス→バイト列
        oos.flush();
        oos.close();

        // ②ファイルからインスタンスを復元
        FileInputStream fis = new FileInputStream("c:¥¥rpgsave.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Hero hero2 = (Hero) ois.readObject();       // バイト列→インスタンス
        ois.close();
    }
}
