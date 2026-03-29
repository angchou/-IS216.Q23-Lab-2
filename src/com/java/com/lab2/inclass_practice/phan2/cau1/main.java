package com.java.com.lab2.inclass_practice.phan2.cau1;

public class main {
    public static void main(String[] args) {
        Employee e = new Employee("Chau Gia An", 20, 1000);

        System.out.println("Thong tin ban dau:");
        e.show();

        e.addSalary();
        System.out.println("Sau khi tang 10%:");
        e.show();

        e.addSalary(0.5f);
        System.out.println("Sau khi tang them 50%:");
        e.show();
    }
}
