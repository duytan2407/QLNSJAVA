/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DanhMuc;

import ConnectToSql.Database;
import Models.TTBaoHiem;
import Models.TTThaiSan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author USER
 */
public class QuyenLoi extends javax.swing.JFrame {
    Database dt = new Database();
    Connection conn = null;
    PreparedStatement pst = null; 
    String MaLoaiBaoHiem;
    String MaLuongg;
    
    String MaPhongBanString;
    String MaBoPhanString;
    public QuyenLoi() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH); /*fullscreen*/
        show_TTBH();
        show_TTTS();
    }
    public ArrayList<TTBaoHiem> TTBHsList(){
            ArrayList<TTBaoHiem> TTBHsList = new ArrayList<>();
            try {
                conn = Database.getDBConnect();
                String sql = "select * from SoBH" ;
                PreparedStatement pst = conn.prepareStatement(sql);         
                ResultSet rs = pst.executeQuery();
                TTBaoHiem BH;
                while(rs.next()){
                    BH = new TTBaoHiem(rs.getString("MaSoBH"), rs.getString("MaLoaiBH"), rs.getString("MaNV"), rs.getString("MaLuong"), rs.getString("NoiCapSo"), rs.getString("NgayCapSo"), rs.getString("NgayHetHan"), rs.getString("GhiChu"));              
                    TTBHsList.add(BH); 
                }
                return TTBHsList;
            } catch (Exception e) {
                jOptionPane1.showMessageDialog(null, "Lỗi!");
            }
            return null;
        }
    public void show_TTBH(){
        ArrayList<TTBaoHiem> list = TTBHsList();
        DefaultTableModel model = (DefaultTableModel)jTable_TTBH.getModel();
        for(TTBaoHiem o : list){
            model.addRow(new Object[]{o.getMaSBH(), o.getMaLoaiBH(), o.getMaNV(),  o.getMaLuong(), o.getNoiCapSo(), o.getNgayCapSo(), o.getNgayHetHan(), o.getGhiChu()});                      
        }       
    }
    
    public ArrayList<TTThaiSan> TTTSsList(){
            ArrayList<TTThaiSan> TTTSsList = new ArrayList<>();
            try {
                conn = Database.getDBConnect();
                String sql1 = "select * from ThaiSan" ;
                PreparedStatement pst = conn.prepareStatement(sql1);         
                ResultSet rs1 = pst.executeQuery();
                TTThaiSan TS;
                while(rs1.next()){
                    TS = new TTThaiSan(rs1.getString("MaThaiSan"), rs1.getString("HoTen"), rs1.getString("MaNV"), rs1.getString("MaPhongBan"), rs1.getString("MaBoPhan"), rs1.getString("NgaySinh"), rs1.getString("NgayVeSom"), rs1.getString("NgayNghiSinh"), rs1.getString("NgayLamTroLai"), rs1.getString("TroCapCTY"), rs1.getString("GhiChu"));              
                    TTTSsList.add(TS); 
                }
                return TTTSsList;
            } catch (Exception e) {
//                jOptionPane1.showMessageDialog(null, "Lỗi!");
                System.out.println("error" + e.toString());
            }
            return null;
        }
    public void show_TTTS(){
        ArrayList<TTThaiSan> list1 = TTTSsList();
        DefaultTableModel model1 = (DefaultTableModel)jTable_TTTS.getModel();
        for(TTThaiSan o1 : list1){
            model1.addRow(new Object[]{o1.getMaThaiSan(), o1.getHoTen(), o1.getMaNV(),  o1.getMaPhongBan(), o1.getMaBoPhan(), o1.getNgaySinh(), o1.getNgayVeSom(), o1.getNgayNghiSinh(), o1.getNgayLamTroLai(), o1.getTroCapCTY(), o1.getGhiChu()});                      
        }       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jOptionPane2 = new javax.swing.JOptionPane();
        jOptionPane3 = new javax.swing.JOptionPane();
        jOptionPane4 = new javax.swing.JOptionPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jButtonThemBH = new javax.swing.JButton();
        jButtonSuaBH = new javax.swing.JButton();
        jButtonXoaBH = new javax.swing.JButton();
        jButtonRefreshBH = new javax.swing.JButton();
        jButtonRefreshBH1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        MaSoBH = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        MaLoaiBH = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        MaNV = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NgayCapSo = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        NgayHetHan = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        GhiChu = new javax.swing.JTextField();
        MaLuong = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        NoiCap = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_TTBH = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jButtonThemTS = new javax.swing.JButton();
        jButtonSuaTS = new javax.swing.JButton();
        jButtonXoaTS = new javax.swing.JButton();
        jButtonRefreshTS = new javax.swing.JButton();
        jButtonRefreshTS1 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        MNV = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        HT = new javax.swing.JTextField();
        MaPB = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        MaTS = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        MaBP = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TC = new javax.swing.JTextField();
        GhiChu1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        NgayLTL = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        NgayXVS = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        NgayS = new com.toedter.calendar.JDateChooser();
        NgayNS = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_TTTS = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setForeground(new java.awt.Color(255, 0, 51));
        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức Năng"));

        jPanel8.setBackground(new java.awt.Color(204, 255, 255));

        jButtonThemBH.setBackground(new java.awt.Color(255, 255, 102));
        jButtonThemBH.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonThemBH.setForeground(new java.awt.Color(255, 51, 51));
        jButtonThemBH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/add_user.png"))); // NOI18N
        jButtonThemBH.setText("Thêm");
        jButtonThemBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemBHActionPerformed(evt);
            }
        });

        jButtonSuaBH.setBackground(new java.awt.Color(255, 255, 102));
        jButtonSuaBH.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonSuaBH.setForeground(new java.awt.Color(255, 51, 51));
        jButtonSuaBH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/edit_user.png"))); // NOI18N
        jButtonSuaBH.setText("Sửa");
        jButtonSuaBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuaBHActionPerformed(evt);
            }
        });

        jButtonXoaBH.setBackground(new java.awt.Color(255, 255, 102));
        jButtonXoaBH.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonXoaBH.setForeground(new java.awt.Color(255, 51, 51));
        jButtonXoaBH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/remove_user.png"))); // NOI18N
        jButtonXoaBH.setText("Xóa");
        jButtonXoaBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaBHActionPerformed(evt);
            }
        });

        jButtonRefreshBH.setBackground(new java.awt.Color(255, 255, 102));
        jButtonRefreshBH.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonRefreshBH.setForeground(new java.awt.Color(255, 51, 51));
        jButtonRefreshBH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/upload.png"))); // NOI18N
        jButtonRefreshBH.setText("Refresh");
        jButtonRefreshBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshBHActionPerformed(evt);
            }
        });

        jButtonRefreshBH1.setBackground(new java.awt.Color(255, 255, 102));
        jButtonRefreshBH1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonRefreshBH1.setForeground(new java.awt.Color(255, 51, 51));
        jButtonRefreshBH1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/close1.png"))); // NOI18N
        jButtonRefreshBH1.setText("Exit");
        jButtonRefreshBH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshBH1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonThemBH, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButtonSuaBH, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addComponent(jButtonXoaBH, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(jButtonRefreshBH, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButtonRefreshBH1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonThemBH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSuaBH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonXoaBH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRefreshBH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRefreshBH1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 204));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 51, 51));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("THÔNG TIN SỔ BẢO HIỂM");

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setText("Mã sổ BH");

        MaSoBH.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Mã loại BH ");

        MaLoaiBH.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        MaLoaiBH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LBH001    ", "LBH002    ", "LBH003    ", "LBH004    ", "LBH005    " }));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Mã NV");

        MaNV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Mã lương");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Ngày cấp sổ");

        NgayCapSo.setDateFormatString("yyyy-MM-dd");
        NgayCapSo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setText("Ngày hết hạn");

        NgayHetHan.setDateFormatString("yyyy-MM-dd");
        NgayHetHan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Ghi chú");

        GhiChu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        MaLuong.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        MaLuong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ML0001    ", "ML0002    ", "ML0003    ", "ML0004    ", "ML0005    ", "ML0006    ", "ML0007    ", "ML0008    ", "ML0009    ", "ML0010    ", "ML0011    ", "ML0012    ", "ML0013    ", "ML0014    ", "ML0015    ", "ML0016    ", "ML0017    ", "ML0018    ", "ML0019    ", "ML0020    ", "ML0021    ", "ML0022    " }));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Nơi cấp");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MaNV)
                            .addComponent(MaLuong, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MaLoaiBH, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MaSoBH)))
                .addGap(75, 75, 75)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NgayCapSo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NgayHetHan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GhiChu)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NoiCap)))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel18, jLabel19, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(NoiCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(MaSoBH, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NgayCapSo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(NgayHetHan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(GhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(MaLoaiBH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(MaLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel18, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {GhiChu, MaLoaiBH, MaLuong, MaNV, MaSoBH, NgayCapSo, NgayHetHan, NoiCap});

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTable_TTBH.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable_TTBH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sổ BH", "Mã loại BH", "Mã NV", "Mã lương", "Nơi cấp", "Ngày cấp sổ", "Ngày hết hạn", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_TTBH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_TTBHMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_TTBH);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Bảo Hiểm ", jPanel1);

        jPanel6.setBackground(new java.awt.Color(204, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức Năng"));

        jPanel10.setBackground(new java.awt.Color(204, 255, 255));

        jButtonThemTS.setBackground(new java.awt.Color(255, 255, 102));
        jButtonThemTS.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonThemTS.setForeground(new java.awt.Color(255, 51, 51));
        jButtonThemTS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/add_user.png"))); // NOI18N
        jButtonThemTS.setText("Thêm");
        jButtonThemTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemTSActionPerformed(evt);
            }
        });

        jButtonSuaTS.setBackground(new java.awt.Color(255, 255, 102));
        jButtonSuaTS.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonSuaTS.setForeground(new java.awt.Color(255, 51, 51));
        jButtonSuaTS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/edit_user.png"))); // NOI18N
        jButtonSuaTS.setText("Sửa");
        jButtonSuaTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuaTSActionPerformed(evt);
            }
        });

        jButtonXoaTS.setBackground(new java.awt.Color(255, 255, 102));
        jButtonXoaTS.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonXoaTS.setForeground(new java.awt.Color(255, 51, 51));
        jButtonXoaTS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/remove_user.png"))); // NOI18N
        jButtonXoaTS.setText("Xóa");
        jButtonXoaTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaTSActionPerformed(evt);
            }
        });

        jButtonRefreshTS.setBackground(new java.awt.Color(255, 255, 102));
        jButtonRefreshTS.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonRefreshTS.setForeground(new java.awt.Color(255, 51, 51));
        jButtonRefreshTS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/upload.png"))); // NOI18N
        jButtonRefreshTS.setText("Refresh");
        jButtonRefreshTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshTSActionPerformed(evt);
            }
        });

        jButtonRefreshTS1.setBackground(new java.awt.Color(255, 255, 102));
        jButtonRefreshTS1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonRefreshTS1.setForeground(new java.awt.Color(255, 51, 51));
        jButtonRefreshTS1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/close1.png"))); // NOI18N
        jButtonRefreshTS1.setText("Exit");
        jButtonRefreshTS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshTS1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonThemTS, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButtonSuaTS, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButtonXoaTS, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButtonRefreshTS, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButtonRefreshTS1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonThemTS, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSuaTS, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonXoaTS, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRefreshTS, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRefreshTS1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 204));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 51, 51));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("THÔNG TIN THAI SẢN");

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Họ tên");

        MNV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Mã NV");

        HT.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        MaPB.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        MaPB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"P001      ", "P002      ", "P003      ", "P004      ", "P005      ", "P006      ", "P007      ", "P008      ", "P009      ", "P010      ", "P011      ", "P012      "}));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Mã phòng ban");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel21.setText("Mã thai sản");

        MaTS.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        MaTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaTSActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("Mã bộ phận");

        MaBP.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        MaBP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"MB001     ", "MB002     ", "MB003     ", "MB004     ", "MB005     ", "MB006     ", "MB007     ", "MB008     ", "MB009     ", "MB010     "}));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Ngày làm trở lại");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Trợ Cấp");

        TC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        GhiChu1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("Ghi chú");

        NgayLTL.setDateFormatString("yyyy-MM-dd");
        NgayLTL.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Ngày xin về sớm");

        NgayXVS.setDateFormatString("yyyy-MM-dd");
        NgayXVS.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Ngày sinh");

        NgayS.setDateFormatString("yyyy-MM-dd");
        NgayS.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        NgayNS.setDateFormatString("yyyy-MM-dd");
        NgayNS.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Ngày nghỉ sinh");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MaTS)
                            .addComponent(HT)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MaPB, 0, 98, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MNV)))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MaBP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NgayXVS, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NgayS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NgayNS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TC))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NgayLTL, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GhiChu1))
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel12, jLabel13, jLabel14, jLabel15, jLabel16, jLabel21, jLabel7, jLabel8, jLabel9});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(NgayLTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(TC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(GhiChu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(MaTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(MaBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(HT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11))
                            .addComponent(NgayXVS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(MNV, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10))
                            .addComponent(NgayS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(MaPB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12))
                            .addComponent(NgayNS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel12, jLabel13, jLabel14, jLabel15, jLabel16, jLabel21, jLabel7, jLabel8, jLabel9});

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {GhiChu1, HT, MNV, MaBP, MaPB, MaTS, NgayLTL, NgayNS, NgayS, NgayXVS, TC});

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTable_TTTS.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable_TTTS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã thai sản", "Họ tên", "Mã NV", "Mã phòng ban", "Mã bộ phận", "Ngày xin về sớm", "Ngày sinh", "Ngày nghỉ sinh", "Ngày làm trở lại", "Trợ cấp", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_TTTS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_TTTSMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_TTTS);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thai Sản", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonThemBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemBHActionPerformed
        try {
            String Sql="insert into SoBH(MaSBH, MaLoaiBH, MaNV, MaLuong, NoiCapSo, NgayCapSo, NgayHetHan, GhiChu) values(?,?,?,?,?,?,?,?)";
            conn = Database.getDBConnect();
            pst = conn.prepareStatement(Sql);
            pst.setString(1, MaSoBH.getText());
            MaLoaiBaoHiem = MaLoaiBH.getSelectedItem().toString();
            pst.setString(2, MaLoaiBaoHiem);
            pst.setString(3, MaNV.getText());
            MaLuongg = MaLuong.getSelectedItem().toString();
            pst.setString(4, MaLuongg);
            pst.setString(5, NoiCap.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String NgayCap = sdf.format(NgayCapSo.getDate());
            pst.setString(6, NgayCap);
            String NgayHet = sdf.format(NgayHetHan.getDate());
            pst.setString(7, NgayHet);
            pst.setString(8, GhiChu.getText());
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable_TTBH.getModel();
            model.setRowCount(0);
            show_TTBH();
            jOptionPane2.showMessageDialog(null, "Thêm thành công!");
        } catch (Exception e) {
            //            jOptionPane3.showMessageDialog(null, "Lỗi!" );
            System.out.println("error" + e.toString());
        }
    }//GEN-LAST:event_jButtonThemBHActionPerformed

    private void jButtonSuaBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuaBHActionPerformed
        try {
            conn = Database.getDBConnect();
//            int row = jTable_TTBH.getSelectedRow();
            String Sql="update SoBH set MaLoaiBH = ?, MaNV = ?, MaLuong = ?, NoiCapSo = ?, NgayCapSo = ?, NgayHetHan = ?, GhiChu = ? where MaSBH =?" /*+ MaSoBH.getText()*/;            
            pst = conn.prepareStatement(Sql);
            MaLoaiBaoHiem = MaLoaiBH.getSelectedItem().toString();
            pst.setString(1, MaLoaiBaoHiem);
            pst.setString(2, MaNV.getText());
            MaLuongg = MaLuong.getSelectedItem().toString();
            pst.setString(3, MaLuongg);
            pst.setString(4, NoiCap.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String NgayCap = sdf.format(NgayCapSo.getDate());
            pst.setString(5, NgayCap);
            String NgayHet = sdf.format(NgayHetHan.getDate());
            pst.setString(6, NgayHet);
            pst.setString(7, GhiChu.getText());
            pst.setString(8, MaSoBH.getText());
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable_TTBH.getModel();
            model.setRowCount(0);
            show_TTBH();
            jOptionPane2.showMessageDialog(null, "Sửa thành công!");
            } catch (Exception e) {
            //            jOptionPane3.showMessageDialog(null, "Lỗi!" );
            System.out.println("error" + e.toString());
        }
    }//GEN-LAST:event_jButtonSuaBHActionPerformed

    private void jButtonXoaBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaBHActionPerformed
        try {
            conn = Database.getDBConnect();    
            String sql="delete from SoBH where MaSBH =?" /*+ MaSoBH.getText()*/;                 
            pst = conn.prepareStatement(sql);     
            pst.setString(1, MaSoBH.getText());
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable_TTBH.getModel();
            model.setRowCount(0);
            show_TTBH();
            jOptionPane2.showMessageDialog(null, "Xóa thành công!");        
        } catch (Exception e) {
//            jOptionPane3.showMessageDialog(null, "Lỗi!");
                     System.out.println("error" + e.toString());
        }
    }//GEN-LAST:event_jButtonXoaBHActionPerformed

    private void jButtonRefreshBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshBHActionPerformed
        MaSoBH.setText("");
        MaNV.setText("");
        NoiCap.setText("");
        GhiChu.setText("");
        MaLoaiBH.setSelectedIndex(0);
        MaLuong.setSelectedIndex(0);
        NgayCapSo.setDate(null);
        NgayHetHan.setDate(null);
    }//GEN-LAST:event_jButtonRefreshBHActionPerformed

    private void jButtonThemTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemTSActionPerformed
        try {
            String Sql1="insert into ThaiSan(MaThaiSan, HoTen, MaNV, MaPhongBan, MaBoPhan, NgaySinh, NgayVeSom, NgayNghiSinh, NgayLamTroLai, TroCapCTY, GhiChu) values(?,?,?,?,?,?,?,?,?,?,?)";
            conn = Database.getDBConnect();
            pst = conn.prepareStatement(Sql1);
            pst.setString(1, MaTS.getText());
            pst.setString(2, HT.getText());
            pst.setString(3, MNV.getText());
            MaPhongBanString = MaPB.getSelectedItem().toString();
            pst.setString(4, MaPhongBanString);
            MaBoPhanString = MaBP.getSelectedItem().toString();
            pst.setString(5, MaBoPhanString);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String NgayVeSom = sdf.format(NgayXVS.getDate());
            pst.setString(6, NgayVeSom);
            String NgSinh = sdf.format(NgayS.getDate());
            pst.setString(7, NgSinh );           
            String NgNghiSinh = sdf.format(NgayNS.getDate());
            pst.setString(8, NgNghiSinh);
            String NgLamTroLai = sdf.format(NgayLTL.getDate());
            pst.setString(9, NgLamTroLai);
            pst.setString(10, TC.getText());
            pst.setString(11, GhiChu1.getText());
            pst.executeUpdate();
            DefaultTableModel model1 = (DefaultTableModel)jTable_TTTS.getModel();
            model1.setRowCount(0);
            show_TTTS();
            jOptionPane2.showMessageDialog(null, "Thêm thành công!");
        } catch (Exception e) {
            //            jOptionPane3.showMessageDialog(null, "Lỗi!" );
            System.out.println("error" + e.toString());
        }                                            

    }//GEN-LAST:event_jButtonThemTSActionPerformed

    private void jButtonSuaTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuaTSActionPerformed
