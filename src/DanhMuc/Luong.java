/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DanhMuc;

import ConnectToSql.Database;
import Models.TTDieuChinh;
import Models.TTLuong;
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
public class Luong extends javax.swing.JFrame {
    Database dt = new Database();
    Connection conn = null;
    PreparedStatement pst = null; 
    
    String MaCVString;
    String MaCVStringg;
    
    public Luong() {
        initComponents();
        show_TTL();
        show_TTDC();
    }
    /*Luong*/
    public ArrayList<TTLuong> TTLsList(){
            ArrayList<TTLuong> TTLsList = new ArrayList<>();
            try {
                conn = Database.getDBConnect();
                String sql = "select * from BangLuong" ;
                PreparedStatement pst = conn.prepareStatement(sql);         
                ResultSet rs = pst.executeQuery();
                TTLuong L;
                while(rs.next()){
                    L = new TTLuong(rs.getString("MaLuong"), rs.getString("MaChucVu"), rs.getString("LCB"), rs.getString("PCChucVu"), rs.getString("NgayNhap"), rs.getString("LCBMoi"), rs.getString("NgaySua"), rs.getString("LyDo"), rs.getString("PCCVuMoi"), rs.getString("NgaySuaPC"), rs.getString("GhiChu"));              
                    TTLsList.add(L); 
                }
                return TTLsList;
            } catch (Exception e) {
                jOptionPane1.showMessageDialog(null, "Lỗi!");
            }
            return null;
        }
    public void show_TTL(){
        ArrayList<TTLuong> list = TTLsList();
        DefaultTableModel model = (DefaultTableModel)jTable_TTLuong.getModel();
        for(TTLuong o : list){
            model.addRow(new Object[]{o.getMaLuong(), o.getMaChucVu(), o.getLCB(),  o.getPCChucVu(), o.getNgayNhap(), o.getLCBMoi(), o.getNgaySua(), o.getPCCVuMoi(), o.getNgaySuaPC(), o.getLyDo(), o.getGhiChu()});                      
        }       
    }
    /*Dieu Chinh*/
    public ArrayList<TTDieuChinh> TTDCsList(){
            ArrayList<TTDieuChinh> TTDCsList = new ArrayList<>();
            try {
                conn = Database.getDBConnect();
                String sql = "select * from DieuChinhLuong" ;
                PreparedStatement pst = conn.prepareStatement(sql);         
                ResultSet rs = pst.executeQuery();
                TTDieuChinh DC;
                while(rs.next()){
                    DC = new TTDieuChinh(rs.getString("MaDieuChinh"), rs.getString("MaNV"), rs.getString("HoTen"), rs.getString("ChucVu"), rs.getString("LCBCu"), rs.getString("PCapCu"), rs.getString("LCBMoi"), rs.getString("PcapMoi"), rs.getString("MaDG"), rs.getString("NgayDC"), rs.getString("GhiChu"));              
                    TTDCsList.add(DC); 
                }
                return TTDCsList;
            } catch (Exception e) {
                jOptionPane1.showMessageDialog(null, "Lỗi!");
            }
            return null;
        }
    public void show_TTDC(){
        ArrayList<TTDieuChinh> list = TTDCsList();
        DefaultTableModel model = (DefaultTableModel)jTable_TTDC.getModel();
        for(TTDieuChinh o : list){
            model.addRow(new Object[]{o.getMaDieuChinh(), o.getMaNV(), o.getHoTen(),  o.getChucVu(), o.getLCBCu(), o.getPCapCu(), o.getLCBMoi(), o.getPcapMoi(), o.getMaDG(), o.getNgayDC(), o.getGhiChu()});                      
        }       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jOptionPane2 = new javax.swing.JOptionPane();
        jOptionPane3 = new javax.swing.JOptionPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        MaL = new javax.swing.JTextField();
        PhuCapCV = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        MaCV = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        LuongCB = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        MucLuongMoi = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PhuCapMoi = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        LyDo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        GhiChu = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        NgayN = new com.toedter.calendar.JDateChooser();
        NgayS = new com.toedter.calendar.JDateChooser();
        NgaySPC = new com.toedter.calendar.JDateChooser();
        jPanel6 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jButtonThemL = new javax.swing.JButton();
        jButtonSuaL = new javax.swing.JButton();
        jButtonXoaL = new javax.swing.JButton();
        jButtonRefreshL = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_TTLuong = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jButtonThemL1 = new javax.swing.JButton();
        jButtonSuaL1 = new javax.swing.JButton();
        jButtonXoaL1 = new javax.swing.JButton();
        jButtonRefreshL1 = new javax.swing.JButton();
        jexit = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        MaNV = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        HoTen = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MaDG = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        LuongC = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        LuongM = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        PhuCapM = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PhuCapC = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        GhiChu1 = new javax.swing.JTextField();
        MaDC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ChucVu = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        NgayC = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_TTDC = new javax.swing.JTable();

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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(204, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(255, 0, 51));
        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 153));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 51, 51));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("LƯƠNG NHÂN VIÊN");

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Mã lương");

        MaL.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        PhuCapCV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("Phụ cấp chức vụ");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Mã chức vụ ");

        MaCV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        MaCV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CV001     ", "CV002     ", "CV003     ", "CV004     ", "CV005     ", "CV006     ", "CV007     ", "CV008     ", "CV009     ", "CV010     ", "CV011     ", "CV012     ", "CV013     ", "CV014     ", "CV015     ", "CV016     ", "CV017     ", "CV018     ", "CV019     ", "CV020     ", "CV021     ", "CV022     "}));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Lương cơ bản");

        LuongCB.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("Mức lương mới");

        MucLuongMoi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Ngày nhập");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Phụ cấp mới");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Ngày sửa");

        PhuCapMoi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Ngày sửa phụ cấp");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setText("Ghi chú");

        LyDo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setText("Lý do");

        GhiChu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LuongCB))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MaCV, javax.swing.GroupLayout.Alignment.TRAILING, 0, 160, Short.MAX_VALUE)
                            .addComponent(MaL))))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PhuCapCV, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MucLuongMoi)
                            .addComponent(NgayN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PhuCapMoi, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(NgayS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NgaySPC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LyDo, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(GhiChu)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel12, jLabel13, jLabel14, jLabel15, jLabel16, jLabel7, jLabel8});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(MaL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(MaCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(PhuCapCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16)
                                .addComponent(jLabel11)
                                .addComponent(NgayS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(PhuCapMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel18)
                                        .addComponent(GhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(NgayN, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(LyDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LuongCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(MucLuongMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(jLabel14))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NgaySPC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel12, jLabel13, jLabel14, jLabel15, jLabel16, jLabel17, jLabel18, jLabel7, jLabel8});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {GhiChu, LuongCB, LyDo, MaCV, MaL, MucLuongMoi, PhuCapCV, PhuCapMoi});

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 1115, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(204, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức Năng"));
        jPanel6.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        jPanel10.setBackground(new java.awt.Color(204, 255, 255));

        jButtonThemL.setBackground(new java.awt.Color(255, 255, 102));
        jButtonThemL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonThemL.setForeground(new java.awt.Color(255, 51, 51));
        jButtonThemL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/add_user.png"))); // NOI18N
        jButtonThemL.setText("Thêm");
        jButtonThemL.setDisabledIcon(null);
        jButtonThemL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemLActionPerformed(evt);
            }
        });

        jButtonSuaL.setBackground(new java.awt.Color(255, 255, 102));
        jButtonSuaL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonSuaL.setForeground(new java.awt.Color(255, 51, 51));
        jButtonSuaL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/edit_user.png"))); // NOI18N
        jButtonSuaL.setText("Sửa");
        jButtonSuaL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuaLActionPerformed(evt);
            }
        });

        jButtonXoaL.setBackground(new java.awt.Color(255, 255, 102));
        jButtonXoaL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonXoaL.setForeground(new java.awt.Color(255, 51, 51));
        jButtonXoaL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/remove_user.png"))); // NOI18N
        jButtonXoaL.setText("Xóa");
        jButtonXoaL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaLActionPerformed(evt);
            }
        });

        jButtonRefreshL.setBackground(new java.awt.Color(255, 255, 102));
        jButtonRefreshL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonRefreshL.setForeground(new java.awt.Color(255, 51, 51));
        jButtonRefreshL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/upload.png"))); // NOI18N
        jButtonRefreshL.setText("Làm mới");
        jButtonRefreshL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshLActionPerformed(evt);
            }
        });

        btnexit.setBackground(new java.awt.Color(255, 255, 102));
        btnexit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnexit.setForeground(new java.awt.Color(255, 51, 51));
        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/button3.Image.gif"))); // NOI18N
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jButtonThemL, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButtonSuaL, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButtonXoaL, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButtonRefreshL)
                .addGap(31, 31, 31)
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonThemL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSuaL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonXoaL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRefreshL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTable_TTLuong.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable_TTLuong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã lương", "Mã chức vụ", "Lương cơ bản", "Phụ cấp chức vụ", "Ngày nhập", "Mức lương mới", "Ngày sửa", "Phụ cấp mới", "Ngày sửa phụ cấp", "Lý do", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_TTLuong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_TTLuongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_TTLuong);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jTabbedPane1.addTab("Lương Cơ Bản", jPanel1);

        jPanel9.setBackground(new java.awt.Color(204, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức Năng"));
        jPanel9.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        jPanel11.setBackground(new java.awt.Color(204, 255, 255));

        jButtonThemL1.setBackground(new java.awt.Color(255, 255, 102));
        jButtonThemL1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonThemL1.setForeground(new java.awt.Color(255, 51, 51));
        jButtonThemL1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/add_user.png"))); // NOI18N
        jButtonThemL1.setText("Thêm");
        jButtonThemL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemL1ActionPerformed(evt);
            }
        });

        jButtonSuaL1.setBackground(new java.awt.Color(255, 255, 102));
        jButtonSuaL1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonSuaL1.setForeground(new java.awt.Color(255, 51, 51));
        jButtonSuaL1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/edit_user.png"))); // NOI18N
        jButtonSuaL1.setText("Sửa");
        jButtonSuaL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuaL1ActionPerformed(evt);
            }
        });

        jButtonXoaL1.setBackground(new java.awt.Color(255, 255, 102));
        jButtonXoaL1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonXoaL1.setForeground(new java.awt.Color(255, 51, 51));
        jButtonXoaL1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/remove_user.png"))); // NOI18N
        jButtonXoaL1.setText("Xóa");
        jButtonXoaL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaL1ActionPerformed(evt);
            }
        });

        jButtonRefreshL1.setBackground(new java.awt.Color(255, 255, 102));
        jButtonRefreshL1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonRefreshL1.setForeground(new java.awt.Color(255, 51, 51));
        jButtonRefreshL1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/upload.png"))); // NOI18N
        jButtonRefreshL1.setText("Làm mới");
        jButtonRefreshL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshL1ActionPerformed(evt);
            }
        });

        jexit.setBackground(new java.awt.Color(255, 255, 102));
        jexit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jexit.setForeground(new java.awt.Color(255, 51, 51));
        jexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/close1.png"))); // NOI18N
        jexit.setText("Exit");
        jexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jButtonThemL1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButtonSuaL1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButtonXoaL1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButtonRefreshL1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jexit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonThemL1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSuaL1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonXoaL1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRefreshL1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jexit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 204));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 51, 51));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("ĐIỀU CHỈNH LƯƠNG");

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setText("Mã NV");

        MaNV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel20.setText("Họ tên");

        HoTen.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel28.setText("Chức vụ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Mã đánh giá");

        MaDG.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel22.setText("Lương cũ");

        LuongC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel23.setText("Lương mới");

        LuongM.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel24.setText("Phụ cấp mới");

        PhuCapM.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Phụ cấp cũ");

        PhuCapC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel26.setText("Ngày chỉnh");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Ghi chú");

        GhiChu1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        MaDC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Mã điều chỉnh");

        ChucVu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CV001     ", "CV002     ", "CV003     ", "CV004     ", "CV005     ", "CV006     ", "CV007     ", "CV008     ", "CV009     ", "CV010     ", "CV011     ", "CV012     ", "CV013     ", "CV014     ", "CV015     ", "CV016     ", "CV017     ", "CV018     ", "CV019     ", "CV020     ", "CV021     ", "CV022     " }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ChucVu, 0, 213, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MaDC, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MaNV, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)))
                .addGap(97, 97, 97)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PhuCapM, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                    .addComponent(LuongM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                    .addComponent(PhuCapC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                    .addComponent(LuongC))
                .addGap(97, 97, 97)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MaDG, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(GhiChu1)
                            .addComponent(NgayC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel19, jLabel2, jLabel20, jLabel22, jLabel23, jLabel24, jLabel26, jLabel28, jLabel3, jLabel4, jLabel5});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(MaDC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(HoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(PhuCapM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel24)
                                .addComponent(jLabel28))
                            .addComponent(ChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LuongC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(PhuCapC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LuongM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(MaDG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                                    .addComponent(NgayC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(GhiChu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel19, jLabel2, jLabel20, jLabel22, jLabel23, jLabel24, jLabel28, jLabel3, jLabel4, jLabel5});

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ChucVu, GhiChu1, HoTen, LuongC, LuongM, MaDC, MaDG, MaNV, PhuCapC, PhuCapM});

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTable_TTDC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã điều chỉnh", "Mã NV", "Họ tên", "Chức vụ", "Lương cũ", "Phụ cấp cũ", "Lương mới", "Phụ cấp mới", "Mã đánh giá", "Ngày chỉnh", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_TTDC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_TTDCMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_TTDC);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jTabbedPane1.addTab("Lộ Trình Thăng Tiến", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonThemLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemLActionPerformed
//        try {
//            String Sql1="insert into BangLuong(MaLuong, MaChucVu, LCB, PCChucVu, NgayNhap, LCBMoi, NgaySua, PCCVuMoi, NgaySuaPC, LyDo, GhiChu) values(?,?,?,?,?,?,?,?,?,?,?)";
//            conn = Database.getDBConnect();
//            pst = conn.prepareStatement(Sql1);
//            pst.setString(1, MaL.getText());
//            MaCVString = MaCV.getSelectedItem().toString();
//            pst.setString(2, MaCVString);
//            pst.setString(3, LuongCB.getText());
//            pst.setString(4, PhuCapCV.getText());
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            String NgayNhapString = sdf.format(NgayN.getDate());
//            pst.setString(5, NgayNhapString);
//            pst.setString(6, MucLuongMoi.getText());
//            String NgaySuaString = sdf.format(NgayS.getDate());
//            pst.setString(7, NgaySuaString);
//            pst.setString(8, PhuCapMoi.getText());
//            String NgaySuaPhuString = sdf.format(NgaySPC.getDate());
//            pst.setString(9, NgaySuaPhuString);
//            pst.setString(10, LyDo.getText());
//            pst.setString(11, GhiChu.getText());
//            pst.executeUpdate();
//            DefaultTableModel model1 = (DefaultTableModel)jTable_TTLuong.getModel();
//            model1.setRowCount(0);
//            show_TTL();
//            jOptionPane2.showMessageDialog(null, "Thêm thành công!");
//        } catch (Exception e) {
//            //            jOptionPane3.showMessageDialog(null, "Lỗi!" );
//            System.out.println("error" + e.toString());
//        }
        if(MaL.getText().isEmpty()){
            jOptionPane3.showMessageDialog(null, "Mã lương không được phép trống!",  "Thông báo", jOptionPane3.WARNING_MESSAGE);
        }
        else if(MaL.getText().isEmpty() || LuongCB.getText().isEmpty() ||  PhuCapCV.getText().isEmpty() || MucLuongMoi.getText().isEmpty() || PhuCapMoi.getText().isEmpty() || LyDo.getText().isEmpty() || GhiChu.getText().isEmpty() || NgayN.getDate() == null || NgayS.getDate() == null || NgaySPC.getDate() == null){
            jOptionPane3.showMessageDialog(null, "Vui lòng điền đủ thông tin!",  "Thông báo", jOptionPane3.WARNING_MESSAGE);
        }   
        
        else{  
            int row = jTable_TTLuong.getSelectedRow();
            TableModel model1 = jTable_TTLuong.getModel();        
            String MaLString = model1.getValueAt(row, 0).toString();
            String ML = MaL.getText().toString();
            if(ML.equalsIgnoreCase(MaLString)){
                jOptionPane3.showMessageDialog(null, "Mã lương đã tồn tại!",  "Thông báo", jOptionPane3.ERROR_MESSAGE);
            }
            else{
                try {
                    String Sql1="insert into BangLuong(MaLuong, MaChucVu, LCB, PCChucVu, NgayNhap, LCBMoi, NgaySua, PCCVuMoi, NgaySuaPC, LyDo, GhiChu) values(?,?,?,?,?,?,?,?,?,?,?)";
                    conn = Database.getDBConnect();
                    pst = conn.prepareStatement(Sql1);
                    pst.setString(1, MaL.getText());
                    MaCVString = MaCV.getSelectedItem().toString();
                    pst.setString(2, MaCVString);
                    pst.setString(3, LuongCB.getText());
                    pst.setString(4, PhuCapCV.getText());
                    try{
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    String NgayNhapString = sdf.format(NgayN.getDate());
                    pst.setString(5, NgayNhapString);
                    String NgaySuaString = sdf.format(NgayS.getDate());
                    pst.setString(7, NgaySuaString);
                    String NgaySuaPhuCapString = sdf.format(NgaySPC.getDate());
                    pst.setString(9, NgaySuaPhuCapString);
                    } catch (Exception e) {
                    jOptionPane3.showMessageDialog(null, "Lỗi ngày!",  "Thông báo", jOptionPane3.ERROR_MESSAGE );
                    }                       
                    pst.setString(6, MucLuongMoi.getText());                    
                    pst.setString(8, PhuCapMoi.getText());                   
                    pst.setString(10, LyDo.getText());
                    pst.setString(11, GhiChu.getText());
                    pst.executeUpdate();
                    DefaultTableModel model = (DefaultTableModel)jTable_TTLuong.getModel();
                    model.setRowCount(0);
                    show_TTL();
                    jOptionPane2.showMessageDialog(null, "Thêm thành công!", "Thông báo", jOptionPane2.INFORMATION_MESSAGE);          
                } catch (Exception e) {
                    jOptionPane3.showMessageDialog(null, "Lỗi khi thêm dữ liệu!",  "Thông báo", jOptionPane3.ERROR_MESSAGE );
    //                System.out.println("error" + e.toString());
                } 
            }
        }
    }//GEN-LAST:event_jButtonThemLActionPerformed

    private void jButtonSuaLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuaLActionPerformed
//        try {
//            String Sql1="update BangLuong set MaChucVu = ?, LCB = ?, PCChucVu = ?, NgayNhap = ?, LCBMoi = ?, NgaySua = ?, PCCVuMoi = ?, NgaySuaPC = ?, LyDo = ?, GhiChu = ? where MaLuong = ?";
//            conn = Database.getDBConnect();
//            pst = conn.prepareStatement(Sql1);
//            MaCVString = MaCV.getSelectedItem().toString();
//            pst.setString(1, MaCVString);
//            pst.setString(2, LuongCB.getText());
//            pst.setString(3, PhuCapCV.getText());
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            String NgayNhapString = sdf.format(NgayN.getDate());
//            pst.setString(4, NgayNhapString);
//            pst.setString(5, MucLuongMoi.getText());
//            String NgaySuaString = sdf.format(NgayS.getDate());
//            pst.setString(6, NgaySuaString);
//            pst.setString(7, PhuCapMoi.getText());
//            String NgaySuaPhuString = sdf.format(NgaySPC.getDate());
//            pst.setString(8, NgaySuaPhuString);
//            pst.setString(9, LyDo.getText());
//            pst.setString(10, GhiChu.getText());
//            pst.setString(11, MaL.getText());
//            pst.executeUpdate();
//            DefaultTableModel model1 = (DefaultTableModel)jTable_TTLuong.getModel();
//            model1.setRowCount(0);
//            show_TTL();
//            jOptionPane2.showMessageDialog(null, "Sửa thành công!");
//        } catch (Exception e) {
//            //            jOptionPane3.showMessageDialog(null, "Lỗi!" );
//            System.out.println("error" + e.toString());
//        }
 int row = jTable_TTLuong.getSelectedRow();        
        if(row == -1){
            jOptionPane3.showMessageDialog(null, "Vui lòng chọn hàng cần sửa!", "Thông báo", jOptionPane3.WARNING_MESSAGE);            
        }  
        else if( MaL.getText().isEmpty() || LuongCB.getText().isEmpty() ||  PhuCapCV.getText().isEmpty() || MucLuongMoi.getText().isEmpty() || PhuCapMoi.getText().isEmpty() || LyDo.getText().isEmpty() || GhiChu.getText().isEmpty() || NgayN.getDate() == null || NgayS.getDate() == null || NgaySPC.getDate() == null){
            jOptionPane3.showMessageDialog(null, "Vui lòng điền đủ thông tin!",  "Thông báo", jOptionPane3.WARNING_MESSAGE);
        }     

        else{
            int confirm = jOptionPane3.showConfirmDialog(null, "Bạn thực sự muốn sửa?", "Thông báo", jOptionPane3.YES_NO_OPTION);
            if(confirm == 0){
                try {
                    String Sql1="update BangLuong set MaChucVu = ?, LCB = ?, PCChucVu = ?, NgayNhap = ?, LCBMoi = ?, NgaySua = ?, PCCVuMoi = ?, NgaySuaPC = ?, LyDo = ?, GhiChu = ? where MaLuong = ?";
                    conn = Database.getDBConnect();
                    pst = conn.prepareStatement(Sql1);
                    MaCVString = MaCV.getSelectedItem().toString();
                    pst.setString(1, MaCVString);
                    pst.setString(2, LuongCB.getText());
                    pst.setString(3, PhuCapCV.getText());
                    try{
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    String NgayNhapString = sdf.format(NgayN.getDate());
                    pst.setString(4, NgayNhapString);
                    String NgaySuaString = sdf.format(NgayS.getDate());
                    pst.setString(6, NgaySuaString);
                    String NgaySuaPhuCapString = sdf.format(NgaySPC.getDate());
                    pst.setString(8, NgaySuaPhuCapString);
                    } catch (Exception e) {
                    jOptionPane3.showMessageDialog(null, "Lỗi ngày!",  "Thông báo", jOptionPane3.ERROR_MESSAGE );
                    }                       
                    pst.setString(5, MucLuongMoi.getText());                    
                    pst.setString(7, PhuCapMoi.getText());                   
                    pst.setString(9, LyDo.getText());
                    pst.setString(10, GhiChu.getText());
                    pst.setString(11, MaL.getText());
                    pst.executeUpdate();
                    DefaultTableModel model1 = (DefaultTableModel)jTable_TTLuong.getModel();
                    model1.setRowCount(0);
                    show_TTL();
                    jOptionPane2.showMessageDialog(null, "Sửa thành công!", "Thông báo", jOptionPane2.INFORMATION_MESSAGE);          
                } catch (Exception e) {
                    jOptionPane3.showMessageDialog(null, "Lỗi khi sửa liệu!", "Thông báo", jOptionPane3.ERROR_MESSAGE);      
    //                System.out.println("error" + e.toString());
                }
            }
        }
    }//GEN-LAST:event_jButtonSuaLActionPerformed

    private void jButtonXoaLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaLActionPerformed
