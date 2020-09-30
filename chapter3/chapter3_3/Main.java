package chapter3_3;

import java.util.ArrayList;
import java.util.Iterator;

// イテレータを用いたリスト要素の取り出し
public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("湊");
        names.add("朝香");
        names.add("菅原");
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String e = it.next();
            System.out.println(e);
        }
    }
}
