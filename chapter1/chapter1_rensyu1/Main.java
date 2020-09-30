package chapter1_rensyu1;

// 1から100間での整数をカンマで連結した文字列sを生成し、カンマで分割してString配列aに格納
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 100; i++) {
            sb.append(i+1).append(",");
        }
        String s = sb.toString();
        String[] a = s.split(",");
    }
}
