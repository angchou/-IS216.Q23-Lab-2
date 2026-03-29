package com.java.com.lab2.inclass_practice.phan2.cau1;

public class Employee extends Person {
    private float salary;

    public Employee() {
        super();
        this.salary = 0;
    }

    public Employee(String name, int age, float salary) {
        super(name, age);
        this.salary = salary;
    }

    public void addSalary() {
        salary += salary * 0.1f;
    }
    public void addSalary(float x) {
        salary += salary * x;
    }

    @Override
    public void show() {
        System.out.println("** THONG TIN NHAN VIEN **");
        System.out.println("Ho va ten:  " + this.getName());
        System.out.println("Tuoi:       " + this.getAge());
        System.out.println("Luong:      " + this.salary);
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        if (salary < 0) {
            System.out.println("Luong phai lon hon hoac bang 0!");
            return;
        }
        this.salary = salary;
    }
}
