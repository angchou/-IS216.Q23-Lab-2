package com.java.com.lab2.inclass_practice.phan1.cau1;

public class Point {
    private int x, y;
    Point(){
        this.x = 0;
        this.y = 0;
    }
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void XuatThongTin()
    {
        System.out.println("(" + x + ", " + y + ")");
    }
    public double TinhKhoangCach(Point p){
        double X = Math.pow(this.x - p.x, 2);
        double Y = Math.pow(this.y - p.y, 2);

        return Math.sqrt(X + Y);
    }
}
