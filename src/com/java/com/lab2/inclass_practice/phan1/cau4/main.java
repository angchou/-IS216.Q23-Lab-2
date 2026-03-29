package com.java.com.lab2.inclass_practice.phan1.cau4;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Xe> ds = new ArrayList<>();

        while (true) {
            System.out.print("Nhap ten chu xe (rong de dung): ");
            String ten = sc.nextLine();
            if (ten.isEmpty()) break;

            Xe x = new Xe();
            x.setTenChuXe(ten);

            System.out.print("Loai xe: ");
            x.setLoaiXe(sc.nextLine());

            System.out.print("Tri gia: ");
            x.setTriGiaXe(sc.nextDouble());

            System.out.print("Dung tich: ");
            x.setDungTichXylanh(sc.nextInt());
            sc.nextLine(); // clear buffer

            ds.add(x);
        }

        System.out.println("\nBang ke khai thue:");
        for (Xe x : ds) {
            x.xuatThongTinXe();
        }

        System.out.print("\nNhap ten chu xe can tim: ");
        String tenTim = sc.nextLine();

        System.out.print("Nhap loai xe: ");
        String loaiTim = sc.nextLine();

        boolean found = false;
        for (Xe x : ds) {
            if (x.getTenChuXe().equalsIgnoreCase(tenTim)
                    && x.getLoaiXe().equalsIgnoreCase(loaiTim)) {
                System.out.println("Thue phai dong: " + x.tinhThue());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay!");
        }
    }
}