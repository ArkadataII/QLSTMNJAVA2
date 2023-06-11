/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import static Controller.QLHH.conn;
import static Controller.QLHH.rs;
import static Controller.QLHH.sql;
import static Controller.QLHH.state;
import Model.MD_CTPX;
import Model.MD_PX;
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
import static qlstmn_20_5_2023.QLSTMN_20_5_2023.Password;
import static qlstmn_20_5_2023.QLSTMN_20_5_2023.Username;
import static qlstmn_20_5_2023.QLSTMN_20_5_2023.dbURL;

/**
 *
 * @author danhn
 */
public class Ctrl_PhieuXuat {

    public static Connection conn;
    public static Statement state, state1;
    public static PreparedStatement pstate, pstate1;
    public static String sql, sql1;
    public static ResultSet rs;

    public static List<MD_QLHH> LayNguonHH(String maxuat) {
        List<MD_QLHH> arr = new ArrayList<>();
        conn = null;
        state = null;

        try {
            conn = DriverManager.getConnection(dbURL, Username, Password);
            sql = "Select MaHH,TenHH,GiaXuat,TonKho from hanghoa ";
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            while (rs.next()) {
                MD_QLHH temp = new MD_QLHH();
                temp.setMahh(rs.getString("MaHH"));
                temp.setTenhh(rs.getString("TenHH"));
                temp.setGiaxuat(rs.getString("GiaXuat"));
                temp.setTonkho(rs.getString("TonKho"));
                arr.add(temp);
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Ctrl_PhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) 
               try {
                state.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return arr;
    }

    public static List<MD_QLHH> TimKiemHH(String tk) {
        List<MD_QLHH> a = new ArrayList<>();
        conn = null;
        state = null;

        try {
            conn = DriverManager.getConnection(dbURL, Username, Password);
            sql = "Select MaHH,TenHH,GiaXuat,TonKho from hanghoa"
                    + " Where (MaHH LIKE '%" + tk + "%') OR (TenHH LIKE '%" + tk + "%') "
                    + "OR (MaNCC LIKE '%" + tk + "%') OR " + "(MaNH LIKE '%" + tk + "%')";
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            while (rs.next()) {
                MD_QLHH temp = new MD_QLHH();
                temp.setMahh(rs.getString("MaHH"));
                temp.setTenhh(rs.getString("TenHH"));
                temp.setGiaxuat(rs.getString("GiaXuat"));
                temp.setTonkho(rs.getString("TonKho"));
                a.add(temp);
            }

            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Ctrl_PhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) 
               try {
                state.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return a;
    }

    public static double LaySLTonKho(String mahh) {
        conn = null;
        pstate = null;
        double tk = 0;
        try {
            conn = DriverManager.getConnection(dbURL, Username, Password);
            String sql = "SELECT TonKho FROM hanghoa WHERE MaHH = ?";
            pstate = conn.prepareStatement(sql);
            pstate.setString(1, mahh);
            rs = pstate.executeQuery();
            if (rs.next()) {
                tk = rs.getDouble("TonKho");
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Ctrl_PhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) 
               try {
                state.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return tk;
    }

    public static void UpdateHH(MD_QLHH hh, String mahh) {
        conn = null;
        pstate = null;
        try {
            conn = DriverManager.getConnection(dbURL, Username, Password);
            sql = "Update hanghoa Set TonKho = ? Where MaHH = ? ";
            pstate = conn.prepareStatement(sql);
            pstate.setString(1, hh.getTonkho());
            pstate.setString(2, mahh);
            pstate.execute();
            pstate.close();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(Ctrl_PhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pstate != null) 
               try {
                pstate.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static List<MD_CTPX> LayNguonCTPhieuXuat(String MaXuat) {
        List<MD_CTPX> arr = new ArrayList<>();
        conn = null;
        state = null;

        try {
            conn = DriverManager.getConnection(dbURL, Username, Password);
            sql = "Select hanghoa.MaHH,TenHH,HangHoa.GiaXuat,SoLuong,ThanhTien from hanghoa inner join chitietphieuxuat on hanghoa.MaHH = chitietphieuxuat.MaHH where chitietphieuxuat.MaXuat='" + MaXuat + "'";
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            while (rs.next()) {
                MD_CTPX temp = new MD_CTPX();
                temp.setMahh(rs.getString("MaHH"));
                temp.setTenhh(rs.getString("TenHH"));
                temp.setGiaxuat(rs.getString("GiaXuat"));
                temp.setSoluong(rs.getString("SoLuong"));
                temp.setThanhtien(rs.getString("ThanhTien"));
                arr.add(temp);
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Ctrl_PhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) 
               try {
                state.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return arr;
    }

    public static void InsertPX(MD_PX px) {
        conn = null;
        pstate = null;

        try {
            conn = DriverManager.getConnection(dbURL, Username, Password);
            sql = "Insert Into phieuxuat Values(?,?,?,?)";
            pstate = conn.prepareStatement(sql);
            pstate.setString(1, px.getMaxuat());
            pstate.setString(2, px.getManv());
            pstate.setString(3, px.getNgayxuat());
            pstate.setString(4, px.getTongtien());
            pstate.execute();

            pstate.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Ctrl_PhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pstate != null) 
               try {
                pstate.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void DeletePX(String maxuat) {
        conn = null;
        state = null;

        try {
            conn = DriverManager.getConnection(dbURL, Username, Password);
            sql = "Delete From chitietphieuxuat Where MaXuat = '" + maxuat + "'";
            sql1 = "Delete From phieuxuat Where MaXuat = '" + maxuat + "'";
            state = conn.createStatement();
            state1 = conn.createStatement();
            state.execute(sql);
            state1.execute(sql1);
            state.close();
            state1.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Ctrl_PhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) 
               try {
                state.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void InsertCTPX(MD_CTPX px) {
        conn = null;
        pstate = null;

        try {
            conn = DriverManager.getConnection(dbURL, Username, Password);
            sql = "Insert Into chitietphieuxuat Values(?,?,?,?,?)";
            pstate = conn.prepareStatement(sql);
            pstate.setString(1, px.getMaxuat());
            pstate.setString(2, px.getMahh());
            pstate.setString(3, px.getGiaxuat());
            pstate.setString(4, px.getSoluong());
            pstate.setString(5, px.getThanhtien());
            pstate.execute();

            pstate.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Ctrl_PhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pstate != null) 
               try {
                pstate.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
