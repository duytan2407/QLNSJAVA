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
public class TTHoSo {
    String MaHoSoTV, MaBangCongTV, MaNV, HoTen, NgaySinh, GioiTinh, DiaChi, SDT, TDHocVan, ViTriThuViec, GhiChu ;
    
    public TTHoSo(){       
    }

    public TTHoSo(String MaHoSoTV, String MaBangCongTV, String MaNV, String HoTen, String NgaySinh, String GioiTinh, String DiaChi, String SDT, String TDHocVan, String ViTriThuViec, String GhiChu) {
        this.MaHoSoTV = MaHoSoTV;
        this.MaBangCongTV = MaBangCongTV;
        this.MaNV = MaNV;
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.TDHocVan = TDHocVan;
        this.ViTriThuViec = ViTriThuViec;
        this.GhiChu = GhiChu;
    }

    public String getMaHoSoTV() {
        return MaHoSoTV;
    }

    public void setMaHoSoTV(String MaHoSoTV) {
        this.MaHoSoTV = MaHoSoTV;
    }

    public String getMaBangCongTV() {
        return MaBangCongTV;
    }

    public void setMaBangCongTV(String MaBangCongTV) {
        this.MaBangCongTV = MaBangCongTV;
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

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getTDHocVan() {
        return TDHocVan;
    }

    public void setTDHocVan(String TDHocVan) {
        this.TDHocVan = TDHocVan;
    }

    public String getViTriThuViec() {
        return ViTriThuViec;
    }

    public void setViTriThuViec(String ViTriThuViec) {
        this.ViTriThuViec = ViTriThuViec;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

   
}

