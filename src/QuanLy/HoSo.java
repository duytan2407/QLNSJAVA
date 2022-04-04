/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLy;

import ConnectToSql.Database;
import DanhMuc.NhanSu;
import Models.TTHoSo;
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
 * @author nguye
 */
public class HoSo extends javax.swing.JFrame {
    Database dt = new Database();
    Connection conn = null;
    PreparedStatement pst = null;
    
    String GioiTinh;
    public HoSo(){
        initComponents();
        show_TTHS();
    }
    public ArrayList<TTHoSo> TTHSsList(){
        ArrayList<TTHoSo> TTHSsList = new ArrayList<>();
        try{
            conn = Database.getDBConnect();
            String sql = "select * from HoSoThuViec";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            TTHoSo HS;
            while (rs.next()) {
                HS = new TTHoSo(rs.getString("MaHoSoTV"), rs.getString("MaBangCongTV"), rs.getString("MaNV"), rs.getString("HoTen"), rs.getString("NgaySinh"), rs.getString("GioiTinh"), rs.getString("DiaChi"), rs.getString("SDT"), rs.getString("TDHocVan"), rs.getString("ViTriThuViec"), rs.getString("GhiChu"));
                TTHSsList.add(HS);
            }
            return TTHSsList;
        }catch(Exception e){
            jOptionPane1.showMessageDialog(null, "Lỗi!");
//                System.out.println("error" + e.toString());
        }
        return null;
    }
    public void show_TTHS(){
        ArrayList<TTHoSo> list = TTHSsList();
        DefaultTableModel model = (DefaultTableModel)jTable_TTHS.getModel();
        for(TTHoSo o : list){
            model.addRow(new Object[]{o.getMaHoSoTV(), o.getMaBangCongTV(), o.getMaNV(), o.getHoTen(), o.getNgaySinh(), o.getGioiTinh(), o.getDiaChi(),o.getSDT(), o.getTDHocVan(), o.getViTriThuViec(), o.getGhiChu()});
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jOptionPane2 = new javax.swing.JOptionPane();
        jOptionPane3 = new javax.swing.JOptionPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        MaHS = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        MaBC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        MaNV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        HoTen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        NgayS = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        Nam = new javax.swing.JRadioButton();
        Nu = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        DiaChi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        VTUngTuyen = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        GhiChu = new javax.swing.JTextField();
        TDHocVan = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        SDT = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_TTHS = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jButtonThemBH = new javax.swing.JButton();
        jButtonSuaBH = new javax.swing.JButton();
        jButtonXoaBH = new javax.swing.JButton();
        jButtonRefreshBH = new javax.swing.JButton();
        jButtonRefreshBH1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 51, 51));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("HỒ SƠ THỬ VIỆC");

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Mã hồ sơ");

        MaHS.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Mã bảng công");

        MaBC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Mã NV");

        MaNV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Họ và tên");

        HoTen.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Ngày sinh");

        NgayS.setDateFormatString("yyyy-MM");
        NgayS.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Giới tính");

        Nam.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup1.add(Nam);
        Nam.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Nam.setText("Nam");

        Nu.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup1.add(Nu);
        Nu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Nu.setText("Nữ");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Địa chỉ");

        DiaChi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Trình độ học vấn");

