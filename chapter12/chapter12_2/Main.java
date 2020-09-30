package chapter12_2;

import static java.lang.System.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main (String[] args) {
        try {
            // インストールしたMySQLのドライバを指定
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();        // JRDCドライバJARが見つからない場合の処理
        }
        /* ... */
        Connection con = null;
        try {
            // STEP1:データベースの接続
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "xxxxx");  // JDBC URLを指定

            // STEP 2-1-1: 送信すべきSQL文のひな形を準備
            PreparedStatement pstmt = con.prepareStatement
                    ("DELETE FROM MONSTERS WHERE HP <= ? OR NAME = ?");

            // STEP 2-1-2: ひな形に値を流し込みSQL文を組み立て送信する
            pstmt.setInt(1, 10);
            pstmt.setString(2, "ゾンビ");
            int r = pstmt.executeUpdate();

            // STEP 2-1-3: 処理結果を判定する
            if (r != 0) {
                out.println(r + "件のモンスターを削除しました");
            } else {
                out.println("該当するモンスターはいませんでした");
            }
            pstmt.close();
        } catch(SQLException e) {
            e.printStackTrace();        // 接続やSQL処理の失敗時の処理
        } finally {
            // STEP3: データベース接続の切断
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();        // 切断失敗時の処理
                }
            }
        }
    }
}