//        try {               
//            conn = Database.getDBConnect();
//            String sql = "delete from BangLuong where MaLuong =?" ;
//            pst = conn.prepareStatement(sql);
//            pst.setString(1, MaL.getText());            
//            pst.executeUpdate();
//            DefaultTableModel model1 = (DefaultTableModel)jTable_TTLuong.getModel();
//            model1.setRowCount(0);
//            show_TTL();
//            jOptionPane2.showMessageDialog(null, "Xóa thành công!");
//        } catch (Exception e) {
//            //            jOptionPane3.showMessageDialog(null, "Lỗi!");
//            System.out.println("error" + e.toString());
//        }
         int row = jTable_TTLuong.getSelectedRow();
        if(row == -1){
            jOptionPane3.showMessageDialog(null, "Vui lòng chọn hàng cần xóa!", "Thông báo", jOptionPane3.WARNING_MESSAGE);
        }
        else{
            int confirm = jOptionPane3.showConfirmDialog(null, "Bạn thực sự muốn xóa?", "Thông báo", jOptionPane3.YES_NO_OPTION);
            if(confirm == 0){
                try {               
                    conn = Database.getDBConnect();
                    String sql = "delete from BangLuong where MaLuong =?" ;
                    pst = conn.prepareStatement(sql);
                    pst.setString(1, MaL.getText());            
                    pst.executeUpdate();
                    DefaultTableModel model1 = (DefaultTableModel)jTable_TTLuong.getModel();
                    model1.setRowCount(0);
                    show_TTL();
                    jOptionPane2.showMessageDialog(null, "Xóa thành công!", "Thông báo", jOptionPane2.INFORMATION_MESSAGE);          
                } catch (Exception e) {
                    jOptionPane3.showMessageDialog(null, "Lỗi khi xóa dữ liệu!", "Thông báo", jOptionPane3.ERROR_MESSAGE);
//                 System.out.println("error" + e.toString());   
                }
            }
        }               
    }//GEN-LAST:event_jButtonXoaLActionPerformed

    private void jButtonRefreshLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshLActionPerformed
        MaL.setText("");
        MaCV.setSelectedIndex(0);
        LuongCB.setText("");
        PhuCapCV.setText("");       
        NgayN.setDate(null);
        MucLuongMoi.setText("");
        NgayS.setDate(null);      
        PhuCapMoi.setText("");
        NgaySPC.setDate(null);
        LyDo.setText("");
        GhiChu.setText("");
    }//GEN-LAST:event_jButtonRefreshLActionPerformed

    private void jTable_TTLuongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_TTLuongMouseClicked
        int row = jTable_TTLuong.getSelectedRow();
        TableModel model = jTable_TTLuong.getModel();
        MaL.setText(model.getValueAt(row, 0).toString());
        LuongCB.setText(model.getValueAt(row, 2).toString());
        PhuCapCV.setText(model.getValueAt(row, 3).toString());
        try{
            Date NgayNhap = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(row, 4));
            NgayN.setDate(NgayNhap);
            Date NgaySua = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(row, 6));
            NgayS.setDate(NgaySua);
            Date NgaySuaPC = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(row, 8));
            NgaySPC.setDate(NgaySuaPC);
        }
        catch (Exception e) {
            jOptionPane1.showMessageDialog(null, e);
        } 
        MucLuongMoi.setText(model.getValueAt(row, 5).toString());
        PhuCapMoi.setText(model.getValueAt(row, 7).toString());
        LyDo.setText(model.getValueAt(row, 9).toString());
        GhiChu.setText(model.getValueAt(row, 10).toString());         
        MaCVString = model.getValueAt(row, 1).toString();
        int i = 0;
        while (true) {
            String MCV = MaCV.getItemAt(i).toString();
            if(MCV.equalsIgnoreCase(MaCVString)){
                MaCV.setSelectedIndex(i);
                break;
            }
            i++;        
        }
    }//GEN-LAST:event_jTable_TTLuongMouseClicked

    private void jButtonThemL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemL1ActionPerformed
           
