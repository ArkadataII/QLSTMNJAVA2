
package Controller;

import Model.MD_CTPN;
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
import static qlstmn_20_5_2023.QLSTMN_20_5_2023.*;


public class CTPN {
    public static Connection conn;
    public static Statement state;
    public static PreparedStatement pstate;
    public static String sql;
    public static ResultSet rs;

    public static List<MD_CTPN> LayNguonCTPN(String ma) {
        List<MD_CTPN> pn = new ArrayList<>();
        conn = null;
        state = null;

        try {
            conn = DriverManager.getConnection(dbURL, Username, Password);
            sql = "Select MaNhap,hanghoa.MaHH,hanghoa.TenHH,chitietphieunhap.GiaNhap,Soluong,ThanhTien"
                    + " from chitietphieunhap,hanghoa Where "
                    + "chitietphieunhap.MaHH = hanghoa.MaHH and MaNhap = '" + ma + "'";
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            while (rs.next()) {
                MD_CTPN temp = new MD_CTPN();
                temp.setManhap(rs.getString("MaNhap"));
                temp.setMahh(rs.getString("MaHH"));
                temp.setTenhh(rs.getString("TenHH"));
                temp.setGianhap(rs.getString("GiaNhap"));
                temp.setSoluong(rs.getString("Soluong"));
                temp.setThanhtien(rs.getString("ThanhTien"));
                pn.add(temp);
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(CTPN.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) 
               try {
                state.close();
            } catch (SQLException ex) {
                Logger.getLogger(CTPN.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(CTPN.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return pn;
    }
}
