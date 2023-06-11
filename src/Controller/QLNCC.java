package Controller;

import Model.MD_QLNCC;
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

public class QLNCC {

    public static Connection conn;
    public static Statement state;
    public static PreparedStatement pstate;
    public static String sql;
    public static ResultSet rs;

    public static List<MD_QLNCC> LayNguon() {
        List<MD_QLNCC> arr = new ArrayList<>();
        conn = null;
        state = null;

        try {
            conn = DriverManager.getConnection(dbURL, Username, Password);
            sql = "Select * from nhacungcap";
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            while (rs.next()) {
                MD_QLNCC temp = new MD_QLNCC();
                temp.setMancc(rs.getString("MaNCC"));
                temp.setTenncc(rs.getString("TenNCC"));
                temp.setDcncc(rs.getString("DiaChiNCC"));
                temp.setSdtncc(rs.getString("SdtNCC"));
                arr.add(temp);
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QLNCC.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) 
               try {
                state.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLNCC.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLNCC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return arr;
    }

    public static List<MD_QLNCC> TimKiem(String tk) {
        List<MD_QLNCC> a = new ArrayList<>();
        conn = null;
        state = null;

        try {
            conn = DriverManager.getConnection(dbURL, Username, Password);
            sql = "Select * from nhacungcap"
                    + " Where (MaNCC LIKE '%" + tk + "%') OR (TenNCC LIKE '%" + tk + "%') OR (DiaChiNCC LIKE '%" + tk + "%') OR "
                    + "(SdtNCC LIKE '%" + tk + "%')";
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            while (rs.next()) {
                MD_QLNCC temp = new MD_QLNCC();
                temp.setMancc(rs.getString("MaNCC"));
                temp.setTenncc(rs.getString("TenNCC"));
                temp.setDcncc(rs.getString("DiaChiNCC"));
                temp.setSdtncc(rs.getString("SdtNCC"));
                a.add(temp);
            }

            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QLNCC.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) 
               try {
                state.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLNCC.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLNCC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return a;
    }
    
    public static void Insert(MD_QLNCC ncc){
        conn = null;
        pstate = null;
        
        try {
            conn = DriverManager.getConnection(dbURL,Username,Password);
            sql = "Insert Into nhacungcap Values(?,?,?,?)";
            pstate = conn.prepareStatement(sql);
            pstate.setString(1, ncc.getMancc());
            pstate.setString(2, ncc.getTenncc());
            pstate.setString(3, ncc.getDcncc());
            pstate.setString(4, ncc.getSdtncc());
            pstate.execute();
            
            pstate.close();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(QLNCC.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (pstate != null) 
               try {
                   pstate.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLNCC.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLNCC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void Update(MD_QLNCC ncc, String macu){
        conn = null;
        pstate = null;
        
        try {
            conn = DriverManager.getConnection(dbURL,Username,Password);
            sql = "Update nhacungcap Set TenNCC = ?, DiaChiNCC = ?, SdtNCC = ? Where MaNCC = ?";
            pstate = conn.prepareStatement(sql);
            pstate.setString(1, ncc.getTenncc());
            pstate.setString(2, ncc.getDcncc());
            pstate.setString(3, ncc.getSdtncc());
            pstate.setString(4, macu);
            pstate.execute();
            
            pstate.close();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(QLNCC.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (pstate != null) 
               try {
                   pstate.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLNCC.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLNCC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void Delete(String mancc){
        conn = null;
        state = null;
        
        try {
            conn = DriverManager.getConnection(dbURL,Username,Password);
            sql = "Delete From nhacungcap Where Mancc = '"+ mancc +"'";
            state = conn.createStatement();
            state.execute(sql);
            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QLNCC.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (state != null) 
               try {
                   state.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLNCC.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLNCC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