//        try {
//            String Sql1="insert into DieuChinhLuong(MaDieuChinh, MaNV, HoTen, ChucVu, LCBCu, PCapCu, LCBMoi, PcapMoi, MaDG, NgayDC, GhiChu) values (?,?,?,?,?,?,?,?,?,?,?)";
//            conn = Database.getDBConnect();
//            pst = conn.prepareStatement(Sql1);
//            pst.setString(1, MaDC.getText()); 
//            pst.setString(2, MaNV.getText());
//            pst.setString(3, HoTen.getText());
//            MaCVStringg = ChucVu.getSelectedItem().toString();
//            pst.setString(4, MaCVStringg);
//            pst.setString(5, LuongC.getText());
//            pst.setString(6, PhuCapC.getText());
//            pst.setString(7, LuongM.getText());
//            pst.setString(8, PhuCapM.getText());
//            pst.setString(9, MaDG.getText());
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            String NgayString = sdf.format(NgayC.getDate());
//            pst.setString(10, NgayString);
//            pst.setString(11, GhiChu1.getText());             
//            pst.executeUpdate();
//            DefaultTableModel model1 = (DefaultTableModel)jTable_TTDC.getModel();
//            model1.setRowCount(0);
//            show_TTDC();
//            jOptionPane2.showMessageDialog(null, "Thêm thành công!");
//        } catch (Exception e) {
//                        jOptionPane3.showMessageDialog(null, "Lỗi!" );
////            System.out.println("error" + e.toString());
//        }
 if(MaDC.getText().isEmpty()){
            jOptionPane3.showMessageDialog(null, "Mã điều chỉnh không được phép trống!",  "Thông báo", jOptionPane3.WARNING_MESSAGE);
        }
        else if(MaDC.getText().isEmpty() || MaNV.getText().isEmpty() ||  HoTen.getText().isEmpty() || LuongC.getText().isEmpty() || PhuCapC.getText().isEmpty() || LuongM.getText().isEmpty() || PhuCapM.getText().isEmpty() || MaDG.getText().isEmpty() || GhiChu1.getText().isEmpty() || NgayC.getDate() == null){
            jOptionPane3.showMessageDialog(null, "Vui lòng điền đủ thông tin!",  "Thông báo", jOptionPane3.WARNING_MESSAGE);
        }   
        
        else{  
            int row = jTable_TTDC.getSelectedRow();
            TableModel model1 = jTable_TTDC.getModel();        
            String MaDCString = model1.getValueAt(row, 0).toString();
            String MDC = MaDC.getText().toString();
            if(MDC.equalsIgnoreCase(MaDCString)){
                jOptionPane3.showMessageDialog(null, "Mã điều chỉnh đã tồn tại!",  "Thông báo", jOptionPane3.ERROR_MESSAGE);
            }
            else{
                try {
                    String Sql1="insert into DieuChinhLuong(MaDieuChinh, MaNV, HoTen, ChucVu, LCBCu, PCapCu, LCBMoi, PcapMoi, MaDG, NgayDC, GhiChu) values (?,?,?,?,?,?,?,?,?,?,?)";
                    conn = Database.getDBConnect();
                    pst = conn.prepareStatement(Sql1);
                    pst.setString(1, MaDC.getText()); 
                    pst.setString(2, MaNV.getText());
                    pst.setString(3, HoTen.getText());
                    MaCVStringg = ChucVu.getSelectedItem().toString();
                    pst.setString(4, MaCVStringg);
                    pst.setString(5, LuongC.getText());
                    pst.setString(6, PhuCapC.getText());
                    pst.setString(7, LuongM.getText());
                    pst.setString(8, PhuCapM.getText());
                    pst.setString(9, MaDG.getText());
                    try{
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    String NgayString = sdf.format(NgayC.getDate());
                    pst.setString(10, NgayString);
                    }catch(Exception e){
                        jOptionPane3.showMessageDialog(null, "Lỗi ngày!",  "Thông báo", jOptionPane3.ERROR_MESSAGE );
                    }
                    pst.setString(11, GhiChu1.getText());             
                    pst.executeUpdate();
                    DefaultTableModel model = (DefaultTableModel)jTable_TTDC.getModel();
                    model.setRowCount(0);
                    show_TTDC();
                    jOptionPane2.showMessageDialog(null, "Thêm thành công!", "Thông báo", jOptionPane2.INFORMATION_MESSAGE);          
                } catch (Exception e) {
                    jOptionPane3.showMessageDialog(null, "Lỗi khi thêm dữ liệu!",  "Thông báo", jOptionPane3.ERROR_MESSAGE );
//                    System.out.println("error" + e.toString());
                }
            }
        }
    }//GEN-LAST:event_jButtonThemL1ActionPerformed

    private void jButtonSuaL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuaL1ActionPerformed
