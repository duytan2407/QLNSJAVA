/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DanhMuc;

import ConnectToSql.Database;
import Models.TTCaNhan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author USER
 */
public class ThongTinCaNhan extends javax.swing.JFrame {
    Database dt = new Database();
    Connection conn = null;
    PreparedStatement pst = null;   
    public ThongTinCaNhan() {
        initComponents();
        show_TTCN();
    }
    public ArrayList<TTCaNhan> TTCNList(){
        ArrayList<TTCaNhan> TTCNsList = new ArrayList<>();
        try {
            conn = Database.getDBConnect();
            String sql = "select * from TTCaNhan" ;
            PreparedStatement pst = conn.prepareStatement(sql);         
            ResultSet rs = pst.executeQuery();
            TTCaNhan TTCN;
            while(rs.next()){
                TTCN = new TTCaNhan(rs.getString("MaNV"), rs.getString("NoiSinh"), rs.getString("NguyenQuan"), rs.getString("DCThuongChu"), rs.getString("DCTamChu"), rs.getString("SDT"), rs.getString("CMTND"), rs.getString("NgayCap"), rs.getString("NoiCap"), rs.getString("DanToc"), rs.getString("TonGiao"), rs.getString("QuocTich"), rs.getString("TiengNN"), rs.getString("TrinhDoNN"), rs.getString("TDHocVan"), rs.getString("GhiChu"));              
                TTCNsList.add(TTCN); 
            }
            return TTCNsList;
        } catch (Exception e) {
            jOptionPane1.showMessageDialog(null, "Lỗi!");
        }
        return null;
    }
    public void show_TTCN(){
        ArrayList<TTCaNhan> list = TTCNList();
        DefaultTableModel model = (DefaultTableModel)jTable_TTCaNhan.getModel();
        for(TTCaNhan o : list){
            model.addRow(new Object[]{o.getMaNV(), o.getNoiSinh(), o.getNguyenQuan(), o.getDCThuongChu(), o.getDCTamChu(), o.getSDT(), o.getCMTND(), o.getNgayCap(), o.getNoiCap(), o.getDanToc(), o.getTonGiao(), o.getQuocTich(), o.getTiengNN(), o.getTrinhDoNN(), o.getTDHocVan(), o.getGhiChu()});        
//        Object[] row = new Object[16];
//        for(int i = 0; i < list.size(); i++){
//            row[0] = list.get(i).getMaNV();
//            row[1] = list.get(i).getNoiSinh();
//            row[2] = list.get(i).getNguyenQuan();
//            row[3] = list.get(i).getDCThuongChu();
//            row[4] = list.get(i).getDCTamChu();
//            row[5] = list.get(i).getSDT();
//            row[6] = list.get(i).getCMTND();
//            row[7] = list.get(i).getNoiCap();
//            row[8] = list.get(i).getNgayCap();
//            row[9] = list.get(i).getDanToc();
//            row[10] = list.get(i).getTonGiao();
//            row[11] = list.get(i).getQuocTich();
//            row[12] = list.get(i).getTiengNN();
//            row[13] = list.get(i).getTrinhDoNN();
//            row[14] = list.get(i).getTDHocVan();
//            row[15] = list.get(i).getGhiChu();
//            model.addRow(row);
//        }       
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jOptionPane2 = new javax.swing.JOptionPane();
        jOptionPane3 = new javax.swing.JOptionPane();
        jOptionPane4 = new javax.swing.JOptionPane();
        jOptionPane5 = new javax.swing.JOptionPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField03 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField04 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField05 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField09 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField02 = new javax.swing.JTextField();
        jTextField07 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField06 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField01 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField08 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButtonRefresh = new javax.swing.JButton();
        jButtonXoa = new javax.swing.JButton();
        jButtonSua = new javax.swing.JButton();
        jButtonThem = new javax.swing.JButton();
        jButtonLuu = new javax.swing.JButton();
        jButtonRefresh1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_TTCaNhan = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        jPanel1.setForeground(new java.awt.Color(153, 255, 153));
        jPanel1.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÔNG TIN CÁ NHÂN");

        jPanel5.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Mã NV");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Nguyên quán");

        jTextField03.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Địa chỉ thường trú");

        jTextField04.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Địa chỉ tạm trú");

        jTextField05.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jTextField05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField05ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Dân tộc");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Tôn giáo");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Quốc tịch");

