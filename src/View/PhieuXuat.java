/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.Ctrl_PhieuNhap;
import Controller.Ctrl_PhieuXuat;
import Controller.TuTaoMa;
import Controller.chuyendoi;
import Model.MD_CTPX;
import Model.MD_PX;
import Model.MD_QLHH;
import Model.MD_QLNV;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import qlstmn_20_5_2023.QLSTMN_20_5_2023;


public class PhieuXuat extends javax.swing.JFrame {

    DefaultTableModel tblHH, tblCTPhieuXuat;//dung de doc cau truc cua bang
    List<MD_QLHH> hh = new ArrayList<>();
    List<MD_CTPX> ctpx = new ArrayList<>();
    List<MD_QLNV> nv = new ArrayList<>();
    String manv, maxuat, tongtien, ngayxuat;
    String mahh, tenhh, giaxuat, soluong, thanhtien, tonkho;
    MouseEvent vtctphieuxuat;
    double sl, gn, tt;
    boolean ktThem;


    public PhieuXuat() {
        initComponents();
        tblHH = (DefaultTableModel) dgHH.getModel();
        tblCTPhieuXuat = (DefaultTableModel) dgCTPhieuXuat.getModel();
        txtMaNV.setVisible(false);
        txtMaNV.setText(QLSTMN_20_5_2023.PX);
        LayNguonTenNV();
        txtMaHH.setVisible(false);
        KhoaDong(true);
        KhoaMo(true);
        txtNgayXuat.setDate(new Date());
        maxuat = txtMaXuat.getText();
        mahh = txtMaHH.getText();
        LayNguonHangHoa();
        txtMaXuat.setText(TuTaoMa.Taoma("phieuxuat", "MaXuat", "PX"));
    }
    
