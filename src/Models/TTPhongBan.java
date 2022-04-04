/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author nguye
 */
public class TTPhongBan {
    String MaPB, TenPB, TruongPB, NgayNhanChuc, GhiChu;
    
    public TTPhongBan(){
        
    }

    public TTPhongBan(String MaPB, String TenPB, String TruongPB, String NgayNhanChuc, String GhiChu) {
        this.MaPB = MaPB;
        this.TenPB = TenPB;
        this.TruongPB = TruongPB;
        this.NgayNhanChuc = NgayNhanChuc;
        this.GhiChu = GhiChu;
    }

    public String getMaPB() {
        return MaPB;
    }

    public void setMaPB(String MaPB) {
        this.MaPB = MaPB;
    }

    public String getTenPB() {
        return TenPB;
    }

    public void setTenPB(String TenPB) {
        this.TenPB = TenPB;
    }

    public String getTruongPB() {
        return TruongPB;
    }

    public void setTruongPB(String TruongPB) {
        this.TruongPB = TruongPB;
    }

    public String getNgayNhanChuc() {
        return NgayNhanChuc;
    }

    public void setNgayNhanChuc(String NgayNhanChuc) {
        this.NgayNhanChuc = NgayNhanChuc;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
    
}
