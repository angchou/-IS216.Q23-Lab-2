package com.java.com.lab2.inclass_practice.phan2.cau3;

public class Zattacker extends Robot {
    private double P;

    Zattacker() {
        super(50);
        P = 20 + 10 * Math.random();
    }

    @Override
    public void xuatThongTin(){
        System.out.println("** Zattacker **");
        super.xuatThongTin();
        System.out.println("P: " + P);
    }

    @Override
    public double tieuThuNangLuong(double S) {
        return getM() * S + P * P * S;
    }
}
