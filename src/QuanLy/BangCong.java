/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLy;

import ConnectToSql.Database;
import DanhMuc.NhanSu;
import Models.TTDieuHanh;
import Models.TTThuViec;
import Models.TTVanPhong;
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
public class BangCong extends javax.swing.JFrame {
    Database dt = new Database();
    Connection conn = null;
    PreparedStatement pst = null;
    
    String MaBPString;
    String MaPBString;
    public BangCong() {
        initComponents();
        show_TTBC();
        show_TTDH();
        show_TTVP();
    }
    /*Thu viec*/
    public ArrayList<TTThuViec> TTBCsList(){
        ArrayList<TTThuViec> TTBCsList = new ArrayList<>();
        try{
            conn = Database.getDBConnect();
            String sql = "select * from BangCongThuViec";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            TTThuViec BC;
            while (rs.next()) {                
                BC = new TTThuViec(rs.getString("MaBangCongTV"), rs.getString("MaBoPhan"), rs.getString("MaPhongBan"), rs.getString("MaNV"), rs.getString("LuongTViec"), rs.getString("ThoiGian"), rs.getString("SoNgayCong"), rs.getString("SoNgayNghi"), rs.getString("SoGioLamThem"), rs.getString("GhiChu"));
                TTBCsList.add(BC);
            }
            return  TTBCsList;
        }
        catch(Exception e){
            jOptionPane1.showMessageDialog(null, "Lỗi!");
        }
        return null;
    }
    public void show_TTBC(){
        ArrayList<TTThuViec> list = TTBCsList();
        DefaultTableModel model = (DefaultTableModel)jTable_TTBC.getModel();
        for(TTThuViec o : list){
            model.addRow(new Object[]{o.getMaBangCongTV(), o.getMaBoPhan(), o.getMaPhongBan(), o.getMaNV(), o.getLuongTViec(), o.getThoiGian(),o.getSoNgayCong(), o.getSoNgayNghi(), o.getSoGioLamThem(), o.getGhiChu()});
        }
    }
    /*Dieu hanh*/
    public ArrayList<TTDieuHanh> TTDHsList(){
        ArrayList<TTDieuHanh> TTDHsList = new ArrayList<>();
        try{
            conn = Database.getDBConnect();
            String sql = "select * from CongKhoiDieuHanh";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            TTDieuHanh DH;
            while (rs.next()) {                
                DH = new TTDieuHanh( rs.getString("MaNV"), rs.getString("LCB"), rs.getString("PhuCapCVu"), rs.getString("PHuCapKhac"),rs.getString("ThoiGian") ,rs.getString("SoNgayCongThang") ,rs.getString("SoNgayNghi"), rs.getString("SoGioLamThem"), rs.getString("GhiChu"));
                TTDHsList.add(DH);
            }
            return  TTDHsList;
        }
        catch(Exception e){
            jOptionPane1.showMessageDialog(null, "Lỗi!");
        }
        return null;
    }
    public void show_TTDH(){
        ArrayList<TTDieuHanh> list = TTDHsList();
        DefaultTableModel model = (DefaultTableModel)jTable_TTDH.getModel();
        for(TTDieuHanh o : list){
            model.addRow(new Object[]{ o.getMaNV(), o.getLCB(), o.getPhuCapCVu(), o.getPHuCapKhac(), o.getThoiGian(), o.getSoNgayCongThang(), o.getSoNgayNghi(), o.getSoGioLamThem(), o.getGhiChu()});
        }
    }
    /*VanPhong*/
    public ArrayList<TTVanPhong> TTVPsList(){
        ArrayList<TTVanPhong> TTVPsList = new ArrayList<>();
        try{
            conn = Database.getDBConnect();
            String sql = "select * from CongKhoiVanPhong";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            TTVanPhong VP;
            while (rs.next()) {                
                VP = new TTVanPhong( rs.getString("MaNV"), rs.getString("LCB"), rs.getString("PhuCapCVu"), rs.getString("PhuCapKhac"),rs.getString("ThoiGian") ,rs.getString("SoNgayCongThang") ,rs.getString("SoNgayNghi"), rs.getString("SoGioLamThem"), rs.getString("GhiChu"));
                TTVPsList.add(VP);
            }
            return  TTVPsList;
        }
        catch(Exception e){
            jOptionPane1.showMessageDialog(null, "Lỗi!");
        }
        return null;
    }
    public void show_TTVP(){
        ArrayList<TTVanPhong> list = TTVPsList();
        DefaultTableModel model = (DefaultTableModel)jTable_TTVP.getModel();
        for(TTVanPhong o : list){
            model.addRow(new Object[]{ o.getMaNV(), o.getLCB(), o.getPhuCapCVu(), o.getPhuCapKhac(), o.getThoiGian(), o.getSoNgayCongThang(), o.getSoNgayNghi(), o.getSoGioLamThem(), o.getGhiChu()});
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jOptionPane2 = new javax.swing.JOptionPane();
        jOptionPane3 = new javax.swing.JOptionPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButtonThemBC = new javax.swing.JButton();
        jButtonSuaBC = new javax.swing.JButton();
        jButtonXoaBC = new javax.swing.JButton();
        jButtonRefreshBC = new javax.swing.JButton();
        jexit = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        LuongTV = new javax.swing.JTextField();
        MaBC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        SoNC = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SoGLT = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        GhiChu = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        MaBP = new javax.swing.JComboBox<>();
        MaPB = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        SoNN = new javax.swing.JTextField();
        MaNV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ThoiGian = new com.toedter.calendar.JDateChooser();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_TTBC = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        maNV = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        LuongCB = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        PhuCapCV = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        PhuCapK = new javax.swing.JTextField();
        SoNgayCong = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        SoGioLamThem = new javax.swing.JTextField();
        SoNgayNghi = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        GhiChu1 = new javax.swing.JTextField();
        thoigian = new com.toedter.calendar.JDateChooser();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_TTDH = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jButtonThemDH = new javax.swing.JButton();
        jButtonSuaDH = new javax.swing.JButton();
        jButtonXoaDH = new javax.swing.JButton();
        jButtonRefreshDH = new javax.swing.JButton();
        jexitt = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        PCchucvu = new javax.swing.JTextField();
        Luongcoban = new javax.swing.JTextField();
        Manv = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        PCkhac = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        Songaycong = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        Songaynghi = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        Sogiolamthem = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        GhiChu2 = new javax.swing.JTextField();
        Thoigian = new com.toedter.calendar.JDateChooser();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jButtonThemVP = new javax.swing.JButton();
        jButtonSuaVP = new javax.swing.JButton();
        jButtonXoaVP = new javax.swing.JButton();
        jButtonRefreshVP = new javax.swing.JButton();
        jButtonRefreshVP1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_TTVP = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jPanel12.setBackground(new java.awt.Color(204, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức Năng"));

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));

        jButtonThemBC.setBackground(new java.awt.Color(255, 255, 102));
        jButtonThemBC.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonThemBC.setForeground(new java.awt.Color(255, 51, 51));
        jButtonThemBC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/add_user.png"))); // NOI18N
        jButtonThemBC.setText("Thêm");
        jButtonThemBC.setMaximumSize(new java.awt.Dimension(70, 25));
        jButtonThemBC.setMinimumSize(new java.awt.Dimension(70, 25));
        jButtonThemBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemBCActionPerformed(evt);
            }
        });

        jButtonSuaBC.setBackground(new java.awt.Color(255, 255, 102));
        jButtonSuaBC.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonSuaBC.setForeground(new java.awt.Color(255, 51, 51));
        jButtonSuaBC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/edit_user.png"))); // NOI18N
        jButtonSuaBC.setText("Sửa");
        jButtonSuaBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuaBCActionPerformed(evt);
            }
        });

        jButtonXoaBC.setBackground(new java.awt.Color(255, 255, 102));
        jButtonXoaBC.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonXoaBC.setForeground(new java.awt.Color(255, 51, 51));
        jButtonXoaBC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/remove_user.png"))); // NOI18N
        jButtonXoaBC.setText("Xóa");
        jButtonXoaBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaBCActionPerformed(evt);
            }
        });

        jButtonRefreshBC.setBackground(new java.awt.Color(255, 255, 102));
        jButtonRefreshBC.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonRefreshBC.setForeground(new java.awt.Color(255, 51, 51));
        jButtonRefreshBC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/upload.png"))); // NOI18N
        jButtonRefreshBC.setText("Làm mới");
        jButtonRefreshBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshBCActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jButtonThemBC, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButtonSuaBC, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButtonXoaBC, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButtonRefreshBC, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jexit, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonThemBC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSuaBC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonXoaBC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRefreshBC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jexit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );

        jPanel13.setBackground(new java.awt.Color(95, 204, 204));

        jPanel14.setBackground(new java.awt.Color(95, 204, 204));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Mã phòng ban ");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Mã bộ phận");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Lương thử việc");

        LuongTV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        MaBC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        MaBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaBCActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Thời gian");

        SoNC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Số ngày công");

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel32.setText("Mã bảng công");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Số giờ làm thêm");

        SoGLT.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Ghi chú");

        GhiChu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        MaBP.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        MaBP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MB001     ", "MB002     ", "MB003     ", "MB004     ", "MB005     ", "MB006     ", "MB007     ", "MB008     ", "MB009     ", "MB010     "  }));

        MaPB.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        MaPB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P001      ", "P002      ", "P003      ", "P004      ", "P005      ", "P006      ", "P007      ", "P008      ", "P009      ", "P010      ", "P011      ", "P012      " }));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Số ngày nghỉ");

        SoNN.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        SoNN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoNNActionPerformed(evt);
            }
        });

        MaNV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Mã NV");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MaNV))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MaPB, 0, 162, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MaBP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MaBC))))
                .addGap(40, 40, 40)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SoNC, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(SoNN)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LuongTV))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ThoiGian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SoGLT, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(GhiChu)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel14Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel10, jLabel2, jLabel3, jLabel32, jLabel4, jLabel6, jLabel7, jLabel8, jLabel9});

        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(LuongTV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(SoGLT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ThoiGian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel14Layout.createSequentialGroup()
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(MaBC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel32))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(MaBP, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(GhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)))))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(MaPB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(SoNC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(SoNN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel14Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel10, jLabel2, jLabel3, jLabel32, jLabel4, jLabel6, jLabel7, jLabel8, jLabel9});

        jPanel14Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {GhiChu, LuongTV, MaBC, MaBP, MaNV, MaPB, SoGLT, SoNC, SoNN});

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 51, 51));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("BẢNG CÔNG THỬ VIỆC");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTable_TTBC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable_TTBC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã bảng công", "Mã bộ phận", "Mã phòng ban", "Mã NV", "Lương thử việc", "Thời gian", "Số ngày công", "Số ngày nghỉ", "Số giờ làm thêm", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_TTBC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_TTBCMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_TTBC);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thử Việc", jPanel1);

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));

        jPanel15.setBackground(new java.awt.Color(255, 255, 204));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Mã NV");

        maNV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Lương cơ bản");

        LuongCB.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        LuongCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuongCBActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Phụ cấp chức vụ");

        PhuCapCV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Thời gian");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("Phụ cấp khác");

        PhuCapK.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        SoNgayCong.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        SoNgayCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoNgayCongActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setText("Số ngày công");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setText("Số ngày nghỉ");

        SoGioLamThem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        SoNgayNghi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setText("Số giờ làm thêm");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel20.setText("Ghi chú");

        GhiChu1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LuongCB, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(PhuCapCV)
                    .addComponent(maNV))
                .addGap(40, 40, 40)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SoNgayCong, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(PhuCapK, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(thoigian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GhiChu1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SoNgayNghi)
                            .addComponent(SoGioLamThem))))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(maNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(PhuCapK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18)
                        .addComponent(SoNgayNghi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(LuongCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(thoigian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(PhuCapCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(SoNgayCong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SoGioLamThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GhiChu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {GhiChu1, LuongCB, PhuCapCV, PhuCapK, SoGioLamThem, SoNgayCong, SoNgayNghi, jLabel11, jLabel12, jLabel13, jLabel16, jLabel17, jLabel18, jLabel19, jLabel20, maNV});

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 51, 51));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("BẢNG CÔNG KHỐI ĐIỀU HÀNH");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTable_TTDH.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable_TTDH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NV", "Lương cơ bản", "Phụ cấp chức vụ", "Phụ cấp khác", "Thời gian", "Số  ngày công", "Số ngày nghỉ", "Số giờ làm thêm", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_TTDH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_TTDHMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_TTDH);

        jPanel6.setBackground(new java.awt.Color(204, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức Năng"));
        jPanel6.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        jPanel16.setBackground(new java.awt.Color(204, 255, 255));

        jButtonThemDH.setBackground(new java.awt.Color(255, 255, 102));
        jButtonThemDH.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonThemDH.setForeground(new java.awt.Color(255, 51, 51));
        jButtonThemDH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/add_user.png"))); // NOI18N
        jButtonThemDH.setText("Thêm");
        jButtonThemDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemDHActionPerformed(evt);
            }
        });

        jButtonSuaDH.setBackground(new java.awt.Color(255, 255, 102));
        jButtonSuaDH.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonSuaDH.setForeground(new java.awt.Color(255, 51, 51));
        jButtonSuaDH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/edit_user.png"))); // NOI18N
        jButtonSuaDH.setText("Sửa");
        jButtonSuaDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuaDHActionPerformed(evt);
            }
        });

        jButtonXoaDH.setBackground(new java.awt.Color(255, 255, 102));
        jButtonXoaDH.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonXoaDH.setForeground(new java.awt.Color(255, 51, 51));
        jButtonXoaDH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/remove_user.png"))); // NOI18N
        jButtonXoaDH.setText("Xóa");
        jButtonXoaDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaDHActionPerformed(evt);
            }
        });

        jButtonRefreshDH.setBackground(new java.awt.Color(255, 255, 102));
        jButtonRefreshDH.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonRefreshDH.setForeground(new java.awt.Color(255, 51, 51));
        jButtonRefreshDH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/upload.png"))); // NOI18N
        jButtonRefreshDH.setText("Làm mới");
        jButtonRefreshDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshDHActionPerformed(evt);
            }
        });

        jexitt.setBackground(new java.awt.Color(255, 255, 102));
        jexitt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jexitt.setForeground(new java.awt.Color(255, 51, 51));
        jexitt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/close1.png"))); // NOI18N
        jexitt.setText("Exit");
        jexitt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jexittActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jButtonThemDH, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButtonSuaDH, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButtonXoaDH, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButtonRefreshDH, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jexitt, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonThemDH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSuaDH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonXoaDH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRefreshDH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jexitt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Điều Hành", jPanel2);

        jPanel7.setBackground(new java.awt.Color(255, 255, 204));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 51, 51));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("BẢNG CÔNG KHỐI VĂN PHÒNG");

        jPanel19.setBackground(new java.awt.Color(255, 255, 204));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel21.setText("Mã NV");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel23.setText("Phụ cấp chức vụ");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel22.setText("Lương cơ bản");

        PCchucvu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        Luongcoban.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        Manv.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel29.setText("Phụ cấp khác");

        PCkhac.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        PCkhac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PCkhacActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel25.setText("Số ngày nghỉ");

        Songaycong.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel24.setText("Số ngày công");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel27.setText("Thời gian");

        Songaynghi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel26.setText("Số giờ làm thêm");

        Sogiolamthem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel30.setText("Ghi chú");

        GhiChu2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PCchucvu, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Luongcoban))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Manv)))
                .addGap(45, 45, 45)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Songaycong, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(PCkhac)
                    .addComponent(Thoigian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Songaynghi, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sogiolamthem))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GhiChu2)))
                .addContainerGap())
        );

        jPanel19Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel21, jLabel22, jLabel23, jLabel24, jLabel25, jLabel26, jLabel27, jLabel29, jLabel30});

        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(Manv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel25)
                        .addComponent(Songaynghi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PCkhac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel29)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Thoigian, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel22)
                                .addComponent(Luongcoban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel27)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PCchucvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(Songaycong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(jLabel30)
                            .addComponent(GhiChu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(Sogiolamthem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel19Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel21, jLabel22, jLabel23, jLabel24, jLabel25, jLabel26, jLabel27, jLabel29, jLabel30});

        jPanel19Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {GhiChu2, Luongcoban, Manv, PCchucvu, PCkhac, Sogiolamthem, Songaycong, Songaynghi});

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel17.setBackground(new java.awt.Color(204, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức Năng"));

        jPanel18.setBackground(new java.awt.Color(204, 255, 255));

        jButtonThemVP.setBackground(new java.awt.Color(255, 255, 102));
        jButtonThemVP.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonThemVP.setForeground(new java.awt.Color(255, 51, 51));
        jButtonThemVP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/add_user.png"))); // NOI18N
        jButtonThemVP.setText("Thêm");
        jButtonThemVP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemVPActionPerformed(evt);
            }
        });

        jButtonSuaVP.setBackground(new java.awt.Color(255, 255, 102));
        jButtonSuaVP.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonSuaVP.setForeground(new java.awt.Color(255, 51, 51));
        jButtonSuaVP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/edit_user.png"))); // NOI18N
        jButtonSuaVP.setText("Sửa");
        jButtonSuaVP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuaVPActionPerformed(evt);
            }
        });

        jButtonXoaVP.setBackground(new java.awt.Color(255, 255, 102));
        jButtonXoaVP.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonXoaVP.setForeground(new java.awt.Color(255, 51, 51));
        jButtonXoaVP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/remove_user.png"))); // NOI18N
        jButtonXoaVP.setText("Xóa");
        jButtonXoaVP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaVPActionPerformed(evt);
            }
        });

        jButtonRefreshVP.setBackground(new java.awt.Color(255, 255, 102));
        jButtonRefreshVP.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonRefreshVP.setForeground(new java.awt.Color(255, 51, 51));
        jButtonRefreshVP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/upload.png"))); // NOI18N
        jButtonRefreshVP.setText("Làm mới");
        jButtonRefreshVP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshVPActionPerformed(evt);
            }
        });

        jButtonRefreshVP1.setBackground(new java.awt.Color(255, 255, 102));
        jButtonRefreshVP1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonRefreshVP1.setForeground(new java.awt.Color(255, 51, 51));
        jButtonRefreshVP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/close1.png"))); // NOI18N
        jButtonRefreshVP1.setText("Exit");
        jButtonRefreshVP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshVP1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButtonThemVP, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jButtonSuaVP, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jButtonXoaVP, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButtonRefreshVP, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButtonRefreshVP1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonThemVP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSuaVP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonXoaVP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRefreshVP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRefreshVP1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );

        jTable_TTVP.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable_TTVP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NV", "Lương cơ bản", "Phụ cấp chức vụ", "Phụ cấp khác", "Thời gian", "Số ngày công", "Số ngày nghỉ", "Số giờ làm thêm", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_TTVP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_TTVPMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_TTVP);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Văn Phòng", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonThemBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemBCActionPerformed
        try {
            String Sql="insert into BangCongThuViec(MaBangCongTV, MaBoPhan, MaPhongBan, MaNV, LuongTViec, ThoiGian, SoNgayCong, SoNgayNghi, SoGioLamThem, GhiChu) values(?,?,?,?,?,?,?,?,?,?)";
            conn = Database.getDBConnect();
            pst = conn.prepareStatement(Sql);
            pst.setString(1, MaBC.getText());
            MaBPString = MaBP.getSelectedItem().toString();
            pst.setString(2, MaBPString);
            MaPBString = MaPB.getSelectedItem().toString();
            pst.setString(3, MaPBString);
            pst.setString(4, MaNV.getText());
            pst.setString(5, LuongTV.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String TG = sdf.format(ThoiGian.getDate());
            pst.setString(6, TG);
            pst.setString(7, SoNC.getText());
            pst.setString(8, SoNN.getText());
            pst.setString(9, SoGLT.getText());
            pst.setString(10, GhiChu.getText());
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable_TTBC.getModel();
            model.setRowCount(0);
            show_TTBC();
            jOptionPane2.showMessageDialog(null, "Thêm thành công!");
        } catch (Exception e) {
            //            jOptionPane3.showMessageDialog(null, "Lỗi!" );
            System.out.println("error" + e.toString());
        }
    }//GEN-LAST:event_jButtonThemBCActionPerformed

    private void jButtonSuaBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuaBCActionPerformed
        try {
            String Sql="update BangCongThuViec set MaBoPhan = ?, MaPhongBan = ?, MaNV = ?, LuongTViec = ?, ThoiGian = ?, SoNgayCong = ?, SoNgayNghi = ?, SoGioLamThem = ?, GhiChu = ? where MaBangCongTV = ?";
            conn = Database.getDBConnect();
            pst = conn.prepareStatement(Sql);           
            MaBPString = MaBP.getSelectedItem().toString();
            pst.setString(1, MaBPString);
            MaPBString = MaPB.getSelectedItem().toString();
            pst.setString(2, MaPBString);
            pst.setString(3, MaNV.getText());
            pst.setString(4, LuongTV.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String TG = sdf.format(ThoiGian.getDate());
            pst.setString(5, TG);
            pst.setString(6, SoNC.getText());
            pst.setString(7, SoNN.getText());
            pst.setString(8, SoGLT.getText());
            pst.setString(9, GhiChu.getText());
            pst.setString(10, MaBC.getText());
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable_TTBC.getModel();
            model.setRowCount(0);
            show_TTBC();
            jOptionPane2.showMessageDialog(null, "Sửa thành công!");
        } catch (Exception e) {
            //            jOptionPane3.showMessageDialog(null, "Lỗi!" );
            System.out.println("error" + e.toString());
        }
    }//GEN-LAST:event_jButtonSuaBCActionPerformed

    private void jButtonXoaBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaBCActionPerformed
        try {
            conn = Database.getDBConnect();
            String Sql="delete from BangCongThuViec where MaBangCongTV = ?";
            pst = conn.prepareStatement(Sql);
            pst.setString(1, MaBC.getText());
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable_TTBC.getModel();
            model.setRowCount(0);
            show_TTBC();
            jOptionPane2.showMessageDialog(null, "Xóa thành công!");
        } catch (Exception e) {
            //            jOptionPane3.showMessageDialog(null, "Lỗi!");
            System.out.println("error" + e.toString());
        }
    }//GEN-LAST:event_jButtonXoaBCActionPerformed

    private void jButtonRefreshBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshBCActionPerformed
        MaBC.setText("");
        MaBP.setSelectedIndex(0);
        MaPB.setSelectedIndex(0);
        MaNV.setText("");
        LuongTV.setText("");
        SoNC.setText("");
        SoNN.setText("");
        SoGLT.setText("");
        GhiChu.setText("");       
        ThoiGian.setDate(null);
    }//GEN-LAST:event_jButtonRefreshBCActionPerformed

    private void SoNNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoNNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SoNNActionPerformed

    private void jTable_TTBCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_TTBCMouseClicked
        int row = jTable_TTBC.getSelectedRow();
        TableModel model = jTable_TTBC.getModel();
        MaBC.setText(model.getValueAt(row, 0).toString());
        MaBPString = (model.getValueAt(row, 1).toString());
        int i = 0;
        while(true){
            String MBP = MaBP.getItemAt(i).toString();
            if(MBP.equalsIgnoreCase(MaBPString)){
                MaBP.setSelectedIndex(i); 
                break;
            }
            i++;
        } 
        MaPBString = (model.getValueAt(row, 2).toString());
        int j = 0;
        while(true){
            String MPB = MaPB.getItemAt(j).toString();
            if(MPB.equalsIgnoreCase(MaPBString)){
                MaPB.setSelectedIndex(j);      
                break;
            }
            j++;
        }
        MaNV.setText(model.getValueAt(row, 3).toString());
        LuongTV.setText(model.getValueAt(row, 4).toString());
        try{
            Date TG = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(row, 5));
            ThoiGian.setDate(TG);
        }
        catch (Exception e) {
            jOptionPane1.showMessageDialog(null, "Lỗi ngày");
        }  
        SoNC.setText(model.getValueAt(row, 6).toString());
        SoNN.setText(model.getValueAt(row, 7).toString());
        SoGLT.setText(model.getValueAt(row, 8).toString());
        GhiChu.setText(model.getValueAt(row, 9).toString());
    }//GEN-LAST:event_jTable_TTBCMouseClicked

    private void SoNgayCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoNgayCongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SoNgayCongActionPerformed

    private void jButtonThemDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemDHActionPerformed
        try {
            String Sql="insert into CongKhoiDieuHanh(MaNV, LCB, PhuCapCVu, PHuCapKhac, ThoiGian, SoNgayCongThang, SoNgayNghi, SoGioLamThem, GhiChu) values(?,?,?,?,?,?,?,?,?)";
            conn = Database.getDBConnect();
            pst = conn.prepareStatement(Sql);
            pst.setString(1, maNV.getText());
            pst.setString(2, LuongCB.getText());
            pst.setString(3, PhuCapCV.getText());
            pst.setString(4, PhuCapK.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String TGString = sdf.format(thoigian.getDate());
            pst.setString(5, TGString);
            pst.setString(6, SoNgayCong.getText());
            pst.setString(7, SoNgayNghi.getText());
            pst.setString(8, SoGioLamThem.getText());
            pst.setString(9, GhiChu1.getText());
            pst.executeUpdate();
            DefaultTableModel model1 = (DefaultTableModel)jTable_TTDH.getModel();
            model1.setRowCount(0);
            show_TTDH();
            jOptionPane2.showMessageDialog(null, "Thêm thành công!");
        } catch (Exception e) {
            //            jOptionPane3.showMessageDialog(null, "Lỗi!" );
            System.out.println("error" + e.toString());
        }
    }//GEN-LAST:event_jButtonThemDHActionPerformed

    private void jButtonSuaDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuaDHActionPerformed
       try {
            String Sql="update CongKhoiDieuHanh set LCB = ?, PhuCapCVu = ?, PHuCapKhac = ?, ThoiGian = ?, SoNgayCongThang = ?, SoNgayNghi = ?, SoGioLamThem = ?, GhiChu = ? where MaNV = ?";
            conn = Database.getDBConnect();
            pst = conn.prepareStatement(Sql);            
            pst.setString(1, LuongCB.getText());
            pst.setString(2, PhuCapCV.getText());
            pst.setString(3, PhuCapK.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String TGString = sdf.format(thoigian.getDate());
            pst.setString(4, TGString);
            pst.setString(5, SoNgayCong.getText());
            pst.setString(6, SoNgayNghi.getText());
            pst.setString(7, SoGioLamThem.getText());
            pst.setString(8, GhiChu1.getText());
            pst.setString(9, maNV.getText());
            pst.executeUpdate();
            DefaultTableModel model1 = (DefaultTableModel)jTable_TTDH.getModel();
            model1.setRowCount(0);
            show_TTDH();
            jOptionPane2.showMessageDialog(null, "Sửa thành công!");
        } catch (Exception e) {
            //            jOptionPane3.showMessageDialog(null, "Lỗi!" );
            System.out.println("error" + e.toString());
        }
    }//GEN-LAST:event_jButtonSuaDHActionPerformed

    private void jButtonXoaDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaDHActionPerformed
        try {
            conn = Database.getDBConnect();
            String sql = "delete from CongKhoiDieuHanh where MaNV =?" ;
            pst = conn.prepareStatement(sql);
            pst.setString(1, MaNV.getText());
            pst.executeUpdate();
            DefaultTableModel model1 = (DefaultTableModel)jTable_TTDH.getModel();
            model1.setRowCount(0);
            show_TTDH();
            jOptionPane2.showMessageDialog(null, "Xóa thành công!");
        } catch (Exception e) {
            //            jOptionPane3.showMessageDialog(null, "Lỗi!");
            System.out.println("error" + e.toString());
        }
    }//GEN-LAST:event_jButtonXoaDHActionPerformed

    private void jButtonRefreshDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshDHActionPerformed
        maNV.setText("");
        LuongCB.setText("");
        PhuCapCV.setText("");
        PhuCapK.setText("");
        thoigian.setDate(null);
        SoNgayCong.setText("");
        SoNgayNghi.setText("");
        SoGioLamThem.setText("");
        GhiChu1.setText("");
    }//GEN-LAST:event_jButtonRefreshDHActionPerformed

    private void jTable_TTDHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_TTDHMouseClicked
      int row = jTable_TTDH.getSelectedRow();
        TableModel model = jTable_TTDH.getModel();
        maNV.setText(model.getValueAt(row, 0).toString());
        LuongCB.setText(model.getValueAt(row, 1).toString());
        PhuCapCV.setText(model.getValueAt(row, 2).toString());
        PhuCapK.setText(model.getValueAt(row, 3).toString());
        try{
            Date Ngay = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(row, 4));
            thoigian.setDate(Ngay);           
        }
        catch (Exception e) {
            jOptionPane1.showMessageDialog(null, "Lỗi ngày");
        } 
        SoNgayCong.setText(model.getValueAt(row, 5).toString());
        SoNgayNghi.setText(model.getValueAt(row, 6).toString());
        SoGioLamThem.setText(model.getValueAt(row, 7).toString());
        GhiChu1.setText(model.getValueAt(row, 8).toString());    
    }//GEN-LAST:event_jTable_TTDHMouseClicked

    private void LuongCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuongCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LuongCBActionPerformed

    private void MaBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaBCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaBCActionPerformed

    private void jButtonThemVPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemVPActionPerformed
 try {
            String Sql="insert into CongKhoiVanPhong(MaNV, LCB, PhuCapCVu, PhuCapKhac, ThoiGian, SoNgayCongThang, SoNgayNghi, SoGioLamThem, GhiChu) values(?,?,?,?,?,?,?,?,?)";
            conn = Database.getDBConnect();
            pst = conn.prepareStatement(Sql);
            pst.setString(1, Manv.getText());
            pst.setString(2, Luongcoban.getText());
            pst.setString(3, PCchucvu.getText());
            pst.setString(4, PCkhac.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String TGString = sdf.format(Thoigian.getDate());
            pst.setString(5, TGString);
            pst.setString(6, Songaycong.getText());
            pst.setString(7, Songaynghi.getText());
            pst.setString(8, Sogiolamthem.getText());
            pst.setString(9, GhiChu2.getText());            
            pst.executeUpdate();
            DefaultTableModel model1 = (DefaultTableModel)jTable_TTVP.getModel();
            model1.setRowCount(0);
            show_TTVP();
            jOptionPane2.showMessageDialog(null, "Thêm thành công!");
        } catch (Exception e) {
            //            jOptionPane3.showMessageDialog(null, "Lỗi!" );
            System.out.println("error" + e.toString());
        }
    }//GEN-LAST:event_jButtonThemVPActionPerformed

    private void jButtonSuaVPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuaVPActionPerformed
            try {
            String Sql="update CongKhoiVanPhong set LCB = ?, PhuCapCVu = ?, PhuCapKhac = ?, ThoiGian = ?, SoNgayCongThang = ?, SoNgayNghi = ?, SoGioLamThem = ?, GhiChu = ? where MaNV = ?";
            conn = Database.getDBConnect();
            pst = conn.prepareStatement(Sql);            
            pst.setString(1, Luongcoban.getText());
            pst.setString(2, PCchucvu.getText());
            pst.setString(3, PCkhac.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String TGString = sdf.format(Thoigian.getDate());
            pst.setString(4, TGString);
            pst.setString(5, Songaycong.getText());
            pst.setString(6, Songaynghi.getText());
            pst.setString(7, Sogiolamthem.getText());
            pst.setString(8, GhiChu2.getText());
            pst.setString(9, Manv.getText());
            pst.executeUpdate();
            DefaultTableModel model1 = (DefaultTableModel)jTable_TTVP.getModel();
            model1.setRowCount(0);
            show_TTVP();
            jOptionPane2.showMessageDialog(null, "Sửa thành công!");
        } catch (Exception e) {
            //            jOptionPane3.showMessageDialog(null, "Lỗi!" );
            System.out.println("error" + e.toString());
        }
    }//GEN-LAST:event_jButtonSuaVPActionPerformed

    private void jButtonXoaVPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaVPActionPerformed
        try {
            conn = Database.getDBConnect();
            String sql = "delete from CongKhoiVanPhong where MaNV =?" ;
            pst = conn.prepareStatement(sql);
            pst.setString(1, Manv.getText());
            pst.executeUpdate();
            DefaultTableModel model1 = (DefaultTableModel)jTable_TTVP.getModel();
            model1.setRowCount(0);
            show_TTVP();
            jOptionPane2.showMessageDialog(null, "Xóa thành công!");
        } catch (Exception e) {
            //            jOptionPane3.showMessageDialog(null, "Lỗi!");
            System.out.println("error" + e.toString());
        }
    }//GEN-LAST:event_jButtonXoaVPActionPerformed

    private void jButtonRefreshVPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshVPActionPerformed
        Manv.setText("");
        Luongcoban.setText("");
        PCchucvu.setText("");
        PCkhac.setText("");
        Thoigian.setDate(null);
        Songaycong.setText("");
        Songaynghi.setText("");
        Sogiolamthem.setText("");
        GhiChu2.setText("");
    }//GEN-LAST:event_jButtonRefreshVPActionPerformed

    private void PCkhacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PCkhacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PCkhacActionPerformed

    private void jTable_TTVPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_TTVPMouseClicked
        int row = jTable_TTVP.getSelectedRow();
        TableModel model = jTable_TTVP.getModel();
        Manv.setText(model.getValueAt(row, 0).toString());
        Luongcoban.setText(model.getValueAt(row, 1).toString());
        PCchucvu.setText(model.getValueAt(row, 2).toString());
        PCkhac.setText(model.getValueAt(row, 3).toString());
        try{
            Date Ngay = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(row, 4));
            Thoigian.setDate(Ngay);           
        }
        catch (Exception e) {
            jOptionPane1.showMessageDialog(null, "Lỗi ngày");
        } 
        Songaycong.setText(model.getValueAt(row, 5).toString());
        Songaynghi.setText(model.getValueAt(row, 6).toString());
        Sogiolamthem.setText(model.getValueAt(row, 7).toString());
        GhiChu2.setText(model.getValueAt(row, 8).toString());   
    }//GEN-LAST:event_jTable_TTVPMouseClicked

    private void jexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jexitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jexitActionPerformed

    private void jexittActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jexittActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jexittActionPerformed

    private void jButtonRefreshVP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshVP1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonRefreshVP1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(BangCong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BangCong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BangCong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BangCong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 BangCong a = new BangCong();
                 a.setLocationRelativeTo(null);
                 a.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField GhiChu;
    private javax.swing.JTextField GhiChu1;
    private javax.swing.JTextField GhiChu2;
    private javax.swing.JTextField LuongCB;
    private javax.swing.JTextField LuongTV;
    private javax.swing.JTextField Luongcoban;
    private javax.swing.JTextField MaBC;
    private javax.swing.JComboBox<String> MaBP;
    private javax.swing.JTextField MaNV;
    private javax.swing.JComboBox<String> MaPB;
    private javax.swing.JTextField Manv;
    private javax.swing.JTextField PCchucvu;
    private javax.swing.JTextField PCkhac;
    private javax.swing.JTextField PhuCapCV;
    private javax.swing.JTextField PhuCapK;
    private javax.swing.JTextField SoGLT;
    private javax.swing.JTextField SoGioLamThem;
    private javax.swing.JTextField SoNC;
    private javax.swing.JTextField SoNN;
    private javax.swing.JTextField SoNgayCong;
    private javax.swing.JTextField SoNgayNghi;
    private javax.swing.JTextField Sogiolamthem;
    private javax.swing.JTextField Songaycong;
    private javax.swing.JTextField Songaynghi;
    private com.toedter.calendar.JDateChooser ThoiGian;
    private com.toedter.calendar.JDateChooser Thoigian;
    private javax.swing.JButton jButtonRefreshBC;
    private javax.swing.JButton jButtonRefreshDH;
    private javax.swing.JButton jButtonRefreshVP;
    private javax.swing.JButton jButtonRefreshVP1;
    private javax.swing.JButton jButtonSuaBC;
    private javax.swing.JButton jButtonSuaDH;
    private javax.swing.JButton jButtonSuaVP;
    private javax.swing.JButton jButtonThemBC;
    private javax.swing.JButton jButtonThemDH;
    private javax.swing.JButton jButtonThemVP;
    private javax.swing.JButton jButtonXoaBC;
    private javax.swing.JButton jButtonXoaDH;
    private javax.swing.JButton jButtonXoaVP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JOptionPane jOptionPane2;
    private javax.swing.JOptionPane jOptionPane3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable_TTBC;
    private javax.swing.JTable jTable_TTDH;
    private javax.swing.JTable jTable_TTVP;
    private javax.swing.JButton jexit;
    private javax.swing.JButton jexitt;
    private javax.swing.JTextField maNV;
    private com.toedter.calendar.JDateChooser thoigian;
    // End of variables declaration//GEN-END:variables
}
