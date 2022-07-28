/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.dao;

import com.ptit.model.Nhanvien;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DUONGNV
 */
public class TestNhanvienDAO {

    NhanvienDAO nhanvienDAO = new NhanvienDAO();

    public TestNhanvienDAO() {
    }

    @Test
    public void checkLogin_DangNhapKhongThanhCong() {
        String username = "username";
        String password = "password";
        Nhanvien nv = nhanvienDAO.checkLogin(username, password);
        assertEquals(null, nv);
    }

    @Test
    public void checkLogin_DangNhapThanhCong() {
        int nhanVienID = 10;

        String username = "tungnd";
        String password = "1";
        Nhanvien nv = nhanvienDAO.checkLogin(username, password);
        assertEquals(nhanVienID, nv.getID());
    }

}
