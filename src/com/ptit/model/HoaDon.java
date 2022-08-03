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
    private int isThannToan;
    private Nhanvien nhanVien;
    private NhaCungCap nhaCungCap;

    public HoaDon() {
    }

    public HoaDon(int ID, String ngayNhapHang, Float tongTien, int isThannToan, Nhanvien nhanVien, NhaCungCap nhaCungCap) {
        this.ID = ID;
        this.ngayNhapHang = ngayNhapHang;
        this.tongTien = tongTien;
        this.isThannToan = isThannToan;
        this.nhanVien = nhanVien;
        this.nhaCungCap = nhaCungCap;
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

    public int getIsThannToan() {
        return isThannToan;
    }

    public void setIsThannToan(int isThannToan) {
        this.isThannToan = isThannToan;
    }

    public Nhanvien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(Nhanvien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public NhaCungCap getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(NhaCungCap nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

}
