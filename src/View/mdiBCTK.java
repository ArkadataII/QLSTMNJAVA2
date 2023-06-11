package View;

import Controller.BCTK;
import Controller.CTPN;
import Controller.CTPX;
import Model.MD_CTPN;
import Model.MD_CTPX;
import Model.MD_PN;
import Model.MD_PX;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import qlstmn_20_5_2023.QLSTMN_20_5_2023;

public class mdiBCTK extends javax.swing.JInternalFrame {

    DefaultTableModel tblDanhSachPN, tblDanhSachPX, tblDanhSachCTPN, tblDanhSachCTPX;
    List<MD_PN> pn = new ArrayList<>();
    List<MD_CTPN> ctpn = new ArrayList<>();
    List<MD_PX> px = new ArrayList<>();
    List<MD_CTPX> ctpx = new ArrayList<>();

    public mdiBCTK() {
        initComponents();
        tblDanhSachPN = (DefaultTableModel) dgDanhSach.getModel();
        tblDanhSachCTPN = (DefaultTableModel) dgDanhSach2.getModel();
        tblDanhSachPX = (DefaultTableModel) dgDanhSach1.getModel();
        tblDanhSachCTPX = (DefaultTableModel) dgDanhSach3.getModel();

        LayNguonPN("1111-01-01", "9999-09-09");
        LayNguonPX("1111-01-01", "9999-09-09");
        TinhTong();
        Date dateObj = null;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
        try {
            dateObj = formatter.parse("2002-03-15");
        } catch (ParseException ex) {
            Logger.getLogger(mdiBCTK.class.getName()).log(Level.SEVERE, null, ex);
        }
        dateTu.setDate(dateObj);
        dateObj = null;
        try {
            dateObj = formatter.parse("2025-03-15");
        } catch (ParseException ex) {
            Logger.getLogger(mdiBCTK.class.getName()).log(Level.SEVERE, null, ex);
        }
        dateDen.setDate(dateObj);
    }

    public void LayNguonPN(String tu, String den) {
        pn = BCTK.LayNguonPN(tu, den);

        tblDanhSachPN.setRowCount(0);//Xoa trang danh sach
        pn.forEach(p -> {//Vong lap de duyet phan tu trong mang arr
            tblDanhSachPN.addRow(new Object[]{// moi mot phan tu tuong ung voi 1 dong add vao gom 2 cot
                p.getManhap(), p.getMancc(), p.getManv(), p.getNgaynhap(), p.getTongtien()
            });
        });
    }

    public void LayNguonCTPN(String ma) {
        ctpn = CTPN.LayNguonCTPN(ma);

        tblDanhSachCTPN.setRowCount(0);//Xoa trang danh sach
        ctpn.forEach(p -> {//Vong lap de duyet phan tu trong mang arr
            tblDanhSachCTPN.addRow(new Object[]{// moi mot phan tu tuong ung voi 1 dong add vao gom 2 cot
                p.getManhap(), p.getMahh(), p.getTenhh(), p.getGianhap(), p.getSoluong(), p.getThanhtien()
            });
        });
    }

    public void LayNguonPX(String tu, String den) {
        px = BCTK.LayNguonPX(tu, den);

        tblDanhSachPX.setRowCount(0);//Xoa trang danh sach
        px.forEach(p -> {//Vong lap de duyet phan tu trong mang arr
            tblDanhSachPX.addRow(new Object[]{// moi mot phan tu tuong ung voi 1 dong add vao gom 2 cot
                p.getMaxuat(), p.getManv(), p.getNgayxuat(), p.getTongtien()
            });
        });
    }

    public void LayNguonCTPX(String ma) {
        ctpx = CTPX.LayNguonCTPX(ma);

        tblDanhSachCTPX.setRowCount(0);//Xoa trang danh sach
        ctpx.forEach(p -> {//Vong lap de duyet phan tu trong mang arr
            tblDanhSachCTPX.addRow(new Object[]{// moi mot phan tu tuong ung voi 1 dong add vao gom 2 cot
                p.getMaxuat(), p.getMahh(), p.getTenhh(), p.getGiaxuat(), p.getSoluong(), p.getThanhtien()
            });
        });
    }

