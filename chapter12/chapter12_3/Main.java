package chapter12_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
            PreparedStatement pstmt =con.prepareStatement
                    ("SELECT * FROM MONSTERS WHERE HP <= ?");

            // STEP 2-1-2: ひな形に値を流し込みSQL文を組み立て送信する
            pstmt.setInt(1, 10);
            ResultSet rs = pstmt.executeQuery();

            /* STEP 2-1-3: 処理結果を判定する
             * 後ほど記述
             */
            rs.close();
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
