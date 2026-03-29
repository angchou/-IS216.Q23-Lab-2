package com.java.com.lab2.homework.cau2;

import java.time.LocalDate;

public class HangGiaDung extends HangHoa {
    private String nhaSanXuat;
    private LocalDate ngayNhap;
    private String loai;

    public HangGiaDung() {
        super();
        this.nhaSanXuat = "";
        this.ngayNhap = LocalDate.now();
        this.loai = "";
    }

    public HangGiaDung(int maHang, String tenHang, int soLuongTon, double donGia, String nhaSanXuat, LocalDate ngayNhap, String loai) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.nhaSanXuat = nhaSanXuat;
        this.ngayNhap = ngayNhap;
        this.loai = loai;
    }

    @Override
    public double getVAT() {
        return 0.1;
    }

    @Override
    public void xuatThongTin() {
        System.out.println("** HANG GIA DUNG **");
        super.xuatThongTin();
        System.out.println("Muc do                  : " + danhGia());
        System.out.println("Nha san xuat            : " + nhaSanXuat);
        System.out.println("Ngay nhap               : " + ngayNhap);
        System.out.println("Loai                    : " + loai);
    }

    @Override
    public String danhGia() {
        if (soLuongTon > 10 && ngayNhap.plusDays(20).isBefore(LocalDate.now())) {
            return "Ban cham";
        }
        return "Khong danh gia";
    }

    @Override
    public int loaiHang() {
        return 3;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public LocalDate getNgayNhap() {
        return ngayNhap;
    }

    public String getLoai() {
        return loai;
    }
}
