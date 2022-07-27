/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.model;

/**
 *
 * @author TUNGND
 */
public class HoaDon {

    private int ID;
    private String ngayNhapHang;
    private Float tongTien;
    private int nhanVienID;
    private int nhaCungCapID;

    public HoaDon() {
    }

    public HoaDon(int ID, String ngayNhapHang, Float tongTien, int nhanVienID, int nhaCungCapID) {
        this.ID = ID;
        this.ngayNhapHang = ngayNhapHang;
        this.tongTien = tongTien;
        this.nhanVienID = nhanVienID;
        this.nhaCungCapID = nhaCungCapID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNgayNhapHang() {
        return ngayNhapHang;
    }

    public void setNgayNhapHang(String ngayNhapHang) {
        this.ngayNhapHang = ngayNhapHang;
    }

    public Float getTongTien() {
        return tongTien;
    }

    public void setTongTien(Float tongTien) {
        this.tongTien = tongTien;
    }

    public int getNhanVienID() {
        return nhanVienID;
    }

    public void setNhanVienID(int nhanVienID) {
        this.nhanVienID = nhanVienID;
    }

    public int getNhaCungCapID() {
        return nhaCungCapID;
    }

    public void setNhaCungCapID(int nhaCungCapID) {
        this.nhaCungCapID = nhaCungCapID;
    }
}
