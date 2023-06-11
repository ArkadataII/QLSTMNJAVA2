
package Model;

public class MD_QLTK {
    String tentk, matkhau;

    public MD_QLTK() {
    }

    public MD_QLTK(String tentk, String matkhau) {
        this.tentk = tentk;
        this.matkhau = matkhau;
    }

    public String getTentk() {
        return tentk;
    }

    public void setTentk(String tentk) {
        this.tentk = tentk;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }
    
}
