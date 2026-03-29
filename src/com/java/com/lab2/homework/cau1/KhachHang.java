package com.java.com.lab2.homework.cau1;

public abstract class KhachHang {
    protected String maKhachHang;
    protected String tenKhachHang;
    protected String ngayHoaDon;
    protected double soLuongDien;
    protected double donGia;
    protected double thanhTien;

    public KhachHang(){
        this.maKhachHang = "";
        this.tenKhachHang = "";
        this.ngayHoaDon = "";
        this.soLuongDien = 0;
        this.donGia = 0;
        this.thanhTien = 0;
    }

    public KhachHang(String maKhachHang, String tenKhachHang, String ngayHoaDon, double soLuongDien, double donGia){
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.ngayHoaDon = ngayHoaDon;
        this.soLuongDien = soLuongDien;
        this.donGia = donGia;
        this.thanhTien = 0;
    }

    public void xuatThongTinKhachHang(){
        System.out.println("** THONG TIN KHACH HANG **");
        System.out.println("Ma khach hang   : " + maKhachHang);
        System.out.println("Ten khach hang  : " + tenKhachHang);
        System.out.println("Ngay hoa don    : " + ngayHoaDon);
        System.out.println("So luong dien   : " + soLuongDien);
        System.out.println("Don gia         : " + donGia);
        System.out.println("Thanh tien      : " + tinhTienDien());
    }

    public abstract double tinhTienDien();
    public abstract int loaiKH();

    public String getMaKhachHang(){
        return maKhachHang;
    }
    public String getTenKhachHang(){
        return tenKhachHang;
    }
    public String getNgayHoaDon(){
        return ngayHoaDon;
    }
}
