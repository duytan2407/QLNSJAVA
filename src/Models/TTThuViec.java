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
public class TTThuViec {
    //String MaBangCongTV, MaBoPhan, MaPhongBan, MaNV, LuongTViec, ThoiGian, SoNgayCong, SoNgayNghi, SoGioLamThem, GhiChu;
    private String MaBangCongTV , MaBoPhan , MaPhongBan , MaNV , LuongTViec ,ThoiGian , SoNgayCong , SoNgayNghi , SoGioLamThem , GhiChu;
    
    public TTThuViec() {
        
    }

    public TTThuViec(String MaBangCongTV, String MaBoPhan, String MaPhongBan, String MaNV, String LuongTViec, String ThoiGian, String SoNgayCong, String SoNgayNghi, String SoGioLamThem, String GhiChu) {
        this.MaBangCongTV = MaBangCongTV;
        this.MaBoPhan = MaBoPhan;
        this.MaPhongBan = MaPhongBan;
        this.MaNV = MaNV;
        this.LuongTViec = LuongTViec;
        this.ThoiGian = ThoiGian;
        this.SoNgayCong = SoNgayCong;
        this.SoNgayNghi = SoNgayNghi;
        this.SoGioLamThem = SoGioLamThem;
        this.GhiChu = GhiChu;
    }

    public String getMaBangCongTV() {
        return MaBangCongTV;
    }

    public void setMaBangCongTV(String MaBangCongTV) {
        this.MaBangCongTV = MaBangCongTV;
    }

    public String getMaBoPhan() {
        return MaBoPhan;
    }

    public void setMaBoPhan(String MaBoPhan) {
        this.MaBoPhan = MaBoPhan;
    }

    public String getMaPhongBan() {
        return MaPhongBan;
    }

    public void setMaPhongBan(String MaPhongBan) {
        this.MaPhongBan = MaPhongBan;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getLuongTViec() {
        return LuongTViec;
    }

    public void setLuongTViec(String LuongTViec) {
        this.LuongTViec = LuongTViec;
    }

    public String getThoiGian() {
        return ThoiGian;
    }

    public void setThoiGian(String ThoiGian) {
        this.ThoiGian = ThoiGian;
    }

    public String getSoNgayCong() {
        return SoNgayCong;
    }

    public void setSoNgayCong(String SoNgayCong) {
        this.SoNgayCong = SoNgayCong;
    }

    public String getSoNgayNghi() {
        return SoNgayNghi;
    }

    public void setSoNgayNghi(String SoNgayNghi) {
        this.SoNgayNghi = SoNgayNghi;
    }

    public String getSoGioLamThem() {
        return SoGioLamThem;
    }

    public void setSoGioLamThem(String SoGioLamThem) {
        this.SoGioLamThem = SoGioLamThem;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
    
   
}
