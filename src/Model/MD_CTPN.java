
package Model;

public class MD_CTPN {
    String manhap,mahh,tenhh,gianhap,soluong,thanhtien;

    public MD_CTPN() {
    }

    public MD_CTPN(String manhap, String mahh, String tenhh, String gianhap, String soluong, String thanhtien) {
        this.manhap = manhap;
        this.mahh = mahh;
        this.tenhh = tenhh;
        this.gianhap = gianhap;
        this.soluong = soluong;
        this.thanhtien = thanhtien;
    }
    
    public MD_CTPN(String manhap, String mahh, String gianhap, String soluong, String thanhtien) {
        this.manhap = manhap;
        this.mahh = mahh;
        this.gianhap = gianhap;
        this.soluong = soluong;
        this.thanhtien = thanhtien;
    }

    public String getManhap() {
        return manhap;
    }

    public void setManhap(String manhap) {
        this.manhap = manhap;
    }

    public String getMahh() {
        return mahh;
    }

    public void setMahh(String mahh) {
        this.mahh = mahh;
    }

    public String getGianhap() {
        return gianhap;
    }

    public void setGianhap(String gianhap) {
        this.gianhap = gianhap;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public String getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(String thanhtien) {
        this.thanhtien = thanhtien;
    }

    public String getTenhh() {
        return tenhh;
    }

    public void setTenhh(String tenhh) {
        this.tenhh = tenhh;
    }
    
    
}
