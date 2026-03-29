package com.java.com.lab2.inclass_practice.phan1.cau4;

public class Xe {
    private String tenChuXe;
    private String loaiXe;
    private double triGiaXe;
    private int dungTichXylanh;

    public Xe() {
        this.tenChuXe = "";
        this.loaiXe = "";
        this.triGiaXe = 0.0;
        this.dungTichXylanh = 0;
    }

    public Xe(String tenChuXe, String loaiXe, double triGiaXe, int dungTichXylanh) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.setTriGiaXe(triGiaXe);
        this.setDungTichXylanh(dungTichXylanh);
    }

    public double tinhThue() {
        return triGiaXe * getPhanTramThue();
    }
    public double getPhanTramThue() {
        if (dungTichXylanh < 100) {
            return 0.01;
        }
        else if (dungTichXylanh <= 175) {
            return 0.03;
        }
        else {
            return 0.05;
        }
    }

    public void xuatThongTinXe() {
        System.out.println("** THONG TIN XE **");
        System.out.println("Ten chu xe         : " + tenChuXe);
        System.out.println("Loai xe            : " + loaiXe);
        System.out.println("Tri gia xe         : " + triGiaXe);
        System.out.println("Dung tich xylanh   : " + dungTichXylanh);
        System.out.println("Thue               : " + this.tinhThue());
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public double getTriGiaXe() {
        return triGiaXe;
    }

    public void setTriGiaXe(double triGiaXe) {
        if (triGiaXe < 0) {
            System.out.println("Tri gia xe phai lon hon hoac bang 0!");
            return;
        }
        this.triGiaXe = triGiaXe;
    }

    public int getDungTichXylanh() {
        return dungTichXylanh;
    }

    public void setDungTichXylanh(int dungTichXylanh) {
        if (dungTichXylanh <= 0) {
            System.out.println("Dung tich xylanh phai lon hon 0!");
            return;
        }
        this.dungTichXylanh = dungTichXylanh;
    }
}
