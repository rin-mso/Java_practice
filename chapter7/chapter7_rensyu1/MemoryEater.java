package chapter7_rensyu1;

import static java.lang.System.*;

public class MemoryEater {
    public static void main(String[] args) {
        out.println("eating memory...");
        long[] larray = new long[1280000];
        for(int i = 0; i < larray.length; i++) {
            larray[i] = i;
        }
    }
}
