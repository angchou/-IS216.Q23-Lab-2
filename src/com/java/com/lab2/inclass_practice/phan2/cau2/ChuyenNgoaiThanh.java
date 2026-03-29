package com.java.com.lab2.inclass_practice.phan2.cau2;

public class ChuyenNgoaiThanh extends Chuyen {
    private String noiDen;
    private int soNgayVanChuyen;

    public ChuyenNgoaiThanh() {
        super();
        this.noiDen = "";
        this.soNgayVanChuyen = 0;
    }

    public ChuyenNgoaiThanh(String maSo, String hoTenTaiXe, String soXe,
                            double khoiLuongHangHoa, String noiDen,
                            int soNgayVanChuyen, double doanhThu) {
        super(maSo, hoTenTaiXe, soXe, khoiLuongHangHoa, doanhThu);
        this.noiDen = noiDen;
        this.setSoNgayVanChuyen(soNgayVanChuyen);
    }

    @Override
    public void xuatThongTin() {
        System.out.println("** CHUYEN NGOAI THANH **");
        System.out.println("Ma so xe            : " + getMaSo());
        System.out.println("Ho ten Tai xe       : " + getHoTenTaiXe());
        System.out.println("So xe               : " + getSoXe());
        System.out.println("Khoi luong hang     : " + getKhoiLuongHangHoa());
        System.out.println("Doanh thu           : " + getDoanhThu());
        System.out.println("Noi den             : " + noiDen);
        System.out.println("So ngay van chuyen  : "+ soNgayVanChuyen);
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayVanChuyen() {
        return soNgayVanChuyen;
    }

    public void setSoNgayVanChuyen(int soNgayVanChuyen) {
        if (soNgayVanChuyen < 0) {
            System.out.println("So ngay van chuyen phai lon hon hoac bang 0!");
            return;
        }
        this.soNgayVanChuyen = soNgayVanChuyen;
    }
}
