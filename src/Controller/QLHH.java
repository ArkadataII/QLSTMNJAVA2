
package Controller;

import Model.MD_QLHH;
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


public class QLHH {
    public static Connection conn;
    public static Statement state;
    public static PreparedStatement pstate;
    public static String sql;
    public static ResultSet rs;

    public static List<MD_QLHH> LayNguon() {
        List<MD_QLHH> arr = new ArrayList<>();
        conn = null;
        state = null;

        try {
            conn = DriverManager.getConnection(dbURL, Username, Password);
            sql = "Select * from hanghoa";
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            while (rs.next()) {
                MD_QLHH temp = new MD_QLHH();
                temp.setMahh(rs.getString("MaHH"));
                temp.setTenhh(rs.getString("TenHH"));
                temp.setMancc(rs.getString("MaNCC"));
                temp.setManh(rs.getString("MaNH"));
                temp.setGianhap(rs.getString("GiaNhap"));
                temp.setGiaxuat(rs.getString("GiaXuat"));
                temp.setTonkho(rs.getString("TonKho"));
                arr.add(temp);
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QLHH.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) 
               try {
                state.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLHH.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLHH.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return arr;
    }
    
    public static List<MD_QLHH> TimKiem(String tk) {
        List<MD_QLHH> a = new ArrayList<>();
        conn = null;
        state = null;

        try {
            conn = DriverManager.getConnection(dbURL, Username, Password);
            sql = "Select * from hanghoa"
                    + " Where (MaHH LIKE '%" + tk + "%') OR (TenHH LIKE '%" + tk + "%') OR (MaNCC LIKE '%" + tk + "%') OR "
                    + "(MaNH LIKE '%" + tk + "%') OR (GiaNhap LIKE '%" + tk + "%') OR (GiaXuat LIKE '%" + tk + "%') OR (TonKho LIKE '%" + tk + "%')";
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            while (rs.next()) {
                MD_QLHH temp = new MD_QLHH();
                temp.setMahh(rs.getString("MaHH"));
                temp.setTenhh(rs.getString("TenHH"));
                temp.setMancc(rs.getString("MaNCC"));
                temp.setManh(rs.getString("MaNH"));
                temp.setGianhap(rs.getString("GiaNhap"));
                temp.setGiaxuat(rs.getString("GiaXuat"));
                temp.setTonkho(rs.getString("TonKho"));
                a.add(temp);
            }

            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QLHH.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) 
               try {
                state.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLHH.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLHH.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return a;
    }
    
    public static void Insert(MD_QLHH hh){
        conn = null;
        pstate = null;
        
        try {
            conn = DriverManager.getConnection(dbURL,Username,Password);
            sql = "Insert Into hanghoa Values(?,?,?,?,?,?,?)";
            pstate = conn.prepareStatement(sql);
            pstate.setString(1, hh.getMahh());
            pstate.setString(2, hh.getTenhh());
            pstate.setString(3, hh.getMancc());
            pstate.setString(4, hh.getManh());
            pstate.setString(5, hh.getGianhap());
            pstate.setString(6, hh.getGiaxuat());
            pstate.setString(7, hh.getTonkho());
            pstate.execute();
            
            pstate.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QLHH.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (pstate != null) 
               try {
                   pstate.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLHH.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLHH.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void Update(MD_QLHH hh, String macu){
        conn = null;
        pstate = null;
        
        try {
            conn = DriverManager.getConnection(dbURL,Username,Password);
            sql = "Update hanghoa Set TenHH = ?, MaNCC = ?, MaNH = ?, GiaNhap = ?, GiaXuat = ?, TonKho = ? Where MaHH = ?";
            pstate = conn.prepareStatement(sql);
            pstate.setString(1, hh.getTenhh());
            pstate.setString(2, hh.getMancc());
            pstate.setString(3, hh.getManh());
            pstate.setString(4, hh.getGianhap());
            pstate.setString(5, hh.getGiaxuat());
            pstate.setString(6, hh.getTonkho());
            pstate.setString(7, macu);
            pstate.execute();
            
            pstate.close();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(QLHH.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (pstate != null) 
               try {
                   pstate.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLHH.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLHH.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void Delete(String mahh){
        conn = null;
        state = null;
        
        try {
            conn = DriverManager.getConnection(dbURL,Username,Password);
            sql = "Delete From hanghoa Where MaHH = '"+ mahh +"'";
            state = conn.createStatement();
            state.execute(sql);
            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QLHH.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (state != null) 
               try {
                   state.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLHH.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLHH.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
