/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DanhMuc;

import ConnectToSql.Database;
import Models.TTNhanVien;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author USER
 */
public class NhanSu extends javax.swing.JFrame {
    Database dt = new Database();
    Connection conn = null;
    PreparedStatement pst = null;
    String GioiTinh;
    String MaPhongBan;
    String MaBoPhan;
    String MaChucVu;
    String TTHonNhan;
    String filename = null;
    byte[] person_image = null;
    public NhanSu() {
        initComponents();
        show_TTNV();
    }
    public ArrayList<TTNhanVien> TTNVsList(){
            ArrayList<TTNhanVien> TTCNsList = new ArrayList<>();
            try {
                conn = Database.getDBConnect();
                String sql = "select * from TTNVCoBan" ;
                PreparedStatement pst = conn.prepareStatement(sql);         
                ResultSet rs = pst.executeQuery();
                TTNhanVien TTNV;
                while(rs.next()){
                    TTNV = new TTNhanVien(rs.getString("MaNV"), rs.getString("HoTen"), rs.getString("NgaySinh"), rs.getString("GioiTinh"), rs.getString("MaHopDong"), rs.getString("MaPhongBan"), rs.getString("MaBoPhan"), rs.getString("MaChucVu"), rs.getString("TTHonNhan"), rs.getString("GhiChu"), rs.getBytes("Anh"));              
                    TTCNsList.add(TTNV); 
                }
                return TTCNsList;
            } catch (Exception e) {
                jOptionPane1.showMessageDialog(null, "Lỗi!");
            }
            return null;
        }
    public void show_TTNV(){
        ArrayList<TTNhanVien> list = TTNVsList();
        DefaultTableModel model = (DefaultTableModel)jTable_TTNV.getModel();
        for(TTNhanVien o : list){
            model.addRow(new Object[]{o.getMaNV(), o.getHoTen(), o.getNgaySinh(), o.getGioiTinh(), o.getMaHopDong(), o.getMaPhongBan(), o.getMaBoPhan(), o.getMaChucVu(), o.getTTHonNhan(), o.getAnh(), o.getGhiChu()});        
               
        }       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        popupMenu1 = new java.awt.PopupMenu();
        jOptionPane1 = new javax.swing.JOptionPane();
        jOptionPane2 = new javax.swing.JOptionPane();
        jOptionPane3 = new javax.swing.JOptionPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButtonThem1 = new javax.swing.JButton();
        jButtonSua1 = new javax.swing.JButton();
        jButtonXoa1 = new javax.swing.JButton();
        jButtonLuu1 = new javax.swing.JButton();
        jButtonRefresh1 = new javax.swing.JButton();
        jexit = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField02 = new javax.swing.JTextField();
        jTextField01 = new javax.swing.JTextField();
        A = new javax.swing.JLabel();
        jTextField04 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox01 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jComboBox02 = new javax.swing.JComboBox<>();
        jComboBox03 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField05 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButtonAnh = new javax.swing.JButton();
        jComboBox04 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_TTNV = new javax.swing.JTable();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuItem1.setText("jMenuItem1");

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức Năng"));

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));

        jButtonThem1.setBackground(new java.awt.Color(255, 255, 102));
        jButtonThem1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonThem1.setForeground(new java.awt.Color(255, 51, 51));
        jButtonThem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/add_user.png"))); // NOI18N
        jButtonThem1.setText("Thêm");
        jButtonThem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThem1ActionPerformed(evt);
            }
        });

        jButtonSua1.setBackground(new java.awt.Color(255, 255, 102));
        jButtonSua1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonSua1.setForeground(new java.awt.Color(255, 51, 51));
        jButtonSua1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/edit_user.png"))); // NOI18N
        jButtonSua1.setText("Sửa");
        jButtonSua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSua1ActionPerformed(evt);
            }
        });

        jButtonXoa1.setBackground(new java.awt.Color(255, 255, 102));
        jButtonXoa1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonXoa1.setForeground(new java.awt.Color(255, 51, 51));
        jButtonXoa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/remove_user.png"))); // NOI18N
        jButtonXoa1.setText("Xóa");
        jButtonXoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoa1ActionPerformed(evt);
            }
        });

        jButtonLuu1.setBackground(new java.awt.Color(255, 255, 102));
        jButtonLuu1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonLuu1.setForeground(new java.awt.Color(255, 51, 51));
        jButtonLuu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/upload.png"))); // NOI18N
        jButtonLuu1.setText("Lưu");

        jButtonRefresh1.setBackground(new java.awt.Color(255, 255, 102));
        jButtonRefresh1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonRefresh1.setForeground(new java.awt.Color(255, 51, 51));
        jButtonRefresh1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/send.png"))); // NOI18N
        jButtonRefresh1.setText("Refresh");
        jButtonRefresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefresh1ActionPerformed(evt);
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
                .addGap(36, 36, 36)
                .addComponent(jButtonThem1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButtonSua1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addComponent(jButtonXoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButtonLuu1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButtonRefresh1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jexit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonThem1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSua1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonXoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLuu1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRefresh1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jexit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonLuu1, jButtonRefresh1, jButtonSua1, jButtonThem1, jButtonXoa1});

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("THÔNG TIN NHÂN VIÊN");

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Mã hợp đồng");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Mã nhân viên");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Họ tên");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("Ngày sinh");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setText("Giới tính");

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton1.setText("Nam");

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton2.setText("Nữ");

        jTextField02.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jTextField01.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        A.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jTextField04.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Mã phòng ban");

        jComboBox01.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBox01.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P001      ", "P002      ", "P003      ", "P004      ", "P005      ", "P006      ", "P007      ", "P008      ", "P009      ", "P010      ", "P011      ", "P012      " }));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Mã bộ phận");

        jComboBox02.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBox02.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MB001     ", "MB002     ", "MB003     ", "MB004     ", "MB005     ", "MB006     ", "MB007     ", "MB008     ", "MB009     ", "MB010     " }));

        jComboBox03.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBox03.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CV001     ", "CV002     ", "CV003     ", "CV004     ", "CV005     ", "CV006     ", "CV007     ", "CV008     ", "CV009     ", "CV010     ", "CV011     ", "CV012     ", "CV013     ", "CV014     ", "CV015     ", "CV016     ", "CV017     ", "CV018     ", "CV019     ", "CV020     ", "CV021     ", "CV022     " }));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Mã chức vụ");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Tình trạng hôn nhân");

        jTextField05.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setText("Ghi chú");

        jButtonAnh.setText("Chọn ảnh");
        jButtonAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnhActionPerformed(evt);
            }
        });

        jComboBox04.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBox04.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Độc thân", "Kết hôn", "Ly hôn" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField04))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField02))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField01))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox03, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox02, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox01, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField05, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(jComboBox04, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAnh)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel16, jLabel17, jLabel18, jLabel2, jLabel3, jLabel4, jLabel6});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jButtonAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBox02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(jComboBox03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jLabel6)
                            .addComponent(jComboBox04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel10, jLabel11, jLabel16, jLabel17, jLabel18, jLabel2, jLabel3, jLabel4, jLabel6});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBox01, jComboBox02, jComboBox03, jComboBox04, jTextField01, jTextField02, jTextField04, jTextField05});

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTable_TTNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaNV", "Họ tên", "Ngày sinh", "Giới tính", "Mã hợp đồng", "Mã phòng ban", "Mã bộ phận", "Mã chức vụ", "Tình trạng hôn nhân", "Ảnh", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_TTNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_TTNVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_TTNV);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonThem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThem1ActionPerformed
//        try {
//            String Sql="insert into TTNVCoBan(MaNV, HoTen, NgaySinh, GioiTinh, MaHopDong, MaPhongBan, MaBoPhan, MaChucVu, TTHonNhan, Anh, GhiChu) values(?,?,?,?,?,?,?,?,?,?,?)";
//            conn = Database.getDBConnect();
//            pst = conn.prepareStatement(Sql);
//            pst.setString(1, jTextField01.getText());
//            pst.setString(2, jTextField02.getText());            
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            String NgayCap = sdf.format(jDateChooser1.getDate());
//            pst.setString(3, NgayCap);
//            if(jRadioButton1.isSelected()){
//                GioiTinh = "Nam";
//            }
//            else{
//                GioiTinh = "Nữ";
//            }
//            pst.setString(4, GioiTinh);
//            pst.setString(5, jTextField04.getText());
//            MaPhongBan = jComboBox01.getSelectedItem().toString();
//            pst.setString(6, MaPhongBan);
//            MaBoPhan = jComboBox02.getSelectedItem().toString();
//            pst.setString(7, MaBoPhan);
//            MaChucVu = jComboBox03.getSelectedItem().toString();
//            pst.setString(8, MaChucVu);
//            TTHonNhan = jComboBox04.getSelectedItem().toString();
//            pst.setString(9, TTHonNhan);
//            pst.setBytes(10, person_image);
//            pst.setString(11, jTextField05.getText());
//            pst.executeUpdate();
//            DefaultTableModel model = (DefaultTableModel)jTable_TTNV.getModel();
//            model.setRowCount(0);
//            show_TTNV();
//            jOptionPane2.showMessageDialog(null, "Thêm thành công!");
//        } catch (Exception e) {
////            jOptionPane3.showMessageDialog(null, "Lỗi!" );
//            System.out.println("error" + e.toString());
//        }
 if(jTextField01.getText().isEmpty()){
            jOptionPane3.showMessageDialog(null, "Mã nhân viên không được phép trống!",  "Thông báo", jOptionPane3.WARNING_MESSAGE);
        }
        else if(jTextField01.getText().isEmpty() || jTextField02.getText().isEmpty() ||  jTextField04.getText().isEmpty() || jTextField05.getText().isEmpty() || buttonGroup1.isSelected(null) ||  A.getIcon() == null || jDateChooser1.getDate() == null){
            jOptionPane3.showMessageDialog(null, "Vui lòng điền đủ thông tin!",  "Thông báo", jOptionPane3.WARNING_MESSAGE);
        }   
        else{  
            int row = jTable_TTNV.getSelectedRow();
            TableModel model1 = jTable_TTNV.getModel();        
            String MaNVString = model1.getValueAt(row, 0).toString();
            String MaNV = jTextField01.getText().toString();
            if(MaNV.equalsIgnoreCase(MaNVString)){
                jOptionPane3.showMessageDialog(null, "Mã nhân viên đã tồn tại!",  "Thông báo", jOptionPane3.ERROR_MESSAGE);
            }
            else{
                try {
                    String Sql="insert into TTNVCoBan(MaNV, HoTen, NgaySinh, GioiTinh, MaHopDong, MaPhongBan, MaBoPhan, MaChucVu, TTHonNhan, Anh, GhiChu) values(?,?,?,?,?,?,?,?,?,?,?)";
                    conn = Database.getDBConnect();
                    pst = conn.prepareStatement(Sql);
                    pst.setString(1, jTextField01.getText());
                    pst.setString(2, jTextField02.getText());
                    try {
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        String NgayS = sdf.format(jDateChooser1.getDate());
                        pst.setString(3, NgayS);
                    } catch (Exception e) {
                        jOptionPane3.showMessageDialog(null, "Lỗi ngày!",  "Thông báo", jOptionPane3.ERROR_MESSAGE );
                    }              
                    if(jRadioButton1.isSelected()){
                        GioiTinh = "Nam";
                    }
                    else{
                        GioiTinh = "Nữ";
                    }
                    pst.setString(4, GioiTinh);
                    pst.setString(5, jTextField04.getText());
                    MaPhongBan = jComboBox01.getSelectedItem().toString();
                    pst.setString(6, MaPhongBan);
                    MaBoPhan = jComboBox02.getSelectedItem().toString();
                    pst.setString(7, MaBoPhan);
                    MaChucVu = jComboBox03.getSelectedItem().toString();
                    pst.setString(8, MaChucVu);
                    TTHonNhan = jComboBox04.getSelectedItem().toString();
                    pst.setString(9, TTHonNhan);
                    pst.setBytes(10, person_image);
                    pst.setString(11, jTextField05.getText());
                    pst.executeUpdate();
                    DefaultTableModel model = (DefaultTableModel)jTable_TTNV.getModel();
                    model.setRowCount(0);
                    show_TTNV();
                    jOptionPane2.showMessageDialog(null, "Thêm thành công!", "Thông báo", jOptionPane2.INFORMATION_MESSAGE);          
                } catch (Exception e) {
                    jOptionPane3.showMessageDialog(null, "Lỗi khi thêm dữ liệu!",  "Thông báo", jOptionPane3.ERROR_MESSAGE );
//                    System.out.println("error" + e.toString());
                }
            }
        }
    }//GEN-LAST:event_jButtonThem1ActionPerformed

    private void jButtonSua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSua1ActionPerformed
        try {
            conn = Database.getDBConnect();
            int row = jTable_TTNV.getSelectedRow();
            String value = (jTable_TTNV.getModel().getValueAt(row, 0).toString());
            String Sql="update TTNVCoBan set HoTen = ?, NgaySinh = ?, GioiTinh = ?, MaHopDong = ?, MaPhongBan = ?, MaBoPhan = ?, MaChucVu = ?, TTHonNhan = ?, Anh = ?, GhiChu = ? where MaNV =" + value ;
            pst = conn.prepareStatement(Sql);
            pst.setString(1, jTextField02.getText());            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String NgayCap = sdf.format(jDateChooser1.getDate());
            pst.setString(2, NgayCap);
            if(jRadioButton1.isSelected()){
                GioiTinh = "Nam";
            }
            else{
                GioiTinh = "Nữ";
            }
            pst.setString(3, GioiTinh);
            pst.setString(4, jTextField04.getText());
            MaPhongBan = jComboBox01.getSelectedItem().toString();
            pst.setString(5, MaPhongBan);
            MaBoPhan = jComboBox02.getSelectedItem().toString();
            pst.setString(6, MaBoPhan);
            MaChucVu = jComboBox03.getSelectedItem().toString();
            pst.setString(7, MaChucVu);
            TTHonNhan = jComboBox04.getSelectedItem().toString();
            pst.setString(8, TTHonNhan);
            pst.setBytes(9, person_image);
            pst.setString(10, jTextField05.getText());
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable_TTNV.getModel();
            model.setRowCount(0);
            show_TTNV();
            jOptionPane2.showMessageDialog(null, "Sửa thành công!");
        } catch (Exception e) {
            jOptionPane3.showMessageDialog(null, "Lỗi!" );
            System.out.println("error" + e.toString());
        }

    }//GEN-LAST:event_jButtonSua1ActionPerformed

    private void jButtonXoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoa1ActionPerformed
        try {
            conn = Database.getDBConnect();
            int row = jTable_TTNV.getSelectedRow();
            String value = (jTable_TTNV.getModel().getValueAt(row, 0).toString());
            String Sql="delete from TTNVCoBan where MaNV =" + value;
            pst = conn.prepareStatement(Sql);
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable_TTNV.getModel();
            model.setRowCount(0);
            show_TTNV();
            jOptionPane2.showMessageDialog(null, "Xóa thành công!");
        } catch (Exception e) {
            jOptionPane3.showMessageDialog(null, "Lỗi!");
            //         System.out.println("error" + e.toString());
        }
    }//GEN-LAST:event_jButtonXoa1ActionPerformed

    private void jButtonRefresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefresh1ActionPerformed
        jTextField01.setText("");
        jTextField02.setText("");
        jTextField04.setText("");
        jTextField05.setText("");
        buttonGroup1.clearSelection();
        jComboBox01.setSelectedIndex(0);
        jComboBox02.setSelectedIndex(0);
        jComboBox03.setSelectedIndex(0);
        jComboBox04.setSelectedIndex(0);
        A.setIcon(null);
    }//GEN-LAST:event_jButtonRefresh1ActionPerformed

    private void jButtonAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnhActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(A.getWidth(), A.getHeight(), Image.SCALE_SMOOTH));
        A.setIcon(imageIcon);
        try{
            File image =new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum; (readNum = fis.read(buf)) != -1;){
                bos.write(buf, 0, readNum);           
            }
            person_image = bos.toByteArray();
        }
        catch(Exception e)
        {
            jOptionPane3.showMessageDialog(null, "Lỗi!" );
        }
    }//GEN-LAST:event_jButtonAnhActionPerformed

    private void jTable_TTNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_TTNVMouseClicked
        int row = jTable_TTNV.getSelectedRow();
        TableModel model = jTable_TTNV.getModel();
        jTextField01.setText(model.getValueAt(row, 0).toString());
        jTextField02.setText(model.getValueAt(row, 1).toString());
        try{
            int drow = jTable_TTNV.getSelectedRow();
            Date NgayCap = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(row, 2));
            jDateChooser1.setDate(NgayCap);
        }
        catch (Exception e) {
            jOptionPane1.showMessageDialog(null, e);
        }  
        String GioiTinh = model.getValueAt(row, 3).toString();
            if(GioiTinh.equals("Nam")){
                jRadioButton1.setSelected(true);
            }
            else{
                jRadioButton2.setSelected(true);
            }        
        jTextField04.setText(model.getValueAt(row, 4).toString());        
        jTextField05.setText(model.getValueAt(row, 10).toString());
        byte[] Anh = (TTNVsList().get(row).getAnh());
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(Anh).getImage().getScaledInstance(A.getWidth(), A.getHeight(), Image.SCALE_SMOOTH ));
        A.setIcon(imageIcon);
        MaPhongBan = model.getValueAt(row, 5).toString();
        int i = 0;
        while (true) {
            String MPB = jComboBox01.getItemAt(i).toString();
            if(MPB.equalsIgnoreCase(MaPhongBan)){
                jComboBox01.setSelectedIndex(i);
                break;
            }
            i++;
        }
        MaBoPhan = model.getValueAt(row, 6).toString();
        int j = 0;
        while (true) {
            String MBP = jComboBox02.getItemAt(j).toString();
            if(MBP.equalsIgnoreCase(MaBoPhan)){
                jComboBox02.setSelectedIndex(j);
                break;
            }
            j++;
        }
        MaChucVu = model.getValueAt(row, 7).toString();
        int k = 0;
        while (true) {
            String MCV = jComboBox03.getItemAt(k).toString();
            if(MCV.equalsIgnoreCase(MaChucVu)){
                jComboBox03.setSelectedIndex(k);
                break;
            }
            k++;
        }        
        TTHonNhan = model.getValueAt(row, 8).toString();
        int l = 0;
        while(true) {
            String TTHN = jComboBox04.getItemAt(l).toString();
            if(TTHN.equalsIgnoreCase(TTHonNhan)){
                jComboBox04.setSelectedIndex(l);
                break;
            }
            l++;
        }
    }//GEN-LAST:event_jTable_TTNVMouseClicked

    private void jexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jexitActionPerformed
        // TODO add your handling code here:
        this.dispose();
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
            java.util.logging.Logger.getLogger(NhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 
                 NhanSu a = new NhanSu();
                 a.setLocationRelativeTo(null);
                 a.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButtonAnh;
    private javax.swing.JButton jButtonLuu1;
    private javax.swing.JButton jButtonRefresh1;
    private javax.swing.JButton jButtonSua1;
    private javax.swing.JButton jButtonThem1;
    private javax.swing.JButton jButtonXoa1;
    private javax.swing.JComboBox<String> jComboBox01;
    private javax.swing.JComboBox<String> jComboBox02;
    private javax.swing.JComboBox<String> jComboBox03;
    private javax.swing.JComboBox<String> jComboBox04;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JOptionPane jOptionPane2;
    private javax.swing.JOptionPane jOptionPane3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_TTNV;
    private javax.swing.JTextField jTextField01;
    private javax.swing.JTextField jTextField02;
    private javax.swing.JTextField jTextField04;
    private javax.swing.JTextField jTextField05;
    private javax.swing.JButton jexit;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables
}
