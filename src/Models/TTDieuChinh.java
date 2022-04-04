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
public class TTDieuChinh {
    String MaDieuChinh, MaNV, HoTen, ChucVu, LCBCu, PCapCu, LCBMoi, PcapMoi, MaDG, NgayDC, GhiChu;
    
    public TTDieuChinh(){
        
    }

    public TTDieuChinh(String MaDieuChinh, String MaNV, String HoTen, String ChucVu, String LCBCu, String PCapCu, String LCBMoi, String PcapMoi, String MaDG, String NgayDC, String GhiChu) {
        this.MaDieuChinh = MaDieuChinh;
        this.MaNV = MaNV;
        this.HoTen = HoTen;
        this.ChucVu = ChucVu;
        this.LCBCu = LCBCu;
        this.PCapCu = PCapCu;
        this.LCBMoi = LCBMoi;
        this.PcapMoi = PcapMoi;
        this.MaDG = MaDG;
        this.NgayDC = NgayDC;
        this.GhiChu = GhiChu;
    }

    public String getMaDieuChinh() {
        return MaDieuChinh;
    }

    public void setMaDieuChinh(String MaDieuChinh) {
        this.MaDieuChinh = MaDieuChinh;
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

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public String getLCBCu() {
        return LCBCu;
    }

    public void setLCBCu(String LCBCu) {
        this.LCBCu = LCBCu;
    }

    public String getPCapCu() {
        return PCapCu;
    }

    public void setPCapCu(String PCapCu) {
        this.PCapCu = PCapCu;
    }

    public String getLCBMoi() {
        return LCBMoi;
    }

    public void setLCBMoi(String LCBMoi) {
        this.LCBMoi = LCBMoi;
    }

    public String getPcapMoi() {
        return PcapMoi;
    }

    public void setPcapMoi(String PcapMoi) {
        this.PcapMoi = PcapMoi;
    }

    public String getMaDG() {
        return MaDG;
    }

    public void setMaDG(String MaDG) {
        this.MaDG = MaDG;
    }

    public String getNgayDC() {
        return NgayDC;
    }

    public void setNgayDC(String NgayDC) {
        this.NgayDC = NgayDC;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

   
    
}
