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
public class NhaCungCap {

    private int ID;
    private String ma;
    private String ten;
    private String diaChi;
    private String email;
    private String dienThoai;
    private String moTa;

    public NhaCungCap() {
        super();
    }

    public NhaCungCap(int ID, String ma, String ten, String diaChi, String email, String dienThoai, String moTa) {
        this.ID = ID;
        this.ma = ma;
        this.ten = ten;
        this.diaChi = diaChi;
        this.email = email;
        this.dienThoai = dienThoai;
        this.moTa = moTa;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

}
