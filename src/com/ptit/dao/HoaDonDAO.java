/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.dao;

import com.ptit.connect.DatabaseConnect;
import com.ptit.model.HoadonLinhkien;
import java.sql.Connection;
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
public class HoaDonDAO {

    public int createHoaDon(int nhanVienID, int nhaCungCapID, List<HoadonLinhkien> slist) {
        Connection connect = null;
        int row = 0;
        try {
            connect = DatabaseConnect.getInstance().getConnection();
            String sql = "INSERT INTO HoaDon VALUES(?,?,?,?,?)";
            StringBuffer sql2 = new StringBuffer("insert into HoadonLinhkien (donGia, soLuong, thanhTien, hoaDonID, linhKienID) values (?,?,?,?,?)");
            PreparedStatement prepar = connect.prepareStatement(sql);

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDateTime now = LocalDateTime.now();

            Float tongTien = 0.0f;
            int j = 0;
            for (HoadonLinhkien item : slist) {
                tongTien += item.getThanhTien();
                if (j != 0) {
                    sql2.append(", (?, ?, ?, ?, ?)");
                }
                j += 1;
            }
            sql2.append(";");

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
                prepar = connect.prepareStatement(sql2.toString());
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
        } catch (SQLException e) {
            e.printStackTrace();
            row = 0;
        }
        return row;
    }

}
