package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static qlstmn_20_5_2023.QLSTMN_20_5_2023.Password;
import static qlstmn_20_5_2023.QLSTMN_20_5_2023.Username;
import static qlstmn_20_5_2023.QLSTMN_20_5_2023.dbURL;

public class TuTaoMa {

    public static Connection conn;
    public static Statement state;
    public static String sql, ktn;
    public static ResultSet rs;
    public static String loaima;

    public static String Taoma(String tenbang, String key, String dinhdang) {
        conn = null;
        state = null;

        try {
            conn = DriverManager.getConnection(dbURL, Username, Password);
            sql = "Select "+ key +" From " + tenbang +" Order by "+ key ;
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            int i = 0;
            rs.last();
            int row = rs.getRow();
            rs.beforeFirst();
            if (rs.next()) {
                rs.beforeFirst();
                do {
                    rs.next();
                    if (i == row) {
                        if (i < 9) {
                            loaima = dinhdang + "0" + String.valueOf(i + 1);
                        } else {
                            loaima = dinhdang + String.valueOf(i + 1);
                        }
                    } else {
                        if (i < 9) {
                            ktn = dinhdang + "0" + String.valueOf(i + 1);
                            loaima = ktn;
                        } else {
                            ktn = dinhdang + String.valueOf(i + 1);
                        }
                        if (ktn.equals(rs.getString(key)) == false) {
                            loaima = ktn;
                            break;
                        }
                    }
                    i++;
                }while(i<=row);
            } else {
                loaima = dinhdang + "0" + "1";
            }

            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(TuTaoMa.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) 
                try {
                state.close();
            } catch (SQLException ex) {
                Logger.getLogger(KiemTraDL.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null)
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(KiemTraDL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return loaima;
    }
}
