package com.java.com.lab2.inclass_practice.phan2.cau4;

public class XeMay extends Xe {
    public XeMay() {
        super();
    }

    public XeMay(double xang, double hang) {
        super(xang, hang);
    }

    @Override
    protected double tinhTieuThu(double km) {
        return km * 2 / 100.0 + (hang / 10.0) * 0.1;
    }
}