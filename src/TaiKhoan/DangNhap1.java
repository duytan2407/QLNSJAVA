/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaiKhoan;
import Models.userDao;
import ConnectToSql.Database;
import Menu.*;
import Models.Share;
import Models.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import  javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class DangNhap1 extends javax.swing.JDialog {

    /**
     * Creates new form DangNhap1
     */
    public DangNhap1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        matkhau = new javax.swing.JLabel();
        dangnhap = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        txtdangnhap = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btndangnhap = new javax.swing.JButton();
        btnthoat = new javax.swing.JButton();
        chkremember = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quản Lí Nhân Sự", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        matkhau.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        matkhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/mk.png"))); // NOI18N
        matkhau.setText("Mật Khẩu");

        dangnhap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dangnhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/administrator.png"))); // NOI18N
        dangnhap.setText("Đăng Nhập");

        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpassKeyPressed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/dangki.png"))); // NOI18N
        jButton1.setText("Đăng Ký");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btndangnhap.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btndangnhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/dangnhap.png"))); // NOI18N
        btndangnhap.setText("Đăng Nhập");
        btndangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndangnhapActionPerformed(evt);
            }
        });
        btndangnhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btndangnhapKeyPressed(evt);
            }
        });

        btnthoat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnthoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/exiit.png"))); // NOI18N
        btnthoat.setText("Thoát");
        btnthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthoatActionPerformed(evt);
            }
        });

        chkremember.setBackground(new java.awt.Color(204, 255, 204));
        chkremember.setSelected(true);
        chkremember.setText("Nhớ Mật Khẩu");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/icon/Changepass.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(btndangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnthoat, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(matkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dangnhap))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdangnhap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkremember, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(matkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(chkremember))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnthoat))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new DangKy().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btndangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangnhapActionPerformed
        // TODO add your handling code here:
        //        try {
            ////            Class.forName("com.mysql.jdbc.Diver");
            ////            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=DATAQLNS;user=sa;password=9091314");
            ////            Database data = new Database();
            //            String sql = "Select * from Users where usernname = ? and pass = ? " ;
            //            Connection conn = Database.getDBConnect();
            //            PreparedStatement pst = conn.prepareStatement(sql);
            //
            //            pst.setString(1, txtdangnhap.getText());
            //            pst.setString(2, txtmatkhau.getText());
            //            ResultSet rs = pst.executeQuery();
            //            if(rs.next())
            //            {
                //                JOptionPane.showMessageDialog(null, "dang nhap thanh cong");
                //
                //            }
            //            else
            //            {
                //                JOptionPane.showMessageDialog(null, "không đúng mật khầu");
                //                Share.nguoidangnhap = rs;
                //                txtdangnhap.setText("");
                //                txtmatkhau.setText("");
                //            }
            //            conn.close();
            //        } catch (Exception e) {
            //            JOptionPane.showMessageDialog(null, e);
            //        }
        //  StringBuffer sb = new StringBuffer();

       

    }//GEN-LAST:event_btndangnhapActionPerformed

    private void btnthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthoatActionPerformed
        dangnhap dk = new dangnhap();
        dk.dispose();

        this.dispose();

    }//GEN-LAST:event_btnthoatActionPerformed

    private void btndangnhapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btndangnhapKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode())==KeyEvent.VK_ENTER){
             userDao dao = new userDao();
             
        try{
            NguoiDung nd = dao.checkloginDung(txtdangnhap.getText(), new String(txtpass.getPassword()));
           
            if(nd == null)
            {
                MessageDialogHelper.Showmesserror(this,"Ten dang nhap hoac mk sai","lổi");

            }
            else{
                Share.nguoidangnhap = nd ;
                 //JOptionPane.showMessageDialog(null, "Mã lương đã tồn tại!",  "Thông báo", JOptionPane.OK_OPTION);
                this.dispose();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            MessageDialogHelper.Showmesserror(this, e.getMessage(), "lỗi");
        }
        }
        
    }//GEN-LAST:event_btndangnhapKeyPressed

    private void txtpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
             userDao dao = new userDao();
        try{
            NguoiDung nd = dao.checkloginDung(txtdangnhap.getText(), new String(txtpass.getPassword()));
            if(nd == null)
            {
                MessageDialogHelper.Showmesserror(this,"Ten dang nhap hoac mk sai","lổi");

            }
            else{
                Share.nguoidangnhap = nd ;
                this.dispose();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            MessageDialogHelper.Showmesserror(this, e.getMessage(), "lỗi");
        }
        }   
    }//GEN-LAST:event_txtpassKeyPressed

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
            java.util.logging.Logger.getLogger(DangNhap1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DangNhap1 dialog = new DangNhap1(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndangnhap;
    private javax.swing.JButton btnthoat;
    private javax.swing.JCheckBox chkremember;
    private javax.swing.JLabel dangnhap;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel matkhau;
    private javax.swing.JTextField txtdangnhap;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables

    private void btndangnhap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