    public void TinhTong() {
        int count = dgDanhSach.getRowCount();
        int Tong = 0;
        TableModel model = dgDanhSach.getModel();
        if (dgDanhSach != null) {
            for (int i = 0; i < count; i++) {
                int tinh = Integer.parseInt(model.getValueAt(i, 4).toString());
                Tong = Tong + tinh;
            }
            txtNhap.setText("Tổng nhập : " + String.valueOf(Tong));
        } else {
            txtNhap.setText("Tổng nhập : 0");
        }

        count = dgDanhSach1.getRowCount();
        Tong = 0;
        model = dgDanhSach1.getModel();
        if (dgDanhSach3 != null) {
            for (int i = 0; i < count; i++) {
                int tinh = Integer.parseInt(model.getValueAt(i, 3).toString());
                Tong = Tong + tinh;
            }
            txtXuat.setText("Tổng xuất : " + String.valueOf(Tong));
        } else {
            txtXuat.setText("Tổng xuất : 0");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cmdAll = new javax.swing.JButton();
        CmdThongke = new javax.swing.JButton();
        dateTu = new com.toedter.calendar.JDateChooser();
        dateDen = new com.toedter.calendar.JDateChooser();
        cmdXuat = new javax.swing.JButton();
        cboEx = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgDanhSach3 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        dgDanhSach = new javax.swing.JTable();
        txtNhap = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtXuat = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCTPN = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        dgDanhSach2 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        dgDanhSach1 = new javax.swing.JTable();
        txtCTPX = new javax.swing.JLabel();
        cmdThoat = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setTitle("Báo cáo thống kê");

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Báo cáo thống kê");

        cmdAll.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmdAll.setText("All");
        cmdAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAllActionPerformed(evt);
            }
        });

        CmdThongke.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        CmdThongke.setText("Thống kê");
        CmdThongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdThongkeActionPerformed(evt);
            }
        });

        cmdXuat.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmdXuat.setText("Xuất excel");
        cmdXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdXuatActionPerformed(evt);
            }
        });

        cboEx.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cboEx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhập", "CTPN", "Xuất", "CTPX" }));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("Nhập hàng :");

        dgDanhSach3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        dgDanhSach3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã xuất", "Mã hàng", "Tên hàng", "Gía xuất", "Số lượng", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(dgDanhSach3);

        dgDanhSach.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        dgDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã nhập", "Mã NCC", "Mã NV", "Ngày nhập", "Tổng tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
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
        jScrollPane2.setViewportView(dgDanhSach);

        txtNhap.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtNhap.setForeground(new java.awt.Color(255, 51, 51));
        txtNhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNhap.setText("Tổng nhập");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Xuất hàng :");

        txtXuat.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtXuat.setForeground(new java.awt.Color(255, 51, 51));
        txtXuat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtXuat.setText("Tổng xuất");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("Từ :");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("Đến :");

        txtCTPN.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtCTPN.setForeground(new java.awt.Color(255, 0, 51));
        txtCTPN.setText("Chi tiết phiếu :");

        dgDanhSach2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        dgDanhSach2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhập", "Mã hàng", "Tên hàng", "Gía nhập", "Số lượng", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(dgDanhSach2);

        dgDanhSach1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        dgDanhSach1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã xuất", "Mã NV", "Ngay xuất", "Tổng tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dgDanhSach1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgDanhSach1MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(dgDanhSach1);

        txtCTPX.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtCTPX.setForeground(new java.awt.Color(255, 0, 51));
        txtCTPX.setText("Chi tiết phiếu :");

        cmdThoat.setText("Thoát");
        cmdThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmdAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CmdThongke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateTu, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateDen, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                        .addComponent(cmdXuat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboEx, 0, 84, Short.MAX_VALUE)
                            .addComponent(cmdThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtCTPN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(116, 116, 116)
                                .addComponent(txtNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtCTPX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmdAll)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmdXuat)
                                    .addComponent(cboEx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(dateTu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(dateDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CmdThongke)
                    .addComponent(cmdThoat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtXuat)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtNhap)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCTPN)
                    .addComponent(txtCTPX))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAllActionPerformed
        LayNguonPN("1111-01-01", "9999-09-09");
        LayNguonPX("1111-01-01", "9999-09-09");
        TinhTong();
    }//GEN-LAST:event_cmdAllActionPerformed

    private void CmdThongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdThongkeActionPerformed
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/mm/dd");
        String date1 = formatter.format(dateTu.getDate());
        String date2 = formatter.format(dateDen.getDate());
        LayNguonPN(date1, date2);
        LayNguonPX(date1, date2);
        TinhTong();
    }//GEN-LAST:event_CmdThongkeActionPerformed

    private void dgDanhSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgDanhSachMouseClicked
        int index = dgDanhSach.getSelectedRow();
        TableModel model = dgDanhSach.getModel();
        String ma = model.getValueAt(index, 0).toString();
        LayNguonCTPN(ma);
        txtCTPN.setText(ma);
    }//GEN-LAST:event_dgDanhSachMouseClicked

    private void cmdThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdThoatActionPerformed
        dispose();
    }//GEN-LAST:event_cmdThoatActionPerformed

    private void dgDanhSach1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgDanhSach1MouseClicked
        int index = dgDanhSach1.getSelectedRow();
        TableModel model = dgDanhSach1.getModel();
        String ma = model.getValueAt(index, 0).toString();
        LayNguonCTPX(ma);
        txtCTPX.setText(ma);
    }//GEN-LAST:event_dgDanhSach1MouseClicked

    private void cmdXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdXuatActionPerformed
        if (cboEx.getSelectedItem().equals("Nhập")) 
         try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Phiếu Nhập");

            XSSFRow row = null;
            Cell cell = null;

            int count = dgDanhSach.getRowCount();
            TableModel model = dgDanhSach.getModel();

            if (dgDanhSach != null) {
                for (int i = -1; i < count; i++) {
                    if (i < 0) {
                        row = sheet.createRow(1 + i);

                        cell = row.createCell(0, CellType.STRING);
                        cell.setCellValue("Mã nhập");

                        cell = row.createCell(1, CellType.STRING);
                        cell.setCellValue("Mã nhà cung cấp");

                        cell = row.createCell(2, CellType.STRING);
                        cell.setCellValue("Mã nhân viên");

                        cell = row.createCell(3, CellType.STRING);
                        cell.setCellValue("Ngày nhập");

                        cell = row.createCell(4, CellType.STRING);
                        cell.setCellValue("Tổng tiền");
                    } else {
                        row = sheet.createRow(1 + i);

                        cell = row.createCell(0, CellType.STRING);
                        cell.setCellValue(model.getValueAt(i, 0).toString());

                        cell = row.createCell(1, CellType.STRING);
                        cell.setCellValue(model.getValueAt(i, 1).toString());

                        cell = row.createCell(2, CellType.STRING);
                        cell.setCellValue(model.getValueAt(i, 2).toString());

                        cell = row.createCell(3, CellType.STRING);
                        cell.setCellValue(model.getValueAt(i, 3).toString());

                        cell = row.createCell(4, CellType.STRING);
                        cell.setCellValue(model.getValueAt(i, 4).toString());
                    }
                }
                File f = new File("C:/Users/acer/Documents/NetBeansProjects/QLSTMN_20_5_2023/Excel/nhap.xlsx");
                FileOutputStream fis = new FileOutputStream(f);
                workbook.write(fis);
                fis.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (cboEx.getSelectedItem().equals("CTPN") && (dgDanhSach2.getRowCount() > 0)) {
            try {
                XSSFWorkbook workbook = new XSSFWorkbook();
                XSSFSheet sheet = workbook.createSheet("Chi Tiết Phiếu Nhập");

                XSSFRow row = null;
                Cell cell = null;

                int count = dgDanhSach2.getRowCount();
                TableModel model = dgDanhSach2.getModel();
                for (int i = -1; i < count; i++) {
                    if (i < 0) {
                        row = sheet.createRow(1 + i);

                        cell = row.createCell(0, CellType.STRING);
                        cell.setCellValue("Mã nhập");

                        cell = row.createCell(1, CellType.STRING);
                        cell.setCellValue("Mã hàng");

                        cell = row.createCell(2, CellType.STRING);
                        cell.setCellValue("Tên hàng");

                        cell = row.createCell(3, CellType.STRING);
                        cell.setCellValue("Gía nhập");

                        cell = row.createCell(4, CellType.STRING);
                        cell.setCellValue("Số lượng");

                        cell = row.createCell(5, CellType.STRING);
                        cell.setCellValue("Thành tiền");
                    } else {
                        row = sheet.createRow(1 + i);

                        cell = row.createCell(0, CellType.STRING);
                        cell.setCellValue(model.getValueAt(i, 0).toString());

                        cell = row.createCell(1, CellType.STRING);
                        cell.setCellValue(model.getValueAt(i, 1).toString());

                        cell = row.createCell(2, CellType.STRING);
                        cell.setCellValue(model.getValueAt(i, 2).toString());

                        cell = row.createCell(3, CellType.STRING);
                        cell.setCellValue(model.getValueAt(i, 3).toString());

                        cell = row.createCell(4, CellType.STRING);
                        cell.setCellValue(model.getValueAt(i, 4).toString());

                        cell = row.createCell(5, CellType.STRING);
                        cell.setCellValue(model.getValueAt(i, 5).toString());
                    }
                    File f = new File("C:/Users/acer/Documents/NetBeansProjects/QLSTMN_20_5_2023/Excel/chitietphieunhap_" + txtCTPN.getText() + ".xlsx");
                    FileOutputStream fis = new FileOutputStream(f);
                    workbook.write(fis);
                    fis.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (dgDanhSach2.getRowCount() <= 0 && cboEx.getSelectedItem().equals("CTPN")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn phiếu nhập", "Thông báo",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (cboEx.getSelectedItem().equals("Xuất")) 
         try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Phiếu Xuất");

            XSSFRow row = null;
            Cell cell = null;

            int count = dgDanhSach1.getRowCount();
            TableModel model = dgDanhSach1.getModel();

            if (dgDanhSach1 != null) {
                for (int i = -1; i < count; i++) {
                    if (i < 0) {
                        row = sheet.createRow(1 + i);

                        cell = row.createCell(0, CellType.STRING);
                        cell.setCellValue("Mã xuất");

                        cell = row.createCell(1, CellType.STRING);
                        cell.setCellValue("Mã nhân viên");

                        cell = row.createCell(2, CellType.STRING);
                        cell.setCellValue("Ngày xuất");

                        cell = row.createCell(3, CellType.STRING);
                        cell.setCellValue("Tổng tiền");
                    } else {
                        row = sheet.createRow(1 + i);

                        cell = row.createCell(0, CellType.STRING);
                        cell.setCellValue(model.getValueAt(i, 0).toString());

                        cell = row.createCell(1, CellType.STRING);
                        cell.setCellValue(model.getValueAt(i, 1).toString());

                        cell = row.createCell(2, CellType.STRING);
                        cell.setCellValue(model.getValueAt(i, 2).toString());

                        cell = row.createCell(3, CellType.STRING);
                        cell.setCellValue(model.getValueAt(i, 3).toString());
                    }
                }
                File f = new File("C:/Users/acer/Documents/NetBeansProjects/QLSTMN_20_5_2023/Excel/xuat.xlsx");
                FileOutputStream fis = new FileOutputStream(f);
                workbook.write(fis);
                fis.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (cboEx.getSelectedItem().equals("CTPX") && (dgDanhSach3.getRowCount() > 0)) {
            try {
                XSSFWorkbook workbook = new XSSFWorkbook();
                XSSFSheet sheet = workbook.createSheet("Chi Tiết Phiếu Nhập");

                XSSFRow row = null;
                Cell cell = null;

                int count = dgDanhSach3.getRowCount();
                TableModel model = dgDanhSach3.getModel();
                for (int i = -1; i < count; i++) {
                    if (i < 0) {
                        row = sheet.createRow(1 + i);

                        cell = row.createCell(0, CellType.STRING);
                        cell.setCellValue("Mã nhập");

                        cell = row.createCell(1, CellType.STRING);
                        cell.setCellValue("Mã hàng");

                        cell = row.createCell(2, CellType.STRING);
                        cell.setCellValue("Tên hàng");

                        cell = row.createCell(3, CellType.STRING);
                        cell.setCellValue("Gía nhập");

                        cell = row.createCell(4, CellType.STRING);
                        cell.setCellValue("Số lượng");

                        cell = row.createCell(5, CellType.STRING);
                        cell.setCellValue("Thành tiền");
                    } else {
                        row = sheet.createRow(1 + i);

                        cell = row.createCell(0, CellType.STRING);
                        cell.setCellValue(model.getValueAt(i, 0).toString());

                        cell = row.createCell(1, CellType.STRING);
                        cell.setCellValue(model.getValueAt(i, 1).toString());

                        cell = row.createCell(2, CellType.STRING);
                        cell.setCellValue(model.getValueAt(i, 2).toString());

                        cell = row.createCell(3, CellType.STRING);
                        cell.setCellValue(model.getValueAt(i, 3).toString());

                        cell = row.createCell(4, CellType.STRING);
                        cell.setCellValue(model.getValueAt(i, 4).toString());

                        cell = row.createCell(5, CellType.STRING);
                        cell.setCellValue(model.getValueAt(i, 5).toString());
                    }
                    File f = new File("C:/Users/acer/Documents/NetBeansProjects/QLSTMN_20_5_2023/Excel/chitietphieuxuat_" + txtCTPX.getText() + ".xlsx");
                    FileOutputStream fis = new FileOutputStream(f);
                    workbook.write(fis);
                    fis.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (dgDanhSach3.getRowCount() <= 0  && cboEx.getSelectedItem().equals("CTPX")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn phiếu xuất", "Thông báo",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_cmdXuatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CmdThongke;
    private javax.swing.JComboBox<String> cboEx;
    private javax.swing.JButton cmdAll;
    private javax.swing.JButton cmdThoat;
    private javax.swing.JButton cmdXuat;
    private com.toedter.calendar.JDateChooser dateDen;
    private com.toedter.calendar.JDateChooser dateTu;
    private javax.swing.JTable dgDanhSach;
    private javax.swing.JTable dgDanhSach1;
    private javax.swing.JTable dgDanhSach2;
    private javax.swing.JTable dgDanhSach3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel txtCTPN;
    private javax.swing.JLabel txtCTPX;
    private javax.swing.JLabel txtNhap;
    private javax.swing.JLabel txtXuat;
    // End of variables declaration//GEN-END:variables
}
