package chapter1_4.copy;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i ++) {
           sb.append("Java");
        }
        String s = sb.toString();
    }
}