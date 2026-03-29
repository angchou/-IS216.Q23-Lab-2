package com.java.com.lab2.homework.cau2;

import java.time.LocalDate;
import java.util.*;

public class main {
    static Scanner sc = new Scanner(System.in);

    static boolean trungMa(ArrayList<HangHoa> ds, int ma) {
        for (HangHoa h : ds) {
            if (h.getMaHang() == ma) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<HangHoa> ds = new ArrayList<>();

        while (true) {
            System.out.print("Nhap ma hang (0 de dung): ");
            int ma = sc.nextInt();
            sc.nextLine();

            if (ma == 0) break;

            if (trungMa(ds, ma)) {
                System.out.println("Ma bi trung!");
                continue;
            }

            System.out.print("Loai (1-Dien may, 2-Thuc pham, 3-Gia dung): ");
            int loai = sc.nextInt();
            sc.nextLine();

            System.out.print("Ten: ");
            String ten = sc.nextLine();
            System.out.print("So luong: ");
            int sl = sc.nextInt();
            System.out.print("Don gia: ");
            double dg = sc.nextDouble();
            sc.nextLine();

            HangHoa h = null;

            if (loai == 1) {
                System.out.print("Thuong hieu: ");
                String th = sc.nextLine();
                System.out.print("Loai may: ");
                String lm = sc.nextLine();
                System.out.print("Bao hanh: ");
                int bh = sc.nextInt();
                sc.nextLine();

                h = new HangDienMay(ma, ten, sl, dg, th, lm, bh);
            }
            else if (loai == 2) {
                System.out.print("Ngay SX (yyyy-mm-dd): ");
                LocalDate nsx = LocalDate.parse(sc.nextLine());
                System.out.print("Ngay HH: ");
                LocalDate nhh = LocalDate.parse(sc.nextLine());
                System.out.print("NCC: ");
                String ncc = sc.nextLine();

                h = new HangThucPham(ma, ten, sl, dg, nsx, nhh, ncc);
            }
            else {
                System.out.print("NSX: ");
                String nsx = sc.nextLine();
                System.out.print("Ngay nhap: ");
                LocalDate nn = LocalDate.parse(sc.nextLine());
                System.out.print("Loai: ");
                String l = sc.nextLine();

                h = new HangGiaDung(ma, ten, sl, dg, nsx, nn, l);
            }

            ds.add(h);
        }

        if (!ds.isEmpty()) {
            HangHoa h = ds.get(0);

            System.out.println("\n--- DEMO THANH TIEN ---");
            System.out.println("Hang: " + h.getTenHang());
            System.out.println("Ton truoc: " + h.getSoLuongTon());

            double tien = h.thanhTien(2);

            System.out.println("Tien phai tra: " + tien);
            System.out.println("Ton sau: " + h.getSoLuongTon());
        }

        System.out.println("\n--- DANH GIA ---");
        for (HangHoa h : ds) {
            System.out.println(h.getMaHang() + " - " + h.getTenHang() +
                    " - " + h.getSoLuongTon() + " - " + h.danhGia());
        }

        System.out.println("\n--- DIEN MAY BAN DUOC ---");
        for (HangHoa h : ds) {
            if (h instanceof HangDienMay && h.danhGia().equalsIgnoreCase("ban duoc")) {
                HangDienMay dm = (HangDienMay) h;
                System.out.println(dm.getThuongHieu() + " - " +
                        dm.getTenHang() + " - " + dm.getLoaiMay());
            }
        }
    }
}