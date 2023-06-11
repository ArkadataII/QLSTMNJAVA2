
package Controller;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static qlstmn_20_5_2023.QLSTMN_20_5_2023.*;

public class KiemTraDL {
    public static Connection conn;
    public static Statement state;
    public static String sql;
    public static ResultSet rs;
    
    public static boolean KiemTraTrungMa (String TenTruong, String TenBang, String manhap, boolean ktThem, String macu){
        boolean kq = false;
        conn = null;
        state = null;
        try {
            conn = DriverManager.getConnection(dbURL,Username,Password);
            if(ktThem == true)
                sql = "SELECT "+ TenTruong +" FROM "+ TenBang +" WHERE "+ TenTruong + " = '"+ manhap + "'";
            else 
                sql = "SELECT "+ TenTruong +" FROM "+ TenBang +" WHERE "
                        + TenTruong + " = '"+ manhap + "' AND "+ TenTruong +"<> '"+ macu +"'";
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            if(rs.next()) 
                kq = true;
            state.close(); conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(KiemTraDL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if ( state != null) 
                try {
                    state.close();
            } catch (SQLException ex) {
                Logger.getLogger(KiemTraDL.class.getName()).log(Level.SEVERE, null, ex);
            }
            if ( conn != null)
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(KiemTraDL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return kq;
    }
}
