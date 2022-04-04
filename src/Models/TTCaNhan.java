/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Date;

/**
 *
 * @author nguye
 */
public class TTCaNhan {

    //private String MaNV, NoiSinh, NguyenQuan, DCThuongTru, DCTamTru, SDT, CMTND, NoiCap, DanToc, TonGiao, QuocTich, TiengNN, TrinhDoNN, TDHocVan, GhiChu, NgayCap;
    private  String MaNV,NoiSinh,NguyenQuan,DCThuongChu	,DCTamChu,SDT,CMTND,NgayCap,NoiCap,DanToc,TonGiao,QuocTich,TiengNN,TrinhDoNN,TDHocVan,GhiChu;	
    public TTCaNhan() {
    }    

    public TTCaNhan(String MaNV, String NoiSinh, String NguyenQuan, String DCThuongChu, String DCTamChu, String SDT, String CMTND, String NgayCap, String NoiCap, String DanToc, String TonGiao, String QuocTich, String TiengNN, String TrinhDoNN, String TDHocVan, String GhiChu) {
        this.MaNV = MaNV;
        this.NoiSinh = NoiSinh;
        this.NguyenQuan = NguyenQuan;
        this.DCThuongChu = DCThuongChu;
        this.DCTamChu = DCTamChu;
        this.SDT = SDT;
        this.CMTND = CMTND;
        this.NgayCap = NgayCap;
        this.NoiCap = NoiCap;
        this.DanToc = DanToc;
        this.TonGiao = TonGiao;
        this.QuocTich = QuocTich;
        this.TiengNN = TiengNN;
        this.TrinhDoNN = TrinhDoNN;
        this.TDHocVan = TDHocVan;
        this.GhiChu = GhiChu;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getNoiSinh() {
        return NoiSinh;
    }

    public void setNoiSinh(String NoiSinh) {
        this.NoiSinh = NoiSinh;
    }

    public String getNguyenQuan() {
        return NguyenQuan;
    }

    public void setNguyenQuan(String NguyenQuan) {
        this.NguyenQuan = NguyenQuan;
    }

    public String getDCThuongChu() {
        return DCThuongChu;
    }

    public void setDCThuongChu(String DCThuongChu) {
        this.DCThuongChu = DCThuongChu;
    }

    public String getDCTamChu() {
        return DCTamChu;
    }

    public void setDCTamChu(String DCTamChu) {
        this.DCTamChu = DCTamChu;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getCMTND() {
        return CMTND;
    }

    public void setCMTND(String CMTND) {
        this.CMTND = CMTND;
    }

    public String getNgayCap() {
        return NgayCap;
    }

    public void setNgayCap(String NgayCap) {
        this.NgayCap = NgayCap;
    }

    public String getNoiCap() {
        return NoiCap;
    }

    public void setNoiCap(String NoiCap) {
        this.NoiCap = NoiCap;
    }

    public String getDanToc() {
        return DanToc;
    }

    public void setDanToc(String DanToc) {
        this.DanToc = DanToc;
    }

    public String getTonGiao() {
        return TonGiao;
    }

    public void setTonGiao(String TonGiao) {
        this.TonGiao = TonGiao;
    }

    public String getQuocTich() {
        return QuocTich;
    }

    public void setQuocTich(String QuocTich) {
        this.QuocTich = QuocTich;
    }

    public String getTiengNN() {
        return TiengNN;
    }

    public void setTiengNN(String TiengNN) {
        this.TiengNN = TiengNN;
    }

    public String getTrinhDoNN() {
        return TrinhDoNN;
    }

    public void setTrinhDoNN(String TrinhDoNN) {
        this.TrinhDoNN = TrinhDoNN;
    }

    public String getTDHocVan() {
        return TDHocVan;
    }

    public void setTDHocVan(String TDHocVan) {
        this.TDHocVan = TDHocVan;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    
}
