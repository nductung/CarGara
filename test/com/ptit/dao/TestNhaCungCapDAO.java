/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.dao;

import com.ptit.model.NhaCungCap;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DUONGNV
 */
public class TestNhaCungCapDAO {

    NhaCungCapDAO nhaCungCapDAO = new NhaCungCapDAO();

    public TestNhaCungCapDAO() {
    }

    @Test
    public void getNhaCungCap_KhongTimThay() {
        int size = 0;
        String key = "key";
        List<NhaCungCap> nhaCungCaps = nhaCungCapDAO.getNhaCungCap(key);
        assertEquals(size, nhaCungCaps.size());
    }

    @Test
    public void getNhaCungCap_TimThay() {
        int size = 1;
        String key = "fina";
        List<NhaCungCap> nhaCungCaps = nhaCungCapDAO.getNhaCungCap(key);
        assertEquals(size, nhaCungCaps.size());
    }

    @Test
    public void createNhaCungCap_ThieuTruongDuLieu() {
        NhaCungCap input = new NhaCungCap();
        input.setMa(null);
        input.setTen("Ten");
        input.setDiaChi("DiaChi");
        input.setEmail("Email");
        input.setDienThoai("DienThoai");
        input.setMoTa("MoTa");

        int f = 0;

        int response = nhaCungCapDAO.createNhaCungCap(input);
        assertEquals(f, response);
    }

    @Test
    public void createNhaCungCap_TrungMa() {
        NhaCungCap input = new NhaCungCap();
        input.setMa("N01");
        input.setTen("Ten");
        input.setDiaChi("DiaChi");
        input.setEmail("Email");
        input.setDienThoai("DienThoai");
        input.setMoTa("MoTa");

        int f = -1;

        int response = nhaCungCapDAO.createNhaCungCap(input);
        assertEquals(f, response);
    }

    @Test
    public void createNhaCungCap_ThanhCong() {
        NhaCungCap input = new NhaCungCap();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
        LocalDateTime now = LocalDateTime.now();

        input.setMa("N" + dtf.format(now));
        input.setTen("Ten");
        input.setDiaChi("DiaChi");
        input.setEmail("Email");
        input.setDienThoai("DienThoai");
        input.setMoTa("MoTa");

        int f = 1;

        int response = nhaCungCapDAO.createNhaCungCap(input);
        assertEquals(f, response);
    }

}
