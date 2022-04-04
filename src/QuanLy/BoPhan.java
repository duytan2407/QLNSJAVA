/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLy;

import ConnectToSql.Database;
import DanhMuc.NhanSu;
import Models.TTBoPhan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author USER
 */
public class BoPhan extends javax.swing.JFrame {
    Database dt = new Database();
    Connection conn = null;
    PreparedStatement pst = null;
    
    String MaPBString;
    public BoPhan() {
        initComponents();
        show_TTBP();
    }
    public ArrayList<TTBoPhan> TTBPsList(){
            ArrayList<TTBoPhan> TTBPsList = new ArrayList<>();
            try {
                conn = Database.getDBConnect();
                String sql = "select * from BoPhan" ;
                PreparedStatement pst = conn.prepareStatement(sql);         
                ResultSet rs = pst.executeQuery();
                TTBoPhan BP;
                while(rs.next()){
                    BP = new TTBoPhan(rs.getString("MaBoPhan"), rs.getString("TenBoPhan"), rs.getString("MaPhongBan"), rs.getString("TruongBoPhan"), rs.getString("NgayNhanChuc"), rs.getString("GhiChu"));              
                    TTBPsList.add(BP); 
                }
                return TTBPsList;
            } catch (Exception e) {
                jOptionPane1.showMessageDialog(null, "Lỗi!");
            }
            return null;
        }
    public void show_TTBP(){
        ArrayList<TTBoPhan> list = TTBPsList();
        DefaultTableModel model = (DefaultTableModel)jTable_TTBP.getModel();
        for(TTBoPhan o : list){
            model.addRow(new Object[]{o.getMaBoPhan(), o.getTenBoPhan(), o.getMaPhongBan(), o.getTruongBoPhan(), o.getNgayNhanChuc(), o.getGhiChu() });                      
        }       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jOptionPane1 = new javax.swing.JOptionPane();
        jOptionPane2 = new javax.swing.JOptionPane();
        jOptionPane3 = new javax.swing.JOptionPane();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TenBP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TruongBP = new javax.swing.JTextField();
        MaPB = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NgNhanChuc = new com.toedter.calendar.JDateChooser();
        MaBP = new javax.swing.JTextField();
        GhiChu = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButtonThem = new javax.swing.JButton();
        jButtonSua = new javax.swing.JButton();
        jButtonXoa = new javax.swing.JButton();
        jButtonRefresh = new javax.swing.JButton();
        jButtonRefresh1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_TTBP = new javax.swing.JTable();

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
        jScrollPane1.setViewportView(jTable1);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Mã bộ phận");

        TenBP.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TenBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TenBPActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Tên bộ phận");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Ghi chú");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Mã phòng ban");

