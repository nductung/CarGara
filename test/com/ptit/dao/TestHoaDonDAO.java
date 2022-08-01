/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.dao;

import com.ptit.model.HoadonLinhkien;
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
        int nhanVienID = 1000;
        int nhaCungCapID = 1;
        int linhKienID = 1;

        List<HoadonLinhkien> slist = new ArrayList<>();

        HoadonLinhkien item = new HoadonLinhkien();
        item.setLinhKienID(linhKienID);
        item.setDonGia(10000f);
        item.setSoLuong(10);
        item.setThanhTien(10 * 10000f);

        slist.add(item);

        int f = 0;

        int response = hoaDonDAO.createHoaDon(nhanVienID, nhaCungCapID, slist);
        assertEquals(f, response);
    }

    @Test
    public void createHoaDon_NhaCungCapKhongTonTai() {
        int nhanVienID = 10;
        int nhaCungCapID = 1000;
        int linhKienID = 1;

        List<HoadonLinhkien> slist = new ArrayList<>();

        HoadonLinhkien item = new HoadonLinhkien();
        item.setLinhKienID(linhKienID);
        item.setDonGia(10000f);
        item.setSoLuong(10);
        item.setThanhTien(10 * 10000f);

        slist.add(item);

        int f = 0;

        int response = hoaDonDAO.createHoaDon(nhanVienID, nhaCungCapID, slist);
        assertEquals(f, response);
    }

    @Test
    public void createHoaDon_LinhKienKhongTonTai() {
        int nhanVienID = 10;
        int nhaCungCapID = 1;
        int linhKienID = 1000;

        List<HoadonLinhkien> slist = new ArrayList<>();

        HoadonLinhkien item = new HoadonLinhkien();
        item.setLinhKienID(linhKienID);
        item.setDonGia(10000f);
        item.setSoLuong(10);
        item.setThanhTien(10 * 10000f);

        slist.add(item);

        int f = 0;

        int response = hoaDonDAO.createHoaDon(nhanVienID, nhaCungCapID, slist);
        assertEquals(f, response);
    }

    @Test
    public void createHoaDon_ThanhCong() {
        int nhanVienID = 10;
        int nhaCungCapID = 1;
        int linhKienID = 1;

        List<HoadonLinhkien> slist = new ArrayList<>();

        HoadonLinhkien item = new HoadonLinhkien();
        item.setLinhKienID(linhKienID);
        item.setDonGia(10000f);
        item.setSoLuong(10);
        item.setThanhTien(10 * 10000f);

        slist.add(item);

        int f = 1;

        int response = hoaDonDAO.createHoaDon(nhanVienID, nhaCungCapID, slist);
        assertEquals(f, response);
    }

}
