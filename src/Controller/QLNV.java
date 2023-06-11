
package Controller;


import Model.MD_QLNV;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static qlstmn_20_5_2023.QLSTMN_20_5_2023.*;

public class QLNV {
    public static Connection conn;
    public static Statement state;
    public static PreparedStatement pstate;
    public static String sql;
    public static ResultSet rs;

    public static List<MD_QLNV> LayNguon(){
        List<MD_QLNV> arr = new ArrayList<>();
        conn = null;
        state = null;
        
        try {
            conn = DriverManager.getConnection(dbURL,Username,Password);
            sql = "Select MaNV, TenNhanVien, (Case When ChucVu = 'True' then N'Bán hàng' Else N'Nhập hàng' end) as ChucVu,"
                    + "(Case When GioiTinh = 'True' then N'Nam' Else N'Nữ' end) as GioiTinh, "
                    + "NamSinh, SdtNV, DiachiNV from NhanVien ";
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            while(rs.next()){
                MD_QLNV temp = new MD_QLNV();
                temp.setManv(rs.getString("MaNV"));
                temp.setTennv(rs.getString("TenNhanVien"));
                temp.setChucvu(rs.getString("ChucVu"));
                temp.setGioitinh(rs.getString("GioiTinh"));
                temp.setNamsinh(rs.getString("NamSinh"));
                temp.setSdt(rs.getString("SdtNV"));
                temp.setDc(rs.getString("DiaChiNV"));
                arr.add(temp);
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QLNV.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if (state != null) 
               try {
                   state.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLNV.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLNV.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return arr;
    }
    
    public static List<MD_QLNV> TimKiem(String tk){
        List<MD_QLNV> a = new ArrayList<>();
        conn = null;
        state = null;
                
        try {
            conn = DriverManager.getConnection(dbURL,Username,Password);
            sql = "Select MaNV, TenNhanVien, (Case When ChucVu = 'True' then N'Bán hàng' Else N'Nhập hàng' end) as ChucVu,"
                    + "(Case When GioiTinh = 'True' then N'Nam' Else N'Nữ' end) as GioiTinh, "
                    + "NamSinh, SdtNV, DiachiNV from NhanVien"
                    + " Where (MaNV LIKE '%"+ tk +"%') OR (TenNhanVien LIKE '%"+ tk +"%') OR (ChucVu LIKE '%"+ tk +"%') OR "
                    + "(GioiTinh LIKE '%"+ tk +"%') OR "
                    + "(NamSinh LIKE '%"+ tk +"%') OR (SdtNV LIKE '%"+ tk +"%') OR (DiaChiNV LIKE '%"+ tk +"%')";
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            while(rs.next()){
                MD_QLNV temp = new MD_QLNV();
                temp.setManv(rs.getString("MaNV"));
                temp.setTennv(rs.getString("TenNhanVien"));
                temp.setChucvu(rs.getString("ChucVu"));
                temp.setGioitinh(rs.getString("GioiTinh"));
                temp.setNamsinh(rs.getString("NamSinh"));
                temp.setSdt(rs.getString("SdtNV"));
                temp.setDc(rs.getString("DiaChiNV"));
                a.add(temp);
            }
            
            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QLNV.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (state != null) 
               try {
                   state.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLNV.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLNV.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return a;
    }
    
    //Thêm nhân viên
    public static void Insert(MD_QLNV nv){
        conn = null;
        pstate = null;
        
        try {
            conn = DriverManager.getConnection(dbURL,Username,Password);
            sql = "Insert Into NhanVien Values(?,?,?,?,?,?,?)";
            pstate = conn.prepareStatement(sql);
            pstate.setString(1, nv.getManv());
            pstate.setString(2, nv.getTennv());
            if(nv.getChucvu().equals("Bán hàng")) pstate.setInt(3, 0);
            else pstate.setInt(3, 1);
            if(nv.getGioiTinh().equals("Nam")) pstate.setInt(4, 0);
            else pstate.setInt(4, 1);
            pstate.setString(5, nv.getNamsinh());
            pstate.setString(6, nv.getSdt());
            pstate.setString(7, nv.getDc());
            pstate.execute();
            
            pstate.close();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(QLNV.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (pstate != null) 
               try {
                   pstate.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLNV.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLNV.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    //Sửa nhân viên
    public static void Update(MD_QLNV nv, String macu){
        conn = null;
        pstate = null;
        
        try {
            conn = DriverManager.getConnection(dbURL,Username,Password);
            sql = "Update NhanVien Set TenNhanVien = ?, ChucVu = ?, GioiTinh = ?,"
                    + "NamSinh = ?, SdtNV = ?, DiaChiNV = ? Where MaNV = ?";
            pstate = conn.prepareStatement(sql);
            pstate.setString(1, nv.getTennv());
            if(nv.getChucvu().equals("Bán hàng")) pstate.setInt(2, 0);
            else pstate.setInt(2, 1);
            if(nv.getGioiTinh().equals("Nam")) pstate.setInt(3, 0);
            else pstate.setInt(3, 1);
            pstate.setString(4, nv.getNamsinh());
            pstate.setString(5, nv.getSdt());
            pstate.setString(6, nv.getDc());
            pstate.setString(7, macu);
            pstate.execute();
            
            pstate.close();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(QLNV.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (pstate != null) 
               try {
                   pstate.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLNV.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLNV.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    //Xóa nhân viên
    public static void Delete(String manv){
        conn = null;
        state = null;
        
        try {
            conn = DriverManager.getConnection(dbURL,Username,Password);
            sql = "Delete From NhanVien Where MaNV = '"+ manv +"'";
            state = conn.createStatement();
            state.execute(sql);
            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QLNV.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (pstate != null) 
               try {
                   pstate.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLNV.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLNV.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    //Check nhân viên nhập
    public static List<MD_QLNV> CheckManv(String tk,boolean b){
        List<MD_QLNV> a = new ArrayList<>();
        conn = null;
        state = null;
                
        try {
            conn = DriverManager.getConnection(dbURL,Username,Password);
            sql = "Select MaNV from NhanVien Where (MaNV = '"+ tk +"') AND (ChucVu = "+ b + ") ";
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            while(rs.next()){
                MD_QLNV temp = new MD_QLNV();
                temp.setManv(rs.getString("MaNV"));
                a.add(temp);
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QLNV.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (state != null) 
               try {
                   state.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLNV.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QLNV.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return a;
    }
}
