package chapter12_6;

import static java.lang.System.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// 基本パターンコード（トランザクション利用時）
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
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "sm813021");  // JDBC URLを指定
            con.setAutoCommit(false);       // 手動コミットモードに切替

            // STEP 2-1-1: 送信すべきSQL文のひな形を準備
            PreparedStatement pstmt =con.prepareStatement
                    ("SELECT * FROM MONSTERS WHERE HP >= ?");

            // STEP 2-1-2: ひな形に値を流し込みSQL文を組み立て送信する
            pstmt.setInt(1, 10);
            ResultSet rs = pstmt.executeQuery();

            // STEP 2-1-3: 処理結果を判定する
            while(rs.next()) {
                out.println(rs.getString("NAME"));      // 注目行の処理
            }

            // メインのDB処理終了後、コミット
            con.commit();
        } catch(SQLException e) {
            try {
                con.rollback();
            } catch(SQLException e2) {
                e.printStackTrace();        // 接続やSQL処理の失敗時の処理
            } finally {
                // STEP3: データベース接続の切断
                if (con != null) {
                    try {
                    con.close();
                    } catch (SQLException e3) {
                    e.printStackTrace();        // 切断失敗時の処理
                    }
                }
            }
        }
    }
}
