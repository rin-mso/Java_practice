package chapter3_8;

import static java.lang.System.*;

import java.util.HashMap;
import java.util.Map;

// HashMapの中身を繰り返し取得し１つずつ取り出す
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> prefs = new HashMap<String, Integer>();
        prefs.put("京都府", 255);
        prefs.put("東京都", 1261);
        prefs.put("熊本県", 182);
        for (String key : prefs.keySet()) {
            int value = prefs.get(key);
            out.println(key + "の人口は、" + value);
        }
    }
}