        VTUngTuyen.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Vị trí ứng tuyển");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Ghi chú");

        GhiChu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("SDT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MaHS))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MaBC, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(MaNV, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NgayS, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Nam, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Nu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(VTUngTuyen, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TDHocVan, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                        .addGap(3, 3, 3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SDT, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GhiChu, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addGap(3, 3, 3))
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel10, jLabel11, jLabel12, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel9});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(MaHS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(NgayS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TDHocVan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(MaBC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Nu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(VTUngTuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(GhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(HoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(SDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel10, jLabel11, jLabel12, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel9});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {DiaChi, GhiChu, HoTen, MaBC, MaHS, MaNV, NgayS, SDT, TDHocVan, VTUngTuyen});

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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTable_TTHS.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable_TTHS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hồ sơ", "Mã bảng công", "Mã NV", "Họ và tên", "Ngày sinh", "Giới tính", "Địa chỉ", "SDT", "Trình độ học vấn", "Vị trí ứng tuyển", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_TTHS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_TTHSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_TTHS);

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
                .addGap(36, 36, 36)
                .addComponent(jButtonThemBH, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addComponent(jButtonSuaBH, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButtonXoaBH, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButtonRefreshBH, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButtonRefreshBH1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRefreshBH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonThemBH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSuaBH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonXoaBH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonThemBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemBHActionPerformed
        try {
            String Sql="insert into HoSoThuViec(MaHoSoTV, MaBangCongTV, MaNV, HoTen, NgaySinh, GioiTinh, DiaChi, SDT, TDHocVan, ViTriThuViec, GhiChu) values(?,?,?,?,?,?,?,?,?,?,?)";
            conn = Database.getDBConnect();
            pst = conn.prepareStatement(Sql);
            pst.setString(1, MaHS.getText());
            pst.setString(2, MaBC.getText());
            pst.setString(3, MaNV.getText());
            pst.setString(4, HoTen.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String NgS = sdf.format(NgayS.getDate());
            pst.setString(5, NgS);
            if(Nam.isSelected()){
                GioiTinh = "Nam";
            }
            else{
                GioiTinh = "Nữ";
            }
            pst.setString(6, GioiTinh);
            pst.setString(7, DiaChi.getText());
            pst.setString(8, SDT.getText());
            pst.setString(9, TDHocVan.getText());
            pst.setString(10, VTUngTuyen.getText());
            pst.setString(11, GhiChu.getText());
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable_TTHS.getModel();
            model.setRowCount(0);
            show_TTHS();
            jOptionPane2.showMessageDialog(null, "Thêm thành công!");
        } catch (Exception e) {
            //            jOptionPane3.showMessageDialog(null, "Lỗi!" );
            System.out.println("error" + e.toString());
        }
    }//GEN-LAST:event_jButtonThemBHActionPerformed

    private void jButtonSuaBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuaBHActionPerformed
        try {
            String Sql="update HoSoThuViec set MaBangCongTV = ?, MaNV = ?, HoTen = ?, NgaySinh = ?, GioiTinh = ?, DiaChi = ?, SDT = ?, TDHocVan = ?, ViTriThuViec = ?, GhiChu = ? where MaHoSoTV = ?";
            conn = Database.getDBConnect();
            pst = conn.prepareStatement(Sql);          
            pst.setString(1, MaBC.getText());
            pst.setString(2, MaNV.getText());
            pst.setString(3, HoTen.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String NgS = sdf.format(NgayS.getDate());
            pst.setString(4, NgS);
            if(Nam.isSelected()){
                GioiTinh = "Nam";
            }
            else{
                GioiTinh = "Nữ";
            }
            pst.setString(5, GioiTinh);
            pst.setString(6, DiaChi.getText());
            pst.setString(7, SDT.getText());
            pst.setString(8, TDHocVan.getText());
            pst.setString(9, VTUngTuyen.getText());
            pst.setString(10, GhiChu.getText());
            pst.setString(11, MaHS.getText());
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable_TTHS.getModel();
            model.setRowCount(0);
            show_TTHS();
            jOptionPane2.showMessageDialog(null, "Sửa thành công!");
        } catch (Exception e) {
            //            jOptionPane3.showMessageDialog(null, "Lỗi!" );
            System.out.println("error" + e.toString());
        }
    }//GEN-LAST:event_jButtonSuaBHActionPerformed

    private void jButtonXoaBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaBHActionPerformed
        try {
            conn = Database.getDBConnect();
            String sql="delete from HoSoThuViec where MaHoSoTV =?" /*+ MaSoBH.getText()*/;
            pst = conn.prepareStatement(sql);
            pst.setString(1, MaHS.getText());
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable_TTHS.getModel();
            model.setRowCount(0);
            show_TTHS();
            jOptionPane2.showMessageDialog(null, "Xóa thành công!");
        } catch (Exception e) {
            //            jOptionPane3.showMessageDialog(null, "Lỗi!");
            System.out.println("error" + e.toString());
        }
    }//GEN-LAST:event_jButtonXoaBHActionPerformed

    private void jButtonRefreshBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshBHActionPerformed
        MaHS.setText("");
        MaBC.setText("");
        MaNV.setText("");
        HoTen.setText("");
        GhiChu.setText("");
        NgayS.setDate(null);
        buttonGroup1.clearSelection();
        DiaChi.setText("");
        SDT.setText("");
        TDHocVan.setText("");
        VTUngTuyen.setText("");
        GhiChu.setText("");
    }//GEN-LAST:event_jButtonRefreshBHActionPerformed

    private void jTable_TTHSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_TTHSMouseClicked
        int row = jTable_TTHS.getSelectedRow();
        TableModel model = jTable_TTHS.getModel();
        MaHS.setText(model.getValueAt(row, 0).toString());
        MaBC.setText(model.getValueAt(row, 1).toString());
        MaNV.setText(model.getValueAt(row, 2).toString());
        HoTen.setText(model.getValueAt(row, 3).toString());
        try{
            Date NgS = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(row, 4));
            NgayS.setDate(NgS);
        }
        catch(Exception e){
            jOptionPane1.showMessageDialog(null, "Lỗi ngày");
        }
        GioiTinh = model.getValueAt(row, 5).toString();
            if(GioiTinh.equals("Nam")){
                Nam.setSelected(true);
            }
            else{
                Nu.setSelected(true);
            }
            DiaChi.setText(model.getValueAt(row, 6).toString());
            SDT.setText(model.getValueAt(row, 7).toString());
            TDHocVan.setText(model.getValueAt(row, 8).toString());
            VTUngTuyen.setText(model.getValueAt(row, 9).toString());
            GhiChu.setText(model.getValueAt(row, 10).toString());
    }//GEN-LAST:event_jTable_TTHSMouseClicked

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
            java.util.logging.Logger.getLogger(HoSo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoSo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoSo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoSo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 HoSo a = new HoSo();
                 a.setLocationRelativeTo(null);
                 a.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DiaChi;
    private javax.swing.JTextField GhiChu;
    private javax.swing.JTextField HoTen;
    private javax.swing.JTextField MaBC;
    private javax.swing.JTextField MaHS;
    private javax.swing.JTextField MaNV;
    private javax.swing.JRadioButton Nam;
    private com.toedter.calendar.JDateChooser NgayS;
    private javax.swing.JRadioButton Nu;
    private javax.swing.JTextField SDT;
    private javax.swing.JTextField TDHocVan;
    private javax.swing.JTextField VTUngTuyen;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonRefreshBH;
    private javax.swing.JButton jButtonRefreshBH1;
    private javax.swing.JButton jButtonSuaBH;
    private javax.swing.JButton jButtonThemBH;
    private javax.swing.JButton jButtonXoaBH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JOptionPane jOptionPane2;
    private javax.swing.JOptionPane jOptionPane3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_TTHS;
    // End of variables declaration//GEN-END:variables
}
