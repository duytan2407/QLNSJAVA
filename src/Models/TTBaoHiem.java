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
public class TTBaoHiem {
    private String MaSBH, MaLoaiBH, MaNV, MaLuong, NoiCapSo, NgayCapSo, NgayHetHan, GhiChu;
    
    public TTBaoHiem(){
        
    }
       
    public TTBaoHiem(String MaSBH, String MaLoaiBH, String MaNV, String MaLuong, String NoiCapSo, String NgayCapSo, String NgayHetHan, String GhiChu) {
        this.MaSBH = MaSBH;
        this.MaLoaiBH = MaLoaiBH;
        this.MaNV = MaNV;
        this.MaLuong = MaLuong;
        this.NoiCapSo = NoiCapSo;
        this.NgayCapSo = NgayCapSo;
        this.NgayHetHan = NgayHetHan;
        this.GhiChu = GhiChu;
    }

    public String getMaSBH() {
        return MaSBH;
    }

    public void setMaSBH(String MaSBH) {
        this.MaSBH = MaSBH;
    }

    public String getMaLoaiBH() {
        return MaLoaiBH;
    }

    public void setMaLoaiBH(String MaLoaiBH) {
        this.MaLoaiBH = MaLoaiBH;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaLuong() {
        return MaLuong;
    }

    public void setMaLuong(String MaLuong) {
        this.MaLuong = MaLuong;
    }

    public String getNoiCapSo() {
        return NoiCapSo;
    }

    public void setNoiCapSo(String NoiCapSo) {
        this.NoiCapSo = NoiCapSo;
    }

    public String getNgayCapSo() {
        return NgayCapSo;
    }

    public void setNgayCapSo(String NgayCapSo) {
        this.NgayCapSo = NgayCapSo;
    }

    public String getNgayHetHan() {
        return NgayHetHan;
    }

    public void setNgayHetHan(String NgayHetHan) {
        this.NgayHetHan = NgayHetHan;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
}

