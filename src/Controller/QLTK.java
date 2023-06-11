
package Controller;

import Model.MD_QLTK;
import View.frmLogin;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import static qlstmn_20_5_2023.QLSTMN_20_5_2023.*;

public class QLTK {
    public static Connection conn;
    public static Statement state;
    public static PreparedStatement pstate;
    public static String sql,mn = "Mana";
    public static ResultSet rs;
    
    //1.Lấy nguồn : dùng để lấy dữ liệu từ CSDL và đưa vào mảng ArrayList<TaiKhoan>
    public static List<MD_QLTK> LayNguon(){
        List<MD_QLTK> arr = new ArrayList<>();
        conn = null;
        state = null;
        
        try {
            conn = DriverManager.getConnection(dbURL,Username,Password);
            sql = "Select * From Login ";
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            while (rs.next()){ // lay du lieu trong mang rs sau khi thuc hien cau lenh truy van
                MD_QLTK temp = new MD_QLTK();
                temp.setTentk(rs.getString("taikhoan"));
                temp.setMatkhau(rs.getString("matkhau"));
                arr.add(temp);
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QLTK.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if (state != null) 
               try {
                   state.close();
            } catch (SQLException ex) {
                Logger.getLogger(frmLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(frmLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return arr;
    } 
    //2.Update : Cập nhật tài khoản
    public static void Update(MD_QLTK tk, String macu){
        conn = null;
        pstate = null;
        
        try {
            conn = DriverManager.getConnection(dbURL,Username,Password);
            sql = "Update login Set taikhoan = ?, matkhau = ? Where taikhoan = ?";
            pstate = conn.prepareStatement(sql);
            pstate.setString(1, tk.getTentk());
            pstate.setString(2,tk.getMatkhau());
            pstate.setString(3, macu);
            pstate.execute();
            
            pstate.close(); 
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QLTK.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if (pstate != null){
                try {
                    pstate.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLTK.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(QLTK.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
