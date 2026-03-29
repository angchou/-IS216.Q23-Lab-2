package com.java.com.lab2.inclass_practice.phan2.cau3;

public class Carrier extends Robot {
    private double E;

    public Carrier() {
        super(30);
        E = 50 + 50 * Math.random();
    }

    @Override
    public void xuatThongTin(){
        System.out.println("** Carrier **");
        super.xuatThongTin();
        System.out.println("E: " + E);
    }

    @Override
    public double tieuThuNangLuong(double S) {
        return getM() * S + 4 * E * S;
    }
}
