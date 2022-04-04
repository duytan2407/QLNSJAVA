/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

public class TTBoPhan {
    private String MaBoPhan, TenBoPhan, MaPhongBan, TruongBoPhan, NgayNhanChuc, GhiChu; 
    
    public TTBoPhan() {        
    }
    
    public TTBoPhan(String MaBoPhan, String TenBoPhan, String MaPhongBan, String TruongBoPhan, String NgayNhanChuc, String GhiChu) {
        this.MaBoPhan = MaBoPhan;
        this.TenBoPhan = TenBoPhan;
        this.MaPhongBan = MaPhongBan;
        this.TruongBoPhan = TruongBoPhan;
        this.NgayNhanChuc = NgayNhanChuc;
        this.GhiChu = GhiChu;
    }

    public String getMaBoPhan() {
        return MaBoPhan;
    }

    public void setMaBoPhan(String MaBoPhan) {
        this.MaBoPhan = MaBoPhan;
    }

    public String getTenBoPhan() {
        return TenBoPhan;
    }

    public void setTenBoPhan(String TenBoPhan) {
        this.TenBoPhan = TenBoPhan;
    }

    public String getMaPhongBan() {
        return MaPhongBan;
    }

    public void setMaPhongBan(String MaPhongBan) {
        this.MaPhongBan = MaPhongBan;
    }

    public String getTruongBoPhan() {
        return TruongBoPhan;
    }

    public void setTruongBoPhan(String TruongBoPhan) {
        this.TruongBoPhan = TruongBoPhan;
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

