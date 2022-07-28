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
public class LinhKien {

    private int ID;
    private String ma;
    private String ten;
    private String donVi;
    private int nhaCungCapID;
    private String hang;

    public LinhKien() {
        super();
    }

    public LinhKien(int ID, String ma, String ten, String donVi, int nhaCungCapID, String hang) {
        this.ID = ID;
        this.ma = ma;
        this.ten = ten;
        this.donVi = donVi;
        this.nhaCungCapID = nhaCungCapID;
        this.hang = hang;
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

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public int getNhaCungCapID() {
        return nhaCungCapID;
    }

    public void setNhaCungCapID(int nhaCungCapID) {
        this.nhaCungCapID = nhaCungCapID;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

}
