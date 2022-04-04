/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import ConnectToSql.Database;
import Models.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class TimKiemDao {
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
    public ArrayList<TTNhanVien> TTNVsList(){
            ArrayList<TTNhanVien> TTCNsList = new ArrayList<>();
            try {
                conn = Database.getDBConnect();
                String sql = "select * from TTNVCoBan " ;
                PreparedStatement pst = conn.prepareStatement(sql);         
                ResultSet rs = pst.executeQuery();
                TTNhanVien TTNV;
                while(rs.next()){
                    TTNV = new TTNhanVien(rs.getString("MaNV"), rs.getString("HoTen"), rs.getString("NgaySinh"), rs.getString("GioiTinh"), rs.getString("MaHopDong"), rs.getString("MaPhongBan"), rs.getString("MaBoPhan"), rs.getString("MaChucVu"), rs.getString("TTHonNhan"), rs.getString("GhiChu"), rs.getBytes("Anh"));              
                    TTCNsList.add(TTNV); 
                }
                return TTCNsList;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Lỗi!");
            }
            return null;
        }
    public List<TTNhanVien> timkiemid(String MaNV)
    {    
            ResultSet rs = null;
            PreparedStatement pst = null;
            List<TTNhanVien> ls = new ArrayList<>();
         try{
             String sql = "select * from TTNVCoBan where MaNV='" + MaNV + "'" ;
             conn = Database.getDBConnect();
              pst = conn.prepareStatement(sql);         
             rs = pst.executeQuery();
             TTNhanVien TTNV;
             while(rs.next()){
                 TTNV = new TTNhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getBytes(11));              
                  ls.add(TTNV);
                 
             }
           }
           catch(Exception e)
           {
               System.out.println("Error:" + e.toString());
           }
          finally{
             try {
                 rs.close(); pst.close(); conn.close();
             } catch (Exception e) {
             }
         }
         return  ls;
 }
     public List<TTNhanVien> timkiemname(String HoTen)
    {    
            ResultSet rs = null;
            PreparedStatement pst = null;
            List<TTNhanVien> ls = new ArrayList<>();
         try{
             String sql = "select * from TTNVCoBan where HoTen like N'%"+HoTen+"%'" ;
             conn = Database.getDBConnect();
              pst = conn.prepareStatement(sql);         
             rs = pst.executeQuery();
             TTNhanVien TTNV;
             while(rs.next()){
                 TTNV = new TTNhanVien(rs.getString("MaNV"), rs.getString("HoTen"), rs.getString("NgaySinh"), rs.getString("GioiTinh"), rs.getString("MaHopDong"), rs.getString("MaPhongBan"), rs.getString("MaBoPhan"), rs.getString("MaChucVu"), rs.getString("TTHonNhan"), rs.getString("GhiChu"), rs.getBytes("Anh"));              
                 ls.add(TTNV);
                 
             }
           }
           catch(Exception e)
           {
               System.out.println("Error:" + e.toString());
           }
          finally{
             try {
                 rs.close(); pst.close(); conn.close();
             } catch (Exception e) {
             }
         }
         return  ls;
 }
    
 } 
  

