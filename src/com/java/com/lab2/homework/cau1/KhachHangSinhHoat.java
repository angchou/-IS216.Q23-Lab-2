package com.java.com.lab2.homework.cau1;

public class KhachHangSinhHoat extends KhachHang {
    private double dinhMuc;

    public KhachHangSinhHoat() {
        super();
        this.dinhMuc = 0;
    }

    public KhachHangSinhHoat(String maKhachHang, String tenKhachHang, String ngayHoaDon, double soLuongDien, double donGia, double dinhMuc) {
        super(maKhachHang, tenKhachHang, ngayHoaDon, soLuongDien, donGia);
        this.dinhMuc = dinhMuc;
    }

    @Override
    public double tinhTienDien() {
        if (soLuongDien <= dinhMuc){
            thanhTien = soLuongDien * donGia;
        }
        else {
            thanhTien = soLuongDien * donGia + (soLuongDien - dinhMuc) * donGia * 2;
        }
        return thanhTien;
    }

    @Override
    public int loaiKH() {
        return 1;
    }
}
