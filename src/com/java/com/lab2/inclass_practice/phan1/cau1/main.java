package com.java.com.lab2.inclass_practice.phan1.cau1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Nhap vao lan luot toa do cua 2 diem:");
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        Point A = new Point(a, b);
        Point B = new Point(c, d);

        System.out.println("Thong tin diem thu nhat:");
        A.XuatThongTin();

        System.out.println("Thong tin diem thu hai:");
        B.XuatThongTin();

        System.out.print("Khoang cach giua hai diem la: " + A.TinhKhoangCach(B));
        sc.close();
    }
}
