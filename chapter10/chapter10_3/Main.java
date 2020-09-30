package chapter10_3;

import static java.lang.System.*;

import java.util.StringTokenizer;

// StringTokenizerを使った文字列の分割
public class Main {
    public static void main(String[] args) {
        String s = "ミナト,アサカ,スガワラ";
        StringTokenizer st = new StringTokenizer(s, ",");
        while(st.hasMoreTokens()) {     // 次のトークンがあるか検査
            String t = st.nextToken();  // 次のトークンを取得
            out.println(t);
        }
    }
}
