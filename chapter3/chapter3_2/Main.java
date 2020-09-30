package chapter3_2;

import java.util.ArrayList;
import java.util.Iterator;

// イテレータの取得
public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("湊");
        names.add("朝香");
        names.add("菅原");
        Iterator<String> it = names.iterator();
    }
}
