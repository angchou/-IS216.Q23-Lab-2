package com.java.com.lab2.inclass_practice.phan2.cau2;

import java.util.Scanner;

public class main {
    static final int MAX = 20;
    static Scanner sc = new Scanner(System.in);

    static ChuyenNoiThanh nhapNoiThanh() {
        System.out.print("Ma so: ");
        String ma = sc.nextLine();
        System.out.print("Ho ten tai xe: ");
        String ten = sc.nextLine();
        System.out.print("So xe: ");
        String soXe = sc.nextLine();
        System.out.print("Khoi luong hang hoa: ");
        double kl = Double.parseDouble(sc.nextLine());
        System.out.print("Quang duong (km): ");
        double qd = Double.parseDouble(sc.nextLine());
        System.out.print("Doanh thu: ");
        double dt = Double.parseDouble(sc.nextLine());
        return new ChuyenNoiThanh(ma, ten, soXe, kl, qd, dt);
    }

    static ChuyenNgoaiThanh nhapNgoaiThanh() {
        System.out.print("Ma so: ");
        String ma = sc.nextLine();
        System.out.print("Ho ten tai xe: ");
        String ten = sc.nextLine();
        System.out.print("So xe: ");
        String soXe = sc.nextLine();
        System.out.print("Khoi luong hang hoa: ");
        double kl = Double.parseDouble(sc.nextLine());
        System.out.print("Noi den: ");
        String noiDen = sc.nextLine();
        System.out.print("So ngay van chuyen: ");
        int ngay = Integer.parseInt(sc.nextLine());
        System.out.print("Doanh thu: ");
        double dt = Double.parseDouble(sc.nextLine());
        return new ChuyenNgoaiThanh(ma, ten, soXe, kl, noiDen, ngay, dt);
    }

    static void nhapDanhSach(ChuyenNoiThanh[] dsNT, ChuyenNgoaiThanh[] dsNGT,
                             int[] demNT, int[] demNGT) {
        int tongChuyen = 0;
        while (tongChuyen < MAX) {
            System.out.println("--- Nhap chuyen thu " + (tongChuyen + 1) + " ---");
            System.out.println("Loai chuyen (1 - Noi thanh | 2 - Ngoai thanh | khac - Dung): ");
            int loai = Integer.parseInt(sc.nextLine().trim());
            if (loai == 1) {
                System.out.println("Nhap thong tin chuyen noi thanh");
                dsNT[demNT[0]] = nhapNoiThanh();
                demNT[0]++;
            } else if (loai == 2) {
                System.out.println("Nhap thong tin chuyen ngoai thanh");
                dsNGT[demNGT[0]] = nhapNgoaiThanh();
                demNGT[0]++;
            } else {
                break;
            }
            tongChuyen++;
        }
    }

    static void xuatDanhSach(ChuyenNoiThanh[] dsNT, int soNT,
                             ChuyenNgoaiThanh[] dsNGT, int soNGT) {
        System.out.println("\n====== Danh sach chuyen xe ======");
        System.out.println("-- Noi thanh (" + soNT + " chuyen) --");
        for (int i = 0; i < soNT; i++) dsNT[i].xuatThongTin();

        System.out.println("\n-- Ngoai thanh (" + soNGT + " chuyen) --");
        for (int i = 0; i < soNGT; i++) dsNGT[i].xuatThongTin();
    }

    static double tongDoanhThuNoiThanh(ChuyenNoiThanh[] ds, int n) {
        double tong = 0;
        for (int i = 0; i < n; i++) tong += ds[i].getDoanhThu();
        return tong;
    }

    static double tongDoanhThuNgoaiThanh(ChuyenNgoaiThanh[] ds, int n) {
        double tong = 0;
        for (int i = 0; i < n; i++) tong += ds[i].getDoanhThu();
        return tong;
    }

    static ChuyenNoiThanh maxDoanhThuNoiThanh(ChuyenNoiThanh[] ds, int n) {
        if (n == 0) return null;
        ChuyenNoiThanh max = ds[0];
        for (int i = 1; i < n; i++)
            if (ds[i].getDoanhThu() > max.getDoanhThu()) max = ds[i];
        return max;
    }

    static ChuyenNgoaiThanh maxDoanhThuNgoaiThanh(ChuyenNgoaiThanh[] ds, int n) {
        if (n == 0) return null;
        ChuyenNgoaiThanh max = ds[0];
        for (int i = 1; i < n; i++)
            if (ds[i].getDoanhThu() > max.getDoanhThu()) max = ds[i];
        return max;
    }

    public static void main(String[] args) {
        ChuyenNoiThanh[]  dsNT  = new ChuyenNoiThanh[MAX];
        ChuyenNgoaiThanh[] dsNGT = new ChuyenNgoaiThanh[MAX];
        int[] demNT  = {0};
        int[] demNGT = {0};

        nhapDanhSach(dsNT, dsNGT, demNT, demNGT);

        xuatDanhSach(dsNT, demNT[0], dsNGT, demNGT[0]);

        System.out.println("\nTong doanh thu noi thanh  : " + tongDoanhThuNoiThanh(dsNT, demNT[0]) + " VND");
        System.out.println("Tong doanh thu ngoai thanh: " + tongDoanhThuNgoaiThanh(dsNGT, demNGT[0]) + "VND");

        System.out.println("\n--- Chuyen noi thanh co doanh thu cao nhat ---");
        ChuyenNoiThanh maxNT = maxDoanhThuNoiThanh(dsNT, demNT[0]);
        if (maxNT != null) {
            maxNT.xuatThongTin();
        }
        else {
            System.out.println("Khong co chuyen noi thanh");
        }

        System.out.println("\n--- Chuyen ngoai thanh co doanh thu cao nhat ---");
        ChuyenNgoaiThanh maxNGT = maxDoanhThuNgoaiThanh(dsNGT, demNGT[0]);
        if (maxNGT != null) maxNGT.xuatThongTin();
        else System.out.println("Khong co chuyen ngoai thanh");

        sc.close();
    }
}
