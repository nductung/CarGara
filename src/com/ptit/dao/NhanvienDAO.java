/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.dao;

import com.ptit.connect.DatabaseConnect;
import com.ptit.model.Nhanvien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author TUNGND
 */
public class NhanvienDAO {

    public Nhanvien checkLogin(String account, String pass) {
        String sql = "SELECT * FROM NhanVien WHERE username = ? AND password = ?";
        Connection connect = null;
        Nhanvien nhanvien = null;
        try {
            connect = DatabaseConnect.getInstance().getConnection();
            PreparedStatement prepar = connect.prepareStatement(sql);
            prepar.setString(1, account);
            prepar.setString(2, pass);
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
