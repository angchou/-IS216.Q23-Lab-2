package com.java.com.lab2.homework.cau1;

public class KhachHangKinhDoanh extends KhachHang {
    public KhachHangKinhDoanh() {
        super();
    }

    public KhachHangKinhDoanh(String maKhachHang, String tenKhachHang, String ngayHoaDon, double soLuongDien, double donGia) {
        super(maKhachHang, tenKhachHang, ngayHoaDon, soLuongDien, donGia);
    }

    @Override
    public double tinhTienDien() {
        if (soLuongDien <= 400){
            thanhTien = soLuongDien * donGia;
        }
        else {
            thanhTien = 400 * donGia + (soLuongDien - 400) * donGia * 1.05;
        }
        return thanhTien;
    }

    @Override
    public int loaiKH() {
        return 2;
    }
}
