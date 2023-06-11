
package Controller;


import Model.MD_QLNH;
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


public class QLNH {
    
    public static Connection conn;
    public static Statement state;
    public static PreparedStatement pstate;
    public static String sql;
    public static ResultSet rs;
    
    public static List<MD_QLNH> LayNguon() {
        List<MD_QLNH> arr = new ArrayList<>();
        conn = null;
        state = null;

        try {
            conn = DriverManager.getConnection(dbURL, Username, Password);
            sql = "Select * from nhomhang";
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            while (rs.next()) {
                MD_QLNH temp = new MD_QLNH();
                temp.setManh(rs.getString("MaNH"));
                temp.setTennh(rs.getString("TenNhomHang"));
                arr.add(temp);
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QLNH.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) 
               try {
                state.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLNH.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLNH.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return arr;
    }
    
    public static List<MD_QLNH> TimKiem(String tk) {
        List<MD_QLNH> a = new ArrayList<>();
        conn = null;
        state = null;

        try {
            conn = DriverManager.getConnection(dbURL, Username, Password);
            sql = "Select * from nhomhang"
                    + " Where (MaNH LIKE '%" + tk + "%') OR (TenNhomHang LIKE '%" + tk + "%')";
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            while (rs.next()) {
                MD_QLNH temp = new MD_QLNH();
                temp.setManh(rs.getString("MaNH"));
                temp.setTennh(rs.getString("TenNhomHang"));
                a.add(temp);
            }

            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QLNH.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) 
               try {
                state.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLNH.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLNH.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return a;
    }
    
    public static void Insert(MD_QLNH ncc){
        conn = null;
        pstate = null;
        
        try {
            conn = DriverManager.getConnection(dbURL,Username,Password);
            sql = "Insert Into nhomhang Values(?,?)";
            pstate = conn.prepareStatement(sql);
            pstate.setString(1, ncc.getManh());
            pstate.setString(2, ncc.getTennh());
            pstate.execute();
            
            pstate.close();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(QLNH.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (pstate != null) 
               try {
                   pstate.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLNH.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLNH.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void Update(MD_QLNH nh, String macu){
        conn = null;
        pstate = null;
        
        try {
            conn = DriverManager.getConnection(dbURL,Username,Password);
            sql = "Update nhomhang Set TenNhomHang = ? Where MaNH = ?";
            pstate = conn.prepareStatement(sql);
            pstate.setString(1, nh.getTennh());
            pstate.setString(2, macu);
            pstate.execute();
            
            pstate.close();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(QLNH.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (pstate != null) 
               try {
                   pstate.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLNH.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLNH.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void Delete(String manh){
        conn = null;
        state = null;
        
        try {
            conn = DriverManager.getConnection(dbURL,Username,Password);
            sql = "Delete From nhomhang Where MaNH = '"+ manh +"'";
            state = conn.createStatement();
            state.execute(sql);
            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QLNH.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (state != null) 
               try {
                   state.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLNH.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLNH.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
