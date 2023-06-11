/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.Ctrl_PhieuNhap;

import Controller.TuTaoMa;
import Controller.chuyendoi;
import Model.MD_CTPN;
import Model.MD_PN;
import Model.MD_QLHH;
import Model.MD_QLNCC;
import Model.MD_QLNV;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import qlstmn_20_5_2023.QLSTMN_20_5_2023;


public class PhieuNhap extends javax.swing.JFrame {

    DefaultTableModel tblNCC, tblHH, tblCTPhieuNhap;//dung de doc cau truc cua bang
    List<MD_QLHH> hh = new ArrayList<>();
    List<MD_QLNCC> ncc = new ArrayList<>();
    List<MD_CTPN> ctpn = new ArrayList<>();
    List<MD_QLNV> nv = new ArrayList<>();
    String mancc, manv, tenncc, diachi, sdt, manhap, tongtien, ngaynhap;
    String mahh, tenhh, gianhap, soluong, thanhtien, tonkho;
    MouseEvent vtctphieunhap;
    double sl, gn, tt;
    boolean ktThem;


    public PhieuNhap() {
        initComponents();
        tblNCC = (DefaultTableModel) dgNCC.getModel();
        tblHH = (DefaultTableModel) dgHH.getModel();
        tblCTPhieuNhap = (DefaultTableModel) dgCTPhieuNhap.getModel();
        KhoaDong(true);
        txtMaNCC.setVisible(false);
        txtMaNV.setText(QLSTMN_20_5_2023.PN);
        LayNguonTenNV();
        txtMaNV.setVisible(false);
        txtMaHH.setVisible(false);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        txtNgayNhap.setDate(new Date());
        manhap = txtMaNhap.getText();
        mahh = txtMaHH.getText();
    }
    
    public void LayNguonTenNV() {
        nv = Ctrl_PhieuNhap.TimKiemTenNV(txtMaNV.getText());

        nv.forEach(p -> {//Vong lap de duyet phan tu trong mang arr
            txtNguoiLap.setText(p.getTennv());
        });
    }

    public void LayNguonNCC() {
        ncc = Ctrl_PhieuNhap.LayNguonNCC();

        tblNCC.setRowCount(0);//Xoa trang danh sach
        ncc.forEach(p -> {//Vong lap de duyet phan tu trong mang arr
            tblNCC.addRow(new Object[]{// moi mot phan tu tuong ung voi 1 dong add vao gom 2 cot
                p.getMancc(), p.getTenncc(), p.getDcncc(), p.getSdtncc()
            });
        });
    }

    public void TimKiemNCC() {
        ncc = Ctrl_PhieuNhap.TimKiemNCC(txtTKNCC.getText());

        tblNCC.setRowCount(0);//Xoa trang danh sach
        ncc.forEach(p -> {//Vong lap de duyet phan tu trong mang arr
            tblNCC.addRow(new Object[]{// moi mot phan tu tuong ung voi 1 dong add vao gom 2 cot
                p.getMancc(), p.getTenncc(), p.getDcncc(), p.getSdtncc()
            });
        });
    }

    public void LayNguonHangHoaBS() {
        mancc = txtMaNCC.getText();
        manhap = txtMaNhap.getText();
        hh = Ctrl_PhieuNhap.LayNguonHangHoaBS(mancc, manhap);

        tblHH.setRowCount(0);//Xoa trang danh sach
        hh.forEach(p -> {//Vong lap de duyet phan tu trong mang arr
            tblHH.addRow(new Object[]{// moi mot phan tu tuong ung voi 1 dong add vao gom 2 cot
                p.getMahh(), p.getTenhh(), p.getGianhap()
            });
        });
    }

