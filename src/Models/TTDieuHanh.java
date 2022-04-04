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
public class TTDieuHanh {
    String  MaNV, LCB, PhuCapCVu, PHuCapKhac, ThoiGian, SoNgayCongThang, SoNgayNghi, SoGioLamThem, GhiChu;
    
    public TTDieuHanh(){
        
    }

    public TTDieuHanh( String MaNV, String LCB, String PhuCapCVu, String PHuCapKhac, String ThoiGian, String SoNgayCongThang, String SoNgayNghi, String SoGioLamThem, String GhiChu) {        
        this.MaNV = MaNV;
        this.LCB = LCB;
        this.PhuCapCVu = PhuCapCVu;
        this.PHuCapKhac = PHuCapKhac;
        this.ThoiGian = ThoiGian;
        this.SoNgayCongThang = SoNgayCongThang;
        this.SoNgayNghi = SoNgayNghi;
        this.SoGioLamThem = SoGioLamThem;
        this.GhiChu = GhiChu;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getLCB() {
        return LCB;
    }

    public void setLCB(String LCB) {
        this.LCB = LCB;
    }

    public String getPhuCapCVu() {
        return PhuCapCVu;
    }

    public void setPhuCapCVu(String PhuCapCVu) {
        this.PhuCapCVu = PhuCapCVu;
    }

    public String getPHuCapKhac() {
        return PHuCapKhac;
    }

    public void setPHuCapKhac(String PHuCapKhac) {
        this.PHuCapKhac = PHuCapKhac;
    }

    public String getThoiGian() {
        return ThoiGian;
    }

    public void setThoiGian(String ThoiGian) {
        this.ThoiGian = ThoiGian;
    }

    public String getSoNgayCongThang() {
        return SoNgayCongThang;
    }

    public void setSoNgayCongThang(String SoNgayCongThang) {
        this.SoNgayCongThang = SoNgayCongThang;
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
