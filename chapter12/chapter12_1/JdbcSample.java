package chapter12_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class JdbcSample {
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
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "sm813021");  // JDBC URLを指定
            // STEP 2:SQL送信処理
            /***********************************
              後ほど記述
             ***********************************/
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
