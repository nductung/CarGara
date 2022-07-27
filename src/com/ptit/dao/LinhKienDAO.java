/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.dao;

import com.ptit.connect.DatabaseConnect;
import com.ptit.model.LinhKien;
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
public class LinhKienDAO {

    public int createLinhKien(LinhKien linhKien) {
        Connection connect = null;
        int row = 0;
        try {
            connect = DatabaseConnect.getInstance().getConnection();
            String check = "SELECT * FROM LinhKien WHERE nhaCungCapID = " + linhKien.getNhaCungCapID() + " AND LOWER( ma ) = '" + linhKien.getMa() + "'";
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery(check);
            if (rs.next()) {
                row = -1;
            } else {
                String sql = "INSERT INTO LinhKien VALUES(?,?,?,?,?)";
                PreparedStatement prepar = connect.prepareStatement(sql);
                prepar.setString(1, linhKien.getMa());
                prepar.setString(2, linhKien.getTen());
                prepar.setString(3, linhKien.getDonVi());
                prepar.setInt(4, linhKien.getNhaCungCapID());
                prepar.setString(5, linhKien.getHang());
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

    public List<LinhKien> getLinhKien(int nhaCungCapID, String key) {
        List<LinhKien> linhKiens = null;
        String sql = "SELECT * FROM LinhKien WHERE nhaCungCapID = " + nhaCungCapID + " AND LOWER( ten ) LIKE  '%" + key + "%'";
        Connection connect = null;
        try {
            connect = DatabaseConnect.getInstance().getConnection();
            Statement stmt = connect.createStatement();
            linhKiens = new ArrayList<LinhKien>();
            ResultSet rs = stmt.executeQuery(sql);
            LinhKien linhKien = null;
            while (rs.next()) {
                linhKien = new LinhKien();
                linhKien.setID(rs.getInt(1));
                linhKien.setMa(rs.getString(2));
                linhKien.setTen(rs.getString(3));
                linhKien.setDonVi(rs.getString(4));
                linhKien.setHang(rs.getString(6));
                linhKiens.add(linhKien);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return linhKiens;
    }
}