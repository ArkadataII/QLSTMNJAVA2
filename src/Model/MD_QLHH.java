
package Model;

public class MD_QLHH {
    String mahh, tenhh, mancc, manh, gianhap, giaxuat, tonkho;

    public MD_QLHH() {
    }

    public MD_QLHH(String mahh, String tenhh, String mancc, String manh, String gianhap, String giaxuat, String tonkho) {
        this.mahh = mahh;
        this.tenhh = tenhh;
        this.mancc = mancc;
        this.manh = manh;
        this.gianhap = gianhap;
        this.giaxuat = giaxuat;
        this.tonkho = tonkho;
    }
    
    public MD_QLHH(String tonkho) {
        this.tonkho = tonkho;
    }

    public String getMahh() {
        return mahh;
    }

    public void setMahh(String mahh) {
        this.mahh = mahh;
    }

    public String getTenhh() {
        return tenhh;
    }

    public void setTenhh(String tenhh) {
        this.tenhh = tenhh;
    }

    public String getMancc() {
        return mancc;
    }

    public void setMancc(String mancc) {
        this.mancc = mancc;
    }

    public String getManh() {
        return manh;
    }

    public void setManh(String manh) {
        this.manh = manh;
    }

    public String getGianhap() {
        return gianhap;
    }

    public void setGianhap(String gianhap) {
        this.gianhap = gianhap;
    }

    public String getGiaxuat() {
        return giaxuat;
    }

    public void setGiaxuat(String giaxuat) {
        this.giaxuat = giaxuat;
    }

    public String getTonkho() {
        return tonkho;
    }

    public void setTonkho(String tonkho) {
        this.tonkho = tonkho;
    }
    
    
}
