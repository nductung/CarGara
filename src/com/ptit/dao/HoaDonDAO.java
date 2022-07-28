/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.dao;

import com.ptit.model.HoadonLinhkien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 *
 * @author TUNGND
 */
public class HoaDonDAO extends DAO {

    public int createHoaDon(int nhanVienID, int nhaCungCapID, List<HoadonLinhkien> slist) {
        int row = 0;
        try {
            StringBuilder sql = new StringBuilder("INSERT INTO HoadonLinhkien (donGia, soLuong, thanhTien, hoaDonID, linhKienID) VALUES (?,?,?,?,?)");

            String sql2 = "INSERT INTO HoaDon VALUES(?,?,?,?,?)";

            connect.setAutoCommit(false);

            PreparedStatement prepar = connect.prepareStatement(sql2);

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDateTime now = LocalDateTime.now();

            Float tongTien = 0.0f;
            int j = 0;
            for (HoadonLinhkien item : slist) {
                tongTien += item.getThanhTien();
                if (j != 0) {
                    sql.append(", (?, ?, ?, ?, ?)");
                }
                j += 1;
            }
            sql.append(";");

            prepar.setString(1, dtf.format(now));
            prepar.setFloat(2, tongTien);
            prepar.setFloat(3, 1);
            prepar.setFloat(4, nhanVienID);
            prepar.setFloat(5, nhaCungCapID);

            row = prepar.executeUpdate();

            if (row == 1) {
                Statement stmt = connect.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT @@IDENTITY");
                while (rs.next()) {
                    row = rs.getInt(1);
                }
                prepar = connect.prepareStatement(sql.toString());
                int i = 0;
                for (HoadonLinhkien item : slist) {
                    prepar.setFloat((5 * i) + 1, item.getDonGia());
                    prepar.setInt((5 * i) + 2, item.getSoLuong());
                    prepar.setFloat((5 * i) + 3, item.getThanhTien());
                    prepar.setInt((5 * i) + 4, row);
                    prepar.setInt((5 * i) + 5, item.getLinhKienID());
                    i += 1;
                }
                row = prepar.executeUpdate();
            }
            connect.commit();
        } catch (SQLException e) {
            try {
                connect.rollback();
            } catch (Exception ex) {
                // ex.printStackTrace();
                // row = 0;
            }
            // e.printStackTrace();
            row = 0;
        }
        return row;
    }
}