        jTextField09.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jTextField09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField09ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Ngoại ngữ");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("Trình độ ngoại ngữ");

        jTextField11.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        jTextField15.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setText("CMTND");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Nơi sinh");

        jTextField02.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jTextField02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField02ActionPerformed(evt);
            }
        });

        jTextField07.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jTextField07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField07ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("Ghi chú");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel22.setText("SĐT");

        jTextField06.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jTextField06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField06ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel21.setText("Trình độ học vấn");

        jTextField14.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jTextField01.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Ngày cấp");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Nơi cấp");

        jTextField08.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Phật giáo", "Công giáo", "Cao Đài", "Tin Lành", "Bửu Sơn Kỳ Hương", "Không"}));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox3.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giỏi", "Khá", "Trung bình" }));

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anh", "Pháp", "Nhật", "Hàn", "Trung" }));
        jComboBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField02, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(jTextField01, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField04, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(jTextField05, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(jTextField03, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField06, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField11))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField09, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, 213, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField07)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(1, 1, 1))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField08)))
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField14))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField15, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel14, jLabel15, jLabel16, jLabel17, jLabel21, jLabel22, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jTextField07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jTextField08, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextField09, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField05, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jTextField06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBox1, jComboBox2, jComboBox3, jLabel11, jLabel14, jLabel15, jLabel16, jLabel17, jLabel2, jLabel21, jLabel22, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, jTextField01, jTextField02, jTextField03, jTextField04, jTextField05, jTextField06, jTextField07, jTextField08, jTextField09, jTextField11, jTextField14, jTextField15});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(249, 249, 249)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức Năng"));
        jPanel2.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        jButtonRefresh.setBackground(new java.awt.Color(255, 255, 102));
        jButtonRefresh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonRefresh.setForeground(new java.awt.Color(255, 51, 51));
        jButtonRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/send.png"))); // NOI18N
        jButtonRefresh.setText("Refresh");
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
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

        jButtonThem.setBackground(new java.awt.Color(255, 255, 102));
        jButtonThem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonThem.setForeground(new java.awt.Color(255, 51, 51));
        jButtonThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/add_user.png"))); // NOI18N
        jButtonThem.setText("Thêm");
        jButtonThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemActionPerformed(evt);
            }
        });

        jButtonLuu.setBackground(new java.awt.Color(255, 255, 102));
        jButtonLuu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonLuu.setForeground(new java.awt.Color(255, 51, 51));
        jButtonLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/upload.png"))); // NOI18N
        jButtonLuu.setText("Lưu");

        jButtonRefresh1.setBackground(new java.awt.Color(255, 255, 102));
        jButtonRefresh1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonRefresh1.setForeground(new java.awt.Color(255, 51, 51));
        jButtonRefresh1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/close1.png"))); // NOI18N
        jButtonRefresh1.setText("Exit");
        jButtonRefresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefresh1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButtonThem, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButtonSua, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButtonXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButtonLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButtonRefresh1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButtonSua)
                    .addComponent(jButtonThem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonXoa)
                    .addComponent(jButtonRefresh)
                    .addComponent(jButtonRefresh1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonLuu, jButtonRefresh, jButtonSua, jButtonThem, jButtonXoa});

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane2.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        jTable_TTCaNhan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable_TTCaNhan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NV", "Nơi sinh", "Nguyên quán", "Địa chỉ thường trú", "Địa chỉ tạm trú", "SĐT", "CMTND", "Ngày cấp", "Nơi cấp", "Dân tộc", "Tôn giáo", "Quốc tịch", "Ngoại ngữ", "Trình độ ngoại ngữ", "Trình độ học vấn", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_TTCaNhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_TTCaNhanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_TTCaNhan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(464, 464, 464)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void jTextField06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField06ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField06ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField07ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField07ActionPerformed

    private void jButtonThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemActionPerformed
        try {    
            String Sql="insert into TTCaNhan(MaNV, NoiSinh, NguyenQuan, DCThuongTru, DCTamTru, SDT, CMTND, NgayCap, NoiCap, DanToc, TonGiao, QuocTich, TiengNN, TrinhDoNN, TDHocVan, GhiChu) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";   
            conn = Database.getDBConnect();
            pst = conn.prepareStatement(Sql);   
            pst.setString(1, jTextField01.getText());
            pst.setString(2, jTextField02.getText());
            pst.setString(3, jTextField03.getText());
            pst.setString(4, jTextField04.getText());
            pst.setString(5, jTextField05.getText());
            pst.setString(6, jTextField06.getText());
            pst.setString(7, jTextField07.getText());            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String NgayCap = sdf.format(jDateChooser1.getDate());
            pst.setString(8, NgayCap);
            pst.setString(9, jTextField08.getText());  
            pst.setString(10, jTextField09.getText());
            String TonGiao;
            TonGiao = jComboBox1.getSelectedItem().toString();
            pst.setString(11, TonGiao);           
            pst.setString(12, jTextField11.getText());
            String NgoaiNgu;
            NgoaiNgu = jComboBox2.getSelectedItem().toString();
            pst.setString(13, NgoaiNgu);
            String TDNgoaiNgu;
            TDNgoaiNgu = jComboBox3.getSelectedItem().toString();
            pst.setString(14, TDNgoaiNgu);
            pst.setString(15, jTextField14.getText());
            pst.setString(16, jTextField15.getText());
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable_TTCaNhan.getModel();
            model.setRowCount(0);
            show_TTCN();
            jOptionPane2.showMessageDialog(null, "Thêm thành công!");          
        } catch (Exception e) {
//            jOptionPane3.showMessageDialog(null, "Lỗi!" );
            System.out.println("error" + e.toString());
        }  
    }//GEN-LAST:event_jButtonThemActionPerformed

    private void jButtonSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuaActionPerformed
        try {  
            conn = Database.getDBConnect();    
            int row = jTable_TTCaNhan.getSelectedRow();
            String value = (jTable_TTCaNhan.getModel().getValueAt(row, 0).toString());
            String Sql="update TTCaNhan set NoiSinh = ?, NguyenQuan = ?, DCThuongTru = ?, DCTamTru = ?, SDT = ?, CMTND = ?, NgayCap = ?, NoiCap = ?, DanToc = ?, TonGiao = ?, QuocTich = ?, TiengNN = ?, TrinhDoNN = ?, TDHocVan = ?, GhiChu = ? where MaNV =" + value ;
            pst = conn.prepareStatement(Sql);          
//            pst.setString(1, jTextField01.getText());
            pst.setString(1, jTextField02.getText());
            pst.setString(2, jTextField03.getText());
            pst.setString(3, jTextField04.getText());
            pst.setString(4, jTextField05.getText());
            pst.setString(5, jTextField06.getText());
            pst.setString(6, jTextField07.getText());            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String NgayCap = sdf.format(jDateChooser1.getDate());
            pst.setString(7, NgayCap);
            pst.setString(8, jTextField08.getText());  
            pst.setString(9, jTextField09.getText());
            String TonGiao;
            TonGiao = jComboBox1.getSelectedItem().toString();
            pst.setString(10, TonGiao);           
            pst.setString(11, jTextField11.getText());
            String NgoaiNgu;
            NgoaiNgu = jComboBox2.getSelectedItem().toString();
            pst.setString(12, NgoaiNgu);
            String TDNgoaiNgu;
            TDNgoaiNgu = jComboBox3.getSelectedItem().toString();
            pst.setString(13, TDNgoaiNgu);
            pst.setString(14, jTextField14.getText());
            pst.setString(15, jTextField15.getText());
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable_TTCaNhan.getModel();
            model.setRowCount(0);
            show_TTCN();
            jOptionPane2.showMessageDialog(null, "Sửa thành công!");          
        } catch (Exception e) {
            jOptionPane3.showMessageDialog(null, "Lỗi!" );      
System.out.println("error" + e.toString());
        }                                     
    }//GEN-LAST:event_jButtonSuaActionPerformed

    private void jTextField02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField02ActionPerformed

    private void jTextField05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField05ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField05ActionPerformed

    private void jTextField09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField09ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField09ActionPerformed

    private void jTable_TTCaNhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_TTCaNhanMouseClicked
        int row = jTable_TTCaNhan.getSelectedRow();
        TableModel model = jTable_TTCaNhan.getModel();
        jTextField01.setText(model.getValueAt(row, 0).toString());
        jTextField02.setText(model.getValueAt(row, 1).toString());
        jTextField03.setText(model.getValueAt(row, 2).toString());
        jTextField04.setText(model.getValueAt(row, 3).toString());
        jTextField05.setText(model.getValueAt(row, 4).toString());
        jTextField06.setText(model.getValueAt(row, 5).toString());
        jTextField07.setText(model.getValueAt(row, 6).toString());
        try{
            int drow = jTable_TTCaNhan.getSelectedRow();
            Date NgayCap = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(row, 7));
            jDateChooser1.setDate(NgayCap);
        }
        catch (Exception e) {
            jOptionPane1.showMessageDialog(null, e);
        }  
        jTextField08.setText(model.getValueAt(row, 8).toString());     
        jTextField09.setText(model.getValueAt(row, 9).toString());
        jTextField11.setText(model.getValueAt(row, 11).toString());        
        jTextField14.setText(model.getValueAt(row, 14).toString());    
        jTextField15.setText(model.getValueAt(row, 15).toString());            
        String TonGiaoString = model.getValueAt(row, 10).toString();
        int i = 0;
        while (true) {
            String TonGiao = jComboBox1.getItemAt(i).toString();
            if(TonGiao.equalsIgnoreCase(TonGiaoString)){
                jComboBox1.setSelectedIndex(i);
                break;
            }
            i++;
        }
        String NgoaiNguString = model.getValueAt(row, 12).toString();
        int j = 0;
        while (true) {
            String NgoaiNgu = jComboBox2.getItemAt(j).toString();
            if(NgoaiNgu.equalsIgnoreCase(NgoaiNguString)){
                jComboBox2.setSelectedIndex(j);
                break;
            }
            j++;
        }
        String TDNgoaiNguString = (model.getValueAt(row, 13).toString());
        int k = 0;
        while (true) {
            String TDNgoaiNgu = jComboBox3.getItemAt(k).toString();
            if(TDNgoaiNgu.equalsIgnoreCase(TDNgoaiNguString)){
                jComboBox3.setSelectedIndex(k);
                break;
            }
            k++;
        }
        
     
