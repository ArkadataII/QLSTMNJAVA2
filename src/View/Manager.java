
package View;

import javax.swing.JOptionPane;


public class Manager extends javax.swing.JFrame {

    public Manager() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        Desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuDangXuat = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuKetThuc = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuQLNV = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuQLNCC = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnuQLNH = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mnuQLHH = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuTLTK = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mnuBCTK = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Management");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jMenu1.setText("Hệ thống");
        jMenu1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        mnuDangXuat.setText("Đăng xuất");
        mnuDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDangXuatActionPerformed(evt);
            }
        });
        jMenu1.add(mnuDangXuat);
        jMenu1.add(jSeparator1);

        mnuKetThuc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuKetThuc.setText("Kết thúc");
        mnuKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuKetThucActionPerformed(evt);
            }
        });
        jMenu1.add(mnuKetThuc);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Danh mục");
        jMenu2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        mnuQLNV.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        mnuQLNV.setText("Quản lý nhân viên");
        mnuQLNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuQLNVActionPerformed(evt);
            }
        });
        jMenu2.add(mnuQLNV);
        jMenu2.add(jSeparator2);

        mnuQLNCC.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        mnuQLNCC.setText("Quản lý nhà cung cấp");
        mnuQLNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuQLNCCActionPerformed(evt);
            }
        });
        jMenu2.add(mnuQLNCC);
        jMenu2.add(jSeparator3);

        mnuQLNH.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        mnuQLNH.setText("Quản lý nhóm hàng");
        mnuQLNH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuQLNHActionPerformed(evt);
            }
        });
        jMenu2.add(mnuQLNH);
        jMenu2.add(jSeparator4);

        mnuQLHH.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        mnuQLHH.setText("Quản lý hàng hóa");
        mnuQLHH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuQLHHActionPerformed(evt);
            }
        });
        jMenu2.add(mnuQLHH);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Chức năng");
        jMenu3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        mnuTLTK.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        mnuTLTK.setText("Thiết lập tài khoản");
        mnuTLTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTLTKActionPerformed(evt);
            }
        });
        jMenu3.add(mnuTLTK);
        jMenu3.add(jSeparator5);

        mnuBCTK.setText("Báo cáo thống kê");
        mnuBCTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBCTKActionPerformed(evt);
            }
        });
        jMenu3.add(mnuBCTK);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void mnuKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuKetThucActionPerformed
        int kq = JOptionPane.showConfirmDialog(this,"Bạn có muốn thoát không","Thông báo",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (kq == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_mnuKetThucActionPerformed

    private void mnuDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDangXuatActionPerformed
        int kq = JOptionPane.showConfirmDialog(this,"Bạn có muốn đăng xuất không?","Thông báo",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (kq == JOptionPane.YES_OPTION) {
            dispose();
            frmLogin frm = new frmLogin();
            frm.setVisible(true);
        }
    }//GEN-LAST:event_mnuDangXuatActionPerformed

    private void mnuQLNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuQLNVActionPerformed
        mdiQLNV frm = new mdiQLNV();
        //Vì phải căn giữa màn của desktop nên ta add form vào trong desktop
        Desktop.add(frm);
        frm.setLocation((Desktop.getWidth()-frm.getWidth())/2,(Desktop.getHeight()-frm.getHeight())/2);
        frm.setVisible(true);
    }//GEN-LAST:event_mnuQLNVActionPerformed

    private void mnuQLNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuQLNCCActionPerformed
        mdiQLNCC frm = new mdiQLNCC();
        //Vì phải căn giữa màn của desktop nên ta add form vào trong desktop
        Desktop.add(frm);
        frm.setLocation((Desktop.getWidth()-frm.getWidth())/2,(Desktop.getHeight()-frm.getHeight())/2);
        frm.setVisible(true);
    }//GEN-LAST:event_mnuQLNCCActionPerformed

    private void mnuQLNHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuQLNHActionPerformed
        mdiQLNH frm = new mdiQLNH();
        //Vì phải căn giữa màn của desktop nên ta add form vào trong desktop
        Desktop.add(frm);
        frm.setLocation((Desktop.getWidth()-frm.getWidth())/2,(Desktop.getHeight()-frm.getHeight())/2);
        frm.setVisible(true);
    }//GEN-LAST:event_mnuQLNHActionPerformed

    private void mnuQLHHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuQLHHActionPerformed
        mdiQLHH frm = new mdiQLHH();
        //Vì phải căn giữa màn của desktop nên ta add form vào trong desktop
        Desktop.add(frm);
        frm.setLocation((Desktop.getWidth()-frm.getWidth())/2,(Desktop.getHeight()-frm.getHeight())/2);
        frm.setVisible(true);
    }//GEN-LAST:event_mnuQLHHActionPerformed

    private void mnuTLTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTLTKActionPerformed
        mdiQLTK frm = new mdiQLTK();
        //Vì phải căn giữa màn của desktop nên ta add form vào trong desktop
        Desktop.add(frm);
        frm.setLocation((Desktop.getWidth()-frm.getWidth())/2,(Desktop.getHeight()-frm.getHeight())/2);
        frm.setVisible(true);
    }//GEN-LAST:event_mnuTLTKActionPerformed

    private void mnuBCTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBCTKActionPerformed
        mdiBCTK frm = new mdiBCTK();
        //Vì phải căn giữa màn của desktop nên ta add form vào trong desktop
        Desktop.add(frm);
        frm.setLocation((Desktop.getWidth()-frm.getWidth())/2,(Desktop.getHeight()-frm.getHeight())/2);
        frm.setVisible(true);
    }//GEN-LAST:event_mnuBCTKActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JMenuItem mnuBCTK;
    private javax.swing.JMenuItem mnuDangXuat;
    private javax.swing.JMenuItem mnuKetThuc;
    private javax.swing.JMenuItem mnuQLHH;
    private javax.swing.JMenuItem mnuQLNCC;
    private javax.swing.JMenuItem mnuQLNH;
    private javax.swing.JMenuItem mnuQLNV;
    private javax.swing.JMenuItem mnuTLTK;
    // End of variables declaration//GEN-END:variables
}
