/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import ConnectToSql.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class timkiemluongdao {
    Database dt = new Database();
    Connection conn = null;
    PreparedStatement pst = null;
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
                JOptionPane.showMessageDialog(null, "Lỗi!");
            }
            return null;
        }


    public List<TTLuong> timkiemmaluong(String MaLuong)
    {    
            ResultSet rs = null;
            PreparedStatement pst = null;
            List<TTLuong> ls = new ArrayList<>();
         try{
            String sql = "select * from BangLuong where MaLuong like N'%"+MaLuong+"%'" ;
             conn = Database.getDBConnect();
              pst = conn.prepareStatement(sql);         
             rs = pst.executeQuery();
             TTLuong L;
             while(rs.next()){
                // TTNV = new TTLuong(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11));              
                 L = new TTLuong(rs.getString("MaLuong"), rs.getString("MaChucVu"), rs.getString("LCB"), rs.getString("PCChucVu"), rs.getString("NgayNhap"), rs.getString("LCBMoi"), rs.getString("NgaySua"), rs.getString("LyDo"), rs.getString("PCCVuMoi"), rs.getString("NgaySuaPC"), rs.getString("GhiChu"));                
                ls.add(L);
                 
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
    
     public List<TTLuong> timkiemmachucvu(String MaChucVu)
    {    
            ResultSet rs = null;
            PreparedStatement pst = null;
            List<TTLuong> ls = new ArrayList<>();
         try{
            String sql = "select * from BangLuong where MaChucVu like N'%"+MaChucVu+"%'" ;
             conn = Database.getDBConnect();
              pst = conn.prepareStatement(sql);         
             rs = pst.executeQuery();
             TTLuong L;
             while(rs.next()){
                // TTNV = new TTLuong(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11));              
                 L = new TTLuong(rs.getString("MaLuong"), rs.getString("MaChucVu"), rs.getString("LCB"), rs.getString("PCChucVu"), rs.getString("NgayNhap"), rs.getString("LCBMoi"), rs.getString("NgaySua"), rs.getString("LyDo"), rs.getString("PCCVuMoi"), rs.getString("NgaySuaPC"), rs.getString("GhiChu"));                
                ls.add(L);
                 
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
