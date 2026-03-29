package com.java.com.lab2.inclass_practice.phan2.cau3;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        System.out.println("Nhap lan luot so luong robot Pedion, Zattacker, Carrier: ");
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        ArrayList<Pedion> pArr = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            Pedion p = new Pedion();
            pArr.add(p);
        }

        ArrayList <Zattacker> zArr = new ArrayList<>();
        for (int i = 0; i < b; i++) {
            Zattacker z = new Zattacker();
            zArr.add(z);
        }

        ArrayList <Carrier> cArr = new ArrayList<>();
        for (int i = 0; i < c; i++) {
            Carrier c_ = new Carrier();
            cArr.add(c_);
        }

        double tongNangLuongPedion = 0, tongNangLuongZattacker = 0, tongNangLuongCarrier = 0;

        System.out.println("Thong tin loai robot Pedion: ");
        for (Pedion p: pArr){
            p.xuatThongTin();
            System.out.println("Nang luong tieu thu: " + p.tieuThuNangLuong(10));
            tongNangLuongPedion += p.tieuThuNangLuong(10);
        }

        System.out.println("Thong tin loai robot Zattacker: ");
        for (Zattacker z: zArr){
            z.xuatThongTin();
            System.out.println("Nang luong tieu thu: " + z.tieuThuNangLuong(10));
            tongNangLuongZattacker += z.tieuThuNangLuong(10);
        }

        System.out.println("Thong tin loai robot Carrier: ");
        for (Carrier c_: cArr){
            c_.xuatThongTin();
            System.out.println("Nang luong tieu thu: " + c_.tieuThuNangLuong(10));
            tongNangLuongCarrier += c_.tieuThuNangLuong(10);
        }

        if(tongNangLuongPedion >= tongNangLuongZattacker && tongNangLuongPedion >= tongNangLuongCarrier){
            System.out.println("Pedion ton nhieu nang luong nhat!");
            sc.close();
            return;
        }
        else if(tongNangLuongZattacker >= tongNangLuongCarrier && tongNangLuongZattacker >= tongNangLuongPedion){
            System.out.println("Zattacker ton nhieu nang luong nhat!");
            sc.close();
            return;
        }
        else{
            System.out.println("Carrier ton nhieu nang luong nhat!");
            sc.close();
            return;
        }
    }

}
