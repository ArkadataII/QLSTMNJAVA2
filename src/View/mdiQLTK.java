
package View;

import Controller.QLTK;
import Model.MD_QLTK;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public final class mdiQLTK extends javax.swing.JInternalFrame {
    
    DefaultTableModel tblDanhSach;//dung de doc cau truc cua bang
    List<MD_QLTK> arr = new ArrayList<>();
    String taikhoan, matkhau, macu;
    
    public mdiQLTK() {
        initComponents();
        tblDanhSach = (DefaultTableModel) dgDanhSach.getModel();
        KhoaMo(true);
        LayNguon();
    }
    
    public void LayNguon(){
        arr = QLTK.LayNguon();
        
        tblDanhSach.setRowCount(0);//Xoa trang danh sach
        arr.forEach(p->{//Vong lap de duyet phan tu trong mang arr
            tblDanhSach.addRow(new Object[]{// moi mot phan tu tuong ung voi 1 dong add vao gom 2 cot
                p.getTentk(), p.getMatkhau()
            });
        });
    }
    
    public void KhoaMo(boolean b) {
        cmdDoiMK.setEnabled(b);
        cmdExit.setEnabled(b);
        
        cmdLuu.setEnabled(!b);
        
        txtMK.setEditable(!b);
        
        dgDanhSach.setEnabled(b);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtChucvu = new javax.swing.JLabel();
        txtTK = new javax.swing.JTextField();
        txtMK = new javax.swing.JTextField();
        cmdDoiMK = new javax.swing.JButton();
        cmdLuu = new javax.swing.JButton();
        cmdExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgDanhSach = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Thiết lập tài khoản");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin tài khoản"));
        jPanel1.setFocusable(false);
        jPanel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setText("Tài khoản");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Mật khẩu");

        txtChucvu.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtChucvu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtChucvu.setText("---");

        txtTK.setEditable(false);

        cmdDoiMK.setText("Đổi mật khẩu");
        cmdDoiMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDoiMKActionPerformed(evt);
            }
        });

        cmdLuu.setText("Lưu");
        cmdLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLuuActionPerformed(evt);
            }
        });

        cmdExit.setText("Thoát");
        cmdExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTK)
                            .addComponent(txtMK)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmdDoiMK, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdLuu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdExit)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(txtChucvu, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtChucvu)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdDoiMK)
                    .addComponent(cmdLuu)
                    .addComponent(cmdExit))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        dgDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Tài khoản", "Mật khẩu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dgDanhSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgDanhSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dgDanhSach);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExitActionPerformed
        dispose();
    }//GEN-LAST:event_cmdExitActionPerformed

    private void cmdDoiMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDoiMKActionPerformed
        if(txtTK.getText().length()<=0)
            return;
        macu = txtTK.getText();
        KhoaMo(false);
        txtMK.setText("");
        txtMK.requestFocus();
    }//GEN-LAST:event_cmdDoiMKActionPerformed

    private void dgDanhSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgDanhSachMouseClicked
        int index = dgDanhSach.getSelectedRow();//dòng đang chọn
        TableModel model = dgDanhSach.getModel();//dùng để lấy ra các cột trong table
        taikhoan = model.getValueAt(index, 0).toString();//dòng index cột 0
        matkhau = model.getValueAt(index, 1).toString();
        
        if(taikhoan.equals("Manager")) txtChucvu.setText("Quản Lý");
        else if (taikhoan.equals("Seller")) txtChucvu.setText("Nhân viên bán hàng");
        else txtChucvu.setText("Nhân viên nhập hàng");
        
        txtTK.setText(taikhoan);
        txtMK.setText(matkhau);
    }//GEN-LAST:event_dgDanhSachMouseClicked

    private void cmdLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLuuActionPerformed
        if(txtMK.getText().length()<=0){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập mật khẩu", "Thông báo",
                    JOptionPane.WARNING_MESSAGE);
            txtMK.requestFocus();
            return;
        }
        taikhoan = txtTK.getText();
        matkhau = txtMK.getText();
        MD_QLTK tk = new MD_QLTK(taikhoan, matkhau);
        QLTK.Update(tk, macu);
        LayNguon();
        KhoaMo(true);
    }//GEN-LAST:event_cmdLuuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdDoiMK;
    private javax.swing.JButton cmdExit;
    private javax.swing.JButton cmdLuu;
    private javax.swing.JTable dgDanhSach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtChucvu;
    private javax.swing.JTextField txtMK;
    private javax.swing.JTextField txtTK;
    // End of variables declaration//GEN-END:variables
}