//        String MaNV = jTable_TTCaNhan.getValueAt(row, 0).toString();Không
//        String NoiSinh = jTable_TTCaNhan.getValueAt(row, 1).toString();
//        String NguyenQuan = jTable_TTCaNhan.getValueAt(row, 2).toString();
//        String DCThuongTru = jTable_TTCaNhan.getValueAt(row, 3).toString();
//        String DCTamTru = jTable_TTCaNhan.getValueAt(row, 4).toString();
//        String SDT = jTable_TTCaNhan.getValueAt(row, 5).toString();
//        String CMTND = jTable_TTCaNhan.getValueAt(row, 6).toString();
//        String NoiCap = jTable_TTCaNhan.getValueAt(row, 7).toString();
//        String NgayCap = jTable_TTCaNhan.getValueAt(row, 8).toString();
//        String DanToc = jTable_TTCaNhan.getValueAt(row, 9).toString();
//        String TonGiao = jTable_TTCaNhan.getValueAt(row, 10).toString();
//        String QuocTich = jTable_TTCaNhan.getValueAt(row, 11).toString();
//        String TiengNN = jTable_TTCaNhan.getValueAt(row, 12).toString();
//        String TrinhDoNN = jTable_TTCaNhan.getValueAt(row, 13).toString();
//        String TDHocVan = jTable_TTCaNhan.getValueAt(row, 14).toString();
//        String GhiChu = jTable_TTCaNhan.getValueAt(row, 15).toString();       
//        jTextField01.setText(MaNV);
//        jTextField02.setText(NoiSinh);
//        jTextField03.setText(NguyenQuan);
//        jTextField04.setText(DCThuongTru);
//        jTextField05.setText(DCTamTru);
//        jTextField06.setText(SDT);
//        jTextField07.setText(CMTND);
//        jTextField08.setText(NoiCap);
//        jDateChooser01.setDate(NgayCap);
//        jTextField09.setText(DanToc);
//        jTextField10.setText(TonGiao);
//        jTextField11.setText(QuocTich);
//        jTextField12.setText(TiengNN);
//        jTextField13.setText(TrinhDoNN);
//        jTextField14.setText(TDHocVan);
//        jTextField15.setText(GhiChu);       
    }//GEN-LAST:event_jTable_TTCaNhanMouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2MouseClicked

    private void jButtonXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaActionPerformed
            try {
                conn = Database.getDBConnect();    
                int row = jTable_TTCaNhan.getSelectedRow();
                String value = (jTable_TTCaNhan.getModel().getValueAt(row, 0).toString());
                String Sql="delete from TTCaNhan where MaNV =" + value;                  
                pst = conn.prepareStatement(Sql);               
                pst.executeUpdate();
                DefaultTableModel model = (DefaultTableModel)jTable_TTCaNhan.getModel();
                model.setRowCount(0);
                show_TTCN();
                jOptionPane2.showMessageDialog(null, "Xóa thành công!");          
        } catch (Exception e) {
            jOptionPane3.showMessageDialog(null, "Lỗi!");
//         System.out.println("error" + e.toString());   
        }         
    }//GEN-LAST:event_jButtonXoaActionPerformed

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
        jTextField01.setText("");
        jTextField02.setText("");
        jTextField03.setText("");
        jTextField04.setText("");
        jTextField05.setText("");
        jTextField06.setText("");
        jTextField07.setText("");
        jTextField08.setText("");
        jTextField09.setText("");
        jTextField11.setText("");
        jTextField14.setText("");
        jTextField15.setText(""); 
        jComboBox1.setSelectedIndex(5);
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
    }//GEN-LAST:event_jButtonRefreshActionPerformed

    private void jButtonRefresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefresh1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
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
            java.util.logging.Logger.getLogger(ThongTinCaNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongTinCaNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongTinCaNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongTinCaNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               ThongTinCaNhan a = new ThongTinCaNhan();
                 a.setLocationRelativeTo(null);
                 a.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLuu;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JButton jButtonRefresh1;
    private javax.swing.JButton jButtonSua;
    private javax.swing.JButton jButtonThem;
    private javax.swing.JButton jButtonXoa;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JOptionPane jOptionPane2;
    private javax.swing.JOptionPane jOptionPane3;
    private javax.swing.JOptionPane jOptionPane4;
    private javax.swing.JOptionPane jOptionPane5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_TTCaNhan;
    private javax.swing.JTextField jTextField01;
    private javax.swing.JTextField jTextField02;
    private javax.swing.JTextField jTextField03;
    private javax.swing.JTextField jTextField04;
    private javax.swing.JTextField jTextField05;
    private javax.swing.JTextField jTextField06;
    private javax.swing.JTextField jTextField07;
    private javax.swing.JTextField jTextField08;
    private javax.swing.JTextField jTextField09;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    // End of variables declaration//GEN-END:variables
}
