package com.java.com.lab2.homework.cau2;

public class HangDienMay extends HangHoa {
    private String thuongHieu;
    private String loaiMay;
    private int thoiGianBaoHanh;

    public HangDienMay() {
        super();
        this.thuongHieu = "";
        this.loaiMay = "";
        this.thoiGianBaoHanh = 0;
    }

    public HangDienMay(int maHang, String tenHang, int soLuongTon, double donGia, String thuongHieu, String loaiMay, int thoiGianBaoHanh) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.thuongHieu = thuongHieu;
        this.loaiMay = loaiMay;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    @Override
    public void xuatThongTin() {
        System.out.println("** HANG DIEN MAY **");
        super.xuatThongTin();
        System.out.println("Muc do              : " + danhGia());
        System.out.println("Thuong hieu         : " + thuongHieu);
        System.out.println("Loai may            : " + loaiMay);
        System.out.println("Thoi gian bao hanh  : " + thoiGianBaoHanh + " thang");
    }

    @Override
    public double getVAT() {
        return 0.1;
    }

    @Override
    public String danhGia() {
        if (soLuongTon < 3) {
            return "Ban duoc";
        }
        return "Khong danh gia";
    }

    @Override
    public int loaiHang() {
        return 1;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public String getLoaiMay() {
        return loaiMay;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }
}
