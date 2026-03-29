package com.java.com.lab2.homework.cau1;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void nhapKhachHang(ArrayList<KhachHang> danhSachKH){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Nhap lan luot cac thong tin Ma khach hang, Ten khach hang, Ngay hoa don(dd/mm/yyyy), So luong dien, don gia, loai khach hang (1-Sinh hoat, 2-Kinh doanh, 3-San xuat) : ");
            String maKhachHang, tenKhachHang, ngayHoaDon;
            double soLuongDien, donGia;
            int loaiKhachHang;
            maKhachHang = sc.nextLine();
            if(maKhachHang.isEmpty()){
                break;
            }
            tenKhachHang = sc.nextLine();
            ngayHoaDon = sc.nextLine();
            soLuongDien = sc.nextDouble();
            sc.nextLine();
            donGia = sc.nextDouble();
            sc.nextLine();
            loaiKhachHang = sc.nextInt();
            sc.nextLine();
            boolean valid = true;
            for(KhachHang k: danhSachKH){
                if (k.getMaKhachHang().equals(maKhachHang) &&
                        k.getTenKhachHang().equals(tenKhachHang) &&
                        k.loaiKH() != loaiKhachHang &&
                        k.getNgayHoaDon().equals(ngayHoaDon)) {

                    System.out.println("Nhap sai dieu kien!");
                    valid = false;
                    break;
                }
            }
            if(!valid) continue;

            if(loaiKhachHang == 1){
                System.out.println("Khach hang sinh hoat, nhap them dinh muc: ");
                double dinhMuc = sc.nextDouble();
                sc.nextLine();
                danhSachKH.add(new KhachHangSinhHoat(maKhachHang, tenKhachHang, ngayHoaDon, soLuongDien, donGia, dinhMuc));
                System.out.println("Them thanh cong!");
            }
            else if(loaiKhachHang == 2){
                System.out.println("Khach hang kinh doanh");
                danhSachKH.add(new KhachHangKinhDoanh(maKhachHang, tenKhachHang, ngayHoaDon, soLuongDien, donGia));
                System.out.println("Them thanh cong!");
            }
            else if(loaiKhachHang == 3){
                System.out.println("Khach hang san xuat, nhap them loai dien(2-2 pha, 3-3 pha): ");
                int loaiDien = sc.nextInt();
                sc.nextLine();
                danhSachKH.add(new KhachHangSanXuat(maKhachHang, tenKhachHang, ngayHoaDon, soLuongDien, donGia, loaiDien));
                System.out.println("Them thanh cong!");
            }
        }
    }

    public static void xuatThongTinKhachHang(ArrayList<KhachHang> danhSachKH){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thang va nam can tra hoa don:");
        String thang = sc.nextLine();
        String nam = sc.nextLine();
        for(KhachHang k: danhSachKH){
            if(k.getNgayHoaDon().substring(3, 5).equals(thang) && k.getNgayHoaDon().substring(6, 10).equals(nam)){
                k.xuatThongTinKhachHang();
            }
        }
    }

    public static void main(String[] args){
        ArrayList <KhachHang> danhSachKH = new ArrayList<>();
        nhapKhachHang(danhSachKH);
        xuatThongTinKhachHang(danhSachKH);
    }
}