    public void LayNguonCTPhieuNhap() {
        manhap = txtMaNhap.getText();
        ctpn = Ctrl_PhieuNhap.LayNguonCTPhieuNhap(manhap);

        tblCTPhieuNhap.setRowCount(0);//Xoa trang danh sach
        ctpn.forEach(p -> {//Vong lap de duyet phan tu trong mang arr
            tblCTPhieuNhap.addRow(new Object[]{// moi mot phan tu tuong ung voi 1 dong add vao gom 2 cot
                p.getMahh(), p.getTenhh(), p.getGianhap(), p.getSoluong(), p.getThanhtien()
            });
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTKNCC = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        btnTaoPhieu = new javax.swing.JButton();
        btnLuuPhieu = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        dgCTPhieuNhap = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        dgHH = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        dgNCC = new javax.swing.JTable();
        chkHien = new javax.swing.JCheckBox();
        txtMaHH = new javax.swing.JTextField();
        txtMaNCC = new javax.swing.JTextField();
        txtMaNV = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtNguoiLap = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTenNCC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTenHH = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtGiaNhap = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSĐT = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtSL = new javax.swing.JTextField();
        txtThanhTien = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        btnKhong = new javax.swing.JButton();
        txtNgayNhap = new com.toedter.calendar.JDateChooser();
        txtMaNhap = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Phiếu Nhập");

        jLabel2.setText("Tìm kiếm:");

        txtTKNCC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTKNCCKeyPressed(evt);
            }
        });

        jLabel14.setText("Tổng số tiền:");

        txtTongTien.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTongTien.setText("0");
        txtTongTien.setEnabled(false);

