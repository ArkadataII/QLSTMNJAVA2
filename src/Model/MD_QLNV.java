
package Model;

public class MD_QLNV {
    String manv, tennv, sdt, dc, chucvu, gioitinh,namsinh;

    public MD_QLNV() {
    }

    public MD_QLNV(String manv, String tennv, String chucvu, String gioitinh, String namsinh, String sdt, String dc) {
        this.manv = manv;
        this.tennv = tennv;
        this.chucvu = chucvu;
        this.gioitinh = gioitinh;
        this.namsinh = namsinh;
        this.sdt = sdt;
        this.dc = dc;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public String getGioiTinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }
    
    
}
