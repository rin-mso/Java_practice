package chapter2_1;

import static java.lang.System.*;

import java.util.Date;

// Date型のおさらい
public class Main {
    public static void main(String[] args) {
        Date now = new Date();
        out.println(now);
        out.println(now.getTime());
        Date past = new Date(1316622225935L);
        out.println(past);
    }
}
