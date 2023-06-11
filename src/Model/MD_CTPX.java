
package Model;

public class MD_CTPX {
    String maxuat,mahh,tenhh,giaxuat,soluong,thanhtien;

    public MD_CTPX() {
    }

    public MD_CTPX(String maxuat, String mahh, String tenhh, String giaxuat, String soluong, String thanhtien) {
        this.maxuat = maxuat;
        this.mahh = mahh;
        this.tenhh = tenhh;
        this.giaxuat = giaxuat;
        this.soluong = soluong;
        this.thanhtien = thanhtien;
    }
    
    public MD_CTPX(String maxuat, String mahh, String giaxuat, String soluong, String thanhtien) {
        this.maxuat = maxuat;
        this.mahh = mahh;
        this.giaxuat = giaxuat;
        this.soluong = soluong;
        this.thanhtien = thanhtien;
    }

    public String getMaxuat() {
        return maxuat;
    }

    public void setMaxuat(String maxuat) {
        this.maxuat = maxuat;
    }

    public String getMahh() {
        return mahh;
    }

    public void setMahh(String mahh) {
        this.mahh = mahh;
    }

    public String getGiaxuat() {
        return giaxuat;
    }

    public void setGiaxuat(String giaxuat) {
        this.giaxuat = giaxuat;
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