        TruongBP.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        MaPB.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        MaPB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P001      ", "P002      ", "P003      ", "P004      ", "P005      ", "P006      ", "P007      ", "P008      ", "P009      ", "P010      ", "P011      ", "P012      "  }));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Trưởng bộ phận");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Ngày nhận chức");

        NgNhanChuc.setDateFormatString("yyyy-MM-dd");
        NgNhanChuc.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TenBP)
                    .addComponent(MaBP)
                    .addComponent(MaPB, 0, 231, Short.MAX_VALUE))
                .addGap(104, 104, 104)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NgNhanChuc, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(GhiChu)
                    .addComponent(TruongBP, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MaBP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel5)
                        .addComponent(TruongBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(NgNhanChuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TenBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(MaPB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {GhiChu, MaBP, MaPB, NgNhanChuc, TenBP, TruongBP});

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 51, 51));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("THÔNG TIN BỘ PHẬN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức Năng"));

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));

        jButtonThem.setBackground(new java.awt.Color(255, 255, 102));
        jButtonThem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonThem.setForeground(new java.awt.Color(255, 51, 51));
        jButtonThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/add_user.png"))); // NOI18N
        jButtonThem.setText("Thêm");
        jButtonThem.setMaximumSize(new java.awt.Dimension(70, 25));
        jButtonThem.setMinimumSize(new java.awt.Dimension(70, 25));
        jButtonThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemActionPerformed(evt);
            }
        });

        jButtonSua.setBackground(new java.awt.Color(255, 255, 102));
        jButtonSua.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonSua.setForeground(new java.awt.Color(255, 51, 51));
        jButtonSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/edit_user.png"))); // NOI18N
        jButtonSua.setText("Sửa");
        jButtonSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuaActionPerformed(evt);
            }
        });

        jButtonXoa.setBackground(new java.awt.Color(255, 255, 102));
        jButtonXoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonXoa.setForeground(new java.awt.Color(255, 51, 51));
        jButtonXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/remove_user.png"))); // NOI18N
        jButtonXoa.setText("Xóa");
        jButtonXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaActionPerformed(evt);
            }
        });

        jButtonRefresh.setBackground(new java.awt.Color(255, 255, 102));
        jButtonRefresh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonRefresh.setForeground(new java.awt.Color(255, 51, 51));
        jButtonRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/upload.png"))); // NOI18N
        jButtonRefresh.setText("Làm mới");
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });

        jButtonRefresh1.setBackground(new java.awt.Color(255, 255, 102));
        jButtonRefresh1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonRefresh1.setForeground(new java.awt.Color(255, 51, 51));
        jButtonRefresh1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/remove_user.png"))); // NOI18N
        jButtonRefresh1.setText("Exit");
        jButtonRefresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefresh1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jButtonThem, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButtonSua, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jButtonXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButtonRefresh1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonThem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRefresh1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonRefresh, jButtonSua, jButtonThem, jButtonXoa});

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );

        jTable_TTBP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã bộ phận", "Tên bộ phận", "Mã phòng ban", "Trưởng bộ phận", "Ngày nhận chức", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_TTBP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_TTBPMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_TTBP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemActionPerformed
        try {
            String Sql="insert into BoPhan(MaBoPhan, TenBoPhan, MaPhongBan, TruongBoPhan, NgayNhanChuc, GhiChu) values(?,?,?,?,?,?)";
            conn = Database.getDBConnect();
            pst = conn.prepareStatement(Sql);
            pst.setString(1, MaBP.getText());
            pst.setString(2, TenBP.getText());
            MaPBString = MaPB.getSelectedItem().toString();
            pst.setString(3, MaPBString);
            pst.setString(4, TruongBP.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String NgayNC= sdf.format(NgNhanChuc.getDate());
            pst.setString(5, NgayNC);
            pst.setString(6, GhiChu.getText());          
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable_TTBP.getModel();
            model.setRowCount(0);
            show_TTBP();
            jOptionPane2.showMessageDialog(null, "Thêm thành công!");
        } catch (Exception e) {
            //            jOptionPane3.showMessageDialog(null, "Lỗi!" );
            System.out.println("error" + e.toString());
        }
    }//GEN-LAST:event_jButtonThemActionPerformed

    private void jButtonSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuaActionPerformed
    try {
            String Sql="update BoPhan set TenBoPhan = ?, MaPhongBan = ?, TruongBoPhan = ?, NgayNhanChuc = ?, GhiChu = ? where MaBoPhan = ?" ;
            conn = Database.getDBConnect();
            pst = conn.prepareStatement(Sql);
            pst.setString(1, TenBP.getText());
            MaPBString = MaPB.getSelectedItem().toString();
            pst.setString(2, MaPBString);
            pst.setString(3, TruongBP.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String NgayNC= sdf.format(NgNhanChuc.getDate());
            pst.setString(4, NgayNC);
            pst.setString(5, GhiChu.getText()); 
            pst.setString(6, MaBP.getText());
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable_TTBP.getModel();
            model.setRowCount(0);
            show_TTBP();
            jOptionPane2.showMessageDialog(null, "Sửa thành công!");
        } catch (Exception e) {
            //            jOptionPane3.showMessageDialog(null, "Lỗi!" );
            System.out.println("error" + e.toString());
        }
    }//GEN-LAST:event_jButtonSuaActionPerformed

    private void jButtonXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaActionPerformed
        try {
            conn = Database.getDBConnect();
            String Sql="delete from BoPhan where MaBoPhan = ?";
            pst = conn.prepareStatement(Sql);
            pst.setString(1, MaBP.getText());
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable_TTBP.getModel();
            model.setRowCount(0);
            show_TTBP();
            jOptionPane2.showMessageDialog(null, "Xóa thành công!");
        } catch (Exception e) {
            //            jOptionPane3.showMessageDialog(null, "Lỗi!");
            System.out.println("error" + e.toString());
        }
    }//GEN-LAST:event_jButtonXoaActionPerformed

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
        MaBP.setText("");
        TenBP.setText("");
        TruongBP.setText("");
        GhiChu.setText("");
        MaPB.setSelectedIndex(0);
        NgNhanChuc.setDate(null);
    }//GEN-LAST:event_jButtonRefreshActionPerformed

    private void TenBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TenBPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TenBPActionPerformed

    private void jTable_TTBPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_TTBPMouseClicked
        int row = jTable_TTBP.getSelectedRow();
        TableModel model = jTable_TTBP.getModel();
        MaBP.setText(model.getValueAt(row, 0).toString());
        TenBP.setText(model.getValueAt(row, 1).toString());
        MaPBString = model.getValueAt(row, 2).toString();
        int i = 0;
        while (true) {
            String MPB = MaPB.getItemAt(i).toString();
            if(MPB.equalsIgnoreCase(MaPBString)){
                MaPB.setSelectedIndex(i);
                break;
            }
            i++;
        }        
        TruongBP.setText(model.getValueAt(row, 3).toString());
        try {
            Date NGNC = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(row, 4));
            NgNhanChuc.setDate(NGNC);
        } catch (Exception e) {
            jOptionPane1.showMessageDialog(null, "Lỗi ngày");
        }
        GhiChu.setText(model.getValueAt(row, 5).toString());
    }//GEN-LAST:event_jTable_TTBPMouseClicked

    private void jButtonRefresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefresh1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRefresh1ActionPerformed

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
            java.util.logging.Logger.getLogger(BoPhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BoPhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BoPhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BoPhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 BoPhan a = new BoPhan();
                 a.setLocationRelativeTo(null);
                 a.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField GhiChu;
    private javax.swing.JTextField MaBP;
    private javax.swing.JComboBox<String> MaPB;
    private com.toedter.calendar.JDateChooser NgNhanChuc;
    private javax.swing.JTextField TenBP;
    private javax.swing.JTextField TruongBP;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JButton jButtonRefresh1;
    private javax.swing.JButton jButtonSua;
    private javax.swing.JButton jButtonThem;
    private javax.swing.JButton jButtonXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JOptionPane jOptionPane2;
    private javax.swing.JOptionPane jOptionPane3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable_TTBP;
    // End of variables declaration//GEN-END:variables
}
