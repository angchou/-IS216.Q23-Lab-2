package com.java.com.lab2.inclass_practice.phan2.cau3;

public abstract class Robot {
    private int M;

    Robot() {
        this.M = 0;
    }
    Robot(int M) {
        this.M = M;
    }

    public abstract double tieuThuNangLuong(double S);

    public void xuatThongTin() {
        System.out.println("M: " + M);
    }

    public int getM() {
        return M;
    }
}
