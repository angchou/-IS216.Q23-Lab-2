package com.java.com.lab2.inclass_practice.phan2.cau2;

public class ChuyenNoiThanh extends Chuyen {
    private double quangDuong; // km

    public ChuyenNoiThanh() {
        super();
        this.quangDuong = 0;
    }

    public ChuyenNoiThanh(String maSo, String hoTenTaiXe, String soXe,
                          double khoiLuongHangHoa, double quangDuong,
                          double doanhThu) {
        super(maSo, hoTenTaiXe, soXe, khoiLuongHangHoa, doanhThu);
        this.setQuangDuong(quangDuong);
    }

    @Override
    public void xuatThongTin() {
        System.out.println("** CHUYEN NOI THANH **");
        System.out.println("Ma so xe        : " + getMaSo());
        System.out.println("Ho ten Tai xe   : " + getHoTenTaiXe());
        System.out.println("So xe           : " + getSoXe());
        System.out.println("Khoi luong hang : " + getKhoiLuongHangHoa());
        System.out.println("Doanh thu       : " + getDoanhThu());
        System.out.println("Quang duong     : " + quangDuong);
    }

    public double getQuangDuong() {
        return quangDuong;
    }

    public void setQuangDuong(double quangDuong) {
        if (quangDuong < 0) {
            System.out.println("Quang duong phai lon hon hoac bang 0!");
            return;
        }
        this.quangDuong = quangDuong;
    }
}
