/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import static Controller.QLNV.conn;
import static Controller.QLNV.rs;
import static Controller.QLNV.sql;
import static Controller.QLNV.state;
import Model.MD_CTPN;
import Model.MD_PN;
import Model.MD_QLHH;
import Model.MD_QLNCC;
import Model.MD_QLNV;
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
public class Ctrl_PhieuNhap {

    public static Connection conn;
    public static Statement state, state1;
    public static PreparedStatement pstate, pstate1, stmt;
    public static String sql, sql1;
    public static ResultSet rs, rs1;

    public static List<MD_QLNCC> LayNguonNCC() {
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
            Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) 
               try {
                state.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return arr;
    }
    public static List<MD_QLNV> TimKiemTenNV(String tk){
        List<MD_QLNV> a = new ArrayList<>();
        conn = null;
        state = null;
                
        try {
            conn = DriverManager.getConnection(dbURL,Username,Password);
            sql = "Select MaNV, TenNhanVien, (Case When ChucVu = 'True' then N'Bán hàng' Else N'Nhập hàng' end) as ChucVu,"
                    + "(Case When GioiTinh = 'True' then N'Nam' Else N'Nữ' end) as GioiTinh, "
                    + "NamSinh, SdtNV, DiachiNV from NhanVien"
                    + " Where (MaNV = '"+ tk +"')";
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
            Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (state != null) 
               try {
                   state.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return a;
    }

    public static List<MD_QLNCC> TimKiemNCC(String tk) {
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
            Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) 
               try {
                state.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return a;
    }

    public static List<MD_QLHH> LayNguonHangHoaBS(String MaNCC, String MaNhap) {
        List<MD_QLHH> arr = new ArrayList<>();
        conn = null;
        state = null;

        try {
            conn = DriverManager.getConnection(dbURL, Username, Password);
            sql = "select MaHH,TenHH,GiaNhap from HangHoa where MaNCC = N'" + MaNCC + "'and MaHH not in (select MaHH from chitietphieunhap where MaNhap=N'" + MaNhap + "')";
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            while (rs.next()) {
                MD_QLHH temp = new MD_QLHH();
                temp.setMahh(rs.getString("MaHH"));
                temp.setTenhh(rs.getString("TenHH"));
                temp.setGianhap(rs.getString("GiaNhap"));
                arr.add(temp);
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) 
               try {
                state.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return arr;
    }

    public static double LaySLTonKho(String mahh) {
        conn = null;
        pstate = null;
        double tk = 0;
        try {
            conn = DriverManager.getConnection(dbURL, Username, Password);
            sql = "SELECT TonKho FROM hanghoa WHERE MaHH = ?";
            pstate = conn.prepareStatement(sql);
            pstate.setString(1, mahh);
            rs = pstate.executeQuery();
            if (rs.next()) {
                tk = rs.getDouble("TonKho");
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) 
               try {
                state.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return tk;
    }

    public static void UpdateHH(MD_QLHH hh, String mahh) {
        conn = null;
        pstate = null;
        pstate1 = null;

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
            Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pstate != null) 
               try {
                pstate.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static List<MD_CTPN> LayNguonCTPhieuNhap(String MaNhap) {
        List<MD_CTPN> arr = new ArrayList<>();
        conn = null;
        state = null;

        try {
            conn = DriverManager.getConnection(dbURL, Username, Password);
            sql = "Select hanghoa.MaHH,TenHH,HangHoa.GiaNhap,SoLuong,ThanhTien from hanghoa inner join chitietphieunhap on hanghoa.MaHH = chitietphieunhap.MaHH where ChiTietPhieuNhap.MaNhap=N'" + MaNhap + "'";
            state = conn.createStatement();
            rs = state.executeQuery(sql);
            while (rs.next()) {
                MD_CTPN temp = new MD_CTPN();
                temp.setMahh(rs.getString("MaHH"));
                temp.setTenhh(rs.getString("TenHH"));
                temp.setGianhap(rs.getString("GiaNhap"));
                temp.setSoluong(rs.getString("SoLuong"));
                temp.setThanhtien(rs.getString("ThanhTien"));
                arr.add(temp);
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) 
               try {
                state.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return arr;
    }

    public static void InsertPN(MD_PN pn) {
        conn = null;
        pstate = null;

        try {
            conn = DriverManager.getConnection(dbURL, Username, Password);
            sql = "Insert Into phieunhap Values(?,?,?,?,?)";
            pstate = conn.prepareStatement(sql);
            pstate.setString(1, pn.getManhap());
            pstate.setString(2, pn.getMancc());
            pstate.setString(3, pn.getManv());
            pstate.setString(4, pn.getNgaynhap());
            pstate.setString(5, pn.getTongtien());
            pstate.execute();

            pstate.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pstate != null) 
               try {
                pstate.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void UpdatePN(MD_PN pn, String manhap) {
        conn = null;
        pstate = null;
        pstate1 = null;

        try {
            conn = DriverManager.getConnection(dbURL, Username, Password);
            sql = "Update phieunhap Set TongTien = ? Where MaNhap = ? ";
            pstate = conn.prepareStatement(sql);
            pstate.setString(1, pn.getTongtien());
            pstate.setString(2, manhap);
            pstate.execute();
            pstate.close();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pstate != null) 
               try {
                pstate.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void DeletePN(String manhap) {
        conn = null;
        state = null;

        try {
            conn = DriverManager.getConnection(dbURL, Username, Password);
            sql = "Delete From chitietphieunhap Where MaNhap = '" + manhap + "'";
            sql1 = "Delete From phieunhap Where MaNhap = '" + manhap + "'";
            state = conn.createStatement();
            state1 = conn.createStatement();
            state.execute(sql);
            state1.execute(sql1);
            state.close();
            state1.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) 
               try {
                state.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void InsertCTPN(MD_CTPN pn) {
        conn = null;
        pstate = null;

        try {
            conn = DriverManager.getConnection(dbURL, Username, Password);
            sql = "Insert Into chitietphieunhap Values(?,?,?,?,?)";
            pstate = conn.prepareStatement(sql);
            pstate.setString(1, pn.getManhap());
            pstate.setString(2, pn.getMahh());
            pstate.setString(3, pn.getGianhap());
            pstate.setString(4, pn.getSoluong());
            pstate.setString(5, pn.getThanhtien());
            pstate.execute();

            pstate.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pstate != null) 
               try {
                pstate.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void UpdateCTPN(MD_CTPN ctpn, String manhap, String mahh) {
        conn = null;
        pstate = null;

        try {
            conn = DriverManager.getConnection(dbURL, Username, Password);
            sql = "Update chitietphieunhap Set SoLuong = ?, ThanhTien = ? Where MaNhap = ? And MaHH = ?";
            pstate = conn.prepareStatement(sql);
            pstate.setString(1, ctpn.getSoluong());
            pstate.setString(2, ctpn.getThanhtien());
            pstate.setString(3, manhap);
            pstate.setString(4, mahh);

            pstate.execute();

            pstate.close();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pstate != null) 
               try {
                pstate.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void DeleteCTPN(String manhap, String mahh) {
        conn = null;
        state = null;

        try {
            conn = DriverManager.getConnection(dbURL, Username, Password);
            sql = "Delete From chitietphieunhap Where MaNhap = '" + manhap + "' And MaHH = '" + mahh + "'";
            state = conn.createStatement();
            state.execute(sql);
            state.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (state != null) 
               try {
                state.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn != null) 
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_PhieuNhap.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
