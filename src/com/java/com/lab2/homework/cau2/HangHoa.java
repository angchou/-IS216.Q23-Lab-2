package com.java.com.lab2.homework.cau2;

import java.lang.management.ManagementFactory;

public abstract class HangHoa {
    protected int maHang;
    protected String tenHang;
    protected int soLuongTon;
    protected double donGia;

    public HangHoa() {
        this.maHang = 0;
        this.tenHang = "";
        this.soLuongTon = 0;
        this.donGia = 0;
    }

    public HangHoa(int maHang, String tenHang, int soLuongTon, double donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuongTon = soLuongTon;
        this.donGia = donGia;
    }

    public void xuatThongTin() {
        System.out.println("Ma hang             : " + maHang);
        System.out.println("Ten Hang            : " + tenHang);
        System.out.println("So luong ton        : " + soLuongTon);
        System.out.println("Don gia             : " + donGia);
    }

    public void xuatMucDoDanhGia() {
        System.out.println("Ma hang             : " + maHang);
        System.out.println("Ten Hang            : " + tenHang);
        System.out.println("So luong ton        : " + soLuongTon);
        System.out.println("Muc do danh gia     : " + danhGia());
    }

    public double thanhTien(int soLuong) {
        if (soLuong > soLuongTon) {
            System.out.println("So luong ton khong du!");
            return 0.0;
        }
        soLuongTon -= soLuong;
        return soLuong * donGia * getVAT();
    }

    public abstract int loaiHang();
    public abstract double getVAT();
    public abstract String danhGia();

    public int getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public double getDonGia() {
        return donGia;
    }
}
