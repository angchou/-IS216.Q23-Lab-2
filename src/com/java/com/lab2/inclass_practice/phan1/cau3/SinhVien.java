package com.java.com.lab2.inclass_practice.phan1.cau3;

public class SinhVien {
    private int mssv;
    private String hoTen;
    private double diemLT;
    private double diemTH;

    public SinhVien() {
        this.mssv = 0;
        this.hoTen = "";
        this.diemLT = 0;
        this.diemTH = 1;
    }

    public SinhVien(int mssv, String hoTen, double diemLT, double diemTH) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.setDiemLT(diemLT);
        this.setDiemTH(diemTH);
    }

    public double diemTrungBinh() {
        return (diemLT + diemLT) / 2;
    }

    @Override
    public String toString() {
        return String.format("%-10d %-20s %-10.2f %-10.2f %-10.2f",
                mssv, hoTen, diemLT, diemTH, diemTrungBinh());
    }

    public double getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(double diemLT) {
        if (diemLT < 0) {
            System.out.println("Diem ly thuyet phai lon hon hoac bang 0!");
            return;
        }
        this.diemLT = diemLT;
    }

    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(double diemTH) {
        if (diemTH < 0) {
            System.out.println("Diem thuc hanh phai lon hon hoac bang 0!");
            return;
        }
        this.diemTH = diemTH;
    }
}
