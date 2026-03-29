package com.java.com.lab2.inclass_practice.phan1.cau2;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat() {
        this.chieuDai = 0;
        this.chieuRong = 0;
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.setChieuDai(chieuDai);
        this.setChieuRong(chieuRong);
    }

    public double dienTich() {
        return chieuDai * chieuRong;
    }

    public double chuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    @Override
    public String toString() {
        return String.format(
                "** Hinh chu nhat **\n"
                + "Chieu dai: " + getChieuDai()
                + "\nChieu rong: " + getChieuRong()
                + "\nDien tich: " + dienTich()
                + "\nChu vi: " + chuVi() + "\n"
                );
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        if (chieuDai <= 0) {
            System.out.println("Chieu dai phai lon hon 0!");
            return;
        }
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        if (chieuRong <= 0) {
            System.out.println("Chieu rong phai lon hon 0!");
            return;
        }
        this.chieuRong = chieuRong;
    }
}