    public void LayNguonTenNV() {
        nv = Ctrl_PhieuNhap.TimKiemTenNV(txtMaNV.getText());

        nv.forEach(p -> {//Vong lap de duyet phan tu trong mang arr
            txtTenNV.setText(p.getTennv());
        });
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTenNV = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        chkHien = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaXuat = new javax.swing.JTextField();
        txtMaNV = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNgayXuat = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgHH = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        dgCTPhieuXuat = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtTenHH = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtGiaXuat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSL = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTienKhachDua = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTienTraLai = new javax.swing.JTextField();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnLuuPhieu = new javax.swing.JButton();
        btnThanhToan = new javax.swing.JButton();
        btnXoaTrang = new javax.swing.JButton();
        txtMaHH = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtTenNV.setEnabled(false);

        jLabel1.setText("Nhân viên:");

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyPressed(evt);
            }
        });

        jLabel2.setText("Tìm Kiếm:");

        chkHien.setText("Hiện Toàn bộ");
        chkHien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkHienMouseClicked(evt);
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
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkHien))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(chkHien))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel3.setText("Phiếu Xuất");

        jLabel4.setText("Mã Xuất:");

        txtMaXuat.setEnabled(false);

        txtMaNV.setText("NV01");

        jLabel12.setText("Ngày Xuất:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(101, 101, 101)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaXuat, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(txtNgayXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtMaXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNgayXuat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        dgHH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HH", "Tên Hàng Hóa", "Giá Xuất", "Tồn Kho"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dgHH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgHHMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dgHH);

        dgCTPhieuXuat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HH", "Tên Hàng Hóa", "Giá Xuất", "Số lượng", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dgCTPhieuXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgCTPhieuXuatMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(dgCTPhieuXuat);

        jLabel6.setText("Tên Hàng:");

        txtTenHH.setEnabled(false);

        jLabel7.setText("Giá Xuất:");

        txtGiaXuat.setEnabled(false);

        jLabel8.setText("Số Lượng:");

        txtSL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSLKeyPressed(evt);
            }
        });

        jLabel9.setText("Tổng Thành Tiền:");

        txtTongTien.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTongTien.setEnabled(false);

        jLabel10.setText("Tiền Khách Đưa:");

        txtTienKhachDua.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTienKhachDua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTienKhachDuaKeyPressed(evt);
            }
        });

        jLabel11.setText("Tiền Trả Lại Khách:");

        txtTienTraLai.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTienTraLai.setEnabled(false);

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnLuuPhieu.setText("Lưu Phiếu");
        btnLuuPhieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuPhieuActionPerformed(evt);
            }
        });

        btnThanhToan.setText("Thanh Toán");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        btnXoaTrang.setText("Xóa Trắng");
        btnXoaTrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaTrangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtGiaXuat))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenHH, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnThem)
                                .addGap(18, 18, 18)
                                .addComponent(btnSua)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoa))
                            .addComponent(txtSL))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTienTraLai, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTienKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(txtMaHH, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXoaTrang)
                        .addGap(18, 18, 18)
                        .addComponent(btnThanhToan)
                        .addGap(59, 59, 59)
                        .addComponent(btnLuuPhieu))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTenHH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtGiaXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtTienKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(txtTienTraLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnXoaTrang)
                        .addComponent(btnThanhToan)
                        .addComponent(btnLuuPhieu))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThem)
                        .addComponent(btnSua)
                        .addComponent(btnXoa)
                        .addComponent(txtMaHH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void LayNguonHangHoa() {
        hh = Ctrl_PhieuXuat.LayNguonHH(txtMaHH.getText());

        tblHH.setRowCount(0);//Xoa trang danh sach
        hh.forEach(p -> {//Vong lap de duyet phan tu trong mang arr
            tblHH.addRow(new Object[]{// moi mot phan tu tuong ung voi 1 dong add vao gom 2 cot
                p.getMahh(), p.getTenhh(), p.getGiaxuat(), p.getTonkho()
            });
        });
    }

    public void TimKiemHangHoa() {
        hh = Ctrl_PhieuXuat.TimKiemHH(txtTimKiem.getText());

        tblHH.setRowCount(0);//Xoa trang danh sach
        hh.forEach(p -> {//Vong lap de duyet phan tu trong mang arr
            tblHH.addRow(new Object[]{// moi mot phan tu tuong ung voi 1 dong add vao gom 2 cot
                p.getMahh(), p.getTenhh(), p.getGiaxuat(), p.getTonkho()
            });
        });
    }

    public void LayNguonCTPhieuXuat() {
        maxuat = txtMaXuat.getText();
        ctpx = Ctrl_PhieuXuat.LayNguonCTPhieuXuat(maxuat);

        tblCTPhieuXuat.setRowCount(0);//Xoa trang danh sach
        ctpx.forEach(p -> {//Vong lap de duyet phan tu trong mang arr
            tblCTPhieuXuat.addRow(new Object[]{// moi mot phan tu tuong ung voi 1 dong add vao gom 2 cot
                p.getMahh(), p.getTenhh(), p.getGiaxuat(), p.getSoluong(), p.getThanhtien()
            });
        });
    }

    public void XoaTrang() {
        txtTenHH.setText("");
        txtGiaXuat.setText("");
        txtSL.setText("");
    }

    public void KhoaMo(boolean b) {
        btnThem.setEnabled(b);
        btnSua.setEnabled(!b);
        btnXoa.setEnabled(!b);
    }

    public void KhoaDong(boolean b) {
        btnThem.setEnabled(!b);
        btnSua.setEnabled(!b);
        txtSL.setEnabled(!b);
        btnXoa.setEnabled(!b);
        btnXoaTrang.setEnabled(!b);
        btnThanhToan.setEnabled(!b);
        btnLuuPhieu.setEnabled(!b);
        txtTienKhachDua.setEnabled(!b);
    }

    public void KhoaCoDL(boolean b) {
        if (tblCTPhieuXuat.getRowCount() < 0) {
            txtTienKhachDua.setEnabled(!b);
            btnThanhToan.setEnabled(!b);
            btnXoaTrang.setEnabled(!b);
            btnLuuPhieu.setEnabled(!b);
        } else {

            txtTienKhachDua.setEnabled(b);
            btnThanhToan.setEnabled(b);
            btnXoaTrang.setEnabled(b);
            btnLuuPhieu.setEnabled(b);

        }
    }

    public void TinhTongTien() {
        double tongtien = 0;
        for (int i = 0; i < dgCTPhieuXuat.getRowCount(); i++) {
            tongtien += Double.parseDouble(dgCTPhieuXuat.getValueAt(i, 4).toString());
        }
        txtTongTien.setText(String.valueOf(tongtien));
    }
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:      
        double tk = Ctrl_PhieuXuat.LaySLTonKho(txtMaHH.getText());
        if (txtTenHH.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn hàng hóa", "Thông báo",
                    JOptionPane.WARNING_MESSAGE);
            dgHH.requestFocus();
            return;
        }
        if (txtSL.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập số luọng", "Thông báo",
                    JOptionPane.WARNING_MESSAGE);
            dgHH.requestFocus();
            return;
        }
        if (Double.parseDouble(txtSL.getText()) > tk) {
            JOptionPane.showMessageDialog(this, "Số lượng tồn kho không đủ", "Thông báo",
                    JOptionPane.WARNING_MESSAGE);
            dgHH.requestFocus();
            return;
        } else {
            /*int[] selectedRows = dgHH.getSelectedRows();
            for (int i : selectedRows) {
                Vector rowData = new Vector();
                for (int j = 0; j < 3; j++) {
                        rowData.add(tblHH.getValueAt(i, j));
                }
                rowData.add(txtSL.getText());
                double gx = Double.parseDouble(txtGiaXuat.getText());
                double sl = Double.parseDouble(txtSL.getText());
                double tt = gx*sl;
                rowData.add(tt);
                tblCTPhieuXuat.addRow(rowData);
            }*/
            String[] data = new String[5];
            data[0] = txtMaHH.getText();
            data[1] = txtTenHH.getText();
            data[2] = txtGiaXuat.getText();
            data[3] = txtSL.getText();
            double gx = Double.parseDouble(txtGiaXuat.getText());
            double sl = Double.parseDouble(txtSL.getText());
            double tt = gx * sl;
            data[4] = String.valueOf(tt);
            tblCTPhieuXuat.addRow(data);
        }
        XoaTrang();
        KhoaDong(true);
        KhoaMo(true);
        KhoaCoDL(true);
        TinhTongTien();

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        double tk = Ctrl_PhieuXuat.LaySLTonKho(txtMaHH.getText());
        if (txtSL.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập số luọng", "Thông báo",
                    JOptionPane.WARNING_MESSAGE);
            dgHH.requestFocus();
            return;
        }
        if (Double.parseDouble(txtSL.getText()) > tk) {
            JOptionPane.showMessageDialog(this, "Số lượng tồn kho không đủ", "Thông báo",
                    JOptionPane.WARNING_MESSAGE);
            dgHH.requestFocus();
            return;
        } else {
            for (int i = 0; i < tblCTPhieuXuat.getRowCount(); i++) {
                if (dgCTPhieuXuat.getValueAt(i, 0).equals(txtMaHH.getText())) {
                    tblCTPhieuXuat.removeRow(i);
                }
            }
            String[] data = new String[5];
            data[0] = txtMaHH.getText();
            data[1] = txtTenHH.getText();
            data[2] = txtGiaXuat.getText();
            data[3] = txtSL.getText();
            double gx = Double.parseDouble(txtGiaXuat.getText());
            double sl = Double.parseDouble(txtSL.getText());
            double tt = gx * sl;
            data[4] = String.valueOf(tt);
            tblCTPhieuXuat.addRow(data);
        }
        XoaTrang();
        KhoaDong(true);
        KhoaMo(true);
        KhoaCoDL(true);
        TinhTongTien();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < tblCTPhieuXuat.getRowCount(); i++) {
            if (dgCTPhieuXuat.getValueAt(i, 0).equals(txtMaHH.getText())) {
                tblCTPhieuXuat.removeRow(i);
            }
        }
        XoaTrang();
        KhoaDong(true);
        KhoaMo(true);
        KhoaCoDL(true);
        TinhTongTien();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnXoaTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTrangActionPerformed
        // TODO add your handling code here:
        tblCTPhieuXuat.setRowCount(0);
        txtTimKiem.setText("");
        txtTenHH.setText("");
        txtGiaXuat.setText("");
        txtSL.setText("");
        txtTongTien.setText("");
        txtTienKhachDua.setText("");
        txtTienTraLai.setText("");
        KhoaDong(true);
        KhoaMo(true);
    }//GEN-LAST:event_btnXoaTrangActionPerformed

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        // TODO add your handling code here:
        double tienthua = Double.parseDouble(txtTienKhachDua.getText()) - Double.parseDouble(txtTongTien.getText());
        if (tienthua < 0) {
            JOptionPane.showMessageDialog(this, "Khách đưa thiếu tiền!!!", "Thông báo",
                    JOptionPane.WARNING_MESSAGE);
            dgHH.requestFocus();
            return;
        } else {
            txtTienTraLai.setText(String.valueOf(tienthua));
        }
        if (tienthua > 0)
            btnLuuPhieu.setEnabled(true);
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void btnLuuPhieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuPhieuActionPerformed
        if (txtTienTraLai.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Khách đưa thiếu tiền!!!", "Thông báo",
                    JOptionPane.WARNING_MESSAGE);
            dgHH.requestFocus();
            return;
        } else {
            int kq = JOptionPane.showConfirmDialog(this, "Bạn có muốn lưu phiếu nhập " + txtMaXuat.getText() + "!!!", "Thông báo",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (kq == JOptionPane.YES_OPTION) {
                maxuat = txtMaXuat.getText();
                manv = txtMaNV.getText();
                Date nn = txtNgayXuat.getDate();
                ngayxuat = chuyendoi.LayngayString(nn);
                tongtien = txtTongTien.getText();
                MD_PX px = new MD_PX(maxuat, manv, ngayxuat, tongtien);
                Ctrl_PhieuXuat.InsertPX(px);
                for (int i = 0; i < tblCTPhieuXuat.getRowCount(); i++) {
                    maxuat = txtMaXuat.getText();
                    mahh = dgCTPhieuXuat.getValueAt(i, 0).toString();
                    giaxuat = dgCTPhieuXuat.getValueAt(i, 2).toString();
                    soluong = dgCTPhieuXuat.getValueAt(i, 3).toString();
                    thanhtien = dgCTPhieuXuat.getValueAt(i, 4).toString();
                    MD_CTPX ctpx = new MD_CTPX(maxuat, mahh, giaxuat, soluong, thanhtien);
                    Ctrl_PhieuXuat.InsertCTPX(ctpx);
                    double slt = Double.parseDouble(soluong.toString());
                    double tk = Ctrl_PhieuXuat.LaySLTonKho(mahh);
                    double tkm = tk - slt;
                    tonkho = String.valueOf(tkm);
                    MD_QLHH hh1 = new MD_QLHH(tonkho);
                    Ctrl_PhieuXuat.UpdateHH(hh1, mahh);
                }
            } else {
                Ctrl_PhieuXuat.DeletePX(maxuat);
            }
            KhoaDong(true);
            KhoaMo(true);
            XoaTrang();
            tblCTPhieuXuat.setRowCount(0);
            tblHH.setRowCount(0);
            LayNguonHangHoa();
            txtTongTien.setText("");
            txtTienKhachDua.setText("");
            txtTienTraLai.setText("");
            txtMaXuat.setText(TuTaoMa.Taoma("phieuxuat", "MaXuat", "PX"));
        }
    }//GEN-LAST:event_btnLuuPhieuActionPerformed

    private void txtTimKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyPressed
        // TODO add your handling code here:
        TimKiemHangHoa();
    }//GEN-LAST:event_txtTimKiemKeyPressed

    private void chkHienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkHienMouseClicked
        // TODO add your handling code here:
        txtTimKiem.setText("");
        if (chkHien.isSelected() == true) {
            LayNguonHangHoa();
        } else {
            tblHH.setRowCount(0);//Xoa trang danh sach
        }
    }//GEN-LAST:event_chkHienMouseClicked

    private void dgHHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgHHMouseClicked
        // TODO add your handling code here:
        int index = dgHH.getSelectedRow();//dòng đang chọn
        TableModel model = dgHH.getModel();//dùng để lấy ra các cột trong table
        txtMaHH.setText(model.getValueAt(index, 0).toString());
        txtTenHH.setText(model.getValueAt(index, 1).toString());
        txtGiaXuat.setText(model.getValueAt(index, 2).toString());
        txtSL.setEnabled(true);
    }//GEN-LAST:event_dgHHMouseClicked

    private void dgCTPhieuXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgCTPhieuXuatMouseClicked
        // TODO add your handling code here:
        vtctphieuxuat = evt;
        int index = dgCTPhieuXuat.getSelectedRow();//dòng đang chọn
        TableModel model = dgCTPhieuXuat.getModel();//dùng để lấy ra các cột trong table
        txtMaHH.setText(model.getValueAt(index, 0).toString());
        txtTenHH.setText(model.getValueAt(index, 1).toString());
        txtGiaXuat.setText(model.getValueAt(index, 2).toString());
        txtSL.setText(model.getValueAt(index, 3).toString());
        KhoaMo(false);
        txtSL.setEnabled(true);
    }//GEN-LAST:event_dgCTPhieuXuatMouseClicked

    private void txtSLKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSLKeyPressed
        // TODO add your handling code here:
        String sl = txtSL.getText();
        int length = sl.length();
        char c = evt.getKeyChar();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (length < 10) {
                txtSL.setEditable(true);
            } else {
                txtSL.setEditable(false);
            }
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                txtSL.setEditable(true);
            } else {
                txtSL.setEditable(false);
            }
        }
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            TinhTongTien();
        }
    }//GEN-LAST:event_txtSLKeyPressed

    private void txtTienKhachDuaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTienKhachDuaKeyPressed
        // TODO add your handling code here:
        String sl = txtSL.getText();
        int length = sl.length();
        char c = evt.getKeyChar();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (length < 20) {
                txtSL.setEditable(true);
            } else {
                txtSL.setEditable(false);
            }
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                txtSL.setEditable(true);
            } else {
                txtSL.setEditable(false);
            }
        }
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            double tienthua = Double.parseDouble(txtTienKhachDua.getText()) - Double.parseDouble(txtTongTien.getText());
            txtTienTraLai.setText(String.valueOf(tienthua));
        }
    }//GEN-LAST:event_txtTienKhachDuaKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PhieuXuat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhieuXuat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhieuXuat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhieuXuat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhieuXuat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuuPhieu;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaTrang;
    private javax.swing.JCheckBox chkHien;
    private javax.swing.JTable dgCTPhieuXuat;
    private javax.swing.JTable dgHH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtGiaXuat;
    private javax.swing.JTextField txtMaHH;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtMaXuat;
    private com.toedter.calendar.JDateChooser txtNgayXuat;
    private javax.swing.JTextField txtSL;
    private javax.swing.JTextField txtTenHH;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txtTienKhachDua;
    private javax.swing.JTextField txtTienTraLai;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}
