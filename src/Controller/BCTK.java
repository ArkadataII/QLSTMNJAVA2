
package Controller;

import Model.MD_PN;
import Model.MD_PX;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static qlstmn_20_5_2023.QLSTMN_20_5_2023.Password;
import static qlstmn_20_5_2023.QLSTMN_20_5_2023.Username;
import static qlstmn_20_5_2023.QLSTMN_20_5_2023.dbURL;


public class BCTK {
    public static Connection conn;
    public static Statement state;
    public static PreparedStatement pstate;
    public static String sql;
    public static ResultSet rs;

    public static List<MD_PN> LayNguonPN(String tu, String den) {
        List<MD_PN> pn = new ArrayList<>();
        List<MD_PX> px = new ArrayList<>();
        conn = null;
        state = null;

        try {
            conn = DriverManager.getConnection(dbURL, Username, Password);
            sql = "Select * from phieunhap Where NgayNhap >= '"+ tu + "' And NgayNhap <= '"+ den + "'";
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            while (rs.next()) {
                MD_PN temp = new MD_PN();
                temp.setManhap(rs.getString("MaNhap"));
                temp.setMancc(rs.getString("MaNCC"));
                temp.setManv(rs.getString("MaNV"));
                temp.setNgaynhap(rs.getString("NgayNhap"));
                temp.setTongtien(rs.getString("TongTien"));
                pn.add(temp);
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(BCTK.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) 
               try {
                state.close();
            } catch (SQLException ex) {
                Logger.getLogger(BCTK.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(BCTK.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return pn;
    }
    
    
    public static List<MD_PX> LayNguonPX(String tu, String den) {
        List<MD_PX> px = new ArrayList<>();
        conn = null;
        state = null;

        try {
            conn = DriverManager.getConnection(dbURL, Username, Password);
            sql = "Select * from phieuxuat Where NgayXuat >= '"+ tu + "' And NgayXuat <= '"+ den + "'";
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            while (rs.next()) {
                MD_PX temp = new MD_PX();
                temp.setMaxuat(rs.getString("MaXuat"));
                temp.setManv(rs.getString("MaNV"));
                temp.setNgayxuat(rs.getString("NgayXuat"));
                temp.setTongtien(rs.getString("TongTien"));
                px.add(temp);
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(BCTK.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) 
               try {
                state.close();
            } catch (SQLException ex) {
                Logger.getLogger(BCTK.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(BCTK.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return px;
    }
    
    
}
