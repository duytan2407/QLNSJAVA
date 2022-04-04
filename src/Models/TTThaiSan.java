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
public class TTThaiSan {
    private String MaThaiSan, HoTen, MaNV, MaPhongBan, MaBoPhan, NgaySinh, NgayVeSom, NgayNghiSinh, NgayLamTroLai, TroCapCTY, GhiChu; 

    private TTThaiSan(){
        
    }
    
    public TTThaiSan(String MaThaiSan, String HoTen, String MaNV, String MaPhongBan, String MaBoPhan, String NgaySinh, String NgayVeSom, String NgayNghiSinh, String NgayLamTroLai, String TroCapCTY, String GhiChu) {
        this.MaThaiSan = MaThaiSan;
        this.HoTen = HoTen;
        this.MaNV = MaNV;
        this.MaPhongBan = MaPhongBan;
        this.MaBoPhan = MaBoPhan;
        this.NgaySinh = NgaySinh;
        this.NgayVeSom = NgayVeSom;
        this.NgayNghiSinh = NgayNghiSinh;
        this.NgayLamTroLai = NgayLamTroLai;
        this.TroCapCTY = TroCapCTY;
        this.GhiChu = GhiChu;
    }

    public String getMaThaiSan() {
        return MaThaiSan;
    }

    public void setMaThaiSan(String MaThaiSan) {
        this.MaThaiSan = MaThaiSan;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaPhongBan() {
        return MaPhongBan;
    }

    public void setMaPhongBan(String MaPhongBan) {
        this.MaPhongBan = MaPhongBan;
    }

    public String getMaBoPhan() {
        return MaBoPhan;
    }

    public void setMaBoPhan(String MaBoPhan) {
        this.MaBoPhan = MaBoPhan;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getNgayVeSom() {
        return NgayVeSom;
    }

    public void setNgayVeSom(String NgayVeSom) {
        this.NgayVeSom = NgayVeSom;
    }

    public String getNgayNghiSinh() {
        return NgayNghiSinh;
    }

    public void setNgayNghiSinh(String NgayNghiSinh) {
        this.NgayNghiSinh = NgayNghiSinh;
    }

    public String getNgayLamTroLai() {
        return NgayLamTroLai;
    }

    public void setNgayLamTroLai(String NgayLamTroLai) {
        this.NgayLamTroLai = NgayLamTroLai;
    }

    public String getTroCapCTY() {
        return TroCapCTY;
    }

    public void setTroCapCTY(String TroCapCTY) {
        this.TroCapCTY = TroCapCTY;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
    
}
    
