package com.java.com.lab2.inclass_practice.phan2.cau3;

public class Pedion extends Robot {
    private double F;

    Pedion() {
        super(20);
        this.F = 1 + 4 * Math.random();
    }
    @Override
    public void xuatThongTin(){
        System.out.println("** Pedion **");
        super.xuatThongTin();
        System.out.println("F: " + F);
    }

    @Override
    public double tieuThuNangLuong(double S) {
        return getM() * S + (F + 1) * S / 2;
    }
}
