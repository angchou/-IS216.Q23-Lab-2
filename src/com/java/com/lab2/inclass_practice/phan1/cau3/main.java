package com.java.com.lab2.inclass_practice.phan1.cau3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SinhVien[] ds = new SinhVien[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Nhap sinh vien thu " + (i + 1));

            ds[i] = new SinhVien();

            System.out.print("Ma SV: ");
            ds[i].setMssv(sc.nextInt());
            sc.nextLine();

            System.out.print("Ho ten: ");
            ds[i].setHoTen(sc.nextLine());

            System.out.print("Diem LT: ");
            ds[i].setDiemLT(sc.nextDouble());

            System.out.print("Diem TH: ");
            ds[i].setDiemTH(sc.nextDouble());
        }

        // In bảng
        System.out.println("\nDanh sach sinh vien:");
        System.out.printf("%-10s %-20s %-10s %-10s %-10s\n",
                "MaSV", "Ho ten", "DiemLT", "DiemTH", "DTB");

        for (SinhVien sv : ds) {
            System.out.println(sv);
        }
    }
}