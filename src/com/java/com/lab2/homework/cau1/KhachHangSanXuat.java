package com.java.com.lab2.homework.cau1;

public class KhachHangSanXuat extends KhachHang {
    private int loaiDien;

    public KhachHangSanXuat() {
        super();
        this.loaiDien = 0;
    }

    public KhachHangSanXuat(String maKhachHang, String tenKhachHang, String ngayHoaDon, double soLuongDien, double donGia, int loaiDien) {
        super(maKhachHang, tenKhachHang, ngayHoaDon, soLuongDien, donGia);
        this.loaiDien = loaiDien;
    }

    @Override
    public double tinhTienDien() {
        if (loaiDien == 2){
            thanhTien = soLuongDien * donGia * ((soLuongDien > 200) ? 1 : 0.98);
        }
        else {
            thanhTien = soLuongDien * donGia + ((soLuongDien > 150) ? 1 : 0.97);
        }
        return thanhTien;
    }

    @Override
    public int loaiKH() {
        return 3;
    }
}
