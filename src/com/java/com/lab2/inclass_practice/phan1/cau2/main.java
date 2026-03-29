package com.java.com.lab2.inclass_practice.phan1.cau2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap chieu dai:");
        double dai = sc.nextDouble();

        System.out.println("Nhap chieu rong:");
        double rong = sc.nextDouble();

        HinhChuNhat hcn = new HinhChuNhat(dai, rong);
        System.out.println(hcn.toString());

        sc.close();
    }
}