//        try {
//            String Sql1="update DieuChinhLuong set MaNV = ?, HoTen = ?, ChucVu = ?, LCBCu = ?, PCapCu = ?, LCBMoi = ?, PcapMoi = ?, MaDG = ?, NgayDC = ?, GhiChu = ? where MaDieuChinh = ?";
//            conn = Database.getDBConnect();
//            pst = conn.prepareStatement(Sql1);
//            pst.setString(1, MaNV.getText());
//            pst.setString(2, HoTen.getText());
//            MaCVStringg = ChucVu.getSelectedItem().toString();
//            pst.setString(3, MaCVStringg);
//            pst.setString(4, LuongC.getText());
//            pst.setString(5, PhuCapC.getText());
//            pst.setString(6, LuongM.getText());
//            pst.setString(7, PhuCapM.getText());
//            pst.setString(8, MaDG.getText());
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            String NgayString = sdf.format(NgayC.getDate());
//            pst.setString(9, NgayString);
//            pst.setString(10, GhiChu1.getText());
//            pst.setString(11, MaDC.getText());  
//            pst.executeUpdate();
//            DefaultTableModel model1 = (DefaultTableModel)jTable_TTDC.getModel();
//            model1.setRowCount(0);
//            show_TTDC();
//            jOptionPane2.showMessageDialog(null, "Thêm thành công!");
//        } catch (Exception e) {
//                        jOptionPane3.showMessageDialog(null, "Lỗi!" );
////            System.out.println("error" + e.toString());
//        }
 int row = jTable_TTDC.getSelectedRow();        
        if(row == -1){
            jOptionPane3.showMessageDialog(null, "Vui lòng chọn hàng cần sửa!", "Thông báo", jOptionPane3.WARNING_MESSAGE);            
        }  
        else if(MaDC.getText().isEmpty() || MaNV.getText().isEmpty() ||  HoTen.getText().isEmpty() || LuongC.getText().isEmpty() || PhuCapC.getText().isEmpty() || LuongM.getText().isEmpty() || PhuCapM.getText().isEmpty() || MaDG.getText().isEmpty() || GhiChu1.getText().isEmpty() || NgayC.getDate() == null){
            jOptionPane3.showMessageDialog(null, "Vui lòng điền đủ thông tin!",  "Thông báo", jOptionPane3.WARNING_MESSAGE);
        }     
        else{
            int confirm = jOptionPane3.showConfirmDialog(null, "Bạn thực sự muốn sửa?", "Thông báo", jOptionPane3.YES_NO_OPTION);
            if(confirm == 0){
                try {
                    String Sql1="update DieuChinhLuong set MaNV = ?, HoTen = ?, ChucVu = ?, LCBCu = ?, PCapCu = ?, LCBMoi = ?, PcapMoi = ?, MaDG = ?, NgayDC = ?, GhiChu = ? where MaDieuChinh = ?";
                    conn = Database.getDBConnect();
                    pst = conn.prepareStatement(Sql1);
                    pst.setString(1, MaNV.getText());
                    pst.setString(2, HoTen.getText());
                    MaCVStringg = ChucVu.getSelectedItem().toString();
                    pst.setString(3, MaCVStringg);
                    pst.setString(4, LuongC.getText());
                    pst.setString(5, PhuCapC.getText());
                    pst.setString(6, LuongM.getText());
                    pst.setString(7, PhuCapM.getText());
                    pst.setString(8, MaDG.getText());
                    try{
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        String NgayString = sdf.format(NgayC.getDate());
                        pst.setString(9, NgayString);
                        }catch(Exception e){
                            jOptionPane3.showMessageDialog(null, "Lỗi ngày!",  "Thông báo", jOptionPane3.ERROR_MESSAGE );
                    }
                    pst.setString(10, GhiChu1.getText());
                    pst.setString(11, MaDC.getText());  
                    pst.executeUpdate();
                    DefaultTableModel model1 = (DefaultTableModel)jTable_TTDC.getModel();
                    model1.setRowCount(0);
                    show_TTDC();
                    jOptionPane2.showMessageDialog(null, "Sửa thành công!", "Thông báo", jOptionPane2.INFORMATION_MESSAGE);          
                } catch (Exception e) {
                    jOptionPane3.showMessageDialog(null, "Lỗi khi sửa liệu!", "Thông báo", jOptionPane3.ERROR_MESSAGE);      
//                    System.out.println("error" + e.toString());
                }
            }
        }          

    }//GEN-LAST:event_jButtonSuaL1ActionPerformed

    private void jButtonXoaL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaL1ActionPerformed
        try {               
            conn = Database.getDBConnect();
            String sql = "delete from DieuChinhLuong where MaDieuChinh = ?" ;
            pst = conn.prepareStatement(sql);
            pst.setString(1, MaDC.getText());            
            pst.executeUpdate();
            DefaultTableModel model1 = (DefaultTableModel)jTable_TTDC.getModel();
            model1.setRowCount(0);
            show_TTDC();
            jOptionPane2.showMessageDialog(null, "Xóa thành công!");
        } catch (Exception e) {
            //            jOptionPane3.showMessageDialog(null, "Lỗi!");
            System.out.println("error" + e.toString());
        }
    }//GEN-LAST:event_jButtonXoaL1ActionPerformed

    private void jButtonRefreshL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshL1ActionPerformed
        MaDC.setText("");        
        MaNV.setText("");
        HoTen.setText("");   
        ChucVu.setSelectedIndex(0);
        LuongC.setText("");
        PhuCapC.setText("");
        LuongM.setText("");
        PhuCapM.setText("");
        MaDG.setText("");
        NgayC.setDate(null);    
        GhiChu1.setText("");
    }//GEN-LAST:event_jButtonRefreshL1ActionPerformed

    private void jTable_TTDCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_TTDCMouseClicked
        int row = jTable_TTDC.getSelectedRow();
        TableModel model = jTable_TTDC.getModel();
        MaDC.setText(model.getValueAt(row, 0).toString());
        MaNV.setText(model.getValueAt(row, 1).toString());
        HoTen.setText(model.getValueAt(row, 2).toString());
        MaCVStringg = model.getValueAt(row, 3).toString();
        int i = 0;
        while (true) {
            String CV = ChucVu.getItemAt(i).toString();
            if(CV.equalsIgnoreCase(MaCVStringg)){
                ChucVu.setSelectedIndex(i);
                break;
            }
            i++; 
        }
        LuongC.setText(model.getValueAt(row, 4).toString());
        PhuCapC.setText(model.getValueAt(row, 5).toString());
        LuongM.setText(model.getValueAt(row, 6).toString());
        PhuCapM.setText(model.getValueAt(row, 7).toString());
        MaDG.setText(model.getValueAt(row, 8).toString());
        try{
        Date Ngay = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(row, 9));
        NgayC.setDate(Ngay);
        }
        catch (Exception e) {
            jOptionPane1.showMessageDialog(null, e);
        } 
        GhiChu1.setText(model.getValueAt(row, 10).toString());                         
    }//GEN-LAST:event_jTable_TTDCMouseClicked

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnexitActionPerformed

    private void jexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jexitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jexitActionPerformed

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
            java.util.logging.Logger.getLogger(Luong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Luong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Luong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Luong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 Luong Luong = new Luong();
                 Luong.setLocationRelativeTo(null);
                 Luong.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ChucVu;
    private javax.swing.JTextField GhiChu;
    private javax.swing.JTextField GhiChu1;
    private javax.swing.JTextField HoTen;
    private javax.swing.JTextField LuongC;
    private javax.swing.JTextField LuongCB;
    private javax.swing.JTextField LuongM;
    private javax.swing.JTextField LyDo;
    private javax.swing.JComboBox<String> MaCV;
    private javax.swing.JTextField MaDC;
    private javax.swing.JTextField MaDG;
    private javax.swing.JTextField MaL;
    private javax.swing.JTextField MaNV;
    private javax.swing.JTextField MucLuongMoi;
    private com.toedter.calendar.JDateChooser NgayC;
    private com.toedter.calendar.JDateChooser NgayN;
    private com.toedter.calendar.JDateChooser NgayS;
    private com.toedter.calendar.JDateChooser NgaySPC;
    private javax.swing.JTextField PhuCapC;
    private javax.swing.JTextField PhuCapCV;
    private javax.swing.JTextField PhuCapM;
    private javax.swing.JTextField PhuCapMoi;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton jButtonRefreshL;
    private javax.swing.JButton jButtonRefreshL1;
    private javax.swing.JButton jButtonSuaL;
    private javax.swing.JButton jButtonSuaL1;
    private javax.swing.JButton jButtonThemL;
    private javax.swing.JButton jButtonThemL1;
    private javax.swing.JButton jButtonXoaL;
    private javax.swing.JButton jButtonXoaL1;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JOptionPane jOptionPane2;
    private javax.swing.JOptionPane jOptionPane3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable_TTDC;
    private javax.swing.JTable jTable_TTLuong;
    private javax.swing.JButton jexit;
    // End of variables declaration//GEN-END:variables

}
