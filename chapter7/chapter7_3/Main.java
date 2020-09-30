package chapter7_3;

import static java.lang.System.*;

import java.util.Iterator;
import java.util.Properties;

// システムプロパティの利用
public class Main {
    public static void main(String[] args) {
        out.println("ご利用のJavaのバージョン");
        out.println(System.getProperty("java.version"));
        Properties p = System.getProperties();
        Iterator<String> i = p.stringPropertyNames().iterator();
        out.println("【システムプロパティ一覧】");
        while (i.hasNext()) {
            String key = i.next();
            out.println(key + " = ");
            out.println(System.getProperty(key));
        }
    }
}