        btnTaoPhieu.setText("Tạo Phiếu");
        btnTaoPhieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoPhieuActionPerformed(evt);
            }
        });

        btnLuuPhieu.setText("Lưu Phiếu");
        btnLuuPhieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuPhieuActionPerformed(evt);
            }
        });

        dgCTPhieuNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã HH", "Tên Hàng Hóa", "Giá Nhập", "Số Lượng", "Thành Tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dgCTPhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgCTPhieuNhapMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(dgCTPhieuNhap);

        dgHH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã HH", "Tên Hàng Hóa", "Giá Nhập"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dgHH.setPreferredSize(new java.awt.Dimension(300, 200));
        dgHH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgHHMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(dgHH);

        dgNCC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã NCC", "Tên Nhà Cung Cấp", "Địa Chỉ", "Số Điện Thoại"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dgNCC.setPreferredSize(new java.awt.Dimension(300, 200));
        dgNCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgNCCMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(dgNCC);

        chkHien.setText("Hiện toàn bộ");
        chkHien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkHienMouseClicked(evt);
            }
        });

        txtMaHH.setEnabled(false);

        txtMaNCC.setEnabled(false);

        txtMaNV.setText("NV01");
        txtMaNV.setEnabled(false);

        jLabel5.setText("Người lập:");

        txtNguoiLap.setEnabled(false);

        jLabel6.setText("Tên nhà cung cấp:");

        txtTenNCC.setEnabled(false);

        jLabel8.setText("Địa chỉ:");

        txtDiaChi.setEnabled(false);

        jLabel9.setText("Tên hàng:");

        txtTenHH.setEnabled(false);

        jLabel10.setText("Giá nhập:");

        txtGiaNhap.setEnabled(false);

        jLabel13.setText("Ngày Nhập:");

        jLabel7.setText("Số điện thoại:");

        txtSĐT.setEnabled(false);

        jLabel11.setText("Số lượng:");

        txtSL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSLKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSLKeyTyped(evt);
            }
        });

        txtThanhTien.setEnabled(false);

        jLabel12.setText("Thành tiền:");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnGhi.setText("Ghi");
        btnGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiActionPerformed(evt);
            }
        });

        btnKhong.setText("Không");
        btnKhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNguoiLap, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                            .addComponent(txtTenNCC))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSĐT, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(txtNgayNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(txtDiaChi)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnThem)
                                .addGap(18, 18, 18)
                                .addComponent(btnSua)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoa))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTenHH, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                                .addComponent(txtGiaNhap)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSL, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txtThanhTien)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnGhi)
                                .addGap(18, 18, 18)
                                .addComponent(btnKhong)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtNguoiLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13))
                    .addComponent(txtNgayNhap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(txtSĐT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtTenHH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKhong)
                    .addComponent(btnGhi)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnThem))
                .addGap(14, 14, 14))
        );

        txtMaNhap.setEnabled(false);

        jLabel3.setText("Mã nhập:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTongTien, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(btnTaoPhieu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLuuPhieu)
                                .addGap(125, 125, 125))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTKNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addComponent(chkHien)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMaHH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtTKNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkHien)
                    .addComponent(txtMaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaHH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtMaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTaoPhieu))
                    .addComponent(btnLuuPhieu))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        btnSua.setEnabled(false);
        btnXoa.setEnabled(false);
        XoaTrang();
        LayNguonCTPhieuNhap();
        if (tblCTPhieuNhap.getRowCount() >= 0) {
            dgNCC.setEnabled(true);
        }
        if (tblCTPhieuNhap.getRowCount() < 0) {
            dgNCC.setEnabled(true);
        }
        LayNguonNCC();
        LayNguonHangHoaBS();
        ktThem = true;
        KhoaMo(false);
        TinhTongTien();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if (txtTenHH.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn hàng hóa", "Thông báo",
                    JOptionPane.WARNING_MESSAGE);
            dgHH.requestFocus();
            return;
        } else {
            txtSL.setEnabled(true);
            ktThem = false;
            KhoaMo(false);

        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        mahh = txtMaHH.getText();
        if (txtTenHH.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn hàng hóa", "Thông báo",
                    JOptionPane.WARNING_MESSAGE);
            dgHH.requestFocus();
            return;
        } else {
            int kq = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa hàng hóa " + txtTenHH.getText() + "!!!", "Thông báo",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (kq == JOptionPane.YES_OPTION) {
                Ctrl_PhieuNhap.DeleteCTPN(manhap, mahh);
                XoaTrang();
                LayNguonCTPhieuNhap();
                LayNguonHangHoaBS();
                TinhTongTien();
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiActionPerformed
        // TODO add your handling code here:
        btnSua.setEnabled(false);
        btnXoa.setEnabled(false);
        TinhThanhTien();
        LayNguonCTPhieuNhap();
        if (txtMaNCC.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn nhà cung cấp", "Thông báo",
                    JOptionPane.WARNING_MESSAGE);
            dgNCC.requestFocus();
            return;
        }
        if (txtTenHH.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn hàng hóa", "Thông báo",
                    JOptionPane.WARNING_MESSAGE);
            dgHH.requestFocus();
            return;
        }
        if (txtSL.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập số lượng", "Thông báo",
                    JOptionPane.WARNING_MESSAGE);
            txtSL.requestFocus();
            return;
        }
        Date nn = txtNgayNhap.getDate();
        ngaynhap = chuyendoi.LayngayString(nn);
        manhap = txtMaNhap.getText();
        mancc = txtMaNCC.getText();
        manv = txtMaNV.getText();
        mahh = txtMaHH.getText();
        tenhh = txtTenHH.getText();
        gianhap = txtGiaNhap.getText();
        soluong = txtSL.getText();
        thanhtien = txtThanhTien.getText();
        tongtien = txtTongTien.getText();
        MD_PN pn = new MD_PN(manhap, mancc, manv, ngaynhap, tongtien);
        MD_CTPN ctpn = new MD_CTPN(manhap, mahh, gianhap, soluong, thanhtien);
        if (ktThem == true) {
            if (dgCTPhieuNhap.getRowCount() <= 0) {

                Ctrl_PhieuNhap.InsertPN(pn);
            }

            Ctrl_PhieuNhap.InsertCTPN(ctpn);
        } else {
            Ctrl_PhieuNhap.UpdateCTPN(ctpn, manhap, mahh);
        }
        txtSL.setEnabled(false);
        XoaTrang();
        KhoaMo(true);
        KhoaCoDL(true);
        LayNguonCTPhieuNhap();
        LayNguonHangHoaBS();
        TinhTongTien();
    }//GEN-LAST:event_btnGhiActionPerformed

    private void btnKhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhongActionPerformed
        // TODO add your handling code here:
        XoaTrang();
        KhoaMo(true);
        if(ktThem==false){
        dgCTPhieuNhapMouseClicked(vtctphieunhap);
        }
    }//GEN-LAST:event_btnKhongActionPerformed

    private void btnTaoPhieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoPhieuActionPerformed
        tblNCC.setRowCount(0);
        tblHH.setRowCount(0);
        tblCTPhieuNhap.setRowCount(0);
        XoaTrangHet();
        KhoaMo(true);
        txtMaNhap.setText(TuTaoMa.Taoma("phieunhap", "MaNhap", "PN"));
        btnTaoPhieu.setEnabled(false);
        txtSL.setEnabled(false);
    }//GEN-LAST:event_btnTaoPhieuActionPerformed

    private void btnLuuPhieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuPhieuActionPerformed
        // TODO add your handling code here:
        tongtien = txtTongTien.getText();
        MD_PN pn = new MD_PN(manhap, mancc, manv, ngaynhap, tongtien);
        int kq = JOptionPane.showConfirmDialog(this, "Bạn có muốn lưu phiếu nhập " + txtMaNhap.getText() + "!!!", "Thông báo",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (kq == JOptionPane.YES_OPTION) {
            Ctrl_PhieuNhap.UpdatePN(pn, manhap);
            for (int i = 0; i < tblCTPhieuNhap.getRowCount(); i++) {
                mahh = dgCTPhieuNhap.getValueAt(i, 0).toString();
                double slt = Double.parseDouble(dgCTPhieuNhap.getValueAt(i, 3).toString());
                double tk = Ctrl_PhieuNhap.LaySLTonKho(mahh);
                double tkm = slt + tk;
                tonkho = String.valueOf(tkm);
                MD_QLHH hh1 = new MD_QLHH(tonkho);
                Ctrl_PhieuNhap.UpdateHH(hh1, mahh);
            }
        } else {
            Ctrl_PhieuNhap.DeletePN(manhap);
        }
        XoaTrangHet();
        KhoaDong(true);
        btnTaoPhieu.setEnabled(true);
        txtMaNhap.setText(TuTaoMa.Taoma("phieunhap", "MaNhap", "PN"));
    }//GEN-LAST:event_btnLuuPhieuActionPerformed

    private void txtTKNCCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTKNCCKeyPressed
        TimKiemNCC();
    }//GEN-LAST:event_txtTKNCCKeyPressed

    private void chkHienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkHienMouseClicked
        txtTKNCC.setText("");
        if (chkHien.isSelected() == true) {
            LayNguonNCC();
        } else {
            tblNCC.setRowCount(0);//Xoa trang danh sach
        }
    }//GEN-LAST:event_chkHienMouseClicked

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
            TinhThanhTien();
        }
    }//GEN-LAST:event_txtSLKeyPressed


    private void txtSLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSLKeyTyped
        // TODO add your handling code here:
        /*char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }*/
    }//GEN-LAST:event_txtSLKeyTyped

    private void dgNCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgNCCMouseClicked
        // TODO add your handling code here:

        int index = dgNCC.getSelectedRow();//dòng đang chọn
        TableModel model = dgNCC.getModel();//dùng để lấy ra các cột trong table
        txtMaNCC.setText(model.getValueAt(index, 0).toString());
        txtTenNCC.setText(model.getValueAt(index, 1).toString());
        txtDiaChi.setText(model.getValueAt(index, 2).toString());
        txtSĐT.setText(model.getValueAt(index, 3).toString());
        LayNguonHangHoaBS();
    }//GEN-LAST:event_dgNCCMouseClicked

    private void dgHHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgHHMouseClicked
        // TODO add your handling code here:
        int index = dgHH.getSelectedRow();//dòng đang chọn
        TableModel model = dgHH.getModel();//dùng để lấy ra các cột trong table
        txtMaHH.setText(model.getValueAt(index, 0).toString());
        txtTenHH.setText(model.getValueAt(index, 1).toString());
        txtGiaNhap.setText(model.getValueAt(index, 2).toString());
        txtSL.setEnabled(true);
    }//GEN-LAST:event_dgHHMouseClicked

    private void dgCTPhieuNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgCTPhieuNhapMouseClicked
        // TODO add your handling code here:
        vtctphieunhap = evt;
        int index = dgCTPhieuNhap.getSelectedRow();//dòng đang chọn
        TableModel model = dgCTPhieuNhap.getModel();//dùng để lấy ra các cột trong table
        txtMaHH.setText(model.getValueAt(index, 0).toString());
        txtTenHH.setText(model.getValueAt(index, 1).toString());
        txtGiaNhap.setText(model.getValueAt(index, 2).toString());
        txtSL.setText(model.getValueAt(index, 3).toString());
        txtThanhTien.setText(model.getValueAt(index, 4).toString());
        LayNguonHangHoaBS();
    }//GEN-LAST:event_dgCTPhieuNhapMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        manhap = txtMaNhap.getText();
        Ctrl_PhieuNhap.DeletePN(manhap);
    }//GEN-LAST:event_formWindowClosing
    public void TinhThanhTien() {
        sl = Double.parseDouble(txtSL.getText());
        gn = Double.parseDouble(txtGiaNhap.getText());
        tt = sl * gn;
        txtThanhTien.setText(String.valueOf(tt));
    }

    public void TinhTongTien() {
        double tongtien = 0;
        for (int i = 0; i < dgCTPhieuNhap.getRowCount(); i++) {
            tongtien += Double.parseDouble(dgCTPhieuNhap.getValueAt(i, 4).toString());
        }
        txtTongTien.setText(String.valueOf(tongtien));
    }

    public void XoaTrang() {
        txtTenHH.setText("");
        txtGiaNhap.setText("");
        txtSL.setText("");
        txtThanhTien.setText("");
    }

    public void XoaTrangHet() {
        tblNCC.setRowCount(0);
        tblHH.setRowCount(0);
        tblCTPhieuNhap.setRowCount(0);
        txtTenNCC.setText("");
        txtSĐT.setText("");
        txtDiaChi.setText("");
        txtTenHH.setText("");
        txtGiaNhap.setText("");
        txtSL.setText("");
        txtThanhTien.setText("");
        txtTongTien.setText("");
    }

    public void KhoaMo(boolean b) {
        txtTKNCC.setEnabled(!b);
        chkHien.setEnabled(!b);
        dgHH.setEnabled(!b);
        dgCTPhieuNhap.setEnabled(b);
        btnThem.setEnabled(b);
        btnSua.setEnabled(b);
        btnXoa.setEnabled(b);
        btnGhi.setEnabled(!b);
        btnKhong.setEnabled(!b);
    }

    public void KhoaDong(boolean b) {
        txtTKNCC.setEnabled(!b);
        chkHien.setEnabled(!b);
        dgNCC.setEnabled(!b);
        dgHH.setEnabled(!b);
        dgCTPhieuNhap.setEnabled(!b);
        txtSL.setEnabled(!b);
        btnThem.setEnabled(!b);
        btnSua.setEnabled(!b);
        btnXoa.setEnabled(!b);
        btnGhi.setEnabled(!b);
        btnKhong.setEnabled(!b);
        btnLuuPhieu.setEnabled(!b);
    }

    public void KhoaCoDL(boolean b) {
        if (dgCTPhieuNhap.getRowCount() >= 0) {
            dgNCC.setEnabled(!b);
            btnSua.setEnabled(b);
            btnXoa.setEnabled(b);
            btnLuuPhieu.setEnabled(b);
        } else {
            btnSua.setEnabled(!b);
            btnXoa.setEnabled(!b);
            btnLuuPhieu.setEnabled(!b);
        }
    }

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
            java.util.logging.Logger.getLogger(PhieuNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhieuNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhieuNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhieuNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhieuNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGhi;
    private javax.swing.JButton btnKhong;
    private javax.swing.JButton btnLuuPhieu;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTaoPhieu;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JCheckBox chkHien;
    private javax.swing.JTable dgCTPhieuNhap;
    private javax.swing.JTable dgHH;
    private javax.swing.JTable dgNCC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtGiaNhap;
    private javax.swing.JTextField txtMaHH;
    private javax.swing.JTextField txtMaNCC;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtMaNhap;
    private com.toedter.calendar.JDateChooser txtNgayNhap;
    private javax.swing.JTextField txtNguoiLap;
    private javax.swing.JTextField txtSL;
    private javax.swing.JTextField txtSĐT;
    private javax.swing.JTextField txtTKNCC;
    private javax.swing.JTextField txtTenHH;
    private javax.swing.JTextField txtTenNCC;
    private javax.swing.JTextField txtThanhTien;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}
