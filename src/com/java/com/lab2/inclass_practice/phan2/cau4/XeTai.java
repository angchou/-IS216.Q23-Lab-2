package com.java.com.lab2.inclass_practice.phan2.cau4;

public class XeTai extends Xe {
    public XeTai() {
        super();
    }

    public XeTai(double xang, double hang) {
        super(xang, hang);
    }

    @Override
    protected double tinhTieuThu(double km) {
        return (km * 20) / 100.0 + (hang / 100.0);
    }
}
