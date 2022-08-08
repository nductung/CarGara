/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.dao;

import com.ptit.model.Nhanvien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author TUNGND
 */
public class NhanvienDAO extends DAO {

    public Nhanvien checkLogin(String username, String password) {
        String sql = "SELECT * FROM tblNhanVien WHERE username = ? AND password = ?";
        Nhanvien nhanvien = null;
        try {
            PreparedStatement prepar = connect.prepareStatement(sql);
            prepar.setString(1, username);
            prepar.setString(2, password);
            ResultSet rs = prepar.executeQuery();
            if (rs.next()) {
                nhanvien = new Nhanvien();
                nhanvien.setID(rs.getInt(1));
                nhanvien.setTen(rs.getString(2));
                nhanvien.setUsername(rs.getString(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nhanvien;
    }
}
