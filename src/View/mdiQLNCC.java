

package View;

import Controller.QLNCC;
import Controller.TuTaoMa;
import Model.MD_QLNCC;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class mdiQLNCC extends javax.swing.JInternalFrame {

    DefaultTableModel tblDanhSach;//dung de doc cau truc cua bang
    List<MD_QLNCC> arr = new ArrayList<>();
    String mancc, tenncc, dcncc, sdtncc, macu;
    boolean ktThem;

    public mdiQLNCC() {
        initComponents();
        tblDanhSach = (DefaultTableModel) dgDanhSach.getModel();
        KhoaMo(true);
        XoaTrang();
        LayNguon();
    }

    public void LayNguon() {
        arr = QLNCC.LayNguon();

        tblDanhSach.setRowCount(0);//Xoa trang danh sach
        arr.forEach(p -> {//Vong lap de duyet phan tu trong mang arr
            tblDanhSach.addRow(new Object[]{// moi mot phan tu tuong ung voi 1 dong add vao gom 2 cot
                p.getMancc(), p.getTenncc(), p.getDcncc(), p.getSdtncc()
            });
        });
    }
    
    public void XoaTrang(){
        txtMancc.setText("");
        txtTenncc.setText("");
        txtDc.setText("");
        txtSdt.setText("");
    }
    
    public void KhoaMo(boolean b){
        txtTimKiem.setEnabled(b);
        cmdThem.setEnabled(b);
        cmdSua.setEnabled(b);
        cmdXoa.setEnabled(b);
        cmdThoat.setEnabled(b);
        dgDanhSach.setEnabled(b);
        
        cmdLuu.setEnabled(!b);
        cmdKhong.setEnabled(!b);
        txtMancc.setEditable(!b);
        txtTenncc.setEditable(!b);
        txtDc.setEditable(!b);
        txtSdt.setEditable(!b);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMancc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTenncc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSdt = new javax.swing.JTextField();
        cmdThem = new javax.swing.JButton();
        cmdSua = new javax.swing.JButton();
        cmdXoa = new javax.swing.JButton();
        cmdLuu = new javax.swing.JButton();
        cmdKhong = new javax.swing.JButton();
        cmdThoat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgDanhSach = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setTitle("Quản lý nhà cung cấp");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin nhà cung cấp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 12))); // NOI18N
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setText("Mã NCC :");

        txtMancc.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Tên :");

        txtTenncc.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("Địa chỉ :");
        jLabel3.setToolTipText("");

        txtDc.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("Sđt :");

        txtSdt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtSdt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSdtKeyTyped(evt);
            }
        });

        cmdThem.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmdThem.setText("Thêm");
        cmdThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdThemActionPerformed(evt);
            }
        });

        cmdSua.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmdSua.setText("Sửa");
        cmdSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSuaActionPerformed(evt);
            }
        });

        cmdXoa.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmdXoa.setText("Xóa");
        cmdXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdXoaActionPerformed(evt);
            }
        });

        cmdLuu.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmdLuu.setText("Lưu");
        cmdLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLuuActionPerformed(evt);
            }
        });

        cmdKhong.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmdKhong.setText("Không");
        cmdKhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdKhongActionPerformed(evt);
            }
        });

        cmdThoat.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmdThoat.setText("Thoát");
        cmdThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdThoatActionPerformed(evt);
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
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMancc))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenncc))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDc))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmdLuu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmdThem))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cmdSua, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmdXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(cmdKhong)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmdThoat)))
                                .addGap(0, 5, Short.MAX_VALUE))
                            .addComponent(txtSdt))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMancc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenncc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdThem)
                    .addComponent(cmdSua)
                    .addComponent(cmdXoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdLuu)
                    .addComponent(cmdKhong)
                    .addComponent(cmdThoat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dgDanhSach.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        dgDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã NCC", "Tên NCC", "Địa chỉ", "Số điện thoại"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("Tìm kiếm :");

        txtTimKiem.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("QUẢN LÝ NHÀ CUNG CẤP");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdThoatActionPerformed
        dispose();
    }//GEN-LAST:event_cmdThoatActionPerformed

    private void dgDanhSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgDanhSachMouseClicked
        int index = dgDanhSach.getSelectedRow();//dòng đang chọn
        TableModel model = dgDanhSach.getModel();//dùng để lấy ra các cột trong table
        
        txtMancc.setText(model.getValueAt(index, 0).toString());
        txtTenncc.setText(model.getValueAt(index, 1).toString());
        txtDc.setText(model.getValueAt(index, 2).toString());
        txtSdt.setText(model.getValueAt(index, 3).toString());
    }//GEN-LAST:event_dgDanhSachMouseClicked

    private void txtTimKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyPressed
        arr = QLNCC.TimKiem(txtTimKiem.getText());
        
        tblDanhSach.setRowCount(0);//Xoa trang danh sach
        arr.forEach(p->{//Vong lap de duyet phan tu trong mang arr
            tblDanhSach.addRow(new Object[]{// moi mot phan tu tuong ung voi 1 dong add vao gom 2 cot
                p.getMancc(), p.getTenncc(), p.getDcncc(), p.getSdtncc()
            });
        });
    }//GEN-LAST:event_txtTimKiemKeyPressed

    private void cmdXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdXoaActionPerformed
        if(txtMancc.getText().length()<=0) return;
        int kq = JOptionPane.showConfirmDialog(this,"Bạn có muốn xóa nhà cung cấp "+ txtMancc.getText() +" không","Thông báo",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (kq == JOptionPane.YES_OPTION) {
            QLNCC.Delete(txtMancc.getText());
            XoaTrang();
            LayNguon();
        }
    }//GEN-LAST:event_cmdXoaActionPerformed

    private void cmdThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdThemActionPerformed
        KhoaMo(false);
        XoaTrang();
        ktThem = true;
        txtMancc.setText(TuTaoMa.Taoma("nhacungcap", "Mancc", "NCC"));
        txtMancc.setEditable(false);
        txtTenncc.requestFocus();
    }//GEN-LAST:event_cmdThemActionPerformed

    private void cmdSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSuaActionPerformed
        if(dgDanhSach.getSelectedRow()<0) return;
        KhoaMo(false);
        ktThem = false;
        macu = txtMancc.getText();
    }//GEN-LAST:event_cmdSuaActionPerformed

    private void cmdKhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdKhongActionPerformed
        XoaTrang();
        KhoaMo(true);
    }//GEN-LAST:event_cmdKhongActionPerformed

    private void cmdLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLuuActionPerformed
        //Kiểm tra dữ liệu rỗng
        if(txtMancc.getText().length()<=0){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập Mã nhà cung cấp","Thông báo",
                    JOptionPane.WARNING_MESSAGE);
            txtMancc.requestFocus();
            return;
        }
        if(txtTenncc.getText().length()<=0){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập Tên nhà cung cấp","Thông báo",
                    JOptionPane.WARNING_MESSAGE);
            txtTenncc.requestFocus();
            return;
        }
        if(txtDc.getText().length()<=0){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập địa chỉ","Thông báo",
                    JOptionPane.WARNING_MESSAGE);
            txtDc.requestFocus();
            return;
        }
        if(txtSdt.getText().length()<=0){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập số điện thoại","Thông báo",
                    JOptionPane.WARNING_MESSAGE);
            txtSdt.requestFocus();
            return;
        }
        
        /*if(KiemTraDL.KiemTraTrungMa("MaNCC","nhacungcap", txtMancc.getText(), ktThem, macu)==true){
            JOptionPane.showMessageDialog(this, "Mã nhà cung cấp đã tồn tại","Thông báo",
                    JOptionPane.ERROR_MESSAGE);
            txtMancc.requestFocus();
            return;
        }*/
        
        mancc = txtMancc.getText();
        tenncc = txtTenncc.getText();
        dcncc = txtDc.getText();
        sdtncc = txtSdt.getText();
        MD_QLNCC ncc = new MD_QLNCC(mancc,tenncc,dcncc,sdtncc);
        if (ktThem == true)
            QLNCC.Insert(ncc);
        else
            QLNCC.Update(ncc, macu);
        LayNguon();
        XoaTrang();
        KhoaMo(true);
    }//GEN-LAST:event_cmdLuuActionPerformed

    private void txtSdtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSdtKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtSdtKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdKhong;
    private javax.swing.JButton cmdLuu;
    private javax.swing.JButton cmdSua;
    private javax.swing.JButton cmdThem;
    private javax.swing.JButton cmdThoat;
    private javax.swing.JButton cmdXoa;
    private javax.swing.JTable dgDanhSach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDc;
    private javax.swing.JTextField txtMancc;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtTenncc;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
