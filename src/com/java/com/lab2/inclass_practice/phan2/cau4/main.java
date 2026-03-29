package com.java.com.lab2.inclass_practice.phan2.cau4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("** Xe may **");
        XeMay xm = new XeMay();
        xm.doXang(5);
        xm.themHang(20);
        xm.chayDuong(50);

        System.out.println("Xang con lai: " + xm.getXang());
        if (xm.kiemTraXang()) {
            System.out.println("Xe con xang");
        }
        else {
            System.out.println("Xe het xang");
        }

        System.out.println("** Xe tai **");
        XeTai xt = new XeTai();
        xt.doXang(50);
        xt.themHang(200);
        xt.chayDuong(100);

        System.out.println("Xe tai con xang: " + xt.getXang());
        if (xt.kiemTraXang()) {
            System.out.println("Xe con xang");
        }
        else {
            System.out.println("Xe het xang");
        }
    }
}
