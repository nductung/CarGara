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
public class HoadonLinhkien {

    private int ID;
    private String ma;
    private String ten;
    private String hang;
    private Float donGia;
    private int soLuong;
    private Float thanhTien;
    private int linhKienID;
    private int hoaDonID;

    public HoadonLinhkien() {
    }

    public HoadonLinhkien(int ID, String ma, String ten, String hang, Float donGia, int soLuong, Float thanhTien, int linhKienID, int hoaDonID) {
        this.ID = ID;
        this.ma = ma;
        this.ten = ten;
        this.hang = hang;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
        this.linhKienID = linhKienID;
        this.hoaDonID = hoaDonID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public Float getDonGia() {
        return donGia;
    }

    public void setDonGia(Float donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(Float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public int getLinhKienID() {
        return linhKienID;
    }

    public void setLinhKienID(int linhKienID) {
        this.linhKienID = linhKienID;
    }

    public int getHoaDonID() {
        return hoaDonID;
    }

    public void setHoaDonID(int hoaDonID) {
        this.hoaDonID = hoaDonID;
    }

}
