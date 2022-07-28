/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.dao;

import com.ptit.model.LinhKien;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TUNGND
 */
public class TestLinhKienDAO {

    LinhKienDAO linhKienDAO = new LinhKienDAO();

    public TestLinhKienDAO() {
    }

    @Test
    public void getLinhKien_KhongTimThay() {
        int size = 0;
        String key = "key";
        List<LinhKien> linhKiens = linhKienDAO.getLinhKien(1, key);
        assertEquals(size, linhKiens.size());
    }

    @Test
    public void getLinhKien_TimThay() {
        int size = 1;
        String key = "Bang keo";
        List<LinhKien> linhKiens = linhKienDAO.getLinhKien(1, key);
        assertEquals(size, linhKiens.size());
    }

    @Test
    public void createLinhKien_ThieuTruongDuLieu() {
        int nhaCungCapID = 1;

        LinhKien input = new LinhKien();
        input.setMa(null);
        input.setTen("Ten");
        input.setDonVi("DonVi");
        input.setNhaCungCapID(nhaCungCapID);
        input.setHang("Hang");

        int f = 0;

        int response = linhKienDAO.createLinhKien(input);
        assertEquals(f, response);
    }

    @Test
    public void createNhaCungCap_TrungMa() {
        int nhaCungCapID = 1;

        LinhKien input = new LinhKien();
        input.setMa("L01");
        input.setTen("Ten");
        input.setDonVi("DonVi");
        input.setNhaCungCapID(nhaCungCapID);
        input.setHang("Hang");

        int f = -1;

        int response = linhKienDAO.createLinhKien(input);
        assertEquals(f, response);
    }

    @Test
    public void createNhaCungCap_NhaCungCapKhongTonTai() {
        int nhaCungCapID = 1000;

        LinhKien input = new LinhKien();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
        LocalDateTime now = LocalDateTime.now();

        input.setMa("L" + dtf.format(now));
        input.setTen("Ten");
        input.setDonVi("DonVi");
        input.setNhaCungCapID(nhaCungCapID);
        input.setHang("Hang");

        int f = 0;

        int response = linhKienDAO.createLinhKien(input);
        assertEquals(f, response);
    }

    @Test
    public void createNhaCungCap_ThanhCong() {
        int nhaCungCapID = 1;

        LinhKien input = new LinhKien();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
        LocalDateTime now = LocalDateTime.now();

        input.setMa("L" + dtf.format(now));
        input.setTen("Ten");
        input.setDonVi("DonVi");
        input.setNhaCungCapID(nhaCungCapID);
        input.setHang("Hang");

        int f = 1;

        int response = linhKienDAO.createLinhKien(input);
        assertEquals(f, response);
    }

}
