
package Controller;

import Model.MD_CTPX;
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


public class CTPX {
    public static Connection conn;
    public static Statement state;
    public static PreparedStatement pstate;
    public static String sql;
    public static ResultSet rs;

    public static List<MD_CTPX> LayNguonCTPX(String ma) {
        List<MD_CTPX> px = new ArrayList<>();
        conn = null;
        state = null;

        try {
            conn = DriverManager.getConnection(dbURL, Username, Password);
            sql = "Select MaXuat,hanghoa.MaHH,hanghoa.TenHH,chitietphieuxuat.GiaXuat,Soluong,ThanhTien"
                    + " from chitietphieuxuat,hanghoa Where "
                    + "chitietphieuxuat.MaHH = hanghoa.MaHH and MaXuat = '" + ma + "'";
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            while (rs.next()) {
                MD_CTPX temp = new MD_CTPX();
                temp.setMaxuat(rs.getString("MaXuat"));
                temp.setMahh(rs.getString("MaHH"));
                temp.setTenhh(rs.getString("TenHH"));
                temp.setGiaxuat(rs.getString("GiaXuat"));
                temp.setSoluong(rs.getString("SoLuong"));
                temp.setThanhtien(rs.getString("ThanhTien"));
                px.add(temp);
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(CTPX.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) 
               try {
                state.close();
            } catch (SQLException ex) {
                Logger.getLogger(CTPX.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(CTPX.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return px;
    }
}
