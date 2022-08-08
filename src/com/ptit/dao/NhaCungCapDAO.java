/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.dao;

import com.ptit.model.NhaCungCap;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TUNGND
 */
public class NhaCungCapDAO extends DAO {

    public List<NhaCungCap> getNhaCungCap(String key) {
        List<NhaCungCap> nhaCungCaps = null;
        String sql;
        if (key.isEmpty()) {
            sql = "SELECT * FROM tblNhaCungCap";
        } else {
            sql = "SELECT * FROM tblNhaCungCap WHERE LOWER( ten ) LIKE  '%" + key + "%'";
        }
        try {
            Statement stmt = connect.createStatement();
            nhaCungCaps = new ArrayList<>();
            ResultSet rs = stmt.executeQuery(sql);
            NhaCungCap nhaCungCap;
            while (rs.next()) {
                nhaCungCap = new NhaCungCap();
                nhaCungCap.setID(rs.getInt(1));
                nhaCungCap.setMa(rs.getString(2));
                nhaCungCap.setTen(rs.getString(3));
                nhaCungCap.setDiaChi(rs.getString(4));
                nhaCungCap.setEmail(rs.getString(5));
                nhaCungCap.setDienThoai(rs.getString(6));
                nhaCungCap.setMoTa(rs.getString(7));
                nhaCungCaps.add(nhaCungCap);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nhaCungCaps;
    }

    public int createNhaCungCap(NhaCungCap nhaCungCap) {
        int row = 0;
        try {
            String check = "SELECT * FROM tblNhaCungCap WHERE LOWER( ma ) = '" + nhaCungCap.getMa() + "'";
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery(check);
            if (rs.next()) {
                row = -1;
            } else {
                String sql = "INSERT INTO tblNhaCungCap VALUES(?,?,?,?,?,?)";
                PreparedStatement prepar = connect.prepareStatement(sql);
                prepar.setString(1, nhaCungCap.getMa());
                prepar.setString(2, nhaCungCap.getTen());
                prepar.setString(3, nhaCungCap.getDiaChi());
                prepar.setString(4, nhaCungCap.getEmail());
                prepar.setString(5, nhaCungCap.getDienThoai());
                prepar.setString(6, nhaCungCap.getMoTa());
                row = prepar.executeUpdate();
                if (row == 1) {
                    // stmt = connect.createStatement();
                    // rs = stmt.executeQuery("SELECT @@IDENTITY");
                    // while (rs.next()) {
                    //     row = rs.getInt(1);
                    // }
                }
            }
        } catch (SQLException e) {
            // e.printStackTrace();
            row = 0;
        }
        return row;
    }
}
