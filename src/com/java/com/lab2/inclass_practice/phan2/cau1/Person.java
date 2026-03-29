package com.java.com.lab2.inclass_practice.phan2.cau1;

public abstract class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Tuoi phai lon hon hoac bang 0");
        }
        this.age = age;
    }

    public abstract void show();
}
