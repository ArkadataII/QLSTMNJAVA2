
package qlstmn_20_5_2023;

import View.Manager;
import View.frmLogin;

public class QLSTMN_20_5_2023 {
    public static String dbURL="jdbc:mysql://localhost:3306/qlstmn_c";
    public static String Username="root";
    public static String Password="";
    public static String UN,PW;
    public static String PN,PX;
    
    public static void main(String[] args) {
        frmLogin frm = new frmLogin();
        frm.setLocation(600, 250);
        frm.setVisible(true);
    }
    
}
