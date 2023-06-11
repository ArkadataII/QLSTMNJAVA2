
package View;

import Controller.KiemTraDL;
import Controller.QLNV;
import Controller.TuTaoMa;
import Model.MD_QLNV;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class mdiQLNV extends javax.swing.JInternalFrame {

    DefaultTableModel tblDanhSach;//dung de doc cau truc cua bang
    List<MD_QLNV> arr = new ArrayList<>();
    String manv,tennv,chucvu,gioitinh,namsinh,sdt,diachi,macu;
    boolean ktThem;
    
    public mdiQLNV() {
        initComponents();
        tblDanhSach = (DefaultTableModel) dgDanhSach.getModel();
        KhoaMo(true);
        LayNguon();
    }
    
    public void LayNguon(){
        arr = QLNV.LayNguon();
        
        tblDanhSach.setRowCount(0);//Xoa trang danh sach
        arr.forEach(p->{//Vong lap de duyet phan tu trong mang arr
            tblDanhSach.addRow(new Object[]{// moi mot phan tu tuong ung voi 1 dong add vao gom 2 cot
                p.getManv(), p.getTennv(), p.getChucvu(), p.getGioiTinh(), p.getNamsinh(), p.getDc(), p.getSdt()
            });
        });
    }
    
    public void KhoaMo(boolean b) {
        cmdThem.setEnabled(b);
        cmdSua.setEnabled(b);
        cmdXoa.setEnabled(b);
        cmdThoat.setEnabled(b);
        dgDanhSach.setEnabled(b);
        txtTimKiem.setEnabled(b);
        
        txtManv.setEditable(!b);
        txtTennv.setEditable(!b);
        txtDiachi.setEditable(!b);
        txtNamsinh.setEditable(!b);
        txtSdt.setEditable(!b);
        
        txtChucvu.setEnabled(!b);
        txtGioiTinh.setEnabled(!b);
        
        cmdLuu.setEnabled(!b);
        cmdKhong.setEnabled(!b);
        
    }
    
    public void XoaTrang(){
        txtManv.setText("");
        txtTennv.setText("");
        txtDiachi.setText("");
        txtNamsinh.setText("");
        txtSdt.setText("");
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgDanhSach = new javax.swing.JTable();
        cmdAll = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtChucvu = new javax.swing.JComboBox<>();
        txtGioiTinh = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtManv = new javax.swing.JTextField();
        txtTennv = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDiachi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNamsinh = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSdt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmdThoat = new javax.swing.JButton();
        cmdKhong = new javax.swing.JButton();
        cmdLuu = new javax.swing.JButton();
        cmdXoa = new javax.swing.JButton();
        cmdSua = new javax.swing.JButton();
        cmdThem = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setTitle("Quản lý nhân viên");

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        dgDanhSach.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        dgDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Họ tên", "Chức vụ", "Giới tính", "Năm sinh", "Địa chỉ", "Số điện thoại"
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

        cmdAll.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmdAll.setText("All");
        cmdAll.setActionCommand("");
        cmdAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAllActionPerformed(evt);
            }
        });

        txtTimKiem.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setText("Tìm kiếm :");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 12))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setText("Chức vụ :");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setText("Giới tính :");

        txtChucvu.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtChucvu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bán hàng", "Nhập hàng" }));

        txtGioiTinh.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Mã nv :");

        txtManv.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtTennv.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("Họ tên :");

        txtDiachi.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("Địa chỉ :");

        txtNamsinh.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtNamsinh.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNamsinh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNamsinhKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("Năm sinh :");

        txtSdt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtSdt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSdtKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setText("Sđt :");

        cmdThoat.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmdThoat.setText("Thoát");
        cmdThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdThoatActionPerformed(evt);
            }
        });

        cmdKhong.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmdKhong.setText("Không");
        cmdKhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdKhongActionPerformed(evt);
            }
        });

        cmdLuu.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmdLuu.setText("Lưu");
        cmdLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLuuActionPerformed(evt);
            }
        });

        cmdXoa.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmdXoa.setText("Xóa");
        cmdXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdXoaActionPerformed(evt);
            }
        });

        cmdSua.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmdSua.setText("Sửa");
        cmdSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSuaActionPerformed(evt);
            }
        });

        cmdThem.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmdThem.setText("Thêm");
        cmdThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtManv, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTennv, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGioiTinh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNamsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtChucvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 32, Short.MAX_VALUE)
                        .addComponent(cmdThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdSua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdXoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdLuu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdKhong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdThoat))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtManv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(txtNamsinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtChucvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTennv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(cmdThem)
                            .addComponent(cmdSua)
                            .addComponent(cmdXoa)
                            .addComponent(cmdLuu)
                            .addComponent(cmdKhong)
                            .addComponent(cmdThoat))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmdAll))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdAll)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLuuActionPerformed
        //Kiểm tra dữ liệu rỗng
        if(txtManv.getText().length()<=0){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập Mã nhân viên","Thông báo",
                    JOptionPane.WARNING_MESSAGE);
            txtManv.requestFocus();
            return;
        }
        if(txtTennv.getText().length()<=0){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập Tên nhân viên","Thông báo",
                    JOptionPane.WARNING_MESSAGE);
            txtTennv.requestFocus();
            return;
        }
        if(txtDiachi.getText().length()<=0){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập địa chỉ","Thông báo",
                    JOptionPane.WARNING_MESSAGE);
            txtDiachi.requestFocus();
            return;
        }
        if(txtNamsinh.getText().length()<=0){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập năm sinh","Thông báo",
                    JOptionPane.WARNING_MESSAGE);
            txtNamsinh.requestFocus();
            return;
        }
        if(txtSdt.getText().length()<=0){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập số điện thoại","Thông báo",
                    JOptionPane.WARNING_MESSAGE);
            txtSdt.requestFocus();
            return;
        }
        
        /*if(KiemTraDL.KiemTraTrungMa("MaNV","nhanvien", txtManv.getText(), ktThem, macu)==true){
            JOptionPane.showMessageDialog(this, "Mã nhân viên đã tồn tại","Thông báo",
                    JOptionPane.ERROR_MESSAGE);
            txtManv.requestFocus();
            return;
        }*/
        
        manv = txtManv.getText();
        tennv = txtTennv.getText();
        chucvu = txtChucvu.getItemAt(txtChucvu.getSelectedIndex());
        gioitinh = txtGioiTinh.getItemAt(txtGioiTinh.getSelectedIndex());
        namsinh = txtNamsinh.getText();
        sdt = txtSdt.getText();
        diachi = txtDiachi.getText();
        MD_QLNV nv = new MD_QLNV(manv,tennv,chucvu,gioitinh,namsinh,sdt,diachi);
        if (ktThem == true)
            QLNV.Insert(nv);
        else
            QLNV.Update(nv, macu);
        LayNguon();
        XoaTrang();
        KhoaMo(true);
    }//GEN-LAST:event_cmdLuuActionPerformed

    private void cmdThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdThoatActionPerformed
        dispose();
    }//GEN-LAST:event_cmdThoatActionPerformed

    private void cmdAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAllActionPerformed
        LayNguon();
    }//GEN-LAST:event_cmdAllActionPerformed

    private void cmdThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdThemActionPerformed
        KhoaMo(false);
        XoaTrang();
        ktThem = true;
        txtManv.setText(TuTaoMa.Taoma("nhanvien", "Manv", "NV"));
        txtManv.setEditable(false);
        txtTennv.requestFocus();
    }//GEN-LAST:event_cmdThemActionPerformed

    private void cmdSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSuaActionPerformed
        if(dgDanhSach.getSelectedRow()<0) return;
        KhoaMo(false);
        ktThem = false;
        macu = txtManv.getText();
    }//GEN-LAST:event_cmdSuaActionPerformed

    private void dgDanhSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgDanhSachMouseClicked
        int index = dgDanhSach.getSelectedRow();//dòng đang chọn
        TableModel model = dgDanhSach.getModel();//dùng để lấy ra các cột trong table
        
        txtManv.setText(model.getValueAt(index, 0).toString());
        txtTennv.setText(model.getValueAt(index, 1).toString());
        
        if(model.getValueAt(index, 2).toString().equals("Bán hàng")) txtChucvu.setSelectedIndex(0);
        else txtChucvu.setSelectedIndex(1);
        if(model.getValueAt(index, 3).toString().equals("Nam")) txtGioiTinh.setSelectedIndex(0);
        else txtGioiTinh.setSelectedIndex(1);

        txtNamsinh.setText(model.getValueAt(index, 4).toString());
        txtSdt.setText(model.getValueAt(index, 5).toString());
        txtDiachi.setText(model.getValueAt(index, 6).toString());


    }//GEN-LAST:event_dgDanhSachMouseClicked

    private void cmdKhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdKhongActionPerformed
        XoaTrang();
        KhoaMo(true);
    }//GEN-LAST:event_cmdKhongActionPerformed

    private void txtTimKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyPressed
        arr = QLNV.TimKiem(txtTimKiem.getText());
        
        tblDanhSach.setRowCount(0);//Xoa trang danh sach
        arr.forEach(p->{//Vong lap de duyet phan tu trong mang arr
            tblDanhSach.addRow(new Object[]{// moi mot phan tu tuong ung voi 1 dong add vao gom 2 cot
                p.getManv(), p.getTennv(), p.getChucvu(), p.getGioiTinh(), p.getNamsinh(), p.getDc(), p.getSdt()
            });
        });
    }//GEN-LAST:event_txtTimKiemKeyPressed

    private void cmdXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdXoaActionPerformed
        if(txtManv.getText().length()<=0) return;
        int kq = JOptionPane.showConfirmDialog(this,"Bạn có muốn xóa nhân viên "+ txtTennv.getText() +" không","Thông báo",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (kq == JOptionPane.YES_OPTION) {
            QLNV.Delete(txtManv.getText());
            XoaTrang();
            LayNguon();
        }
    }//GEN-LAST:event_cmdXoaActionPerformed

    private void txtNamsinhKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamsinhKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtNamsinhKeyTyped

    private void txtSdtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSdtKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_txtSdtKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAll;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> txtChucvu;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JComboBox<String> txtGioiTinh;
    private javax.swing.JTextField txtManv;
    private javax.swing.JTextField txtNamsinh;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtTennv;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
