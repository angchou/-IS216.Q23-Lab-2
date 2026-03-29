package com.java.com.lab2.inclass_practice.phan2.cau4;

public abstract class Xe {
    protected double xang;
    protected double hang;

    public Xe() {
        this.xang = 0.0;
        this.hang = 0.0;
    }

    public Xe(double xang, double hang) {
        this.xang = xang > 0 ? xang : 0.0;
        this.hang = hang > 0 ? hang : 0;
    }

    public void themHang(double m) {
        if (m > 0) {
            hang += m;
        }
    }

    public void botHang(double m) {
        if (m > 0) {
            hang -= m;
            if (hang < 0) {
                hang = 0;
            }
        }
    }

    public void doXang(double lit) {
        if (lit > 0) {
            xang += lit;
        }
    }

    public boolean kiemTraXang() {
        return (xang > 0);
    }

    public void chayDuong(double km) {
        if (km <= 0) return;
        double tieuThu = tinhTieuThu(km);
        if (xang >= tieuThu) {
            xang -= tieuThu;
            System.out.println("Xe chay...");
        } else {
            System.out.println("Khong du xang de chay...");
        }
    }

    protected abstract double tinhTieuThu(double km);

    public double getXang() {
        return xang;
    }
}
