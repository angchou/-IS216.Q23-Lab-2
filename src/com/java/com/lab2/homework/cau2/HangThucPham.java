package com.java.com.lab2.homework.cau2;

import java.time.LocalDate;

public class HangThucPham extends HangHoa {
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;
    private String nhaCungCap;

    public HangThucPham() {
        super();
        this.ngaySanXuat = LocalDate.now();
        this.ngayHetHan = LocalDate.now();
        this.nhaCungCap = "";
    }

    public HangThucPham(int maHang, String tenHang, int soLuongTon, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan, String nhaCungCap) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
        this.nhaCungCap = nhaCungCap;
    }

    @Override
    public double getVAT() {
        return 0.05;
    }

    @Override
    public String danhGia() {
        if (LocalDate.now().isAfter(ngayHetHan) && soLuongTon > 2) {
            return "Kho ban";
        }
        return "Khong danh gia";
    }

    @Override
    public int loaiHang() {
        return 2;
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }
}
