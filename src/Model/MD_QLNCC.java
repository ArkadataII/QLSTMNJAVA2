
package Model;


public class MD_QLNCC {
    String Mancc, Tenncc, Dcncc, Sdtncc;

    public MD_QLNCC() {
    }

    public MD_QLNCC(String Mancc, String Tenncc, String Dcncc, String Sdtncc) {
        this.Mancc = Mancc;
        this.Tenncc = Tenncc;
        this.Dcncc = Dcncc;
        this.Sdtncc = Sdtncc;
    }

    public String getMancc() {
        return Mancc;
    }

    public void setMancc(String Mancc) {
        this.Mancc = Mancc;
    }

    public String getTenncc() {
        return Tenncc;
    }

    public void setTenncc(String Tenncc) {
        this.Tenncc = Tenncc;
    }

    public String getDcncc() {
        return Dcncc;
    }

    public void setDcncc(String Dcncc) {
        this.Dcncc = Dcncc;
    }

    public String getSdtncc() {
        return Sdtncc;
    }

    public void setSdtncc(String Sdtncc) {
        this.Sdtncc = Sdtncc;
    }
    
    
}
