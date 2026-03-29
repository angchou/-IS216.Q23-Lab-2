package com.java.com.lab2.inclass_practice.phan2.cau2;

public abstract class Chuyen {
    private String maSo;
    private String hoTenTaiXe;
    private String soXe;
    private double khoiLuongHangHoa;
    private double doanhThu;

    public Chuyen() {
        this.maSo = "";
        this.hoTenTaiXe = "";
        this.soXe = "";
        this.khoiLuongHangHoa = (double)0.0F;
        this.doanhThu = (double)0.0F;
    }

    public Chuyen(String maSo, String hoTenTaiXe, String soXe, double khoiLuongHangHoa, double doanhThu) {
        this.maSo = maSo;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.setKhoiLuongHangHoa(khoiLuongHangHoa);
        this.setDoanhThu(doanhThu);
    }

    public abstract void xuatThongTin();

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public double getKhoiLuongHangHoa() {
        return khoiLuongHangHoa;
    }

    public void setKhoiLuongHangHoa(double khoiLuongHangHoa) {
        if (khoiLuongHangHoa < 0) {
            System.out.println("Khoi luong hang hoa phai lon hon hoac bang 0!");
            return;
        }
        this.khoiLuongHangHoa = khoiLuongHangHoa;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        if (doanhThu < 0) {
            System.out.println("Doanh thu phai lon hon hoac bang 0!");
            return;
        }
        this.doanhThu = doanhThu;
    }
}
