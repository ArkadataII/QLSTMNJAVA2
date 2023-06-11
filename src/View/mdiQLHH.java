
package View;

import Controller.QLHH;
import Controller.KiemTraDL;
import Controller.QLNCC;
import Controller.QLNH;
import Controller.TuTaoMa;
import Model.MD_QLHH;
import Model.MD_QLNCC;
import Model.MD_QLNH;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class mdiQLHH extends javax.swing.JInternalFrame {
    
    DefaultTableModel tblDanhSach;//dung de doc cau truc cua bang
    List<MD_QLHH> arr = new ArrayList<>();
    List<MD_QLNCC> ncc = new ArrayList<>();
    List<MD_QLNH> nh = new ArrayList<>();
    String mahh, tenhh, mancc, manh, gianhap, giaxuat, tonkho, macu;
    boolean ktThem;

    public mdiQLHH() {
        initComponents();
        tblDanhSach = (DefaultTableModel) dgDanhSach.getModel();
        KhoaMo(true);
        XoaTrang();
        LayNguon();
        LayNguonNH();
        LayNguonNCC();
        System.out.println(cbManh.getSelectedIndex());
    }
    
    public void LayNguon() {
        arr = QLHH.LayNguon();

        tblDanhSach.setRowCount(0);//Xoa trang danh sach
        arr.forEach(p -> {//Vong lap de duyet phan tu trong mang arr
            tblDanhSach.addRow(new Object[]{// moi mot phan tu tuong ung voi 1 dong add vao gom 2 cot
                p.getMahh(), p.getTenhh(), p.getMancc(), p.getManh(), p.getGianhap(), p.getGiaxuat(), p.getTonkho()
            });
        });
    }
    
    public void LayNguonNCC() {
        ncc = QLNCC.LayNguon();
        ncc.forEach(p -> {//Vong lap de duyet phan tu trong mang arr
            cbMancc.addItem(p.getMancc());
        });
    }
    
    public void LayNguonNH() {
        nh = QLNH.LayNguon();
        nh.forEach(p -> {//Vong lap de duyet phan tu trong mang arr
            cbManh.addItem(p.getManh());
        });
    }
    
    public void KhoaMo(boolean b){
        //txtTimKiem.setEnabled(b);
        cmdThem.setEnabled(b);
        cmdSua.setEnabled(b);
        cmdXoa.setEnabled(b);
        cmdThoat.setEnabled(b);
        dgDanhSach.setEnabled(b);
        
        cbMancc.setEnabled(!b);
        cbManh.setEnabled(!b);
        cmdLuu.setEnabled(!b);
        cmdKhong.setEnabled(!b);
        txtMahh.setEditable(!b);
        txtTenhh.setEditable(!b);
        txtGianhap.setEditable(!b);
        txtGiaxuat.setEditable(!b);
        txtTonkho.setEditable(!b);
    }
    
    public void XoaTrang(){
        txtMahh.setText("");
        txtTenhh.setText("");
        txtGianhap.setText("");
        txtGiaxuat.setText("");
        txtTonkho.setText("");
    }
    
    public int vtncc(String tk){
        for (int i = 0; i < ncc.size(); i++){
            if(ncc.get(i).getMancc().equals(tk))
                    return i;
        }
        return 0;
    }
    
    public int vtnh(String tk){
        for (int i = 0; i < nh.size(); i++){
            if(nh.get(i).getManh().equals(tk))
                    return i;
        }
        return 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtGiaxuat = new javax.swing.JTextField();
        txtTenhh = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTonkho = new javax.swing.JTextField();
        txtMahh = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtGianhap = new javax.swing.JTextField();
        cmdThem = new javax.swing.JButton();
        cmdSua = new javax.swing.JButton();
        cmdXoa = new javax.swing.JButton();
        cmdLuu = new javax.swing.JButton();
        cmdKhong = new javax.swing.JButton();
        cmdThoat = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbMancc = new javax.swing.JComboBox<>();
        cbManh = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgDanhSach = new javax.swing.JTable();
        txtTimKiem = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setTitle("Quản lý hàng hóa");

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ HÀNG HÓA");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin hàng hóa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 12))); // NOI18N

        jLabel7.setText("Gía xuất :");

        txtGiaxuat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGiaxuatKeyTyped(evt);
            }
        });

        jLabel8.setText("Tồn kho :");

        jLabel3.setText("Tên HH :");

        txtTonkho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTonkhoKeyTyped(evt);
            }
        });

        jLabel5.setText("Mã NH :");

        jLabel2.setText("Mã HH :");

        jLabel6.setText("Gía nhập :");

        txtGianhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGianhapKeyTyped(evt);
            }
        });

        cmdThem.setText("Thêm");
        cmdThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdThemActionPerformed(evt);
            }
        });

        cmdSua.setText("Sửa");
        cmdSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSuaActionPerformed(evt);
            }
        });

        cmdXoa.setText("Xóa");
        cmdXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdXoaActionPerformed(evt);
            }
        });

        cmdLuu.setText("Lưu");
        cmdLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLuuActionPerformed(evt);
            }
        });

        cmdKhong.setText("Không");
        cmdKhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdKhongActionPerformed(evt);
            }
        });

        cmdThoat.setText("Thoát");
        cmdThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdThoatActionPerformed(evt);
            }
        });

        jLabel4.setText("Mã NCC :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbMancc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTenhh)
                    .addComponent(txtMahh, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtGianhap, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(cbManh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(cmdThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdSua, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmdLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdKhong, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(22, 22, 22)
                                .addComponent(txtGiaxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(23, 23, 23)
                                .addComponent(txtTonkho, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbManh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtGiaxuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(txtTonkho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtGianhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmdThem)
                            .addComponent(cmdSua)
                            .addComponent(cmdXoa)
                            .addComponent(cmdLuu)
                            .addComponent(cmdKhong)
                            .addComponent(cmdThoat)
                            .addComponent(jLabel4)
                            .addComponent(cbMancc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMahh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTenhh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dgDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã hàng hóa", "Tên hàng hóa", "Mã nhà cung cấp", "Mã nhóm hàng", "Gía nhập", "Gía xuất", "Tồn kho"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyPressed(evt);
            }
        });

        jLabel9.setText("Tìm kiếm :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdThoatActionPerformed
        dispose();
    }//GEN-LAST:event_cmdThoatActionPerformed

    private void cmdKhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdKhongActionPerformed
        XoaTrang();
        KhoaMo(true);
    }//GEN-LAST:event_cmdKhongActionPerformed

    private void dgDanhSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgDanhSachMouseClicked
        int index = dgDanhSach.getSelectedRow();//dòng đang chọn
        TableModel model = dgDanhSach.getModel();//dùng để lấy ra các cột trong table
        
        txtMahh.setText(model.getValueAt(index, 0).toString());
        txtTenhh.setText(model.getValueAt(index, 1).toString());
        cbMancc.setSelectedIndex(vtncc(model.getValueAt(index, 2).toString()));
        cbManh.setSelectedIndex(vtnh(model.getValueAt(index, 3).toString()));
        txtGianhap.setText(model.getValueAt(index, 4).toString());
        txtGiaxuat.setText(model.getValueAt(index, 5).toString());
        txtTonkho.setText(model.getValueAt(index, 6).toString());
    }//GEN-LAST:event_dgDanhSachMouseClicked

    private void cmdThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdThemActionPerformed
        KhoaMo(false);
        XoaTrang();
        ktThem = true;
        txtMahh.setText(TuTaoMa.Taoma("hanghoa", "MaHH", "HH"));
        txtMahh.setEditable(false);
        txtTenhh.requestFocus();
    }//GEN-LAST:event_cmdThemActionPerformed

    private void cmdSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSuaActionPerformed
        if(dgDanhSach.getSelectedRow()<0) return;
        KhoaMo(false);
        ktThem = false;
        macu = txtMahh.getText();
    }//GEN-LAST:event_cmdSuaActionPerformed

    private void cmdXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdXoaActionPerformed
        if(txtMahh.getText().length()<=0) return;
        int kq = JOptionPane.showConfirmDialog(this,"Bạn có muốn xóa hàng hóa "+ txtTenhh.getText() +" không","Thông báo",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (kq == JOptionPane.YES_OPTION) {
            QLHH.Delete(txtMahh.getText());
            XoaTrang();
            LayNguon();
        }
    }//GEN-LAST:event_cmdXoaActionPerformed

    private void cmdLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLuuActionPerformed
        if(txtMahh.getText().length()<=0){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập Mã hàng hóa","Thông báo",
                    JOptionPane.WARNING_MESSAGE);
            txtMahh.requestFocus();
            return;
        }
        if(txtTenhh.getText().length()<=0){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập Tên hàng hóa","Thông báo",
                    JOptionPane.WARNING_MESSAGE);
            txtTenhh.requestFocus();
            return;
        }
        if(txtGianhap.getText().length()<=0){
            JOptionPane.showMessageDialog(this, "Bạn chưa giá nhập","Thông báo",
                    JOptionPane.WARNING_MESSAGE);
            txtGianhap.requestFocus();
            return;
        }
        if(txtGiaxuat.getText().length()<=0){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập giá xuất","Thông báo",
                    JOptionPane.WARNING_MESSAGE);
            txtGiaxuat.requestFocus();
            return;
        }
        
        /*if(KiemTraDL.KiemTraTrungMa("MaHH","hanghoa", txtMahh.getText(), ktThem, macu)==true){
            JOptionPane.showMessageDialog(this, "Mã hàng hóa đã tồn tại","Thông báo",
                    JOptionPane.ERROR_MESSAGE);
            txtMahh.requestFocus();
            return;
        }*/
        
        mahh = txtMahh.getText();
        tenhh = txtTenhh.getText();
        mancc = cbMancc.getSelectedItem().toString();
        manh = cbManh.getSelectedItem().toString();
        gianhap = txtGianhap.getText();
        giaxuat = txtGiaxuat.getText();
        tonkho = txtTonkho.getText();
        MD_QLHH hh = new MD_QLHH(mahh,tenhh,mancc,manh,gianhap,giaxuat,tonkho);
        if (ktThem == true)
            QLHH.Insert(hh);
        else
            QLHH.Update(hh, macu);
        LayNguon();
        XoaTrang();
        KhoaMo(true);
    }//GEN-LAST:event_cmdLuuActionPerformed

    private void txtTimKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyPressed
        arr = QLHH.TimKiem(txtTimKiem.getText());
        
        tblDanhSach.setRowCount(0);//Xoa trang danh sach
        arr.forEach(p->{//Vong lap de duyet phan tu trong mang arr
            tblDanhSach.addRow(new Object[]{// moi mot phan tu tuong ung voi 1 dong add vao gom 2 cot
                p.getMahh(), p.getTenhh(), p.getMancc(), p.getManh(), p.getGianhap(), p.getGiaxuat(), p.getTonkho()
            });
        });
    }//GEN-LAST:event_txtTimKiemKeyPressed

    private void txtGianhapKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGianhapKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtGianhapKeyTyped

    private void txtGiaxuatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGiaxuatKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtGiaxuatKeyTyped

    private void txtTonkhoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTonkhoKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtTonkhoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbMancc;
    private javax.swing.JComboBox<String> cbManh;
    private javax.swing.JButton cmdKhong;
    private javax.swing.JButton cmdLuu;
    private javax.swing.JButton cmdSua;
    private javax.swing.JButton cmdThem;
    private javax.swing.JButton cmdThoat;
    private javax.swing.JButton cmdXoa;
    private javax.swing.JTable dgDanhSach;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtGianhap;
    private javax.swing.JTextField txtGiaxuat;
    private javax.swing.JTextField txtMahh;
    private javax.swing.JTextField txtTenhh;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTonkho;
    // End of variables declaration//GEN-END:variables
}
