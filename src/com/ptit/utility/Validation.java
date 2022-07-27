/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.utility;

import com.ptit.model.NhaCungCap;
import com.ptit.model.LinhKien;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author TUNGND
 */
public class Validation {

    public static boolean isCustomerValid(NhaCungCap ncc) {
        if (isStringValid(ncc.getMa()) && isStringValid(ncc.getDiaChi()) && isStringValid(ncc.getDienThoai()) && isStringValid(ncc.getEmail()) && isStringValid(ncc.getTen())) {
            return true;
        }
        return false;
    }

    public static boolean isNhaCungCapValid(NhaCungCap ncc) {
        if (isStringValid(ncc.getMa()) && isStringValid(ncc.getDiaChi()) && isStringValid(ncc.getDienThoai()) && isStringValid(ncc.getEmail()) && isStringValid(ncc.getTen())) {
            return true;
        }
        return false;
    }

    public static boolean isLinhKienValid(LinhKien lk) {
        if (isStringValid(lk.getMa()) && isStringValid(lk.getTen()) && isStringValid(lk.getDonVi()) && isStringValid(lk.getHang())) {
            return true;
        }
        return false;
    }

    public static boolean isStringValid(String str) {
        if (str.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không được để trống thông tin!", "Thông báo", 1);
            return false;
        }
        if (str.length() > 255) {
            JOptionPane.showMessageDialog(null, "Không được quá 255 kí tự!", "Thông báo", 1);
            return false;
        }
        return true;
    }

    public static boolean isNameValid(String str) {
        if (str.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không được để trống thông tin!", "Không được để trống thông tin!", 1);
            return false;
        }
        if (str.length() > 40) {
            JOptionPane.showMessageDialog(null, "Họ tên không được quá 40 kí tự!", "Họ tên không được quá 40 kí tự!", 1);
            return false;
        }
        return true;
    }

    public static boolean isAddressValid(String str) {
        if (str.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không được để trống thông tin!", "Không được để trống thông tin!", 1);
            return false;
        }
        if (str.length() > 50) {
            JOptionPane.showMessageDialog(null, "Địa chỉ không được quá 50 kí tự!", "Địa chỉ không được quá 50 kí tự!", 1);
            return false;
        }
        return true;
    }

    public static boolean isDateValid(String str) {
        if (str.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không được để trống thông tin!", "Không được để trống thông tin!", 1);
            return false;
        }
        DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        formatter.setLenient(false);
        try {
            Date date = formatter.parse(str);
            return true;
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Không đúng định dạng MM/dd/yyyy", "Không đúng định dạng MM/dd/yyyy", 1);
            return false;
        }
    }

    public static boolean isPhoneValid(String str) {
        if (str.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không được để trống thông tin!", "Không được để trống thông tin!", 1);
            return false;
        }
        if (str.length() > 20) {
            JOptionPane.showMessageDialog(null, "Số điện thoại không được quá 20 kí tự!", "Số điện thoại không không được quá 20 kí tự!", 1);
            return false;
        }
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Không đúng định dạng!", "Không đúng định dạng!", 1);
            return false;
        }
        return true;
    }

    public static boolean isLicenseValid(String str) {
        String regex = "^\\d{2}[A-Z]\\d{1}[-]\\d{4,5}$";
        if (!str.matches(regex)) {
            JOptionPane.showMessageDialog(null, "Biển số không đúng định dạng!", "Biển số không đúng định dạng!", 1);
            return false;
        }
        return true;
    }

    public static boolean isModelValid(String str) {
        if (str.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không được để trống thông tin!", "Không được để trống thông tin!", 1);
            return false;
        }
        if (str.length() > 40) {
            JOptionPane.showMessageDialog(null, "Loại xe không được quá 40 kí tự!", "Loại xe không được quá 40 kí tự!", 1);
            return false;
        }
        return true;
    }

    public static boolean isMakerValid(String str) {
        if (str.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không được để trống thông tin!", "Không được để trống thông tin!", 1);
            return false;
        }
        if (str.length() > 40) {
            JOptionPane.showMessageDialog(null, "Nhà sản xuất không được quá 40 kí tự!", "Nhà sản xuất không được quá 40 kí tự!", 1);
            return false;
        }
        return true;
    }

    public static boolean isNoteValid(String str) {
        if (str.length() > 200) {
            JOptionPane.showMessageDialog(null, "Ghi chú không được quá 200 kí tự!", "Ghi chú không được quá 200 kí tự!", 1);
            return false;
        }
        return true;
    }

    public static boolean isAmountValid(String m) {
        int n = 0;
        if (m.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không được để trống", "Không được để trống", 1);
            return false;
        }
        try {
            n = Integer.parseInt(m);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Bạn phải nhập số", "Bạn phải nhập số", 1);
            return false;
        }
        if (n < 1) {
            JOptionPane.showMessageDialog(null, "Số lượng phải lớn hơn 0", "Số lượng phải lớn hơn 0", 1);
            return false;
        }
        return true;
    }
}
