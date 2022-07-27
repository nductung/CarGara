/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.dao;

import com.ptit.connect.DatabaseConnect;
import com.ptit.model.NhaCungCap;
import java.sql.Connection;
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
public class NhaCungCapDAO {

    public List<NhaCungCap> getNhaCungCap(String key) {
        List<NhaCungCap> nhaCungCaps = null;
        String sql = "SELECT * FROM NhaCungCap WHERE LOWER( ten ) LIKE  '%" + key + "%'";
        Connection connect = null;
        try {
            connect = DatabaseConnect.getInstance().getConnection();
            Statement stmt = connect.createStatement();
            nhaCungCaps = new ArrayList<>();
            ResultSet rs = stmt.executeQuery(sql);
            NhaCungCap nhaCungCap = null;
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
        Connection connect = null;
        int row = 0;
        try {
            connect = DatabaseConnect.getInstance().getConnection();
            String check = "SELECT * FROM NhaCungCap WHERE LOWER( ma ) = '" + nhaCungCap.getMa() + "'";
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery(check);
            if (rs.next()) {
                row = -1;
            } else {
                String sql = "INSERT INTO NhaCungCap VALUES(?,?,?,?,?,?)";
                PreparedStatement prepar = connect.prepareStatement(sql);
                prepar.setString(1, nhaCungCap.getMa());
                prepar.setString(2, nhaCungCap.getTen());
                prepar.setString(3, nhaCungCap.getDiaChi());
                prepar.setString(4, nhaCungCap.getEmail());
                prepar.setString(5, nhaCungCap.getDienThoai());
                prepar.setString(6, nhaCungCap.getMoTa());
                row = prepar.executeUpdate();
                if (row == 1) {
                    stmt = connect.createStatement();
                    rs = stmt.executeQuery("SELECT @@IDENTITY");
                    while (rs.next()) {
                        row = rs.getInt(1);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            row = 0;
        }
        return row;
    }
}
