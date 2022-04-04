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
public class TTLuong {
    //String MaLuong, MaChucVu, LCB, PCChucVu, NgayNhap, LCBMoi, NgaySua, LyDo, PCCVuMoi, NgaySuaPC, GhiChu;
 private String MaLuong,	
MaChucVu,	
LCB,	
PCChucVu,	
NgayNhap,	
LCBMoi,	
NgaySua,	
LyDo,	
PCCVuMoi,	
NgaySuaPC,	
GhiChu;	
		
    public TTLuong(){
        
    }
    
    public TTLuong(String MaLuong, String MaChucVu, String LCB, String PCChucVu, String NgayNhap, String LCBMoi, String NgaySua, String LyDo, String PCCVuMoi, String NgaySuaPC, String GhiChu) {
        this.MaLuong = MaLuong;
        this.MaChucVu = MaChucVu;
        this.LCB = LCB;
        this.PCChucVu = PCChucVu;
        this.NgayNhap = NgayNhap;
        this.LCBMoi = LCBMoi;
        this.NgaySua = NgaySua;
        this.LyDo = LyDo;
        this.PCCVuMoi = PCCVuMoi;
        this.NgaySuaPC = NgaySuaPC;
        this.GhiChu = GhiChu;
    }

    public String getMaLuong() {
        return MaLuong;
    }

    public void setMaLuong(String MaLuong) {
        this.MaLuong = MaLuong;
    }

    public String getMaChucVu() {
        return MaChucVu;
    }

    public void setMaChucVu(String MaChucVu) {
        this.MaChucVu = MaChucVu;
    }

    public String getLCB() {
        return LCB;
    }

    public void setLCB(String LCB) {
        this.LCB = LCB;
    }

    public String getPCChucVu() {
        return PCChucVu;
    }

    public void setPCChucVu(String PCChucVu) {
        this.PCChucVu = PCChucVu;
    }

    public String getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(String NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public String getLCBMoi() {
        return LCBMoi;
    }

    public void setLCBMoi(String LCBMoi) {
        this.LCBMoi = LCBMoi;
    }

    public String getNgaySua() {
        return NgaySua;
    }

    public void setNgaySua(String NgaySua) {
        this.NgaySua = NgaySua;
    }

    public String getLyDo() {
        return LyDo;
    }

    public void setLyDo(String LyDo) {
        this.LyDo = LyDo;
    }

    public String getPCCVuMoi() {
        return PCCVuMoi;
    }

    public void setPCCVuMoi(String PCCVuMoi) {
        this.PCCVuMoi = PCCVuMoi;
    }

    public String getNgaySuaPC() {
        return NgaySuaPC;
    }

    public void setNgaySuaPC(String NgaySuaPC) {
        this.NgaySuaPC = NgaySuaPC;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
}
