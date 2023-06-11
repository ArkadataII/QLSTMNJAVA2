
package Model;

public class MD_PN {
    String manhap,mancc,manv,ngaynhap,tongtien;

    public MD_PN() {
    }

    public MD_PN(String manhap, String mancc, String manv, String ngaynhap, String tongtien) {
        this.manhap = manhap;
        this.mancc = mancc;
        this.manv = manv;
        this.ngaynhap = ngaynhap;
        this.tongtien = tongtien;
    }

    public String getManhap() {
        return manhap;
    }

    public void setManhap(String manhap) {
        this.manhap = manhap;
    }

    public String getMancc() {
        return mancc;
    }

    public void setMancc(String mancc) {
        this.mancc = mancc;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public String getTongtien() {
        return tongtien;
    }

    public void setTongtien(String tongtien) {
        this.tongtien = tongtien;
    }
    
    
}
