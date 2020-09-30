package chapter4_9;

import static java.lang.System.*;

// 複製した勇者の剣の名前を変更してみる
public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero("ミナト");
        Sword s = new Sword("はがねの剣");
        h1.setSword(s);
        out.println("装備：" + h1.getSword().getName());
        out.println("clone()で複製します");
        Hero h2 = h1.clone();
        out.println("コピー元の勇者の剣の名前を変えます");
        h1.getSword().setName("ひのきの棒");
        out.println("コピー元とコピー先の勇者の装備を表示します");
        out.println("コピー元：" + h1.getSword().getName() + "/コピー先：" + h2.getSword().getName());
    }
}
