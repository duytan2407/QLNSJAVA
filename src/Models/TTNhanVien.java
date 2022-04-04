/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

public class TTNhanVien {
    String MaNV, HoTen, NgaySinh, GioiTinh, MaHopDong, MaPhongBan, MaBoPhan, MaChucVu, TTHonNhan, GhiChu;
    byte[] Anh;
    
    public TTNhanVien(){
        
    }

   

//    public void setAnh(byte[] Anh) {
//        this.Anh = Anh;
//    }

    public TTNhanVien(String MaNV, String HoTen, String NgaySinh, String GioiTinh, String MaHopDong, String MaPhongBan, String MaBoPhan, String MaChucVu, String TTHonNhan, String GhiChu, byte[] Anh) {
        this.MaNV = MaNV;
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.MaHopDong = MaHopDong;
        this.MaPhongBan = MaPhongBan;
        this.MaBoPhan = MaBoPhan;
        this.MaChucVu = MaChucVu;
        this.TTHonNhan = TTHonNhan;
        this.GhiChu = GhiChu;
        this.Anh = Anh;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getMaHopDong() {
        return MaHopDong;
    }

    public void setMaHopDong(String MaHopDong) {
        this.MaHopDong = MaHopDong;
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

    public String getMaChucVu() {
        return MaChucVu;
    }

    public void setMaChucVu(String MaChucVu) {
        this.MaChucVu = MaChucVu;
    }

    public String getTTHonNhan() {
        return TTHonNhan;
    }

    public void setTTHonNhan(String TTHonNhan) {
        this.TTHonNhan = TTHonNhan;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public byte[] getAnh() {
        return Anh;
    }

    public void setAnh(byte[] Anh) {
        this.Anh = Anh;
    }

    
    
}
