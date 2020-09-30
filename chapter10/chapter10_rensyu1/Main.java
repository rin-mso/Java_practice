package chapter10_rensyu1;

import static java.lang.System.*;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader fr = new FileReader("c:¥¥pref.properties");
        Properties p = new Properties();
        p.load(fr);
        out.println(getProperty("aichi.capital") + ":" + p.getProperty("aichi.food"));
        fr.close();
    }
}