try {
            String Sql1="update ThaiSan set HoTen = ?, MaNV = ?, MaPhongBan = ?, MaBoPhan = ?, NgaySinh = ?, NgayVeSom = ?, NgayNghiSinh = ?, NgayLamTroLai = ?, TroCapCTY = ?, GhiChu = ? where MaThaiSan = ?";
            conn = Database.getDBConnect();
            pst = conn.prepareStatement(Sql1);
            pst.setString(1, HT.getText());
            pst.setString(2, MNV.getText());
            MaPhongBanString = MaPB.getSelectedItem().toString();
            pst.setString(3, MaPhongBanString);
            MaBoPhanString = MaBP.getSelectedItem().toString();
            pst.setString(4, MaBoPhanString);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String NgayVeSom = sdf.format(NgayXVS.getDate());
            pst.setString(5, NgayVeSom);
            String NgSinh = sdf.format(NgayS.getDate());
            pst.setString(6, NgSinh );           
            String NgNghiSinh = sdf.format(NgayNS.getDate());
            pst.setString(7, NgNghiSinh);
            String NgLamTroLai = sdf.format(NgayLTL.getDate());
            pst.setString(8, NgLamTroLai);
            pst.setString(9, TC.getText());
            pst.setString(10, GhiChu1.getText());
            pst.setString(11, MaTS.getText());
            pst.executeUpdate();
            DefaultTableModel model1 = (DefaultTableModel)jTable_TTTS.getModel();
            model1.setRowCount(0);
            show_TTTS();
            jOptionPane2.showMessageDialog(null, "Thêm thành công!");
        } catch (Exception e) {
            //            jOptionPane3.showMessageDialog(null, "Lỗi!" );
            System.out.println("error" + e.toString());
        }                                        
    }//GEN-LAST:event_jButtonSuaTSActionPerformed

    private void jButtonXoaTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaTSActionPerformed
         try {
            conn = Database.getDBConnect();    
//            int row = jTable_TTTS.getSelectedRow();
//            String value1 = (jTable_TTTS.getModel().getValueAt(row, 0).toString());
            String Sql1="delete from ThaiSan where MaThaiSan =?" ;                
            pst = conn.prepareStatement(Sql1);
            pst.setString(1, MaTS.getText());
            pst.executeUpdate();
            DefaultTableModel model1 = (DefaultTableModel)jTable_TTTS.getModel();
            model1.setRowCount(0);
            show_TTTS();
            jOptionPane2.showMessageDialog(null, "Xóa thành công!");        
            } catch (Exception e) {
    //            jOptionPane3.showMessageDialog(null, "Lỗi!");
                         System.out.println("error" + e.toString());
            }                                   
    }//GEN-LAST:event_jButtonXoaTSActionPerformed

    private void jButtonRefreshTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshTSActionPerformed
        MaTS.setText("");
        HT.setText("");
        MNV.setText("");
        MaPB.setSelectedIndex(0);
        MaBP.setSelectedIndex(0);
        NgayXVS.setDate(null);
        NgayS.setDate(null);
        NgayNS.setDate(null);
        NgayLTL.setDate(null);
        TC.setText("");
        GhiChu1.setText("");
    }//GEN-LAST:event_jButtonRefreshTSActionPerformed

    private void MaTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaTSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaTSActionPerformed

    private void jTable_TTBHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_TTBHMouseClicked
        int row = jTable_TTBH.getSelectedRow();
        TableModel model = jTable_TTBH.getModel();
        MaSoBH.setText(model.getValueAt(row, 0).toString());
        MaLoaiBaoHiem = model.getValueAt(row, 1).toString();
        int i = 0;
        while (true) {
            String MLBH = MaLoaiBH.getItemAt(i).toString();
            if(MLBH.equalsIgnoreCase(MaLoaiBaoHiem)){
                MaLoaiBH.setSelectedIndex(i);
                break;
            }
            i++;
        }
        MaNV.setText(model.getValueAt(row, 2).toString());    
        MaLuongg = model.getValueAt(row, 3).toString();
        int j = 0;
        while (true) {
            String ML = MaLuong.getItemAt(j).toString();
            if(ML.equalsIgnoreCase(MaLuongg)){
                MaLuong.setSelectedIndex(j);
                break;
            }
            j++;
        }
        NoiCap.setText(model.getValueAt(row, 4).toString());
        try{
            Date NgayCap = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(row, 5));
            this.NgayCapSo.setDate(NgayCap);            
        }
        catch (Exception e) {
            jOptionPane1.showMessageDialog(null, e);
        }  
        try{
            Date NgayHet = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(row, 6));
            this.NgayHetHan.setDate(NgayHet);
        }
        catch (Exception e) {
            jOptionPane1.showMessageDialog(null, e);
        }     
        
        GhiChu.setText(model.getValueAt(row, 7).toString());              
    }//GEN-LAST:event_jTable_TTBHMouseClicked

    private void jTable_TTTSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_TTTSMouseClicked
        int row = jTable_TTTS.getSelectedRow();
        TableModel model1 = jTable_TTTS.getModel();
        MaTS.setText(model1.getValueAt(row, 0).toString());
        HT.setText(model1.getValueAt(row, 1).toString());
        MNV.setText(model1.getValueAt(row, 2).toString());        
        try{
            Date NgayVeSom = new SimpleDateFormat("yyyy-MM-dd").parse((String)model1.getValueAt(row, 5));
            this.NgayXVS.setDate(NgayVeSom);
            Date NgaySinh = new SimpleDateFormat("yyyy-MM-dd").parse((String)model1.getValueAt(row, 6));
            this.NgayS.setDate(NgaySinh);
            Date NgayNghiSinh = new SimpleDateFormat("yyyy-MM-dd").parse((String)model1.getValueAt(row, 7));
            this.NgayNS.setDate(NgayNghiSinh);
            Date NgayTroLai = new SimpleDateFormat("yyyy-MM-dd").parse((String)model1.getValueAt(row, 8));
            this.NgayLTL.setDate(NgayTroLai);
        }
        catch (Exception e) {
            jOptionPane1.showMessageDialog(null, e);
        }             
        TC.setText(model1.getValueAt(row, 9).toString());
        GhiChu1.setText(model1.getValueAt(row, 10).toString());             
        MaPhongBanString = model1.getValueAt(row, 3).toString();
        int i = 0;
        while (true) {
            String MPB = MaPB.getItemAt(i).toString();
            if(MPB.equalsIgnoreCase(MaPhongBanString)){
                MaPB.setSelectedIndex(i);
                break;
            }
            i++;
        }
        MaBoPhanString = model1.getValueAt(row, 4).toString();
        int j = 0;
        while (true) {
            String MBP = MaBP.getItemAt(j).toString();
            if(MBP.equalsIgnoreCase(MaBoPhanString)){
               MaBP.setSelectedIndex(j);
                break;
            }
            j++;
        }
    }//GEN-LAST:event_jTable_TTTSMouseClicked

    private void jButtonRefreshTS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshTS1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonRefreshTS1ActionPerformed

    private void jButtonRefreshBH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshBH1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonRefreshBH1ActionPerformed

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
            java.util.logging.Logger.getLogger(QuyenLoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuyenLoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuyenLoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuyenLoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                 QuyenLoi a = new QuyenLoi();
                 a.setLocationRelativeTo(null);
                 a.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField GhiChu;
    private javax.swing.JTextField GhiChu1;
    private javax.swing.JTextField HT;
    private javax.swing.JTextField MNV;
    private javax.swing.JComboBox<String> MaBP;
    private javax.swing.JComboBox<String> MaLoaiBH;
    private javax.swing.JComboBox<String> MaLuong;
    private javax.swing.JTextField MaNV;
    private javax.swing.JComboBox<String> MaPB;
    private javax.swing.JTextField MaSoBH;
    private javax.swing.JTextField MaTS;
    private com.toedter.calendar.JDateChooser NgayCapSo;
    private com.toedter.calendar.JDateChooser NgayHetHan;
    private com.toedter.calendar.JDateChooser NgayLTL;
    private com.toedter.calendar.JDateChooser NgayNS;
    private com.toedter.calendar.JDateChooser NgayS;
    private com.toedter.calendar.JDateChooser NgayXVS;
    private javax.swing.JTextField NoiCap;
    private javax.swing.JTextField TC;
    private javax.swing.JButton jButtonRefreshBH;
    private javax.swing.JButton jButtonRefreshBH1;
    private javax.swing.JButton jButtonRefreshTS;
    private javax.swing.JButton jButtonRefreshTS1;
    private javax.swing.JButton jButtonSuaBH;
    private javax.swing.JButton jButtonSuaTS;
    private javax.swing.JButton jButtonThemBH;
    private javax.swing.JButton jButtonThemTS;
    private javax.swing.JButton jButtonXoaBH;
    private javax.swing.JButton jButtonXoaTS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable_TTBH;
    private javax.swing.JTable jTable_TTTS;
    // End of variables declaration//GEN-END:variables
}
