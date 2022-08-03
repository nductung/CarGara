/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.dao;

import com.ptit.model.HoadonLinhkien;
import com.ptit.model.NhaCungCap;
import com.ptit.model.LinhKien;
import com.ptit.model.Nhanvien;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TUNGND
 */
public class TestHoaDonDAO {

    HoaDonDAO hoaDonDAO = new HoaDonDAO();

    public TestHoaDonDAO() {
    }

    @Test
    public void createHoaDon_NhanVienKhongTonTai() {
        Nhanvien nhanVien = new Nhanvien(1000, "Nguyen Duc Tung", "tungnd", "1");
        NhaCungCap nhaCungCap = new NhaCungCap(1, "N01", "Fina", "Ha Noi", "fina@gmail.com", "0111111", "");
        LinhKien linhKien = new LinhKien(1, "L01", "Bang keo", "cai", null, "Kia");

        List<HoadonLinhkien> slist = new ArrayList<>();

        HoadonLinhkien item = new HoadonLinhkien();
        item.setLinhKien(linhKien);
        item.setDonGia(10000f);
        item.setSoLuong(10);
        item.setThanhTien(10 * 10000f);

        slist.add(item);

        int f = 0;

        int response = hoaDonDAO.createHoaDon(nhanVien, nhaCungCap, slist);
        assertEquals(f, response);
    }

    @Test
    public void createHoaDon_NhaCungCapKhongTonTai() {
        Nhanvien nhanVien = new Nhanvien(10, "Nguyen Duc Tung", "tungnd", "1");
        NhaCungCap nhaCungCap = new NhaCungCap(1000, "N01", "Fina", "Ha Noi", "fina@gmail.com", "0111111", "");
        LinhKien linhKien = new LinhKien(1, "L01", "Bang keo", "cai", null, "Kia");

        List<HoadonLinhkien> slist = new ArrayList<>();

        HoadonLinhkien item = new HoadonLinhkien();
        item.setLinhKien(linhKien);
        item.setDonGia(10000f);
        item.setSoLuong(10);
        item.setThanhTien(10 * 10000f);

        slist.add(item);

        int f = 0;

        int response = hoaDonDAO.createHoaDon(nhanVien, nhaCungCap, slist);
        assertEquals(f, response);
    }

    @Test
    public void createHoaDon_LinhKienKhongTonTai() {
        Nhanvien nhanVien = new Nhanvien(10, "Nguyen Duc Tung", "tungnd", "1");
        NhaCungCap nhaCungCap = new NhaCungCap(1, "N01", "Fina", "Ha Noi", "fina@gmail.com", "0111111", "");
        LinhKien linhKien = new LinhKien(1000, "L01", "Bang keo", "cai", null, "Kia");

        List<HoadonLinhkien> slist = new ArrayList<>();

        HoadonLinhkien item = new HoadonLinhkien();
        item.setLinhKien(linhKien);
        item.setDonGia(10000f);
        item.setSoLuong(10);
        item.setThanhTien(10 * 10000f);

        slist.add(item);

        int f = 0;

        int response = hoaDonDAO.createHoaDon(nhanVien, nhaCungCap, slist);
        assertEquals(f, response);
    }

    @Test
    public void createHoaDon_ThanhCong() {
        Nhanvien nhanVien = new Nhanvien(10, "Nguyen Duc Tung", "tungnd", "1");
        NhaCungCap nhaCungCap = new NhaCungCap(1, "N01", "Fina", "Ha Noi", "fina@gmail.com", "0111111", "");
        LinhKien linhKien = new LinhKien(1, "L01", "Bang keo", "cai", null, "Kia");

        List<HoadonLinhkien> slist = new ArrayList<>();

        HoadonLinhkien item = new HoadonLinhkien();
        item.setLinhKien(linhKien);
        item.setDonGia(10000f);
        item.setSoLuong(10);
        item.setThanhTien(10 * 10000f);

        slist.add(item);

        int f = 1;

        int response = hoaDonDAO.createHoaDon(nhanVien, nhaCungCap, slist);
        assertEquals(f, response);
    }

}
